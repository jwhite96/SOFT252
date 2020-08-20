/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import accounts.Account;
import accounts.Doctor;
import accounts.Patient;
import appointments.Appointment;
import javax.swing.JOptionPane;
import view.AppointmentView;

/**
 *
 * @author James
 */
public class AppointmentController {
    
    private final AppointmentView view;
    private final Doctor doctor;
    private final Appointment appointment;

    public AppointmentController(Account doctor, Appointment a) {
        this.view = new AppointmentView();
        this.doctor = (Doctor) doctor;
        this.appointment = a;
        initController();
        view.setVisible(true);
    }
        
    public void initController() {        
        view.getBtnBack().addActionListener(e -> back());
        view.getBtnEnd().addActionListener(e -> endAppointment());
        view.getLblDate().setText(appointment.getDate());
        view.getTxtNotes().setText(appointment.getNotes());
        view.getLblGender().setText(appointment.getPatient().getGender());
        view.getLblAge().setText(Integer.toString(appointment.getPatient().getAge()));
        view.getLstHistory().setListData(Patient.getHistory(appointment.getPatient()));
        view.getLblName().setText(appointment.getPatient().getFirstName() + " " + appointment.getPatient().getSurname());        
    }
        
    private void endAppointment() {     
                
        int alert = JOptionPane.showConfirmDialog(null, "Are you sure you want to end this appointment?", "End Appointment", JOptionPane.YES_NO_OPTION);
        
        if (alert == JOptionPane.YES_OPTION) {
            String notes = view.getTxtNotes().getText();
            Doctor.endAppointment(appointment, notes);
            JOptionPane.showMessageDialog(null, "Appointment Concluded. Notes Updated");    
        }
        view.setVisible(false);
        new DoctorController(doctor);
    }
    
    private void back(){
        view.setVisible(false);
        new DoctorController(doctor);
    }
}
