/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import accounts.*;
import view.PatientHome;
import accounts.Patient;
import javax.swing.DefaultComboBoxModel;
import serialization.AccountSingleton;
import serialization.AppointmentSingleton;

/**
 *
 * @author James
 */
public class PatientController {
    
    private final PatientHome view;
    private final Patient patient;    
    
    public PatientController(Account patient) {
        this.view = new PatientHome();
        this.patient = (Patient) patient;
        initController();
        view.setVisible(true);
        view.getLblDetails().setText("Welcome " + patient.getFirstName() + " " + patient.getSurname());
    }
        
    public void initController() {
        view.getBtnLogout().addActionListener(e -> logout());
        view.getBtnSubmit().addActionListener(e -> requestAppointment());
        view.getCmbDoctor().setModel(new DefaultComboBoxModel(Admin.viewAccounts("DOCTOR")));
    }
    
    private void logout(){
        new LoginController();
        view.setVisible(false);
    }
    
    private void requestAppointment() {
        
    }
}
