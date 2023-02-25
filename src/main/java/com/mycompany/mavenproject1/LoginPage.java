/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author Jun Ming
 */
package com.mycompany.mavenproject1;
import com.mycompany.adminExecutive.adminExecutiveMenuFrame;
import com.mycompany.buildingManager.buildingManagerMenuFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
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
    
    // login button
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
                                case "resident" -> setResidentData(fileUserID, fileUsername, filePassword);
                                case "visitor" -> directToVisitorPass(fileUserID);
                                case "guard" -> toGuardOption(fileUserID);
                                default -> System.out.println("cant find page for this role");
                              }

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

public void setResidentData(String residentId, String residentName, String residentPwd)
{
    //set id,name,username,password
    ResidentMain residentMain = new ResidentMain();
    residentMain.setId(residentId);
    residentMain.setUserName(residentName);
    residentMain.setPassword(residentPwd);
    //direct to resident main page
    logInFrame.dispose();
    ResidentOption residentOption = new ResidentOption();
    residentOption.setVisible(true);

}

public void directToVisitorPass(String visitorId)
{
    //assume visitor pass valid
    logInFrame.dispose();
    VisitorVisitorPassView visitorPassView = new VisitorVisitorPassView(visitorId);
    visitorPassView.setVisible(true);
}

public void toGuardOption(String userId)
{
    GuardMain main = new GuardMain();
    
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

 