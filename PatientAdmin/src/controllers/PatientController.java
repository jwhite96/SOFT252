/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import accounts.Account;
import view.PatientHome;
import accounts.Patient;

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
        view.getLblDetails().setText("Welcome " + patient.getFirstName() + patient.getSurname());
    }
        
    public void initController() {
        view.getBtnLogout().addActionListener(e -> logout());
    }
    
    private void logout(){
        new LoginController();
        view.setVisible(false);
    }
}
