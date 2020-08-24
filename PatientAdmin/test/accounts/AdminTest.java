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
public class AdminTest {
    
    public AdminTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of generateID method, of class Admin.
     */
    @Test
    public void testGenerateID() {
        System.out.println("generateID");
        String accountType = "";
        String expResult = "";
        String result = Admin.generateID(accountType);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAccount method, of class Admin.
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
        Admin.createAccount(ID, password, firstName, surname, address, accountType);
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAccount method, of class Admin.
     */
    @Test
    public void testRemoveAccount() {
        System.out.println("removeAccount");
        String account = "";
        Admin.removeAccount(account);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAccounts method, of class Admin.
     */
    @Test
    public void testGetAccounts() {
        System.out.println("getAccounts");
        String accountType = "";
        String[] expResult = null;
        String[] result = Admin.getAccounts(accountType);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewRatings method, of class Admin.
     */
    @Test
    public void testViewRatings() {
        System.out.println("viewRatings");
        Admin.viewRatings();
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveFeedback method, of class Admin.
     */
    @Test
    public void testGiveFeedback() {
        System.out.println("giveFeedback");
        Admin.giveFeedback();
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Admin.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Admin instance = new Admin();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
