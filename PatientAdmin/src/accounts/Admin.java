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
public class Admin extends Account {
    
    //constructor
    public Admin (int ID, String firstName, String surname, String address) {
        this.ID = ID;
        this.firstName = firstName;
        this.surname = surname;
        this.accountType = "ADMIN";
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
    
}
