/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pharmacy.Medicine;

/**
 *
 * @author James
 */
public class MedicineSingletonTest {
    
    public MedicineSingletonTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of addMedicine method, of class MedicineSingleton.
     */
    @Test
    public void testAddMedicine() {
        System.out.println("addMedicine");
        Medicine medicine = null;
        MedicineSingleton.addMedicine(medicine);
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStock method, of class MedicineSingleton.
     */
    @Test
    public void testDeleteStock() {
        System.out.println("deleteStock");
        Medicine m = null;
        MedicineSingleton.deleteStock(m);
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStock method, of class MedicineSingleton.
     */
    @Test
    public void testUpdateStock() {
        System.out.println("updateStock");
        MedicineSingleton.updateStock();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStock method, of class MedicineSingleton.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        ArrayList expResult = null;
        ArrayList result = MedicineSingleton.getStock();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToObject method, of class MedicineSingleton.
     */
    @Test
    public void testConvertToObject() {
        System.out.println("convertToObject");
        String m = "";
        Medicine expResult = null;
        Medicine result = MedicineSingleton.convertToObject(m);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToArray method, of class MedicineSingleton.
     */
    @Test
    public void testConvertToArray() {
        System.out.println("convertToArray");
        String[] expResult = null;
        String[] result = MedicineSingleton.convertToArray();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
