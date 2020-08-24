/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;

import accounts.Account;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author James
 */
public class RequestTest {
    
    public RequestTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getID method, of class Request.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Request instance = new RequestImpl();
        String expResult = "";
        String result = instance.getID();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Request.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        String ID = "";
        Request instance = new RequestImpl();
        instance.setID(ID);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccount method, of class Request.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        Request instance = new RequestImpl();
        Account expResult = null;
        Account result = instance.getAccount();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestType method, of class Request.
     */
    @Test
    public void testGetRequestType() {
        System.out.println("getRequestType");
        Request instance = new RequestImpl();
        String expResult = "";
        String result = instance.getRequestType();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccount method, of class Request.
     */
    @Test
    public void testSetAccount() {
        System.out.println("setAccount");
        Account Account = null;
        Request instance = new RequestImpl();
        instance.setAccount(Account);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRequestType method, of class Request.
     */
    @Test
    public void testSetRequestType() {
        System.out.println("setRequestType");
        String requestType = "";
        Request instance = new RequestImpl();
        instance.setRequestType(requestType);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointment method, of class Request.
     */
    @Test
    public void testGetAppointment() {
        System.out.println("getAppointment");
        Request instance = new RequestImpl();
        AppointmentRequest expResult = null;
        AppointmentRequest result = instance.getAppointment();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAppointment method, of class Request.
     */
    @Test
    public void testSetAppointment() {
        System.out.println("setAppointment");
        AppointmentRequest appointment = null;
        Request instance = new RequestImpl();
        instance.setAppointment(appointment);
        fail("The test case is a prototype.");
    }

    public class RequestImpl extends Request {
    }
    
}
