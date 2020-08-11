/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import accounts.*;
import appointments.Appointment;
import java.io.Serializable;
import java.util.ArrayList;
import pharmacy.Medicine;
import requests.*;
import serialization.RequestSerialiser;

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
     * @param account - account making the request
     * @param requestType - request type
     * @param doctor - requested doctor for appointments ONLY
     * @param dateTime - request dateTime for appointments ONLY
     * @param medicine - medicine for stock requests ONLY
     * @param quantity - quantity for stock requests ONLY
     */
    public static void createRequest(Account account, String requestType, Doctor doctor, String dateTime, String medicine, int quantity) {
                        
        requests = getRequests();
        
        if (null != requestType)switch (requestType) {
            case "CREATE":
                requests.add(new CreateRequest(account));
                break;
            case "APPOINTMENT":
                requests.add(new AppointmentRequest(account, doctor, dateTime));
                break;
            case "DELETE":
                requests.add(new DeleteRequest(account));
                break;
            case "MEDICINE":
                requests.add(new MedicineRequest(account, medicine, quantity));
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
        
        Request r = convertToObject(request); //convert to request object
        Account a = r.getAccount(); //account making the request
        
        if (null != r.getRequestType())switch (r.getRequestType()) {
            case "CREATE":
                AccountSingleton.addAccount(a);
                deleteRequest(request);
                break;
            case "DELETE":
                AccountSingleton.deleteAccount(AccountSingleton.convertToObject(a.getID()));
                deleteRequest(request);
                break;
            case "APPOINTMENT":
                AppointmentRequest e = (AppointmentRequest) r;
                Doctor d = e.getDoctor();
                String dateTime = e.getDateTime();
                Appointment newAppointment = new Appointment((Patient) a, d, dateTime, " ");
                AppointmentSingleton.addAppointment(newAppointment);
                deleteRequest(request);
                break;
            case "MEDICINE":
                MedicineRequest m = (MedicineRequest) r;
                String medicine = m.getMedicine();
                int quantity = m.getQuantity();
                Medicine newOrder = new Medicine(medicine, quantity);
                MedicineSingleton.addMedicine(newOrder);
                deleteRequest(request);
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
