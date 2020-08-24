/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import accounts.Account;
import appointments.Appointment;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author James
 */
public class AppointmentSingletonTest {
    
    public AppointmentSingletonTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of addAppointment method, of class AppointmentSingleton.
     */
    @Test
    public void testAddAppointment() {
        System.out.println("addAppointment");
        Appointment a = null;
        AppointmentSingleton.addAppointment(a);
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAppointment method, of class AppointmentSingleton.
     */
    @Test
    public void testDeleteAppointment() {
        System.out.println("deleteAppointment");
        Appointment a = null;
        AppointmentSingleton.deleteAppointment(a);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNotes method, of class AppointmentSingleton.
     */
    @Test
    public void testAddNotes() {
        System.out.println("addNotes");
        Appointment a = null;
        String notes = "";
        AppointmentSingleton.addNotes(a, notes);
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToObject method, of class AppointmentSingleton.
     */
    @Test
    public void testConvertToObject() {
        System.out.println("convertToObject");
        String a = "";
        Appointment expResult = null;
        Appointment result = AppointmentSingleton.convertToObject(a);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAppointments method, of class AppointmentSingleton.
     */
    @Test
    public void testUpdateAppointments() {
        System.out.println("updateAppointments");
        AppointmentSingleton.updateAppointments();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointments method, of class AppointmentSingleton.
     */
    @Test
    public void testGetAppointments() {
        System.out.println("getAppointments");
        ArrayList expResult = null;
        ArrayList result = AppointmentSingleton.getAppointments();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserAppointments method, of class AppointmentSingleton.
     */
    @Test
    public void testGetUserAppointments() {
        System.out.println("getUserAppointments");
        Account a = null;
        int status = 0;
        String[] expResult = null;
        String[] result = AppointmentSingleton.getUserAppointments(a, status);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
