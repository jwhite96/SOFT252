/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import accounts.*;
import appointments.*;
import java.io.Serializable;
import java.util.ArrayList;
import serialization.AppointmentSerialiser;

/**
 *
 * @author James
 */
public class AppointmentSingleton implements Serializable {
    
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public AppointmentSingleton() {
    }
            
    /**
     * 
     * @param a appointment to be added
     */
    public static void addAppointment(Appointment a) {
        appointments.add(a);
        updateAppointments();
    }
    
    /**
     * 
     * @param a appointment to be deleted
     */
    public static void deleteAppointment(Appointment a) {
                
        //remove account object
        if (appointments.contains(a)) {
            appointments.remove(a);
        }
                
        updateAppointments();
    }
    
    public static void addNotes(Appointment a, String notes) {
                
        for (Appointment i : appointments) {
            if (i.equals(a)) {
                int index = appointments.indexOf(i);
                i.setNotes(notes);
                i.setStatus(1);
                appointments.set(index, i);
            }
        }
                
        updateAppointments();
               
    }
    
    /**
     * 
     * @param a to be converted to object
     * @return Appointment object
     */
    public static Appointment convertToObject(String a) {
        
        for (Appointment i : appointments) {
           if (a.contains(i.getDate())){
               return i;
           }
        }
        return null;
    }
    
    public static void updateAppointments() {
        AppointmentSerialiser.xmlEncoder(appointments, "data/Appointments.xml");
    }
    
    /**
     * 
     * @return full list of all appointments
     */
    public static ArrayList getAppointments() {
        appointments = AppointmentSerialiser.xmlDecoder(appointments, "data/Appointments.xml");
        return appointments;
    }
    
    /**
     * 
     * @param a account viewing the appointment
     * @return array list of user appointments
     */
    public static String [] getUserAppointments(Account a, int status){
             
        getAppointments();
        
        ArrayList<Appointment> appoinmentList = new ArrayList<>();    
        
        // loop through list of appointments and return all for specified doctor
        for (Appointment i : appointments) {
            if (i.getStatus() == status) {
                if (i.getDoctor().getID().equals(a.getID()) || i.getPatient().getID().equals(a.getID()) ) {
                    appoinmentList.add(i);
                }
            }
        }
        
        //create new string array for converted list
        String[] list = new String[appoinmentList.size()];
              
        //loop through arraylist and put into string array
        for (int j = 0; j < appoinmentList.size(); j++) {
            list[j] = appoinmentList.get(j).toString();
        }        
                
        return list;
    }    
}
