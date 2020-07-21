/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import accounts.Account;
import view.AdminHome;
import accounts.Admin;

/**
 *
 * @author James
 */
public class AdminController {
    
    private final AdminHome view;
    private final Admin admin;    
    
    public AdminController(Account admin) {
        this.view = new AdminHome();
        this.admin = (Admin) admin;
        initController();
        view.setVisible(true);
        view.getLblDetails().setText("Welcome " + admin.toString());
    }
        
    public void initController() {
        view.getBtnLogout().addActionListener(e -> logout());
    }
    
    private void logout(){
        new LoginController();
        view.setVisible(false);
    }
}
