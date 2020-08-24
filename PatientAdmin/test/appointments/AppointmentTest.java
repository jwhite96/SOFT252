/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointments;

import accounts.Doctor;
import accounts.Patient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author James
 */
public class AppointmentTest {
    
    public AppointmentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getDoctor method, of class Appointment.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        Appointment instance = new Appointment();
        Doctor expResult = null;
        Doctor result = instance.getDoctor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctor method, of class Appointment.
     */
    @Test
    public void testSetDoctor() {
        System.out.println("setDoctor");
        Doctor doctor = null;
        Appointment instance = new Appointment();
        instance.setDoctor(doctor);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class Appointment.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        Appointment instance = new Appointment();
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatient method, of class Appointment.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        Appointment instance = new Appointment();
        instance.setPatient(patient);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Appointment.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Appointment.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        Appointment instance = new Appointment();
        instance.setDate(date);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotes method, of class Appointment.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.getNotes();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotes method, of class Appointment.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        String notes = "";
        Appointment instance = new Appointment();
        instance.setNotes(notes);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Appointment.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Appointment instance = new Appointment();
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Appointment.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        int status = 0;
        Appointment instance = new Appointment();
        instance.setStatus(status);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Appointment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Appointment instance = new Appointment();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
