/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import accounts.Account;
import accounts.Admin;
import view.SecretaryHome;
import accounts.Secretary;
import javax.swing.JOptionPane;

/**
 *
 * @author James
 */
public class SecretaryController {
    
    private final SecretaryHome view;
    private final Secretary secretary;    
    
    public SecretaryController(Account secretary) {
        this.view = new SecretaryHome();
        this.secretary = (Secretary) secretary;
        initController();
        view.setVisible(true);
        view.getLblDetails().setText("Welcome " + secretary.getFirstName() + " " + secretary.getSurname());
    }
        
    public void initController() {
        view.getBtnLogout().addActionListener(e -> logout());
        view.getBtnAction().addActionListener(e -> actionRequest());
        view.getBtnDelete().addActionListener(e -> deleteRequest());
        view.getBtnRemove().addActionListener(e -> removeAccount());
        view.getLstRequests().setListData(Secretary.getRequests());
        view.getLstStock().setListData(Secretary.getPharmacy());
        view.getLstPatients().setListData(Admin.getAccounts("PATIENT"));
    }
    
    private void actionRequest() {
        
        int alert = JOptionPane.showConfirmDialog(null, "Are you sure you want to action this request?", "Action Request", JOptionPane.YES_NO_OPTION);
        
        if (alert == JOptionPane.YES_OPTION) {
            Secretary.actionRequest(view.getLstRequests().getSelectedValue());
            JOptionPane.showMessageDialog(null, "Request Actioned");           
        }
        view.getLstRequests().setListData(Secretary.getRequests());
    }
        
    private void deleteRequest() {
        
        int alert = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this request?", "Delete Request", JOptionPane.YES_NO_OPTION);
        
        if (alert == JOptionPane.YES_OPTION) {
            Secretary.deleteRequest(view.getLstRequests().getSelectedValue());
            JOptionPane.showMessageDialog(null, "Request Deleted");            
        }
        view.getLstRequests().setListData(Secretary.getRequests());
    }
    
    private void removeAccount() {
        int alert = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this account?", "Remove Account", JOptionPane.YES_NO_OPTION);
        
        if (alert == JOptionPane.YES_OPTION) {
            Admin.removeAccount(view.getLstPatients().getSelectedValue());
            JOptionPane.showMessageDialog(null, "Account Removed");
        }
        view.getLstPatients().setListData(Admin.getAccounts("PATIENT"));
    }
    
    private void logout(){
        new LoginController();
        view.setVisible(false);
    }
}
