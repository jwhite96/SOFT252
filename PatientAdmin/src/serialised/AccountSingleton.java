/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialised;

import accounts.*;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James
 */
public class AccountSingleton implements Serializable {
    
    private static ArrayList<Account> accountsList = new ArrayList<>();
    
    public AccountSingleton() {
    } 
    
    /**
     * Load XML
     * @return array list of saved accounts
     */
    public static ArrayList loadXML(){

        try {
            XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream("data/Accounts.xml")));            
            ArrayList<Account> savedAccounts = (ArrayList<Account>) d.readObject();
            d.close();  
            
            return savedAccounts;
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(AccountSingleton.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
    }
    
    /**
     * 
     * @param accountType - account type of requested account
     * @return randomly generated ID with correct account code
     */
    public static String generateID(String accountType){
        
        String accountCode = null;
        
        if (null != accountType)switch (accountType) {
            case "ADMIN":
                accountCode = "A";
                break;
            case "DOCTOR":
                accountCode = "D";
                break;
            case "PATIENT":
                accountCode = "P";
                break;
            case "SECRETARY":
                accountCode = "S";
                break;
            default:
                break;
        }

        Random rand = new Random();
        String digits = Integer.toString(rand.nextInt(10000));
               
        String ID = accountCode + digits;
        
        return ID;
    }        
    
    /**
     * 
     * @param password- users password
     * @param firstName - users first name
     * @param surname - users surname
     * @param address = users address
     * @param accountType - account type of the user [Admin, Doctor, Patient or Secretary]
     */
    public static void createAccount(String password, String firstName, String surname, String address, String accountType) {
                
        accountsList = loadXML();
        
        String ID = generateID(accountType);
        
        if (null != accountType)switch (accountType) {
            case "DOCTOR":
                accountsList.add(new Doctor(ID, password, firstName, surname, address));
                break;
            case "ADMIN":
                accountsList.add(new Admin(ID, password, firstName, surname, address));
                break;
            case "PATIENT":
                accountsList.add(new Patient(ID, password, firstName, surname, address));
                break;
            case "SECRETARY":
                accountsList.add(new Secretary(ID, password, firstName, surname, address));
                break;
            default:
                break;
        }
        
        updateXML();

    }
    
    /**
     * update XML with newly created account
     */
    private static void updateXML() {
        
        try {
            XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("data/Accounts.xml")));
            e.writeObject(accountsList);
            e.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccountSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * @return full list of all users
     */
    public static ArrayList getAccounts() {
        accountsList = loadXML();
        return accountsList;
    } 


}
