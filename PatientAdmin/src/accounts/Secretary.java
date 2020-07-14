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
public class Secretary extends Account {
    
    //constructor
    public Secretary (int ID, String firstName, String surname, String address) {
        this.ID = ID;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.accountType = "SECRETARY";
    }  
    
    public void approveAccount() {
        
    }
    
    public void viewAppointmentRequest() {
        
    }
    
    public void createAppointment() {
        
    }
    
    public void giveMedicine() {
        
    }
    
    public void orderMedicine() {
        
    }
    
    public void removePatient() {
        
    }
    
    public void approveRemovalRequest() {
        
    }
}
