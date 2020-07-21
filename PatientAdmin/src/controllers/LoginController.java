/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import accounts.Account;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import serialised.AccountSingleton;
import view.Login;

/**
 *
 * @author James
 */
public class LoginController {
    
    private final Login view;

    public LoginController() {
        this.view = new Login();
        initController();
        view.setVisible(true);
    }
    
    public void initController() {
        view.getBtnLogin().addActionListener(e -> login());
        view.getBtnClose().addActionListener(e -> close());
    }

    private void login(){
        String ID = view.getTxtID().getText();
        String password = String.valueOf(view.getTxtPassword().getPassword());
               
        for (Account i : (ArrayList<Account>)AccountSingleton.getAccounts()) {
            if ((i.getID().contentEquals(ID)) && (i.getPassword().contentEquals(password))) {
                
                switch (i.getAccountType()) {
                        case "ADMIN":
                            new AdminController(i);
                            view.setVisible(false);
                            return;
                        case "DOCTOR":
                            new DoctorController(i);
                            view.setVisible(false);
                            return;    
                        case "PATIENT":
                            new PatientController(i);
                            view.setVisible(false);
                            return;
                        case "SECRETARY":
                            new SecretaryController(i);
                            view.setVisible(false);
                            return;
                    }
            } 
            else 
            {        
                JOptionPane.showMessageDialog(null, "Invalid Login Credentials");
            }
        }
    }
    
    private void close() {
        System.exit(0);
    }
       
}
