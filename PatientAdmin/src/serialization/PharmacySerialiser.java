/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

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
import pharmacy.Medicine;
import singleton.MedicineSingleton;

/**
 *
 * @author James
 */
public class PharmacySerialiser implements Serializable {
    
    public PharmacySerialiser() {
    }
    
    /**
     * 
     * @param accountsList - current ArrayList of accounts after each update
     * @param XML - name of the XML file
     */
    public static void xmlEncoder(ArrayList<Medicine> accountsList, String XML) {
        
        try {
            XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(XML)));
            e.writeObject(accountsList);
            e.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MedicineSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * @param accountsList
     * @param XML
     * @return ArrayList of saved accounts in the XML file
     */
    public static ArrayList xmlDecoder(ArrayList<Medicine> accountsList, String XML) {
    
        try {
            XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream(XML)));            
            ArrayList<Medicine> savedAccounts = (ArrayList<Medicine>) d.readObject();
            d.close();  
            
            return savedAccounts;
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(MedicineSingleton.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
    }
}
