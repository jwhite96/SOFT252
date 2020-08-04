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
import view.RequestAccount;
public class RequestAccountController {
    
    private final RequestAccount view;

    public RequestAccountController() {
        this.view = new RequestAccount();
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
        String gender = view.getCmbGender().getSelectedItem().toString();
        String password = String.valueOf(view.getTxtPassword().getPassword());

        if (firstName.isEmpty() || surname.isEmpty() || address.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Entry");
        } 
        else 
        {
            String ID = Admin.generateID("PATIENT");
            Patient newPatient = new Patient(ID, password, firstName, surname, address, gender, age);
            Patient.requestAccount(newPatient);
            JOptionPane.showMessageDialog(null, "Your Account Request Has Been Recieved");
        }
         
        view.setVisible(false);
        new LoginController();
    }
    
    private void back() {
        view.setVisible(false);
        new LoginController();
    }
    
}
