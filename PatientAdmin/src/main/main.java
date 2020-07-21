/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import accounts.Account;
import appointments.*;
import controllers.LoginController;
import java.util.ArrayList;
import serialised.*;
import view.Login;

/**
 *
 * @author James
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Login login = new Login();
       login.setVisible(true);
       
       System.out.println(AccountSingleton.getAccounts());             
   
       String username = "A1001";
       String passsword = "admin";
              
       for (Account a : (ArrayList<Account>)AccountSingleton.getAccounts()) {
            if ((a.getID().contentEquals(username)) && (a.getPassword().contentEquals(passsword))) {
                System.out.println("YAY");
            } 
            else 
            {        
            System.out.println("FUCK");
            }
        }
       
    }    
}
