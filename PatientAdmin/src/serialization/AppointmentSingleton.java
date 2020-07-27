/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import accounts.*;
import appointments.*;
import serialization.AccountSingleton;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author James
 */
public class AppointmentSingleton implements Serializable {
    
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public AppointmentSingleton() {
    }
        
    public static void createAppointment(Doctor doctor, Patient patient, String date, String notes) {
                
        appointments = getAppointments();

        appointments.add(new Appointment(doctor, patient, date, notes));
         
        updateAppointments();
    }
    
    public static void updateAppointments() {
        AppointmentSerialiser.xmlDecoder(appointments, "data/Appointments.xml");
    }
    
    /**
     * 
     * @return full list of all appointments
     */
    public static ArrayList getAppointments() {
        appointments = AppointmentSerialiser.xmlDecoder(appointments, "data/Appointments.xml");
        return appointments;
    }
    
    
}
