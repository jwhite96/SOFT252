/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import singleton.AccountSingleton;
import accounts.Account;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James
 */
public class AccountSerialiser implements Serializable {
    
    public AccountSerialiser() {
    }
    
    /**
     * 
     * @param accountsList - current ArrayList of accounts after each update
     * @param XML - name of the XML file
     */
    public static void xmlEncoder(ArrayList<Account> accountsList, String XML) {
        
        try {
            XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(XML)));
            e.writeObject(accountsList);
            e.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccountSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * @param accountsList
     * @param XML
     * @return ArrayList of saved accounts in the XML file
     */
    public static ArrayList xmlDecoder(ArrayList<Account> accountsList, String XML) {
    
        try {
            XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream(XML)));            
            ArrayList<Account> savedAccounts = (ArrayList<Account>) d.readObject();
            d.close();  
            
            return savedAccounts;
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(AccountSingleton.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
    }
}
