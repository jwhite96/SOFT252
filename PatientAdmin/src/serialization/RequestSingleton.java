/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.Serializable;
import java.util.ArrayList;
import requests.*;

/**
 *
 * @author James
 */
public class RequestSingleton implements Serializable {
    
    private static ArrayList<Request> requests = new ArrayList<>();

    public RequestSingleton() {
    }
        
    public static void updateRequest() {
        RequestSerialiser.xmlDecoder(requests, "data/Requests.xml");
    }
    
    /**
     * 
     * @return full list of all appointments
     */
    public static ArrayList getRequests() {
        requests = RequestSerialiser.xmlDecoder(requests, "data/Requests.xml");
        return requests;
    }
    
}
