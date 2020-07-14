/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author James
 */
public abstract class Account {
    
    //common account attributes
    protected int ID;
    protected String password;
    protected String firstName;
    protected String surname;
    protected String address;
    protected String accountType;
    
    //getters
    public int getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }    
    
    public String getFirstName() {
        return firstName;
    }    

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getAccountType() {
        return accountType;
    }
     
    //verify login credentials 
    public static void verifyLogin() {
        
    }
    
}
