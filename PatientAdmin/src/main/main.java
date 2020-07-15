/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import accounts.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author James
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Doctor James = new Doctor("D001", "password", "James", "White", "Hemel Hempstead");
        
        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(James);  

        //Scanner input = new Scanner(System.in);
       
        //String ID = input.nextLine();
        
        System.out.println(James);
        //String password = input.nextLine();             
        

         
    }    
}
