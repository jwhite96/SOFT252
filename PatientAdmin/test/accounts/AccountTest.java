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
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getID method, of class Account.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Account instance = new AccountImpl();
        String expResult = "";
        String result = instance.getID();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Account.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        String ID = "";
        Account instance = new AccountImpl();
        instance.setID(ID);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Account.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Account instance = new AccountImpl();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Account.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Account instance = new AccountImpl();
        instance.setPassword(password);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Account.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Account instance = new AccountImpl();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Account.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Account instance = new AccountImpl();
        instance.setFirstName(firstName);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Account.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Account instance = new AccountImpl();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Account.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        Account instance = new AccountImpl();
        instance.setSurname(surname);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Account.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Account instance = new AccountImpl();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Account.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Account instance = new AccountImpl();
        instance.setAddress(address);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccountType method, of class Account.
     */
    @Test
    public void testGetAccountType() {
        System.out.println("getAccountType");
        Account instance = new AccountImpl();
        String expResult = "";
        String result = instance.getAccountType();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAccountType method, of class Account.
     */
    @Test
    public void testSetAccountType() {
        System.out.println("setAccountType");
        String accountType = "";
        Account instance = new AccountImpl();
        instance.setAccountType(accountType);
        fail("The test case is a prototype.");
    }

    public class AccountImpl extends Account {
    }
    
}
