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
public class Appointment implements Serializable {
    
    private Doctor doctor;
    private Patient patient;
    private String date;
    private String notes;
    private int status; //0 = upcoming | 1 = previous

    public Appointment(Doctor doctor, Patient patient, String date, String notes, int status) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.notes = notes;
        this.status = status;
    }
    
    public Appointment() {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
    
}
