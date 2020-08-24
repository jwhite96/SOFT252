/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import accounts.Account;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author James
 */
public class AccountSerialiserTest {
    
    public AccountSerialiserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of xmlEncoder method, of class AccountSerialiser.
     */
    @Test
    public void testXmlEncoder() {
        System.out.println("xmlEncoder");
        ArrayList<Account> accountsList = null;
        String XML = "";
        AccountSerialiser.xmlEncoder(accountsList, XML);
        fail("The test case is a prototype.");
    }

    /**
     * Test of xmlDecoder method, of class AccountSerialiser.
     */
    @Test
    public void testXmlDecoder() {
        System.out.println("xmlDecoder");
        ArrayList<Account> accountsList = null;
        String XML = "";
        ArrayList expResult = null;
        ArrayList result = AccountSerialiser.xmlDecoder(accountsList, XML);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
