/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import accounts.Account;
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
        view.getLstRequests().setListData(Secretary.getRequests());
    }
    
    private void actionRequest() {
        Secretary.actionRequest(view.getLstRequests().getSelectedValue());
        JOptionPane.showMessageDialog(null, "Request Actioned");
        view.getLstRequests().setListData(Secretary.getRequests());
    }
        
    private void deleteRequest() {
        Secretary.deleteRequest(view.getLstRequests().getSelectedValue());
        JOptionPane.showMessageDialog(null, "Request Deleted");
        view.getLstRequests().setListData(Secretary.getRequests());
    }
    
    private void logout(){
        new LoginController();
        view.setVisible(false);
    }
}
