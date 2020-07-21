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
public class Secretary extends Account implements Serializable {
    
    public Secretary (String ID, String password, String firstName, String surname, String address) {
        this.ID = ID;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;        
        this.accountType = "SECRETARY";
    }

    public Secretary() {
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
    
   @Override
    public String toString(){
        return firstName + " " + surname;
    }
}
