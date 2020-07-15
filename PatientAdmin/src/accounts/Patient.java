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
public class Patient extends Account{
    
    private String gender;
    private int age;
    
    //constructor
    public Patient (String ID, String password, String firstName, String surname, String address) {
        this.ID = ID;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;        
        this.accountType = "PATIENT";
    }
    
    public void requestAccount(){
        
    }
    
    public void provideFeedback(){
        
    }
    
    public void viewRatings(){
        
    }
    
    public void requestAppointment(){
        
    }
    
    public void addAccount(){
        
    }
    
    @Override
    public String toString(){
        return ID + password + firstName + surname + address + accountType;
    }
    
}
