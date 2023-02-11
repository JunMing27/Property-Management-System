/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author Jun Ming
 */
package com.mycompany.mavenproject1;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.*;
import javax.swing.*;

public class LoginPage {

  public static void main(String[] args) {
    // create window
    JFrame logInFrame = new JFrame("Login");
    logInFrame.setSize(800, 600);
    logInFrame.setResizable(false);
    logInFrame.setLocationRelativeTo(null);
    logInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // add panel to JFrame
    JPanel panel = new JPanel();
    logInFrame.add(panel);
    placeComponents(panel);

    // display Window
    logInFrame.setVisible(true);
    
  }

  private static void placeComponents(JPanel panel) {
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
                    String fileUserID = credentialReader.next();
                    String fileUsername = credentialReader.next();
                    String filePassword = credentialReader.next();
                    String fileUserRole = credentialReader.next();
                    // compare user entered credential with credentials in txt field
                    if (enterUsername.equals(fileUsername.trim()) && enterPassword.equals(filePassword.trim())){
                        // If username and password are correct, system will search for the page based on their role
                        System.out.println("Correct username or password");
                        switch(fileUserRole.trim()) {
                            case "admin" -> System.out.println("admin");
                            case "manager" -> System.out.println("manager");
                            case "resident" -> setResidentData(fileUserID);
                            default -> System.out.println("cant find page for this role");
                          }

                    }
                    else{
                        warningLabel.setText(" Wrong Username or Password");
                        warningLabel.setVisible(true);
                    }
                }
            }
            catch(FileNotFoundException ex){
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      }
    });
  }



private static void setResidentData(String residentId)
{
    BufferedReader bf = null;
    try {
        ResidentMain residentMain = new ResidentMain();
        residentMain.setId(residentId);
        File residentFile = new File("src/main/java/com/mycompany/textFile/ResidentProfile.txt");
        List<String> listOfResidentData = new ArrayList<String>();
        bf = new BufferedReader(new FileReader(residentFile));
        String fileLine = bf.readLine();

        //save all data into arraylist
        while(fileLine != null)
        {
            listOfResidentData.add(fileLine);
            fileLine = bf.readLine();
        }
        bf.close();

        String[] arrayResidentData = listOfResidentData.toArray(new String[0]);

        //search for resident id
        for(int i=0; i<listOfResidentData.size(); i++)
        {
            String[][] arrayResidentData = {listOfResidentData.toArray()};
            System.out.println(i + "times -------------------");
            System.out.println(arrayResidentData[i]);
            System.out.println(listOfResidentData.get(i));
            if (listOfResidentData.get(i).equals("R1")) {
                System.out.println("found!!!!!!!!!!!!");
                residentMain.setName(listOfResidentData.get(i+1));
                residentMain.setGender(listOfResidentData.get(i+2));
                residentMain.setAge(listOfResidentData.get(i+3));
                residentMain.setPhone(listOfResidentData.get(i+4));
                residentMain.setUnit(listOfResidentData.get(i+5));
                residentMain.setImage(listOfResidentData.get(i+6));
            }
        }

        System.out.println(listOfResidentData);
        System.out.println(Arrays.toString(arrayResidentData));
        System.out.println("1" + residentMain.getAge());


    } catch (FileNotFoundException e) {
        Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, e);
    } catch (IOException ex) {
        Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
    
}


}

 