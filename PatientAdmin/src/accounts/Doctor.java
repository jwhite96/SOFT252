/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import java.io.Serializable;

/**
 *
 * @author James
 */
public class Doctor extends Account implements Serializable {
    
    private int rating;
    
    public Doctor (String ID, String password, String firstName, String surname, String address, int rating) {
        this.ID = ID;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;        
        this.accountType = "DOCTOR";
        this.rating = rating;
    }    

    public Doctor() {
    }
    
    public void viewAppointments(){
        
    }
    
    public void createNotes(){
        
    }
    
    public void viewPatientHistory(){
        
    }
    
    public void createAppointment(){
        
    }
    
    public void createPrescription(){
        
    }
    
    public void requestMedicine(){
        
    }   
 
    @Override
    public String toString(){
        return ID + ": Dr " + firstName + " " + surname + " - " + rating;
    }
}
