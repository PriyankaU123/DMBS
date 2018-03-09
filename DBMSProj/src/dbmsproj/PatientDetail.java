/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmsproj;

import java.io.Serializable;

/**
 *
 * @author Urooj
 */
public class PatientDetail implements Serializable{
    private String SSN = "";
    private String ID = "";
    private String DOB = "";
    private String Username = "";
    private String Sex = "";
    private String Password = "";
    private String Zipcode = "";
    private String Email = "";
    private String Address = "";
    private String City = "";
    private String State = "";
    private String PrimaryDoc = "";
    private String EmergencyContact = "";
    private String Phone = "";
    private String Name = "";
    private String InsuranceProvider = "";
    
    public String getSSN(){
        return SSN;
    }
    public void setSSN(String ssn){
        SSN = ssn;
    }
    public String getID(){
        return ID;
    }
    public void setID(String id){
        ID = id;
    }
    public String getDOB(){
        return DOB;
    }
    public void setDOB(String dob){
        DOB = dob;
    }
    public String getUsername(){
        return Username;
    }
    public void setUsername(String username){
        Username = username;
    }
    public String getSex(){
        return Sex;
    }
    public void setSex(String sex){
        Sex = sex;
    }
    public String getPassword(){
        return Password;
    }
    public void setPassword(String password){
        Password = password;
    }
    public String getZipcode(){
        return Zipcode;
    }
    public void setZipcode(String zipcode){
        Zipcode = zipcode;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String email){
        Email = email;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String address){
        Address = address;
    }
    public String getCity(){
        return City;
    }
    public void setCity(String city){
        City = city;
    }
    public String getState(){
        return State;
    }
    public void setState(String state){
        State = state;
    }
    public String getPrimaryDoc(){
        return PrimaryDoc;
    }
    public void setPrimaryDoc(String primarydoc){
        PrimaryDoc = primarydoc;
    }
    public String getEmergencyContact(){
        return EmergencyContact;
    }
    public void setEmergencyContact(String emergencyContact){
        EmergencyContact = emergencyContact;
    }
    public String getPhone(){
        return Phone;
    }
    public void setPhone(String phone){
        Phone = phone;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name = name;
    }
    public String getInsuranceProvider(){
        return InsuranceProvider;
    }
    public void setInsuranceProvider(String insuranceProvider){
        InsuranceProvider = insuranceProvider;
    }
}
