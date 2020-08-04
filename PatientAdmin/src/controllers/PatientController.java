/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import accounts.*;
import view.PatientHome;
import accounts.Patient;
import appointments.Appointment;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import serialization.AccountSingleton;


/**
 *
 * @author James
 */
public class PatientController {
    
    private final PatientHome view;
    private final Account patient;
    
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
        view.getBtnDelete().addActionListener(e -> deleteRequest());
        view.getCmbDoctor().setModel(new DefaultComboBoxModel(Admin.getAccounts("DOCTOR")));
    }
    
    private void logout(){
        new LoginController();
        view.setVisible(false);
    }
      
    private void requestAppointment() {
        Doctor doctor = (Doctor) AccountSingleton.convertToObject(view.getCmbDoctor().toString());
        String time = view.getCmbTime().getSelectedItem().toString();
        String day =  view.getCmbDay().getSelectedItem().toString();
        String month = view.getCmbMonth().getSelectedItem().toString();        
        
        String dateTime = time + " / " + day + " / " + month;

        Patient.requestAppointment(patient, doctor, dateTime);
        
        JOptionPane.showMessageDialog(null, "Your appointment request has been received. Thank You");
    }
    
    private void deleteRequest() {
        Patient.deleteAccount(patient);
    }
    
}
