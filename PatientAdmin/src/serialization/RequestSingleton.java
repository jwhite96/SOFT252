/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import accounts.*;
import appointments.Appointment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import requests.*;

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
     * @param doctor - requested doctor for appointments ONLY
     * @param dateTime - request dateTime for appointments ONLY
     */
    public static void createRequest(Account account, String requestType, Doctor doctor, String dateTime) {
                
        String ID = generateID();
        
        requests = getRequests();
        
        if (null != requestType)switch (requestType) {
            case "CREATE":
                requests.add(new CreateRequest(ID, account));
                break;
            case "APPOINTMENT":
                requests.add(new AppointmentRequest(ID, account, doctor, dateTime));
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
    
    public static Request convertToObject(String request) {
        
        for (Request i : requests) {
           if (request.contains(i.getRequestType())){
               return i;
           }
        }
        return null;
    }
    
    /**
     * 
     * @param request - request that is being actioned
     */
    public static void actionRequest(String request) {
        
        Request r = convertToObject(request); //convert to object
        Account a = r.getAccount(); //account making the request               
        
        if (null != r.getRequestType())switch (r.getRequestType()) {
            case "CREATE":
                AccountSingleton.addAccount(a);
                deleteRequest(request);
                break;
            case "DELETE":  
                AccountSingleton.deleteAccount(a);
                deleteRequest(request);
                break;
            case "APPOINTMENT":
                Doctor d = r.getAppointment().getDoctor();
                String dateTime = r.getAppointment().getDateTime();                
                Appointment e = new Appointment((Patient) a, d, dateTime, " ");
                AppointmentSingleton.addAppointment(e);
                deleteRequest(request);
                break;
            case "MEDICINE":
                
                break;
            default:
                break;
        }  
    }
    
    public static void deleteRequest(String request) {
        
        Request i = convertToObject(request);
        
        //remove request object
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
     * @return full list of all requests
     */
    public static ArrayList getRequests() {
        requests = RequestSerialiser.xmlDecoder(requests, "data/Requests.xml");
        return requests;
    }
    
    /**
     * 
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
