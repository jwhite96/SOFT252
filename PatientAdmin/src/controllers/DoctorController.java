/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import accounts.Account;
import accounts.Doctor;
import view.DoctorHome;

/**
 *
 * @author James
 */
public class DoctorController {
    
    private final DoctorHome view;
    private final Doctor doctor;    

    public DoctorController(Account doctor) {
        this.view = new DoctorHome();
        this.doctor = (Doctor) doctor;
        initController();
        view.setVisible(true);
        view.getLblDetails().setText("Welcome " + doctor.getFirstName() + " " + doctor.getSurname());
    }
        
    public void initController() {
        view.getBtnLogout().addActionListener(e -> logout());
    }
    
    private void logout(){
        view.setVisible(false);
        new LoginController();
    }
}
