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
        view.getLblDetails().setText("Welcome " + admin.getFirstName() + " " + admin.getSurname());
    }
            
    public void initController() {
        view.getBtnLogout().addActionListener(e -> logout());
        view.getBtnCreate().addActionListener(e -> create());
        view.getBtnDeleteDoc().addActionListener(e -> deleteDoctor());
        view.getBtnDeleteSec().addActionListener(e -> deleteSecreatary());
        view.getLstDoctors().setListData(Admin.getAccounts("DOCTOR"));
        view.getLstSecretary().setListData(Admin.getAccounts("SECRETARY"));
    }
    
    private void deleteDoctor() {        
        Admin.removeAccount(view.getLstDoctors().getSelectedValue());
        view.getLstDoctors().setListData(Admin.getAccounts("DOCTOR"));
        view.getLstSecretary().setListData(Admin.getAccounts("SECRETARY"));
    }
    
    private void deleteSecreatary() {
        Admin.removeAccount(view.getLstSecretary().getSelectedValue());
        view.getLstDoctors().setListData(Admin.getAccounts("DOCTOR"));
        view.getLstSecretary().setListData(Admin.getAccounts("SECRETARY"));
    }
    
    private void create() {
        new AddAccountController(admin);
        view.setVisible(false);
    }
    
    private void logout() {
        new LoginController();
        view.setVisible(false);
    }
}
