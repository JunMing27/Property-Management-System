/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jun Ming
 */
public class BusManUserManageAddEdit extends javax.swing.JFrame {

    /**
     * Creates new form BusManUserManageAdd
     */
    public BusManUserManageAddEdit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("upload image");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID ");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name ");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gender ");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Age ");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Phone Number");

        jLabel7.setText("jLabel3");

        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Male");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Female");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField4)
                                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                        .addComponent(jTextField1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox2)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(188, 188, 188))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(60, 60, 60))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        BusManUserManage BusManUserManage = new BusManUserManage();
        BusManUserManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BusManUserManage.pack();
        BusManUserManage.setResizable(false);
        BusManUserManage.setLocationRelativeTo(null);
        BusManUserManage.setVisible(true);
        BusManUserManage.backButtonToggle();
        //Run Method in BusManUserManage to set UserType and Data
        BusManUserManage.setUserType(this.UserType);
        BusManUserManage.setAdminOrBuildingExecutiveData(this.UserType);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        insertDataToFile();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    File sourceFile;
    String[] imagePath = new String[1];
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // upload image button
        try{                                         
            // TODO add your handling code here:
            JFileChooser filechooser = new JFileChooser();
            BusinessManagerMain main = new BusinessManagerMain();
            filechooser.addChoosableFileFilter(main.new ImageFilter());
            filechooser.setAcceptAllFileFilterUsed(false);
            filechooser.showOpenDialog(null);
            sourceFile = filechooser.getSelectedFile();
            String filename = sourceFile.getName();
            this.ImageName=filename;
            // get image path first so that the staff can add the image into this system's folder after clicking add item button:
            imagePath[0] = sourceFile.getAbsolutePath();
            try{
                // resize the image so that it can fit the border:
                BufferedImage ItemImage = ImageIO.read(new File(imagePath[0]));
                Image resizedImage = ItemImage.getScaledInstance(165, 130, Image.SCALE_SMOOTH);
                jLabel2.setIcon(new ImageIcon(resizedImage));
            }
            catch(IOException e){}
        }
        catch(Exception e){
        }
                                            

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox2.isSelected()){
            jCheckBox1.setSelected(false); 
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){
            jCheckBox2.setSelected(false); 
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private String UserType;
    private String ImageName;
    private String AddOrEdit;
    
    
    //Method
    // method to hide ID field if Business Manager want to add User // ID will only be shown when edit user data
    public void addUserToggle(String getUserType){
        jTextField1.setVisible(false);
        jLabel1.setVisible(false);
        jLabel7.setText(getUserType);
        jLabel7.setVisible(false);
        this.UserType = getUserType;
        jButton2.setText("Add User");
        this.AddOrEdit="add";
    }
    
    // method for edit function to toggle field and label visibility
    public void editUserToggle(String getUserType){
        jLabel7.setText(getUserType);
        jLabel7.setVisible(false);
        this.UserType = getUserType;
        jButton2.setText(" Edit ");
        this.AddOrEdit="edit";
    }
    
    //global variable for add/edit function
    String ID=null;
    String Name=null;
    String Gender=null;
    String Age = null;
    String PhoneNumber =null;
    String CurrentImageName = null;
    String file ="";
    File source;
    File dest;
    //method to add/edit user data into txt file
    public void insertDataToFile(){
        if(this.UserType=="Admin Executive"){
            file ="AdminExecutive.txt";
        }else if (this.UserType=="Building Executive"){
            file ="BuildingExecutive.txt";
        }
        
        //get ID
         BufferedReader input;
        try {
            input = new BufferedReader(new FileReader("src/main/java/com/mycompany/mavenproject1/"+file));
            String last="";
            String line="";

            try {
                while ((line = input.readLine()) != null) {
                    last = line;
                }
                Scanner ScanEachString = new Scanner(last);
                ScanEachString.useDelimiter("[,\n]");
                while (ScanEachString.hasNextLine()) {
                    // First character of a string
                    ID = (ScanEachString.next().trim());
                    break;
                }
                char firstchar = ID.charAt(0);
                ID = ID.substring(1);
                Integer IDnumber = Integer.parseInt(ID)+1;
                ID = firstchar+ (IDnumber).toString();
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        
        
        //get name
        Name = jTextField2.getText().trim();
        
        //get gender
        if(jCheckBox1.isSelected()){
            Gender= "male";
        }else if (jCheckBox2.isSelected()){
            Gender= "female";
        }
        
        //get age
        try{
            if(Integer.parseInt(jTextField4.getText())>0){
                Age = (jTextField4.getText().trim()).toString();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Only Accept Whole Number in Age Section", "Warning", JOptionPane.ERROR_MESSAGE);
        };
        //get phone number
        PhoneNumber = jTextField5.getText().trim();
        
        //get ImageName
        ImageName = this.ImageName;
        
        if(Name == null || Gender == null || Age == null || PhoneNumber == null || ImageName == null){
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Warning", JOptionPane.ERROR_MESSAGE);
        }else{
            if(file != ""){
                if(this.AddOrEdit=="add"){
                    addDataMethod();
                }else if(this.AddOrEdit=="edit"){
                    editDataMethod();
                }
            }
            
        }
    }
    
    public void editDataToFileDisplay(String getID, String getName, String getGender, String getAge, String getPhoneNo, String getImage){
        // if statement to find user gender because cant directly print the data as it is check box
        if(getGender.equals("male")){
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(false);
        }else if (getGender.equals("female")){
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(true);
        }else{jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);}
        jTextField1.setText(getID);
        jTextField2.setText(getName);
        jTextField4.setText(getAge);
        jTextField5.setText(getPhoneNo);
        this.ImageName=getImage;
        try{
                BufferedImage UserImage = ImageIO.read(new File("src/main/java/com/mycompany/image/"+getImage));
                Image resizedImage = UserImage.getScaledInstance(165, 130, Image.SCALE_SMOOTH);
                jLabel2.setIcon(new ImageIcon(resizedImage));
            }
            catch(Exception e){}
    }
    
    public void addDataMethod(){
        try {
            BufferedWriter itemtofile;
            FileWriter AddNewItem = new FileWriter("src/main/java/com/mycompany/mavenproject1/"+file,true);
            itemtofile = new BufferedWriter(AddNewItem);
            itemtofile.write(ID+",");
            itemtofile.write(Name+",");
            itemtofile.write(Gender+",");
            itemtofile.write(Age+",");
            itemtofile.write(PhoneNumber+",");
            itemtofile.write(this.ImageName);
            itemtofile.newLine();
            itemtofile.close();
            AddNewItem.close();
            JOptionPane.showMessageDialog(null, "Added "+this.UserType+" Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
            dest = new File("src/main/java/com/mycompany/image/" + this.ImageName);
            source = sourceFile;
            BusinessManagerMain main = new BusinessManagerMain();
            main.transferImage(source,dest);

            //set text field and variable to null after inserting new user data to file
            this.ImageName=null;
            jCheckBox1.setSelected(false); jCheckBox2.setSelected(false); jTextField2.setText(null); jTextField4.setText(null); jTextField5.setText(null);jLabel2.setIcon(null);
            Name=null; Gender= null; Age = null; PhoneNumber = null; ImageName = null;
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Failed to add new user", "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    public void editDataMethod(){
        try {
            BusinessManagerMain main = new BusinessManagerMain();
            String fileName = "src/main/java/com/mycompany/mavenproject1/"+file;
            ArrayList<ArrayList<String>> allUsers = main.UserInfo(fileName);
            for (ArrayList<String> user : allUsers) {
                if (user.get(0).equals(jTextField1.getText())) {
                    user.set(1, String.valueOf(Name));
                    user.set(2, String.valueOf(Gender));
                    user.set(3, String.valueOf(Age));
                    user.set(4, String.valueOf(PhoneNumber));
                    user.set(5, String.valueOf(this.ImageName));
                    break;
                }
            }
            new FileWriter(fileName, false).close();
            for (ArrayList<String> user : allUsers) {
                try {
                    main.appendUserManage(user.get(0),user.get(1),user.get(2),user.get(3),user.get(4),user.get(5), file);
                }
                catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "failed to update file", "Warning", JOptionPane.ERROR_MESSAGE);
                }
            }
            JOptionPane.showMessageDialog(null, "Edited Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problem Occured, Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BusManUserManageAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusManUserManageAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusManUserManageAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusManUserManageAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusManUserManageAddEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
