/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.io.Serializable;

/**
 *
 * @author James
 */
public class Medicine implements Serializable {
    
    private String medicine;
    private int quantity;

    public Medicine(String medicine, int quantity) {
        this.medicine = medicine;
        this.quantity = quantity;
    }

    public Medicine() {
    }
    
    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return medicine + ": " + quantity + " Units";
    }    
}
