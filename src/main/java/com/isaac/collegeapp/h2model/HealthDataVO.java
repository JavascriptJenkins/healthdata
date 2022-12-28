package com.isaac.collegeapp.h2model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="healthdata")
@JsonIgnoreProperties
public class HealthDataVO {

//    {
//        "Rndrng_NPI" : "1003000126",
//            "Rndrng_Prvdr_Last_Org_Name" : "Enkeshafi",
//            "Rndrng_Prvdr_First_Name" : "Ardalan",
//            "Rndrng_Prvdr_MI" : "",
//            "Rndrng_Prvdr_Crdntls" : "M.D.",
//            "Rndrng_Prvdr_Gndr" : "M",
//            "Rndrng_Prvdr_Ent_Cd" : "I",
//            "Rndrng_Prvdr_St1" : "6410 Rockledge Dr Ste 304",
//            "Rndrng_Prvdr_St2" : "",
//            "Rndrng_Prvdr_City" : "Bethesda",
//            "Rndrng_Prvdr_State_Abrvtn" : "MD",
//            "Rndrng_Prvdr_State_FIPS" : "24",
//            "Rndrng_Prvdr_Zip5" : "20817",
//            "Rndrng_Prvdr_RUCA" : "1",
//            "Rndrng_Prvdr_RUCA_Desc" : "Metropolitan area core: primary flow within an urbanized area of 50,000 and greater",
//            "Rndrng_Prvdr_Cntry" : "US",
//            "Rndrng_Prvdr_Type" : "Stringernal Medicine",
//            "Rndrng_Prvdr_Mdcr_Prtcptg_Ind" : "Y",
//            "HCPCS_Cd" : "99217",
//            "HCPCS_Desc" : "Hospital observation care on day of discharge",
//            "HCPCS_Drug_Ind" : "N",
//            "Place_Of_Srvc" : "F",
//            "Tot_Benes" : "23",
//            "Tot_Srvcs" : "23",
//            "Tot_Bene_Day_Srvcs" : "23",
//            "Avg_Sbmtd_Chrg" : "406.17391304",
//            "Avg_Mdcr_Alowd_Amt" : "76.803913043",
//            "Avg_Mdcr_Pymt_Amt" : "61.40173913",
//            "Avg_Mdcr_Stdzd_Amt" : "58.003913043"
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    Long id;

    @JsonProperty
    String Rndrng_NPI;
    @JsonProperty
    String Rndrng_Prvdr_Last_Org_Name;
    @JsonProperty
    String Rndrng_Prvdr_First_Name;
    @JsonProperty
    String Rndrng_Prvdr_MI;
    @JsonProperty
    String Rndrng_Prvdr_Crdntls;
    @JsonProperty
    String Rndrng_Prvdr_Gndr;
    @JsonProperty
    String Rndrng_Prvdr_Ent_Cd;
    @JsonProperty
    String Rndrng_Prvdr_St1;
    @JsonProperty
    String Rndrng_Prvdr_St2;
    @JsonProperty
    String Rndrng_Prvdr_City;
    @JsonProperty
    String Rndrng_Prvdr_State_Abrvtn;
    @JsonProperty
    String Rndrng_Prvdr_State_FIPS;
    @JsonProperty
    String Rndrng_Prvdr_Zip5;
    @JsonProperty
    String Rndrng_Prvdr_RUCA;
    @JsonProperty
    String Rndrng_Prvdr_RUCA_Desc;
    @JsonProperty
    String Rndrng_Prvdr_Cntry;
    @JsonProperty
    String Rndrng_Prvdr_Type;
    @JsonProperty
    String Rndrng_Prvdr_Mdcr_Prtcptg_Ind;
    @JsonProperty
    String HCPCS_Cd;
    @JsonProperty
    String HCPCS_Desc;
    @JsonProperty
    String HCPCS_Drug_Ind;
    @JsonProperty
    String Place_Of_Srvc;
    @JsonProperty
    String Tot_Benes;
    @JsonProperty
    String Tot_Srvcs;
    @JsonProperty
    String Tot_Bene_Day_Srvcs;
    @JsonProperty
    String Avg_Sbmtd_Chrg;
    @JsonProperty
    String Avg_Mdcr_Alowd_Amt;
    @JsonProperty
    String Avg_Mdcr_Pymt_Amt;
    @JsonProperty
    String Avg_Mdcr_Stdzd_Amt;



    @JsonProperty
    LocalDateTime updatedtimestamp;
    @JsonProperty
    LocalDateTime createtimestamp;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRndrng_NPI() {
        return Rndrng_NPI;
    }

    public void setRndrng_NPI(String rndrng_NPI) {
        Rndrng_NPI = rndrng_NPI;
    }

    public String getRndrng_Prvdr_Last_Org_Name() {
        return Rndrng_Prvdr_Last_Org_Name;
    }

    public void setRndrng_Prvdr_Last_Org_Name(String rndrng_Prvdr_Last_Org_Name) {
        Rndrng_Prvdr_Last_Org_Name = rndrng_Prvdr_Last_Org_Name;
    }

    public String getRndrng_Prvdr_First_Name() {
        return Rndrng_Prvdr_First_Name;
    }

    public void setRndrng_Prvdr_First_Name(String rndrng_Prvdr_First_Name) {
        Rndrng_Prvdr_First_Name = rndrng_Prvdr_First_Name;
    }

    public String getRndrng_Prvdr_MI() {
        return Rndrng_Prvdr_MI;
    }

    public void setRndrng_Prvdr_MI(String rndrng_Prvdr_MI) {
        Rndrng_Prvdr_MI = rndrng_Prvdr_MI;
    }

    public String getRndrng_Prvdr_Crdntls() {
        return Rndrng_Prvdr_Crdntls;
    }

    public void setRndrng_Prvdr_Crdntls(String rndrng_Prvdr_Crdntls) {
        Rndrng_Prvdr_Crdntls = rndrng_Prvdr_Crdntls;
    }

    public String getRndrng_Prvdr_Gndr() {
        return Rndrng_Prvdr_Gndr;
    }

    public void setRndrng_Prvdr_Gndr(String rndrng_Prvdr_Gndr) {
        Rndrng_Prvdr_Gndr = rndrng_Prvdr_Gndr;
    }

    public String getRndrng_Prvdr_Ent_Cd() {
        return Rndrng_Prvdr_Ent_Cd;
    }

    public void setRndrng_Prvdr_Ent_Cd(String rndrng_Prvdr_Ent_Cd) {
        Rndrng_Prvdr_Ent_Cd = rndrng_Prvdr_Ent_Cd;
    }

    public String getRndrng_Prvdr_St1() {
        return Rndrng_Prvdr_St1;
    }

    public void setRndrng_Prvdr_St1(String rndrng_Prvdr_St1) {
        Rndrng_Prvdr_St1 = rndrng_Prvdr_St1;
    }

    public String getRndrng_Prvdr_St2() {
        return Rndrng_Prvdr_St2;
    }

    public void setRndrng_Prvdr_St2(String rndrng_Prvdr_St2) {
        Rndrng_Prvdr_St2 = rndrng_Prvdr_St2;
    }

    public String getRndrng_Prvdr_City() {
        return Rndrng_Prvdr_City;
    }

    public void setRndrng_Prvdr_City(String rndrng_Prvdr_City) {
        Rndrng_Prvdr_City = rndrng_Prvdr_City;
    }

    public String getRndrng_Prvdr_State_Abrvtn() {
        return Rndrng_Prvdr_State_Abrvtn;
    }

    public void setRndrng_Prvdr_State_Abrvtn(String rndrng_Prvdr_State_Abrvtn) {
        Rndrng_Prvdr_State_Abrvtn = rndrng_Prvdr_State_Abrvtn;
    }

    public String getRndrng_Prvdr_State_FIPS() {
        return Rndrng_Prvdr_State_FIPS;
    }

    public void setRndrng_Prvdr_State_FIPS(String rndrng_Prvdr_State_FIPS) {
        Rndrng_Prvdr_State_FIPS = rndrng_Prvdr_State_FIPS;
    }

    public String getRndrng_Prvdr_Zip5() {
        return Rndrng_Prvdr_Zip5;
    }

    public void setRndrng_Prvdr_Zip5(String rndrng_Prvdr_Zip5) {
        Rndrng_Prvdr_Zip5 = rndrng_Prvdr_Zip5;
    }

    public String getRndrng_Prvdr_RUCA() {
        return Rndrng_Prvdr_RUCA;
    }

    public void setRndrng_Prvdr_RUCA(String rndrng_Prvdr_RUCA) {
        Rndrng_Prvdr_RUCA = rndrng_Prvdr_RUCA;
    }

    public String getRndrng_Prvdr_RUCA_Desc() {
        return Rndrng_Prvdr_RUCA_Desc;
    }

    public void setRndrng_Prvdr_RUCA_Desc(String rndrng_Prvdr_RUCA_Desc) {
        Rndrng_Prvdr_RUCA_Desc = rndrng_Prvdr_RUCA_Desc;
    }

    public String getRndrng_Prvdr_Cntry() {
        return Rndrng_Prvdr_Cntry;
    }

    public void setRndrng_Prvdr_Cntry(String rndrng_Prvdr_Cntry) {
        Rndrng_Prvdr_Cntry = rndrng_Prvdr_Cntry;
    }

    public String getRndrng_Prvdr_Type() {
        return Rndrng_Prvdr_Type;
    }

    public void setRndrng_Prvdr_Type(String rndrng_Prvdr_Type) {
        Rndrng_Prvdr_Type = rndrng_Prvdr_Type;
    }

    public String getRndrng_Prvdr_Mdcr_Prtcptg_Ind() {
        return Rndrng_Prvdr_Mdcr_Prtcptg_Ind;
    }

    public void setRndrng_Prvdr_Mdcr_Prtcptg_Ind(String rndrng_Prvdr_Mdcr_Prtcptg_Ind) {
        Rndrng_Prvdr_Mdcr_Prtcptg_Ind = rndrng_Prvdr_Mdcr_Prtcptg_Ind;
    }

    public String getHCPCS_Cd() {
        return HCPCS_Cd;
    }

    public void setHCPCS_Cd(String HCPCS_Cd) {
        this.HCPCS_Cd = HCPCS_Cd;
    }

    public String getHCPCS_Desc() {
        return HCPCS_Desc;
    }

    public void setHCPCS_Desc(String HCPCS_Desc) {
        this.HCPCS_Desc = HCPCS_Desc;
    }

    public String getHCPCS_Drug_Ind() {
        return HCPCS_Drug_Ind;
    }

    public void setHCPCS_Drug_Ind(String HCPCS_Drug_Ind) {
        this.HCPCS_Drug_Ind = HCPCS_Drug_Ind;
    }

    public String getPlace_Of_Srvc() {
        return Place_Of_Srvc;
    }

    public void setPlace_Of_Srvc(String place_Of_Srvc) {
        Place_Of_Srvc = place_Of_Srvc;
    }

    public String getTot_Benes() {
        return Tot_Benes;
    }

    public void setTot_Benes(String tot_Benes) {
        Tot_Benes = tot_Benes;
    }

    public String getTot_Srvcs() {
        return Tot_Srvcs;
    }

    public void setTot_Srvcs(String tot_Srvcs) {
        Tot_Srvcs = tot_Srvcs;
    }

    public String getTot_Bene_Day_Srvcs() {
        return Tot_Bene_Day_Srvcs;
    }

    public void setTot_Bene_Day_Srvcs(String tot_Bene_Day_Srvcs) {
        Tot_Bene_Day_Srvcs = tot_Bene_Day_Srvcs;
    }

    public String getAvg_Sbmtd_Chrg() {
        return Avg_Sbmtd_Chrg;
    }

    public void setAvg_Sbmtd_Chrg(String avg_Sbmtd_Chrg) {
        Avg_Sbmtd_Chrg = avg_Sbmtd_Chrg;
    }

    public String getAvg_Mdcr_Alowd_Amt() {
        return Avg_Mdcr_Alowd_Amt;
    }

    public void setAvg_Mdcr_Alowd_Amt(String avg_Mdcr_Alowd_Amt) {
        Avg_Mdcr_Alowd_Amt = avg_Mdcr_Alowd_Amt;
    }

    public String getAvg_Mdcr_Pymt_Amt() {
        return Avg_Mdcr_Pymt_Amt;
    }

    public void setAvg_Mdcr_Pymt_Amt(String avg_Mdcr_Pymt_Amt) {
        Avg_Mdcr_Pymt_Amt = avg_Mdcr_Pymt_Amt;
    }

    public String getAvg_Mdcr_Stdzd_Amt() {
        return Avg_Mdcr_Stdzd_Amt;
    }

    public void setAvg_Mdcr_Stdzd_Amt(String Avg_Mdcr_Stdzd_Amt) {
        Avg_Mdcr_Stdzd_Amt = Avg_Mdcr_Stdzd_Amt;
    }

    public LocalDateTime getUpdatedtimestamp() {
        return updatedtimestamp;
    }

    public void setUpdatedtimestamp(LocalDateTime updatedtimestamp) {
        this.updatedtimestamp = updatedtimestamp;
    }

    public LocalDateTime getCreatetimestamp() {
        return createtimestamp;
    }

    public void setCreatetimestamp(LocalDateTime createtimestamp) {
        this.createtimestamp = createtimestamp;
    }





}