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
    
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String notes;
    private int status; // 0 = outstanding, 1 = concluded

    public Appointment(Patient patient, Doctor doctor, String date, String notes, int status) {
        this.patient = patient;
        this.doctor = doctor;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
        
    @Override
    public String toString(){
        return patient + " " + date + " " + notes;
    }    
}
