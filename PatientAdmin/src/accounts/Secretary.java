/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import java.io.Serializable;
import serialization.RequestSingleton;

/**
 *
 * @author James
 */
public class Secretary extends Account implements Serializable {
    
    public Secretary (String ID, String password, String firstName, String surname, String address) {
        this.ID = ID;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;        
        this.accountType = "SECRETARY";
    }

    public Secretary() {
    }
    
    public static void actionRequest(String request) {
        RequestSingleton.actionRequest(request);
    }
    
    public static void deleteRequest(String request) {
        RequestSingleton.deleteRequest(request);
    }

    public static String [] getRequests() {
        return RequestSingleton.convertToArray();
    }

    @Override
    public String toString(){
        return ID + ": " + firstName + " " + surname;
    }
}
