/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountfactory;

import accounts.*;
import java.util.List;

/**
 *
 * @author James
 */
public class AccountFactory {
    
    List<Doctor> doctors;
    List<Patient> patients;   
    List<Admin> admins;
    List<Secretary> secretarys;
    
    public AccountFactory(List<Doctor> doctors, List<Patient> patients, List<Admin> admins, List<Secretary> secretarys) {
        this.doctors = doctors;
        this.patients = patients;
        this.admins = admins;
        this.secretarys = secretarys;  
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    
    public void addPatient(Patient patient){
        patients.add(patient);
    }
    
    public void addAdmin(Admin admin){
        admins.add(admin);
    }
    
    public void addSecretary(Secretary secretary){
        secretarys.add(secretary);
    }
    
    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }

    public List<Secretary> getSecretarys() {
        return secretarys;
    }

    public void setSecretarys(List<Secretary> secretarys) {
        this.secretarys = secretarys;
    }
    
    
}
