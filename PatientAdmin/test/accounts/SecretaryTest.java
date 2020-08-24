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
public class SecretaryTest {
    
    public SecretaryTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of actionRequest method, of class Secretary.
     */
    @Test
    public void testActionRequest() {
        System.out.println("actionRequest");
        String request = "";
        Secretary.actionRequest(request);
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRequest method, of class Secretary.
     */
    @Test
    public void testDeleteRequest() {
        System.out.println("deleteRequest");
        String request = "";
        Secretary.deleteRequest(request);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequests method, of class Secretary.
     */
    @Test
    public void testGetRequests() {
        System.out.println("getRequests");
        String[] expResult = null;
        String[] result = Secretary.getRequests();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPharmacy method, of class Secretary.
     */
    @Test
    public void testGetPharmacy() {
        System.out.println("getPharmacy");
        String[] expResult = null;
        String[] result = Secretary.getPharmacy();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStock method, of class Secretary.
     */
    @Test
    public void testRemoveStock() {
        System.out.println("removeStock");
        String m = "";
        Secretary.removeStock(m);
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Secretary.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Secretary instance = new Secretary();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
