/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;

import accounts.*;
import java.io.Serializable;

/**
 *
 * @author James
 */
public class AppointmentRequest extends Request implements Serializable {
    
    private Doctor doctor;
    private String date;
    
    public AppointmentRequest(String ID, Account account, Doctor doctor, String date) {
        this.ID = ID;
        this.Account = account;
        this.doctor = doctor;
        this.date = date;
        this.requestType = "APPOINTMENT";
    }
        
    public AppointmentRequest() {
    }
    
    @Override
    public String toString(){
        return Account.getID() + " " + Account.getFirstName() + " " + Account.getSurname() + ": " + requestType;
    }
}
