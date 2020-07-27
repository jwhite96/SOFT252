/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;

import accounts.Doctor;
import accounts.Patient;
import java.io.Serializable;

/**
 *
 * @author James
 */
public class AppointmentRequest extends Request implements Serializable {
    
    private Doctor doctor;
    private Patient patient;
    private String date;
    
    public AppointmentRequest() {
        this.requestType = "APPOINTMENT";
    }
    
    
    
}
