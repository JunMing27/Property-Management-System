/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.adminExecutive;

import com.mycompany.vendor.vendor;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jun Ming
 */
public class adminExecVendorAddEditFrame extends javax.swing.JFrame {

    /**
     * Creates new form adminExecVendorAddEditFrame
     */
    public adminExecVendorAddEditFrame() {
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
        backBtn = new javax.swing.JButton();
        AddEditBtn = new javax.swing.JButton();
        vendorImage = new javax.swing.JLabel();
        imageUploader = new javax.swing.JButton();
        vendorIdField = new javax.swing.JTextField();
        vendorNameField = new javax.swing.JTextField();
        vendorAgeField = new javax.swing.JTextField();
        vendorPhoneNumberField = new javax.swing.JTextField();
        vendorIdLabel = new javax.swing.JLabel();
        vendorNameLabel = new javax.swing.JLabel();
        vendorGenderLabel = new javax.swing.JLabel();
        vendorAgeLabel = new javax.swing.JLabel();
        vendorPhoneNumberLabel = new javax.swing.JLabel();
        maleCheckBox = new javax.swing.JCheckBox();
        femaleCheckBox = new javax.swing.JCheckBox();
        vendorUserNameLabel = new javax.swing.JLabel();
        credentialNameField = new javax.swing.JTextField();
        vendorPassLabel = new javax.swing.JLabel();
        credentialPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setForeground(new java.awt.Color(0, 0, 0));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        AddEditBtn.setBackground(new java.awt.Color(255, 255, 255));
        AddEditBtn.setForeground(new java.awt.Color(0, 0, 0));
        AddEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEditBtnActionPerformed(evt);
            }
        });

        vendorImage.setForeground(new java.awt.Color(0, 0, 0));
        vendorImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imageUploader.setBackground(new java.awt.Color(255, 255, 255));
        imageUploader.setForeground(new java.awt.Color(0, 0, 0));
        imageUploader.setText("upload image");
        imageUploader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUploaderActionPerformed(evt);
            }
        });

        vendorIdField.setEnabled(false);
        vendorIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorIdFieldActionPerformed(evt);
            }
        });

        vendorIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vendorIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        vendorIdLabel.setText("Vendor ID");

        vendorNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vendorNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        vendorNameLabel.setText("Vendor Name ");

        vendorGenderLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vendorGenderLabel.setForeground(new java.awt.Color(0, 0, 0));
        vendorGenderLabel.setText("Gender ");

        vendorAgeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vendorAgeLabel.setForeground(new java.awt.Color(0, 0, 0));
        vendorAgeLabel.setText("Age ");

        vendorPhoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vendorPhoneNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        vendorPhoneNumberLabel.setText("Phone Number");

        maleCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        maleCheckBox.setText("Male");
        maleCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleCheckBoxActionPerformed(evt);
            }
        });

        femaleCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        femaleCheckBox.setText("Female");
        femaleCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleCheckBoxActionPerformed(evt);
            }
        });

        vendorUserNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vendorUserNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        vendorUserNameLabel.setText("User Name");

        credentialNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credentialNameFieldActionPerformed(evt);
            }
        });

        vendorPassLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vendorPassLabel.setForeground(new java.awt.Color(0, 0, 0));
        vendorPassLabel.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imageUploader, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(vendorUserNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(credentialNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendorIdLabel)
                                    .addComponent(vendorNameLabel)
                                    .addComponent(vendorGenderLabel)
                                    .addComponent(vendorAgeLabel)
                                    .addComponent(vendorPhoneNumberLabel))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(vendorNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                        .addComponent(vendorIdField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(femaleCheckBox)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(vendorAgeField)
                                    .addComponent(vendorPhoneNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(vendorPassLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(credentialPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(191, 191, 191))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(vendorImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(AddEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(backBtn)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(vendorImage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imageUploader, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendorIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorIdLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendorNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendorGenderLabel)
                            .addComponent(maleCheckBox)
                            .addComponent(femaleCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendorAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorAgeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendorPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorPhoneNumberLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendorUserNameLabel)
                            .addComponent(credentialNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(credentialPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vendorPassLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(AddEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
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

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        adminExecVendorManageFrame vendorManage = new adminExecVendorManageFrame();
        vendorManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vendorManage.pack();
        vendorManage.setResizable(false);
        vendorManage.setLocationRelativeTo(null);
        vendorManage.setVisible(true);
        vendorManage.backButtonToggle();
        try {
            vendorManage.setUserType("Vendor");
            vendorManage.setVendorData();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void AddEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEditBtnActionPerformed
        // TODO add your handling code here:
        if(addEditDetector=="edit"){
            if((vendorNameField.getText()).equals("") ||(vendorAgeField.getText()).equals("") ||(vendorPhoneNumberField.getText()).equals("") || (credentialNameField.getText()).equals("") || (credentialPasswordField.getPassword()).equals("") || this.imageName==null) {
                JOptionPane.showMessageDialog(null, "Enter all field", "Warning", JOptionPane.ERROR_MESSAGE);
            }else{
                adminExecutive adminExecutiveMain = new adminExecutive();
                adminExecutive.adminExecutiveMethod mainInner = adminExecutiveMain.new adminExecutiveMethod();
                ArrayList<String> dataList = new ArrayList<String>();
                dataList.add(vendorIdField.getText());
                dataList.add(vendorNameField.getText());
                if(maleCheckBox.isSelected()){
                    dataList.add("male");
                }else{
                    dataList.add("female");
                }
                dataList.add(vendorAgeField.getText());
                dataList.add(vendorPhoneNumberField.getText());
                dataList.add(imageName);
                dataList.add(credentialNameField.getText());
                char[] i = credentialPasswordField.getPassword();
                String stringPassword = new String(i);
                dataList.add(stringPassword);
                mainInner.addEditVendor(dataList, "Vendor","VendorProfile.txt","edit");
                //transfer uploaded image to our system image folder
                if (sourceFile!=null) {
                    File dest = new File("src/main/java/com/mycompany/image/" + this.imageName);
                    File source = sourceFile;
                    adminExecutiveMain.transferImage(source,dest);
                }
            }
        }else if(addEditDetector=="add"){
            if((vendorNameField.getText()).equals("") ||(vendorAgeField.getText()).equals("") ||(vendorPhoneNumberField.getText()).equals("") || (credentialNameField.getText()).equals("") || (credentialPasswordField.getPassword()).equals("")|| this.imageName==null) {
                JOptionPane.showMessageDialog(null, "Enter all field", "Warning", JOptionPane.ERROR_MESSAGE);
            }else{
                vendor vendorClass = new vendor();
                ArrayList<String> dataList = new ArrayList<String>();
                vendorClass.getIncreasedID("VendorProfile.txt","Vendor");
                dataList.add(vendorClass.getUserId());
                dataList.add(vendorNameField.getText());
                if(maleCheckBox.isSelected()){
                    dataList.add("male");
                }else{
                    dataList.add("female");
                }
                dataList.add(vendorAgeField.getText());
                dataList.add(vendorPhoneNumberField.getText());
                dataList.add(imageName);
                dataList.add(credentialNameField.getText());
                char[] i = credentialPasswordField.getPassword();
                String stringPassword = new String(i);
                dataList.add(stringPassword);
                System.out.println(dataList);
                adminExecutive adminExecutiveMain = new adminExecutive();
                adminExecutive.adminExecutiveMethod mainInner = adminExecutiveMain.new adminExecutiveMethod();
                mainInner.addEditVendor(dataList, "Vendor","VendorProfile.txt","add");
                //transfer uploaded image to our system image folder
                File dest = new File("src/main/java/com/mycompany/image/" + this.imageName);
                File source = sourceFile;
                adminExecutiveMain.transferImage(source,dest);
                //set value empty after inserting
                vendorIdField.setText("");
                vendorNameField.setText("");
                maleCheckBox.setSelected(false);
                femaleCheckBox.setSelected(false);
                vendorAgeField.setText("");
                vendorPhoneNumberField.setText("");
                credentialNameField.setText("");
                credentialPasswordField.setText("");
                vendorImage.setIcon(null);
            }
        }
    }//GEN-LAST:event_AddEditBtnActionPerformed

    private void imageUploaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUploaderActionPerformed
        // TODO add your handling code here:
        try{
            // TODO add your handling code here:
            JFileChooser filechooser = new JFileChooser();
            adminExecutive adminExecutiveMain = new adminExecutive();
            filechooser.addChoosableFileFilter(adminExecutiveMain.new ImageFilter());
            filechooser.setAcceptAllFileFilterUsed(false);
            filechooser.showOpenDialog(null);
            sourceFile = filechooser.getSelectedFile();
            String filename = sourceFile.getName();
            this.imageName=filename;
            // get image path first so that the staff can add the image into this system's folder after clicking add item button:
            imagePath[0] = sourceFile.getAbsolutePath();
            try{
                // resize the image so that it can fit the border:
                BufferedImage ItemImage = ImageIO.read(new File(imagePath[0]));
                Image resizedImage = ItemImage.getScaledInstance(165, 130, Image.SCALE_SMOOTH);
                vendorImage.setIcon(new ImageIcon(resizedImage));
            }
            catch(IOException e){}
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_imageUploaderActionPerformed

    private void vendorIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendorIdFieldActionPerformed

    private void maleCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleCheckBoxActionPerformed
        // TODO add your handling code here:
        if(maleCheckBox.isSelected()){
            femaleCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_maleCheckBoxActionPerformed

    private void femaleCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleCheckBoxActionPerformed
        // TODO add your handling code here:
        if(femaleCheckBox.isSelected()){
            maleCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_femaleCheckBoxActionPerformed

    private void credentialNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credentialNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credentialNameFieldActionPerformed

    
    private String imageName=null;
    File sourceFile=null;
    String[] imagePath = new String[1];
    private String addEditDetector;
    private String fileType="VendorProfile.txt";
    private String userType="Vendor";
    
    public void addEditDetect(String functionType,String id) {
        if(functionType=="edit"){
            this.addEditDetector="edit";
            vendor vendorClass = new vendor();
            vendorClass.chooseTxtFile("Employee");
            vendorClass.getDataViewSingle(id, fileType,userType);
            AddEditBtn.setText("Update");
            vendorIdField.setText(vendorClass.getUserId());
            vendorNameField.setText(vendorClass.getUserName());
            if(vendorClass.getUserGender().equals("male")){
                maleCheckBox.setSelected(true);
            }else if(vendorClass.getUserGender().equals("female")){
                femaleCheckBox.setSelected(true);
            }
            vendorAgeField.setText(vendorClass.getUserAge());
            vendorPhoneNumberField.setText(vendorClass.getUserPhone());
            this.imageName=vendorClass.getUserImage();
            credentialNameField.setText(vendorClass.getCredentialName());
            credentialPasswordField.setText(vendorClass.getPassword());
            try{
                BufferedImage UserImage = ImageIO.read(new File("src/main/java/com/mycompany/image/"+vendorClass.getUserImage()));
                Image resizedImage = UserImage.getScaledInstance(165, 130, Image.SCALE_SMOOTH);
                vendorImage.setIcon(new ImageIcon(resizedImage));
                }catch(Exception e){}
        }else if (functionType=="add"){
            this.addEditDetector="add";
            AddEditBtn.setText("Add");
            vendorIdField.setVisible(false);
            vendorIdLabel.setVisible(false);
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
            java.util.logging.Logger.getLogger(adminExecVendorAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminExecVendorAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminExecVendorAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminExecVendorAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminExecVendorAddEditFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEditBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField credentialNameField;
    private javax.swing.JPasswordField credentialPasswordField;
    private javax.swing.JCheckBox femaleCheckBox;
    private javax.swing.JButton imageUploader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox maleCheckBox;
    private javax.swing.JTextField vendorAgeField;
    private javax.swing.JLabel vendorAgeLabel;
    private javax.swing.JLabel vendorGenderLabel;
    private javax.swing.JTextField vendorIdField;
    private javax.swing.JLabel vendorIdLabel;
    private javax.swing.JLabel vendorImage;
    private javax.swing.JTextField vendorNameField;
    private javax.swing.JLabel vendorNameLabel;
    private javax.swing.JLabel vendorPassLabel;
    private javax.swing.JTextField vendorPhoneNumberField;
    private javax.swing.JLabel vendorPhoneNumberLabel;
    private javax.swing.JLabel vendorUserNameLabel;
    // End of variables declaration//GEN-END:variables
}
