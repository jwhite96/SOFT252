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
public class PrescriptionTest {
    
    public PrescriptionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getDoctor method, of class Prescription.
     */
    @Test
    public void testGetDoctor() {
        System.out.println("getDoctor");
        Prescription instance = new Prescription();
        Doctor expResult = null;
        Doctor result = instance.getDoctor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoctor method, of class Prescription.
     */
    @Test
    public void testSetDoctor() {
        System.out.println("setDoctor");
        Doctor doctor = null;
        Prescription instance = new Prescription();
        instance.setDoctor(doctor);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class Prescription.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        Prescription instance = new Prescription();
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatient method, of class Prescription.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        Prescription instance = new Prescription();
        instance.setPatient(patient);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicine method, of class Prescription.
     */
    @Test
    public void testGetMedicine() {
        System.out.println("getMedicine");
        Prescription instance = new Prescription();
        String expResult = "";
        String result = instance.getMedicine();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedicine method, of class Prescription.
     */
    @Test
    public void testSetMedicine() {
        System.out.println("setMedicine");
        String medicine = "";
        Prescription instance = new Prescription();
        instance.setMedicine(medicine);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class Prescription.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Prescription instance = new Prescription();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class Prescription.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Prescription instance = new Prescription();
        instance.setQuantity(quantity);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDosage method, of class Prescription.
     */
    @Test
    public void testGetDosage() {
        System.out.println("getDosage");
        Prescription instance = new Prescription();
        String expResult = "";
        String result = instance.getDosage();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDosage method, of class Prescription.
     */
    @Test
    public void testSetDosage() {
        System.out.println("setDosage");
        String dosage = "";
        Prescription instance = new Prescription();
        instance.setDosage(dosage);
        fail("The test case is a prototype.");
    }
    
}
