/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointments;
import accounts.*;
import java.io.Serializable;

/**
 *
 * @author James
 */
public class Prescription implements Serializable {
    
    private Doctor doctor;
    private Patient patient;
    private String medicine;
    private int quantity;
    private String dosage;

    public Prescription(Doctor doctor, Patient patient, String medicine, int quantity, String dosage) {
        this.doctor = doctor;
        this.patient = patient;
        this.medicine = medicine;
        this.quantity = quantity;
        this.dosage = dosage;
    }

    public Prescription() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
    
    
}
