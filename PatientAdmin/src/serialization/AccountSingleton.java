/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import accounts.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author James
 */
public class AccountSingleton implements Serializable {
    
    private static ArrayList<Account> accountsList = new ArrayList<>();
    
    public AccountSingleton() {
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
     * @param ID
     * @param password- users password
     * @param firstName - users first name
     * @param surname - users surname
     * @param address = users address
     * @param accountType - account type of the user [Admin, Doctor, Patient or Secretary]
     */
    public static void createAccount(String ID, String password, String firstName, String surname, String address, String accountType) {
                
        getAccounts();
        
        if (null != accountType)switch (accountType) {
            case "DOCTOR":
                accountsList.add(new Doctor(ID, password, firstName, surname, address, 0));
                break;
            case "ADMIN":
                accountsList.add(new Admin(ID, password, firstName, surname, address));
                break;
            case "SECRETARY":
                accountsList.add(new Secretary(ID, password, firstName, surname, address));
                break;
            default:
                break;
        }  
        updateAccounts();
    }
    
    public static Account convertToObject(String account) {
        
        for (Account i : accountsList) {
           if (account.contains(i.getID())){
               return i;
           }
        }
        return null;
    }
    
    public static void addAccount(Account a) {
        accountsList.add(a);
        updateAccounts();
    }
    
    public static void deleteAccount(Account a) {
        
        System.out.println(a);
        
        //remove account object
        if (accountsList.contains(a)) {
            accountsList.remove(a);
        }
        
        System.out.println(accountsList);
        
        updateAccounts();
    }
    
    public static void updateAccounts() {
        AccountSerialiser.xmlEncoder(accountsList, "data/Accounts.xml");
    }
    
    /**
     * 
     * @return full list of users
     */
    public static ArrayList getAccounts() {
        accountsList = AccountSerialiser.xmlDecoder(accountsList, "data/Accounts.xml");
        return accountsList;
    }       

    /**
     * 
     * @param accountType
     * @return string array of accounts sorted by type
     */
    public static String [] getAccountsByType(String accountType){
             
        getAccounts();
        
        ArrayList<Account> accountsByType = new ArrayList<>();

        // loop through list of accounts and find all of the same account type
        for (Account i : accountsList) {
            if (i.getAccountType().contentEquals(accountType)) {
                accountsByType.add(i);
            }
        }

        //create new string array for converted list
        String[] list = new String[accountsByType.size()];
              
        //loop through arraylist and put into string array
        for (int j = 0; j < accountsByType.size(); j++) {
            list[j] = accountsByType.get(j).toString();
        }        
        
        return list;
    }    
}

