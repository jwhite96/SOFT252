/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import accounts.Account;
import view.SecretaryHome;
import accounts.Secretary;

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
        view.getLblDetails().setText("Welcome " + secretary.getFirstName() + secretary.getSurname());
    }
        
    public void initController() {
        view.getBtnLogout().addActionListener(e -> logout());
    }
    
    private void logout(){
        new LoginController();
        view.setVisible(false);
    }
}
