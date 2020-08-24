/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import appointments.Appointment;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author James
 */
public class DoctorTest {
    
    public DoctorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of viewAppointments method, of class Doctor.
     */
    @Test
    public void testViewAppointments() {
        System.out.println("viewAppointments");
        Account d = null;
        String[] expResult = null;
        String[] result = Doctor.viewAppointments(d);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistory method, of class Doctor.
     */
    @Test
    public void testGetHistory() {
        System.out.println("getHistory");
        Account d = null;
        String[] expResult = null;
        String[] result = Doctor.getHistory(d);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointment method, of class Doctor.
     */
    @Test
    public void testGetAppointment() {
        System.out.println("getAppointment");
        String appointment = "";
        Appointment expResult = null;
        Appointment result = Doctor.getAppointment(appointment);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of endAppointment method, of class Doctor.
     */
    @Test
    public void testEndAppointment() {
        System.out.println("endAppointment");
        Appointment a = null;
        String notes = "";
        Doctor.endAppointment(a, notes);
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelAppointment method, of class Doctor.
     */
    @Test
    public void testCancelAppointment() {
        System.out.println("cancelAppointment");
        String appointment = "";
        Doctor.cancelAppointment(appointment);
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestStock method, of class Doctor.
     */
    @Test
    public void testRequestStock() {
        System.out.println("requestStock");
        Account doctor = null;
        String medicine = "";
        int quantity = 0;
        Doctor.requestStock(doctor, medicine, quantity);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRating method, of class Doctor.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        Doctor instance = new Doctor();
        int expResult = 0;
        int result = instance.getRating();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRating method, of class Doctor.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        int rating = 0;
        Doctor instance = new Doctor();
        instance.setRating(rating);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Doctor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Doctor instance = new Doctor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
