/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import java.io.Serializable;
import serialization.AppointmentSingleton;

/**
 *
 * @author James
 */
public class Patient extends Account implements Serializable{
    
    private String gender;
    private int age;
    
    //constructor
    public Patient (String ID, String password, String firstName, String surname, String address, String gender, int age) {
        this.ID = ID;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;      
        this.gender = gender;
        this.age = age;
        this.accountType = "PATIENT";
    }

    public Patient() {
    }
    
    public void requestAccount(){
        
    }
    
    public void provideFeedback(){
        
    }
    
    public void viewRatings(){
        
    }
    
    public static void bookAppointment(Doctor doctor, Patient patient, String dateTime, String notes){
        AppointmentSingleton.createAppointment(doctor, patient, dateTime, notes);
    }
    
    @Override
    public String toString(){
        return ID + " " + firstName + " " + surname;
    }
    
}
