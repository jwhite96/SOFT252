/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import requests.Request;

/**
 *
 * @author James
 */
public class RequestSerialiserTest {
    
    public RequestSerialiserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of xmlEncoder method, of class RequestSerialiser.
     */
    @Test
    public void testXmlEncoder() {
        System.out.println("xmlEncoder");
        ArrayList<Request> requests = null;
        String XML = "";
        RequestSerialiser.xmlEncoder(requests, XML);
        fail("The test case is a prototype.");
    }

    /**
     * Test of xmlDecoder method, of class RequestSerialiser.
     */
    @Test
    public void testXmlDecoder() {
        System.out.println("xmlDecoder");
        ArrayList<Request> requests = null;
        String XML = "";
        ArrayList expResult = null;
        ArrayList result = RequestSerialiser.xmlDecoder(requests, XML);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
