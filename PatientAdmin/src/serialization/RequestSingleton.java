/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import accounts.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import requests.*;
import static serialization.AccountSingleton.convertToObject;
import static serialization.AccountSingleton.updateAccounts;

/**
 *
 * @author James
 */
public class RequestSingleton implements Serializable {
    
    private static ArrayList<Request> requests = new ArrayList<>();

    public RequestSingleton() {
    }
    
    /**
     * 
     * @return randomly generated ID
     */
    public static String generateID(){
               
        Random rand = new Random();
        String digits = Integer.toString(rand.nextInt(10000));
               
        String ID = "R" + digits;
        
        return ID;
    }        
    
    /**
     * 
     * @param account - account making the request
     * @param requestType - request type
     * @param doctor - doctor for appointment request
     * @param date - date for appointment request
     */
    public static void createRequest(Account account, String requestType, Doctor doctor, String date) {
                
        String ID = generateID();
        
        requests = getRequests();
        
        if (null != requestType)switch (requestType) {
            case "CREATE":
                requests.add(new CreateRequest(ID, account));
                break;
            case "APPOINTMENT":
                requests.add(new AppointmentRequest(ID, account, doctor, date));
                break;
            case "DELETE":
                requests.add(new DeleteRequest(ID ,account));
                break;
            case "MEDICINE":
                requests.add(new MedicineRequest(ID, account));
                break;
            default:
                break;
        }  
        updateRequests();
    }
    
    public static Request convertToObject(String account) {
        
        for (Request i : requests) {
           if (account.contains(i.getRequestType())){
               return i;
           }
        }
        return null;
    }
    
    public static void deleteRequest(String request) {
        
        Request i = convertToObject(request);
        
        //remove account object
        if (requests.contains(i)) {
            requests.remove(i);
        }
           
        //update xml
        updateRequests();
    }

    public static void updateRequests() {
        RequestSerialiser.xmlEncoder(requests, "data/Requests.xml");
    }
    
    /**
     * 
     * @return full list of all appointments
     */
    public static ArrayList getRequests() {
        requests = RequestSerialiser.xmlDecoder(requests, "data/Requests.xml");
        return requests;
    }
    
    /**
     * 
     * @param requestType
     * @return string array of requests sorted by type
     */
    public static String [] convertToArray(){
             
        getRequests();
        
        //create new string array for converted list
        String[] list = new String[requests.size()];
              
        //loop through arraylist and put into string array
        for (int j = 0; j < requests.size(); j++) {
            list[j] = requests.get(j).toString();
        }        
        
        return list;
    }    
    
}
