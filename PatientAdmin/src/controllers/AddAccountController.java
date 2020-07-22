/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import accounts.Account;
import accounts.Admin;
import javax.swing.JOptionPane;
import view.AddAccount;

/**
 *
 * @author James
 */
public class AddAccountController {
    
    private final AddAccount view;
    private final Admin admin;
    
    public AddAccountController(Account admin) {
        this.view = new AddAccount();
        this.admin = (Admin) admin;
        initController();
        view.setVisible(true);
    }
            
    public void initController() {
        view.getBtnCreate().addActionListener(e -> createAccount());
        view.getBtnBack().addActionListener(e -> back());
    }
    
    private void createAccount() {
        String accountType = view.getCmbType().getSelectedItem().toString();
        String firstName = view.getTxtFirstName().getText();
        String surname = view.getTxtSurname().getText();
        String address = view.getTxtAddress().getText();
        String password = String.valueOf(view.getTxtPassword().getPassword());

        if (firstName.isEmpty() || surname.isEmpty() || address.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Entry");
        } 
        else 
        {
            Admin.createAccount(password, firstName, surname, address, accountType);
        }

        JOptionPane.showMessageDialog(null, "Account Created");
        view.setVisible(false);
        new AdminController(admin);
    }
    
    private void back(){
        view.setVisible(false);
    }
}
