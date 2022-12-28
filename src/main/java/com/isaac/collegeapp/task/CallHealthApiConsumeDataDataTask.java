package com.isaac.collegeapp.task;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.isaac.collegeapp.h2model.HealthDataVO;
import com.isaac.collegeapp.jparepo.HealthDataRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;


/* Pass in a filepath to this class and it will import a csv file
* and insert it into mysql.
*
* TODO: connect this to the codegenerator so code will be generated in addition to importing the data
*
*  */
@Component
public class CallHealthApiConsumeDataDataTask implements Runnable {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // groovy will magically let you inject into this class
    public String filepath;

    // groovy will magically let you inject into this class
    public String newtablename;

    public HealthDataRepo healthDataRepo;


    RestTemplate restTemplate = new RestTemplate();

    public CallHealthApiConsumeDataDataTask(RestTemplate restTemplate, HealthDataRepo healthDataRepo) {
        this.restTemplate = restTemplate;
        this.healthDataRepo = healthDataRepo;
    }

    @Override
    public void run() {
        try {
            makecallgetdata();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // TODO: import model specific data, with object models
        // importCsvDataModel()
    }

    // import generic csv data
    void makecallgetdata() throws JsonProcessingException {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
       // headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<String> result =
                restTemplate.exchange("https://data.cms.gov/data-api/v1/dataset/92396110-2aed-4d63-a6a2-5d6207d46a29/data", HttpMethod.GET, entity, String.class);







        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(result.getBody());

        
        for(int i = 0; i < jsonNode.size(); i++){
            JsonNode item = jsonNode.get(i);
            //System.out.println(item.toPrettyString());
            HealthDataVO healthDataVO = objectMapper.readValue(item.toString(), HealthDataVO.class);
            healthDataVO.setUpdatedtimestamp(java.time.LocalDateTime.now());
            healthDataVO.setCreatetimestamp(java.time.LocalDateTime.now());
            healthDataRepo.save(healthDataVO);
        }
        
      
      //  System.out.println(result.getBody());


        // https://data.cms.gov/data-api/v1/dataset/92396110-2aed-4d63-a6a2-5d6207d46a29/data


        }


//        new File(filepath).splitEachLine(",").each {fields ->
//
//            println(fields[16])
//            sqldataset.add(
//                    game_id: Integer.parseInt(fields[16]),
//                    season: Integer.parseInt(fields[17]),
//                    type: fields[18]
//            )
//        }


        // convert the file into mysql readable format

        // do the actual insert into mysql



    }



