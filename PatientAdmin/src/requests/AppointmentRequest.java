/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;
import accounts.Doctor;

/**
 *
 * @author James
 */
public class AppointmentRequest extends Request {
    
    private Doctor doctor;
    private String date; //sort out dates later
    
    public AppointmentRequest() {
        this.requestType = "APPOINTMENT";
    }  
    
}
