/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

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
public class AppointmentSerialiserTest {
    
    public AppointmentSerialiserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of xmlEncoder method, of class AppointmentSerialiser.
     */
    @Test
    public void testXmlEncoder() {
        System.out.println("xmlEncoder");
        ArrayList<Appointment> appointments = null;
        String XML = "";
        AppointmentSerialiser.xmlEncoder(appointments, XML);
        fail("The test case is a prototype.");
    }

    /**
     * Test of xmlDecoder method, of class AppointmentSerialiser.
     */
    @Test
    public void testXmlDecoder() {
        System.out.println("xmlDecoder");
        ArrayList<Appointment> appointments = null;
        String XML = "";
        ArrayList expResult = null;
        ArrayList result = AppointmentSerialiser.xmlDecoder(appointments, XML);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
