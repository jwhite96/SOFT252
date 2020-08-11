/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;

import accounts.*;

/**
 *
 * @author James
 */
public class MedicineRequest extends Request {
    
    private String medicine;
    private int quantity;
    
    public MedicineRequest(Account account, String medicine, int quantity) {
        this.Account = account;
        this.requestType = "MEDICINE";
        this.medicine = medicine;
        this.quantity = quantity;
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
}
