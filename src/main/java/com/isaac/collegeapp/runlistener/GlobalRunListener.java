package com.isaac.collegeapp.runlistener;

import com.isaac.collegeapp.jparepo.HealthDataRepo;
import com.isaac.collegeapp.model.ProfessorDAO;
import com.isaac.collegeapp.repo.ProfessorRepository;
import com.isaac.collegeapp.task.CallHealthApiConsumeDataDataTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class GlobalRunListener implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    ProfessorRepository professorRepository;

    @Autowired
    CallHealthApiConsumeDataDataTask callHealthApiConsumeDataDataTask;

    @Autowired
    TaskExecutor taskExecutor;

    @Autowired
    HealthDataRepo healthDataRepo;


    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("Application has started, executing code now");

        RestTemplate restTemplate = new RestTemplate();
        CallHealthApiConsumeDataDataTask callHealthApiConsumeDataDataTask =
                new CallHealthApiConsumeDataDataTask(restTemplate, healthDataRepo);
        taskExecutor.execute(callHealthApiConsumeDataDataTask);

        //loadDatabaseConnection();
        //getProfessors();
    }

    protected void loadDatabaseConnection() {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            System.out.println("load database method is happening");

            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }

    }

    protected void getProfessors() {

        System.out.println("getProfessors database method is happening");
        List<ProfessorDAO> professorDAOList = professorRepository.getProfessorDAOList();
        System.out.println(professorDAOList);
    }

    @PostConstruct
    public void getdata(){

    }
}
