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
public class PrescriptionSingleton {
    
    private static ArrayList<Prescription> prescriptions = new ArrayList<>();
    
    /**
     * Load XML
     * @return array list of saved prescriptions
     */
    public static ArrayList loadXML(){

        try {
            XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream("data/Accounts.xml")));            
            ArrayList<Prescription> savedPrescriptions = (ArrayList<Prescription>) d.readObject();
            d.close();  
            
            return savedPrescriptions;
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(AccountSingleton.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
    }
     
    public static void createPrescription(Doctor doctor, Patient patient, String medicine, int quantity, String dosage) {
                
        //prescriptions = loadXML();
                
        // add prescription function
        prescriptions.add(new Prescription(doctor, patient, medicine, quantity, dosage));
        
        updateXML();
    }
    
    /**
     * update XML with newly created prescription
     */
    private static void updateXML() {
        
        try {
            XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("data/Accounts.xml")));
            e.writeObject(prescriptions);
            e.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccountSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * @return full list of all prescriptions
     */
    public static ArrayList getAppointments() { //tweak to only ger user specific ones
        prescriptions = loadXML();
        return prescriptions;
    } 
}
