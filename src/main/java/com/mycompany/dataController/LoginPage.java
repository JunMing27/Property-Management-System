/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author Jun Ming
 */
package com.mycompany.dataController;
import com.mycompany.AccExecutive.AccExecMenuFrame;
import com.mycompany.BuildingExecutive.buildingExecMenuFrame;
import com.mycompany.adminExecutive.adminExecutiveMenuFrame;
import com.mycompany.buildingManager.buildingManagerMenuFrame;
import com.mycompany.employee.guardMenuFrame;
import com.mycompany.resident.residentMenuFrame;
import com.mycompany.vendor.vendorMenuFrame;
import com.mycompany.visitor.checkVisitorPassFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;
import javax.swing.*;

public class LoginPage extends javax.swing.JFrame  {

  private static JFrame logInFrame = new JFrame("Login");

  public void placeComponents(JPanel panel) {
    panel.setLayout(null);
    
    // title label
    // setBounds(x, y, width, height)
    JLabel titleLabel1 = new JLabel("Welcome To");
    titleLabel1.setBounds(360, 140, 100, 30);
    titleLabel1.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 16));
    JLabel titleLabel2 = new JLabel("Parkhill Property Management System");
    titleLabel2.setBounds(260, 170, 320, 30);
    titleLabel2.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 18));
    panel.add(titleLabel1);
    panel.add(titleLabel2);
    
    
    // username field label
    JLabel usernameLabel = new JLabel("Username :");
    usernameLabel.setBounds(280, 230, 80, 25);
    panel.add(usernameLabel);

    // username field
    JTextField usernameField = new JTextField(20);
    usernameField.setBounds(370, 230, 160, 25);
    panel.add(usernameField);

    // password field label
    JLabel passwordFieldLabel = new JLabel("Password :");
    passwordFieldLabel.setBounds(280, 260, 80, 25);
    panel.add(passwordFieldLabel);

    // password field
    JPasswordField passwordField = new JPasswordField(20);
    passwordField.setBounds(370, 260, 160, 25);
    panel.add(passwordField);

    // login button
    JButton loginBtn = new JButton("LOGIN");
    loginBtn.setBounds(280, 300, 250, 25);
    loginBtn.setBackground(new java.awt.Color(255,255,255));
    loginBtn.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); 
    loginBtn.setForeground(new java.awt.Color(0, 0, 0));
    loginBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, false));
    loginBtn.setFocusPainted(false);
    loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    panel.getRootPane().setDefaultButton(loginBtn);
    panel.add(loginBtn);
    
    // visitor pass button
    JButton visitorBtn = new JButton("Visitor Pass");
    visitorBtn.setBounds(280, 330, 250, 25);
    visitorBtn.setBackground(new java.awt.Color(255,255,255));
    visitorBtn.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); 
    visitorBtn.setForeground(new java.awt.Color(0, 0, 0));
    visitorBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, false));
    visitorBtn.setFocusPainted(false);
    visitorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    panel.add(visitorBtn);
    
    // warning label
    JLabel warningLabel = new JLabel();
    warningLabel.setBounds(280, 360, 250, 40);
    warningLabel.setForeground(new java.awt.Color(255,0,0));
    warningLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,0,0), 1, false));
    panel.add(warningLabel);
    warningLabel.setVisible(false);
    
    // login button's ActionListener
    loginBtn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        boolean loginStatus = false;
        
        String enterUsername = "";
        String enterPassword = "";
        enterUsername = usernameField.getText();
        char[] enterPasswordChar = passwordField.getPassword();
        enterPassword = new String(enterPasswordChar);
        // test if username and password text field is empty
        if (enterUsername.equals("") || enterPassword.equals("")){
            warningLabel.setText(" Username and Password cannot be empty");
            warningLabel.setVisible(true);
        }
        else{
            // if not empty then do a while loop to get all credential from loginCredential.txt
            try{
                File loginCredential = new File("src/main/java/com/mycompany/textFile/loginCredential.txt");
                Scanner credentialReader = new Scanner(loginCredential);
                credentialReader.useDelimiter("[,\n]");
                while (credentialReader.hasNextLine()) {
                    try{
                        String fileUserID = credentialReader.next();
                        String fileUsername = credentialReader.next();
                        String filePassword = credentialReader.next();
                        String fileUserRole = credentialReader.next();
                        // compare user entered credential with credentials in txt field
                        if (enterUsername.equals(fileUsername.trim()) && enterPassword.equals(filePassword.trim())){
                            loginStatus = true;
                            // If username and password are correct, system will search for the page based on their role
                            System.out.println("Correct username or password");
                            switch(fileUserRole.trim()) {
                                case "Admin Executive" -> goAdminExecutivePage();
                                case "Building Manager" -> goBuildingManagerPage();
                                case "Account Executive" -> goAccountExecutivePage();
                                case "Building Executive"-> goBuildingExecutivePage();
                                case "Resident" -> goResidentPage(fileUserID);
                                case "Vendor" -> goVendorPage(fileUserID);
                                case "Employee" -> goEmployeePage(fileUserID); //will identify if it is guard
                                default -> System.out.println("cant find page for this role");
                              }
                            usernameField.setText("");
                            passwordField.setText("");
                        }
                        else{
                            ;
                        }
                    }catch(Exception s){}
                }
                if(loginStatus==false){
                    warningLabel.setText(" Wrong Username or Password");
                    warningLabel.setVisible(true);
                }
            }
            catch(FileNotFoundException ex){
                
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      }
    });
    
    
    //visitor pass button's actionlistener
    visitorBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            logInFrame.dispose();
            checkVisitorPassFrame checkPassFrame = new checkVisitorPassFrame();
            checkPassFrame.setVisible(true);
        }
    });
  }

public void goAdminExecutivePage()
{
    logInFrame.dispose();
    adminExecutiveMenuFrame adminMenu = new adminExecutiveMenuFrame();
    adminMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    adminMenu.pack();
    adminMenu.setResizable(false);
    adminMenu.setLocationRelativeTo(null);
    adminMenu.setVisible(true);
}
public void goAccountExecutivePage()
{
    logInFrame.dispose();
    AccExecMenuFrame AccExecMenu = new AccExecMenuFrame();
    AccExecMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    AccExecMenu.pack();
    AccExecMenu.setResizable(false);
    AccExecMenu.setLocationRelativeTo(null);
    AccExecMenu.setVisible(true);
}

public void goBuildingExecutivePage()
{
    logInFrame.dispose();
    buildingExecMenuFrame BuildExecMenu = new buildingExecMenuFrame();
    BuildExecMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    BuildExecMenu.pack();
    BuildExecMenu.setResizable(false);
    BuildExecMenu.setLocationRelativeTo(null);
    BuildExecMenu.setVisible(true);
}


public void goBuildingManagerPage()
{
    logInFrame.dispose();
    buildingManagerMenuFrame mainMenu = new buildingManagerMenuFrame();
    mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainMenu.pack();
    mainMenu.setResizable(false);
    mainMenu.setLocationRelativeTo(null);
    mainMenu.setVisible(true);
}

public void goResidentPage(String residentId)
{
    logInFrame.dispose();
    residentMenuFrame residentMenu = new residentMenuFrame(residentId);
    residentMenu.setVisible(true);

}

public void goVendorPage(String vendorId)
{
    logInFrame.dispose();
    vendorMenuFrame vendorMenu = new vendorMenuFrame(vendorId);
    vendorMenu.setVisible(true);
}

public void goEmployeePage(String guardId)
{
    String jobScope = "";
    try{
        File file = new File("src/main/java/com/mycompany/textFile/Employee.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null )
        {
            String[] dataRow = line.split(",");
            if(dataRow[0].equals(guardId))
            {
                jobScope = dataRow[5];
            }
            line = br.readLine();
        }
    } catch (IOException ex) {
          Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    //if jobscope is security
    if(jobScope.equals("Security"))
    {
        logInFrame.dispose();
        guardMenuFrame guardMenu = new guardMenuFrame(guardId);
        guardMenu.setVisible(true);
    }
    
}

public static void main(String[] args) {
    // create window
    logInFrame.setSize(800, 600);
    logInFrame.setResizable(false);
    logInFrame.setLocationRelativeTo(null);
    logInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // add panel to JFrame
    JPanel panel = new JPanel();
    logInFrame.add(panel);
    LoginPage login = new LoginPage();
    login.placeComponents(panel);

    // display Window
    logInFrame.setVisible(true);
    
  }

}

 