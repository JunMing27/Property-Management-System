/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.resident;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author hoiyi
 */
public class residentProfileManageFrame extends javax.swing.JFrame {

    static String idGet;
    
    public residentProfileManageFrame(String id) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        idGet = id;
        displayData();
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
        topLabel = new javax.swing.JLabel();
        residentIdLabel = new javax.swing.JTextField();
        residentNameLabel = new javax.swing.JTextField();
        residentGenderLabel = new javax.swing.JTextField();
        residentIdTxt = new javax.swing.JTextField();
        residentNameTxt = new javax.swing.JTextField();
        residentGenderTxt = new javax.swing.JTextField();
        residentAgeLabel = new javax.swing.JTextField();
        residentUnitLabel = new javax.swing.JTextField();
        residentPhoneLabel = new javax.swing.JTextField();
        residentAgeTxt = new javax.swing.JTextField();
        residentUnitTxt = new javax.swing.JTextField();
        residentPhoneTxt = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        residentUsernameLabel = new javax.swing.JLabel();
        residentPwdLabel = new javax.swing.JLabel();
        residentUsernameTxt = new javax.swing.JTextField();
        residentPwdTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));
        jPanel1.setPreferredSize(new java.awt.Dimension(566, 600));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setForeground(new java.awt.Color(0, 0, 0));
        backBtn.setText("Back");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        topLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topLabel.setForeground(new java.awt.Color(0, 0, 0));
        topLabel.setText("PROFILE");

        residentIdLabel.setEditable(false);
        residentIdLabel.setBackground(new java.awt.Color(233, 233, 233));
        residentIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        residentIdLabel.setText("Resident ID :");
        residentIdLabel.setBorder(null);
        residentIdLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentNameLabel.setEditable(false);
        residentNameLabel.setBackground(new java.awt.Color(233, 233, 233));
        residentNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        residentNameLabel.setText("Resident Name :");
        residentNameLabel.setBorder(null);
        residentNameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentGenderLabel.setEditable(false);
        residentGenderLabel.setBackground(new java.awt.Color(233, 233, 233));
        residentGenderLabel.setForeground(new java.awt.Color(0, 0, 0));
        residentGenderLabel.setText("Resident Gender :");
        residentGenderLabel.setBorder(null);
        residentGenderLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentIdTxt.setEditable(false);
        residentIdTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentIdTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentIdTxt.setText("HALO");
        residentIdTxt.setBorder(null);
        residentIdTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentNameTxt.setEditable(false);
        residentNameTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentNameTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentNameTxt.setText("User 1");
        residentNameTxt.setBorder(null);
        residentNameTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentGenderTxt.setEditable(false);
        residentGenderTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentGenderTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentGenderTxt.setText("Female");
        residentGenderTxt.setBorder(null);
        residentGenderTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentAgeLabel.setEditable(false);
        residentAgeLabel.setBackground(new java.awt.Color(233, 233, 233));
        residentAgeLabel.setForeground(new java.awt.Color(0, 0, 0));
        residentAgeLabel.setText("Resident Age :");
        residentAgeLabel.setBorder(null);
        residentAgeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentUnitLabel.setEditable(false);
        residentUnitLabel.setBackground(new java.awt.Color(233, 233, 233));
        residentUnitLabel.setForeground(new java.awt.Color(0, 0, 0));
        residentUnitLabel.setText("Resident Unit No. :");
        residentUnitLabel.setBorder(null);
        residentUnitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentPhoneLabel.setEditable(false);
        residentPhoneLabel.setBackground(new java.awt.Color(233, 233, 233));
        residentPhoneLabel.setForeground(new java.awt.Color(0, 0, 0));
        residentPhoneLabel.setText("Resident Phone No. :");
        residentPhoneLabel.setBorder(null);
        residentPhoneLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentAgeTxt.setEditable(false);
        residentAgeTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentAgeTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentAgeTxt.setText("38");
        residentAgeTxt.setBorder(null);
        residentAgeTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentUnitTxt.setEditable(false);
        residentUnitTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentUnitTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentUnitTxt.setText("D-01-01");
        residentUnitTxt.setBorder(null);
        residentUnitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentPhoneTxt.setEditable(false);
        residentPhoneTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentPhoneTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentPhoneTxt.setText("012-345 6789");
        residentPhoneTxt.setBorder(null);
        residentPhoneTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        imageLabel.setBackground(new java.awt.Color(233, 233, 233));
        imageLabel.setForeground(new java.awt.Color(0, 0, 0));
        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imageLabel.setMaximumSize(new java.awt.Dimension(138, 126));
        imageLabel.setMinimumSize(new java.awt.Dimension(138, 126));
        imageLabel.setPreferredSize(new java.awt.Dimension(138, 126));

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setText("EDIT");
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        residentUsernameLabel.setBackground(new java.awt.Color(233, 233, 233));
        residentUsernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        residentUsernameLabel.setText("Username :");

        residentPwdLabel.setBackground(new java.awt.Color(233, 233, 233));
        residentPwdLabel.setForeground(new java.awt.Color(0, 0, 0));
        residentPwdLabel.setText("Password :");

        residentUsernameTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentUsernameTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentUsernameTxt.setText("User1");
        residentUsernameTxt.setBorder(null);
        residentUsernameTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentPwdTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentPwdTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentPwdTxt.setText("user123");
        residentPwdTxt.setBorder(null);
        residentPwdTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(topLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(residentGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentUsernameLabel)
                            .addComponent(residentPwdLabel))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(residentGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentAgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentUnitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentUsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentPwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentAgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentUnitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentUsernameLabel)
                    .addComponent(residentUsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentPwdLabel)
                    .addComponent(residentPwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        residentMenuFrame menu = new residentMenuFrame(idGet);
        menu.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        this.dispose();
        residentProfileEditFrame residentProfileEdit = new residentProfileEditFrame(idGet);
        residentProfileEdit.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private String residentImage;
    
    private void displayData()
    {
        resident main = new resident();
        main.setUserId(idGet);
        main.displayDataViewOwn(0, "", "resident", "ResidentProfile");
        try {
            main.getCredentialData(main.getUserId());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(residentProfileManageFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(main.getUserId()!= null)
        {
            residentIdTxt.setText(main.getUserId());
            residentNameTxt.setText(main.getUserName());
            residentGenderTxt.setText(main.getUserGender());
            residentAgeTxt.setText(main.getUserAge());
            residentPhoneTxt.setText(main.getUserPhone());
            residentUnitTxt.setText(main.getUserUnit());
            residentImage = main.getUserImage();

            residentUsernameTxt.setText(main.getCredentialName());
            residentPwdTxt.setText(main.getPassword());
            
            try {
                //image
                BufferedImage bufferedImage = null;
                File imageFile = new File("src/main/java/com/mycompany/Image/"+residentImage);
                bufferedImage = ImageIO.read(imageFile);
                Image profileImage = bufferedImage.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon profileIcon = new ImageIcon(profileImage);
                imageLabel.setIcon(profileIcon);
            } catch (IOException ex) {
                Logger.getLogger(residentProfileManageFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            residentIdTxt.setText("no data");
            residentNameTxt.setText("no data");
            residentGenderTxt.setText("no data");
            residentAgeTxt.setText("no data");
            residentPhoneTxt.setText("no data");
            residentUnitTxt.setText("no data");
            imageLabel.setText("no data");
            residentUsernameTxt.setText("no data");
            residentPwdTxt.setText("no data");
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
            java.util.logging.Logger.getLogger(residentProfileManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(residentProfileManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(residentProfileManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(residentProfileManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new residentProfileManageFrame(idGet).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField residentAgeLabel;
    private javax.swing.JTextField residentAgeTxt;
    private javax.swing.JTextField residentGenderLabel;
    private javax.swing.JTextField residentGenderTxt;
    private javax.swing.JTextField residentIdLabel;
    private javax.swing.JTextField residentIdTxt;
    private javax.swing.JTextField residentNameLabel;
    private javax.swing.JTextField residentNameTxt;
    private javax.swing.JTextField residentPhoneLabel;
    private javax.swing.JTextField residentPhoneTxt;
    private javax.swing.JLabel residentPwdLabel;
    private javax.swing.JTextField residentPwdTxt;
    private javax.swing.JTextField residentUnitLabel;
    private javax.swing.JTextField residentUnitTxt;
    private javax.swing.JLabel residentUsernameLabel;
    private javax.swing.JTextField residentUsernameTxt;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables
}
