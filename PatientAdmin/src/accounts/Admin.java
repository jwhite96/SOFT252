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
public class Admin extends Account implements Serializable {
    
    //constructor
    public Admin (String ID, String password, String firstName, String surname, String address) {
        this.ID = ID;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;        
        this.accountType = "ADMIN";
    }

    public Admin() {
    }
    
    public static void createAccount(){
        
    }
    
    public static void addAccount(){
        
    }
    
    public static void removeAccount(){
        
    }
    
    public static void viewRatings(){
        
    }
    
    public static void giveFeedback() {
        
    }
    
    @Override
    public String toString(){
        return ID + " " + firstName + " " + surname;
    }
}
