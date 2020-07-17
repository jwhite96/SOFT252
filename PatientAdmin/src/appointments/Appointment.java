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
    private String date; //Sort out date later
    private String notes;

    public Appointment(Doctor doctor, Patient patient, String date, String notes) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.notes = notes;
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
