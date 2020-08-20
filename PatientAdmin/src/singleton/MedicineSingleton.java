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
                
        // getStock();
        
        stockList.add(medicine);
        updateStock();
    }
    
     public static void deleteStock(Medicine m) {
                
        //remove account object
        if (stockList.contains(m)) {
            stockList.remove(m);
        }
                
        updateStock();
    }
    
    public static void updateStock() {
        PharmacySerialiser.xmlEncoder(stockList, "data/Pharmacy.xml");
    }
    
    /**
     * 
     * @return full list of users
     */
    public static ArrayList getStock() {
        stockList = PharmacySerialiser.xmlDecoder(stockList, "data/Pharmacy.xml");
        return stockList;
    }
    
    public static Medicine convertToObject(String m) {
        
        for (Medicine i : stockList) {
           if (m.contains(i.getMedicine())){
               return i;
           }
        }
        return null;
    }
    
    /**
     * 
     * @return string array of pharmacy stock
     */
    public static String [] convertToArray(){
             
        getStock();
        
        //create new string array for converted list
        String[] list = new String[stockList.size()];
              
        //loop through arraylist and put into string array
        for (int j = 0; j < stockList.size(); j++) {
            list[j] = stockList.get(j).toString();
        }        
        
        return list;
    }    
}

