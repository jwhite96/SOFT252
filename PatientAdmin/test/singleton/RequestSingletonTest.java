/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import accounts.Account;
import accounts.Doctor;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import requests.Request;

/**
 *
 * @author James
 */
public class RequestSingletonTest {
    
    public RequestSingletonTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of createRequest method, of class RequestSingleton.
     */
    @Test
    public void testCreateRequest() {
        System.out.println("createRequest");
        Account account = null;
        String requestType = "";
        Doctor doctor = null;
        String dateTime = "";
        String medicine = "";
        int quantity = 0;
        RequestSingleton.createRequest(account, requestType, doctor, dateTime, medicine, quantity);
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToObject method, of class RequestSingleton.
     */
    @Test
    public void testConvertToObject() {
        System.out.println("convertToObject");
        String request = "";
        Request expResult = null;
        Request result = RequestSingleton.convertToObject(request);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionRequest method, of class RequestSingleton.
     */
    @Test
    public void testActionRequest() {
        System.out.println("actionRequest");
        String request = "";
        RequestSingleton.actionRequest(request);
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRequest method, of class RequestSingleton.
     */
    @Test
    public void testDeleteRequest() {
        System.out.println("deleteRequest");
        String request = "";
        RequestSingleton.deleteRequest(request);
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRequests method, of class RequestSingleton.
     */
    @Test
    public void testUpdateRequests() {
        System.out.println("updateRequests");
        RequestSingleton.updateRequests();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequests method, of class RequestSingleton.
     */
    @Test
    public void testGetRequests() {
        System.out.println("getRequests");
        ArrayList expResult = null;
        ArrayList result = RequestSingleton.getRequests();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToArray method, of class RequestSingleton.
     */
    @Test
    public void testConvertToArray() {
        System.out.println("convertToArray");
        String[] expResult = null;
        String[] result = RequestSingleton.convertToArray();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
