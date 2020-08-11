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
            
    public static void addAppointment(Appointment a) {
        appointments.add(a);
        updateAppointments();
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
    
    public static String [] getDoctorAppointments(Doctor doctor){
             
        getAppointments();
        
        ArrayList<Appointment> appoinmentList = new ArrayList<>();    
        
        // loop through list of accounts and find all of the same account type
        for (Appointment i : appointments) {
            if (i.getDoctor().equals(doctor)) {
                appoinmentList.add(i);
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
