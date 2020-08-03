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
    
    public MedicineRequest(String ID, Account account) {
        this.ID = ID;
        this.Account = account;
        this.requestType = "MEDICINE";
    }  
}
