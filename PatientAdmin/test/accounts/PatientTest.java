/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author James
 */
public class PatientTest {
    
    public PatientTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of requestAccount method, of class Patient.
     */
    @Test
    public void testRequestAccount() {
        System.out.println("requestAccount");
        Account account = null;
        Patient.requestAccount(account);
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestAppointment method, of class Patient.
     */
    @Test
    public void testRequestAppointment() {
        System.out.println("requestAppointment");
        Account patient = null;
        Doctor doctor = null;
        String dateTime = "";
        Patient.requestAppointment(patient, doctor, dateTime);
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class Patient.
     */
    @Test
    public void testDeleteAccount() {
        System.out.println("deleteAccount");
        Account account = null;
        Patient.deleteAccount(account);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointments method, of class Patient.
     */
    @Test
    public void testGetAppointments() {
        System.out.println("getAppointments");
        Account p = null;
        String[] expResult = null;
        String[] result = Patient.getAppointments(p);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistory method, of class Patient.
     */
    @Test
    public void testGetHistory() {
        System.out.println("getHistory");
        Account p = null;
        String[] expResult = null;
        String[] result = Patient.getHistory(p);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelAppointment method, of class Patient.
     */
    @Test
    public void testCancelAppointment() {
        System.out.println("cancelAppointment");
        String appointment = "";
        Patient.cancelAppointment(appointment);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Patient.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Patient.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Patient instance = new Patient();
        instance.setGender(gender);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Patient.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Patient instance = new Patient();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Patient.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Patient instance = new Patient();
        instance.setAge(age);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Patient.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Patient instance = new Patient();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
