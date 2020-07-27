/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import accounts.*;
import javax.swing.JOptionPane;

/**
 *
 * @author James
 */
import view.CreateAccount;
public class CreateAccountController {
    
    private final CreateAccount view;

    public CreateAccountController() {
        this.view = new CreateAccount();
        initController();
        view.setVisible(true);
    }
            
    public void initController() {
        view.getBtnCreate().addActionListener(e -> createAccount());
        view.getBtnBack().addActionListener(e -> back());
    }
    
    private void createAccount() {
        String firstName = view.getTxtFirstName().getText();
        String surname = view.getTxtSurname().getText();
        String address = view.getTxtAddress().getText();
        int age = (Integer) view.getSpnAge().getValue();
        String gender = view.getCmbGender().toString();
        String password = String.valueOf(view.getTxtPassword().getPassword());

        if (firstName.isEmpty() || surname.isEmpty() || address.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Entry");
        } 
        else 
        {
            String ID = Admin.generateID("PATIENT");
            Admin.createAccount(ID, password, firstName, surname, address, gender, age, "PATIENT");
            JOptionPane.showMessageDialog(null, "Your Account Has Been Created. Your User ID is: " + ID);
        }
         
        view.setVisible(false);
        new LoginController();
    }
    
    private void back() {
        new LoginController();
        view.setVisible(false);
    }
    
}
