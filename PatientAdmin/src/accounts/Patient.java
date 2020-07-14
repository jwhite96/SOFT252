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
    public Patient (int ID, String firstName, String surname, String address) {
        this.ID = ID;
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
    
}
