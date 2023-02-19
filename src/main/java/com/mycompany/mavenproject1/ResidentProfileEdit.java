/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ResidentProfileEdit extends javax.swing.JFrame {
    //declare variable
    ResidentProfile residentProfile = new ResidentProfile();
    ResidentMain residentMain = new ResidentMain();
    String residentName, residentAgeString, residentGender, residentPhone;
    int residentAgeInt;
    /**
     * Creates new form ResidentProfileEdit
     */
    public ResidentProfileEdit() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        errorMessage = new javax.swing.JTextField();

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
        residentIdTxt.setText("R1");
        residentIdTxt.setBorder(null);
        residentIdTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentNameTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentNameTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentNameTxt.setText("User 1");
        residentNameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        residentNameTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentGenderTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentGenderTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentGenderTxt.setText("Female");
        residentGenderTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
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

        residentAgeTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentAgeTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentAgeTxt.setText("38");
        residentAgeTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        residentAgeTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentUnitTxt.setEditable(false);
        residentUnitTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentUnitTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentUnitTxt.setText("D-01-01");
        residentUnitTxt.setBorder(null);
        residentUnitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentPhoneTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentPhoneTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentPhoneTxt.setText("012-345 6789");
        residentPhoneTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        residentPhoneTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(233, 233, 233));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("IMAGE");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        saveBtn.setBackground(new java.awt.Color(255, 255, 255));
        saveBtn.setForeground(new java.awt.Color(0, 0, 0));
        saveBtn.setText("SAVE");
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelBtn.setText("CANCEL");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        errorMessage.setEditable(false);
        errorMessage.setBackground(new java.awt.Color(233, 233, 233));
        errorMessage.setForeground(new java.awt.Color(204, 0, 0));
        errorMessage.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(119, 119, 119)
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
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(residentGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(residentAgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(residentUnitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(residentPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(residentNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(residentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(188, 188, 188)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(161, Short.MAX_VALUE))
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
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
        residentProfile.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        int dialog = JOptionPane.showConfirmDialog(null, 
                "Are You Sure to Save?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(dialog == JOptionPane.YES_OPTION){
            if(checkData())
            {
                setData();
                this.dispose();
                residentProfile.setVisible(true); 
            }
              
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        residentProfile.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    
    private void displayData()
    {
        residentIdTxt.setText(residentMain.getId());
        residentNameTxt.setText(residentMain.getName());
        residentGenderTxt.setText(residentMain.getGender());
        residentAgeTxt.setText(residentMain.getAge());
        residentPhoneTxt.setText(residentMain.getPhone());
        residentUnitTxt.setText(residentMain.getUnit());
    }
    
    private boolean checkData()
    {
        residentName = residentNameTxt.getText();
        residentAgeString = residentAgeTxt.getText();
        residentGender = residentGenderTxt.getText();
        residentPhone = residentPhoneTxt.getText();
        
        //check empty
        if (residentName == null || residentGender == null || residentAgeString == null || residentPhone == null)
        {
            errorMessage.setText("Name/Gender/Age/Phone Cannot be Empty !");
            return false;
        }
        
        if (residentName.equals("") || residentGender.equals("") || residentAgeString.equals("") || residentPhone.equals(""))
        {
            errorMessage.setText("Name/Gender/Age/Phone Cannot be Empty !");
            return false;
        }
        
        
        //check name
        Matcher nameMatcher = Pattern.compile("^[A-Za-z]\\w{5,29}$").
                matcher(residentName);
        if(nameMatcher.matches() == false)
        {
            errorMessage.setText("Name is Invalid !");
            return false;
        }
        
        //check gender
        if(!residentGender.equals("Male") || !residentGender.equals("Female") )
        {
            errorMessage.setText("Gender must be Small Letter !");
            return false;
        }
        
        //check age
        try {
            residentAgeInt = Integer.parseInt(residentAgeString);
            errorMessage.setText("Age Must be Integer !");
        } catch (NumberFormatException e) {
            return false;
        }
        
        //check phone
        Matcher phoneMatcher = Pattern.compile("^(01)[0-9]*[0-9]{7,8}$").
                matcher(residentPhone);
         //check dash
        Matcher phoneMatcher2 = Pattern.compile("^(01)[0-9]-*[0-9]{7,8}$").
                matcher(residentPhone);
         //check space
        Matcher phoneMatcher3 = Pattern.compile("^(01)[0-9]-*[0-9 ]{7,8}$").
                matcher(residentPhone);
        if(phoneMatcher.matches() == false && phoneMatcher2.matches() == false && phoneMatcher3.matches() == false)
        {
            errorMessage.setText("Phone Number is Invalid !");
            return false;
        }
        
     
        return true;
    }
    
    
    private void setData()
    {
        residentMain.setName(residentNameTxt.getText());
        residentMain.setGender(residentGenderTxt.getText());
        residentMain.setAge(residentAgeTxt.getText());
        residentMain.setPhone(residentPhoneTxt.getText());
        
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
            java.util.logging.Logger.getLogger(ResidentProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentProfileEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField errorMessage;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField residentUnitLabel;
    private javax.swing.JTextField residentUnitTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables
}
