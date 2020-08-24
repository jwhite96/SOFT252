/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;

import accounts.Doctor;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author James
 */
public class AppointmentRequestTest {
    
    public AppointmentRequestTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getDoctor method, of class AppointmentRequest.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        AppointmentRequest instance = new AppointmentRequest();
        Doctor expResult = null;
        Doctor result = instance.getDoctor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctor method, of class AppointmentRequest.
     */
    @Test
    public void testSetDoctor() {
        System.out.println("setDoctor");
        Doctor doctor = null;
        AppointmentRequest instance = new AppointmentRequest();
        instance.setDoctor(doctor);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateTime method, of class AppointmentRequest.
     */
    @Test
    public void testGetDateTime() {
        System.out.println("getDateTime");
        AppointmentRequest instance = new AppointmentRequest();
        String expResult = "";
        String result = instance.getDateTime();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateTime method, of class AppointmentRequest.
     */
    @Test
    public void testSetDateTime() {
        System.out.println("setDateTime");
        String dateTime = "";
        AppointmentRequest instance = new AppointmentRequest();
        instance.setDateTime(dateTime);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AppointmentRequest.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AppointmentRequest instance = new AppointmentRequest();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
