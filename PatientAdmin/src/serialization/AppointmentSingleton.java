/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import appointments.*;
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
    
    
}
