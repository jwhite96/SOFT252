/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialised;

import accounts.*;
import appointments.*;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James
 */
public class AppointmentSingleton {
    
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    
    /**
     * Load XML
     * @return array list of saved appointments
     */
    public static ArrayList loadXML(){

        try {
            XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream("data/Accounts.xml")));            
            ArrayList<Appointment> savedAppointments = (ArrayList<Appointment>) d.readObject();
            d.close();  
            
            return savedAppointments;
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(AccountSingleton.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
    }
     
        public static void createAppointment(Doctor doctor, Patient patient, String date, String notes) {
                
        appointments = loadXML();
                
        // add appointment function
        appointments.add(new Appointment(doctor, patient, date, notes));
         
        updateXML();
    }
    
    /**
     * update XML with newly created appointment
     */
    private static void updateXML() {
        
        try {
            XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("data/Accounts.xml")));
            e.writeObject(appointments);
            e.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccountSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * @return full list of all appointments
     */
    public static ArrayList getAppointments() { //tweak to only ger user specific ones
        appointments = loadXML();
        return appointments;
    } 
}
