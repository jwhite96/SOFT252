/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author James
 */
public class MedicineRequestTest {
    
    public MedicineRequestTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getMedicine method, of class MedicineRequest.
     */
    @Test
    public void testGetMedicine() {
        System.out.println("getMedicine");
        MedicineRequest instance = new MedicineRequest();
        String expResult = "";
        String result = instance.getMedicine();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedicine method, of class MedicineRequest.
     */
    @Test
    public void testSetMedicine() {
        System.out.println("setMedicine");
        String medicine = "";
        MedicineRequest instance = new MedicineRequest();
        instance.setMedicine(medicine);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class MedicineRequest.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        MedicineRequest instance = new MedicineRequest();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class MedicineRequest.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        MedicineRequest instance = new MedicineRequest();
        instance.setQuantity(quantity);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MedicineRequest.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MedicineRequest instance = new MedicineRequest();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
