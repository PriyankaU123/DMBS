/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmsproj;

import java.io.Serializable;


public class MedicalDetail implements Serializable{
    private String ID_Num = "";
    private String Patient = "";
    private String Date = "";
    private String doctor = "";
    private String App_ID = "";
    private String Patient_ssn = "";
    
    
    public String getID_Num(){
        return ID_Num;
    }
    public void setID_Num(String Id_num){
        ID_Num = Id_num;
    }
    public String getPatient(){
        return Patient;
    }
    public void setPatient(String patient){
        Patient = patient;
    }
    public String getDate(){
        return Date;
    }
    public void setDate(String date){
        Date = date;
    }
    public String getdoctor(){
        return doctor;
    }
    public void setdoctor(String Doctor){
        doctor = Doctor;
    }
    public String getApp_ID(){
        return App_ID;
    }
    public void setApp_ID(String app_ID){
        App_ID = app_ID;
    }
    public String getPatient_ssn(){
        return Patient_ssn;
    }
    public void setPatient_ssn(String patient_ssn){
        Patient_ssn = patient_ssn;
    }
}
