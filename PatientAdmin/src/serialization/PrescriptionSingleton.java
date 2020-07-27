/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;
import accounts.*;
import appointments.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author James
 */
public class PrescriptionSingleton implements Serializable {

    private static ArrayList<Prescription> prescriptions = new ArrayList<>();
    
    public PrescriptionSingleton() {
    }

    public static void createPrescription(Doctor doctor, Patient patient, String medicine, int quantity, String dosage) {
                
        prescriptions = getAppointments();
                
        // add prescription function
        prescriptions.add(new Prescription(doctor, patient, medicine, quantity, dosage));

    }

    /**
     * 
     * @return full list of all prescriptions
     */
    public static ArrayList getAppointments() {
        PrescriptionSerialiser.xmlDecoder(prescriptions, "data/Prescriptions.xml");
        return prescriptions;
    }
    
    public static void updateAppoitments() {
        PrescriptionSerialiser.xmlEncoder(prescriptions, "data/Prescriptions.xml");
    }
}
