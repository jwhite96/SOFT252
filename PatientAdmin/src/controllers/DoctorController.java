/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import accounts.Account;
import accounts.Doctor;
import javax.swing.JOptionPane;
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
        view.getBtnCreate().addActionListener(e -> newOrder());
        view.getLstAppointments().setListData(Doctor.viewAppointments((Doctor) doctor));
    }
    
    private void newOrder() {
        String name = view.getTxtMedicine().getText();
        int age = (Integer) view.getSpnQuantity().getValue();
        Doctor.requestStock(doctor, name, age);
        JOptionPane.showMessageDialog(null, "Your stock request has been received. Thank You");
        initController();
    }
    
    private void logout(){
        view.setVisible(false);
        new LoginController();
    }
}
