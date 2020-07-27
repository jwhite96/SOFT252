/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;
   
import java.io.Serializable;
import serialization.AccountSingleton;

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
    
    public static String generateID(String accountType) {
        return AccountSingleton.generateID(accountType);
    }
    
    public static void createAccount(String ID, String password, String firstName, String surname, String address, String gender, int age, String accountType){
        AccountSingleton.createAccount(ID, password, firstName, surname, address, gender, age, accountType);
    }
        
    public static void removeAccount(String info){
        AccountSingleton.deleteAccount(info);
    }
    
    public static String [] viewAccounts(String accountType) {
        return AccountSingleton.getAccountsByType(accountType);
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
