/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.io.Serializable;
import java.util.ArrayList;
import pharmacy.Medicine;
import serialization.PharmacySerialiser;

/**
 *
 * @author James
 */
public class MedicineSingleton implements Serializable {
    
    private static ArrayList<Medicine> stockList = new ArrayList<>();
    
    public MedicineSingleton() {
    } 
               
    /**
     * 
     * @param medicine 
     */
    public static void addMedicine(Medicine medicine) {
                
        getStock();
        
        stockList.add(medicine);
        updateStock();
    }
    
    public static void updateStock() {
        PharmacySerialiser.xmlEncoder(stockList, "data/Accounts.xml");
    }
    
    /**
     * 
     * @return full list of users
     */
    public static ArrayList getStock() {
        stockList = PharmacySerialiser.xmlDecoder(stockList, "data/Accounts.xml");
        return stockList;
    }       
}

