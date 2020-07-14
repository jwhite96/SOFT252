/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author James
 */
public class Doctor extends Account{
    
    private int rating;
    
    //constructors
    public Doctor (int ID, String firstName, String surname, String address) {
        this.ID = ID;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.accountType = "DOCTOR";
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
}
