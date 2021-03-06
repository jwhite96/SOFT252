/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import java.io.Serializable;
import singleton.AppointmentSingleton;
import singleton.RequestSingleton;

/**
 *
 * @author James
 */
public class Patient extends Account implements Serializable {
    
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
    
    public static void requestAccount(Account account){
        RequestSingleton.createRequest(account, "CREATE", null, null, null, 0);
    }
    
    public static void requestAppointment(Account patient, Doctor doctor, String dateTime){
        RequestSingleton.createRequest(patient, "APPOINTMENT", doctor, dateTime, null, 0);
    }
    
    public static void deleteAccount(Account account) {
        RequestSingleton.createRequest(account, "DELETE", null, null, null, 0);
    }
    
    public static String [] getAppointments(Account p) {
        return AppointmentSingleton.getUserAppointments(p, 0);
    }
    
    public static String [] getHistory(Account p) {
        return AppointmentSingleton.getUserAppointments(p, 1);
    }
    
    public static void cancelAppointment(String appointment) {
        AppointmentSingleton.deleteAppointment(AppointmentSingleton.convertToObject(appointment));
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return ID + " " + firstName + " " + surname;
    }

}
