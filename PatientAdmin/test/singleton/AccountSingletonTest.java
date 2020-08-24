/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

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
public class AccountSingletonTest {
    
    public AccountSingletonTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of generateID method, of class AccountSingleton.
     */
    @Test
    public void testGenerateID() {
        System.out.println("generateID");
        String accountType = "";
        String expResult = "";
        String result = AccountSingleton.generateID(accountType);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAccount method, of class AccountSingleton.
     */
    @Test
    public void testCreateAccount() {
        System.out.println("createAccount");
        String ID = "";
        String password = "";
        String firstName = "";
        String surname = "";
        String address = "";
        String accountType = "";
        AccountSingleton.createAccount(ID, password, firstName, surname, address, accountType);
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToObject method, of class AccountSingleton.
     */
    @Test
    public void testConvertToObject() {
        System.out.println("convertToObject");
        String account = "";
        Account expResult = null;
        Account result = AccountSingleton.convertToObject(account);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccount method, of class AccountSingleton.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        Account a = null;
        AccountSingleton.addAccount(a);
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class AccountSingleton.
     */
    @Test
    public void testDeleteAccount() {
        System.out.println("deleteAccount");
        Account a = null;
        AccountSingleton.deleteAccount(a);
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccounts method, of class AccountSingleton.
     */
    @Test
    public void testUpdateAccounts() {
        System.out.println("updateAccounts");
        AccountSingleton.updateAccounts();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccounts method, of class AccountSingleton.
     */
    @Test
    public void testGetAccounts() {
        System.out.println("getAccounts");
        ArrayList expResult = null;
        ArrayList result = AccountSingleton.getAccounts();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountsByType method, of class AccountSingleton.
     */
    @Test
    public void testGetAccountsByType() {
        System.out.println("getAccountsByType");
        String accountType = "";
        String[] expResult = null;
        String[] result = AccountSingleton.getAccountsByType(accountType);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
