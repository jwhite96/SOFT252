/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import appointments.Appointment;
import java.io.Serializable;
import singleton.AppointmentSingleton;
import singleton.RequestSingleton;

/**
 *
 * @author James
 */
public class Doctor extends Account implements Serializable {
    
    private int rating;
    
    public Doctor (String ID, String password, String firstName, String surname, String address, int rating) {
        this.ID = ID;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;        
        this.accountType = "DOCTOR";
        this.rating = rating;
    }    

    public Doctor() {
    }
    
    public static String [] viewAppointments(Account d) {
        return AppointmentSingleton.getUserAppointments(d, 0);
    }
    
    public static String [] getHistory(Account d) {
        return AppointmentSingleton.getUserAppointments(d, 1);
    }
    
    public static Appointment getAppointment(String appointment) {
        return AppointmentSingleton.convertToObject(appointment);
    }
    
    public static void endAppointment(Appointment a, String notes) {
        AppointmentSingleton.addNotes(a, notes);
    }
    
    public static void cancelAppointment(String appointment) {
        AppointmentSingleton.deleteAppointment(AppointmentSingleton.convertToObject(appointment));
    }
    
    public static void requestStock(Account doctor, String medicine, int quantity) {
        RequestSingleton.createRequest(doctor, "MEDICINE", null, null, medicine, quantity);
    }
            
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    } 
    
    @Override
    public String toString(){
        return ID + ": Dr " + firstName + " " + surname;
    }    
}
