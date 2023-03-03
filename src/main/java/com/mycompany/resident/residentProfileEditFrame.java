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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author hoiyi
 */
public class residentProfileEditFrame extends javax.swing.JFrame {

    String imageName = null;
    File sourceFile = null;
    static String idGet;
    
    public residentProfileEditFrame(String id) {
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
        residentAgeLabel = new javax.swing.JTextField();
        residentUnitLabel = new javax.swing.JTextField();
        residentPhoneLabel = new javax.swing.JTextField();
        residentAgeTxt = new javax.swing.JTextField();
        residentUnitTxt = new javax.swing.JTextField();
        residentPhoneTxt = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        errorMessage = new javax.swing.JTextField();
        residentUsernameLabel = new javax.swing.JLabel();
        residentUsernameTxt = new javax.swing.JTextField();
        residentPwdLabel = new javax.swing.JLabel();
        residentPwdTxt = new javax.swing.JTextField();
        maleCheckBox = new javax.swing.JCheckBox();
        femaleCheckBox = new javax.swing.JCheckBox();

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
        residentNameTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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
        residentAgeTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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
        residentPhoneTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        imageLabel.setBackground(new java.awt.Color(233, 233, 233));
        imageLabel.setForeground(new java.awt.Color(0, 0, 0));
        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLabelMouseClicked(evt);
            }
        });

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
        errorMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorMessage.setBorder(null);

        residentUsernameLabel.setBackground(new java.awt.Color(233, 233, 233));
        residentUsernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        residentUsernameLabel.setText("Username :");

        residentUsernameTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentUsernameTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentUsernameTxt.setText("User1");
        residentUsernameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        residentUsernameTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        residentPwdLabel.setBackground(new java.awt.Color(233, 233, 233));
        residentPwdLabel.setForeground(new java.awt.Color(0, 0, 0));
        residentPwdLabel.setText("Password :");

        residentPwdTxt.setBackground(new java.awt.Color(233, 233, 233));
        residentPwdTxt.setForeground(new java.awt.Color(0, 0, 0));
        residentPwdTxt.setText("user123");
        residentPwdTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        residentPwdTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        maleCheckBox.setBackground(new java.awt.Color(233, 233, 233));
        maleCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        maleCheckBox.setText("Male");

        femaleCheckBox.setBackground(new java.awt.Color(233, 233, 233));
        femaleCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        femaleCheckBox.setText("Female");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(residentGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addComponent(residentUsernameLabel)
                            .addComponent(residentPwdLabel))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(residentUnitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentUsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentPwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(femaleCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(residentAgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(topLabel)))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
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
                            .addComponent(maleCheckBox)
                            .addComponent(femaleCheckBox))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(residentAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentAgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(residentUsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(residentPwdLabel)
                    .addComponent(residentPwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
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
        residentProfileManageFrame manageFrame = new residentProfileManageFrame(idGet);
        manageFrame.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void imageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                final String name = f.getName();
                return name.endsWith(".png") || name.endsWith(".jpg");
            }
            @Override
            public String getDescription() {
                return "*.png,*.jpg";
            }
        });
        
        int result = fileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            sourceFile = fileChooser.getSelectedFile();
            imageName = sourceFile.getName();
            
            BufferedImage bufferedImage = null;
            try {
                bufferedImage = ImageIO.read(sourceFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //width and height according to jframe profile label size
            Image profileImage = bufferedImage.getScaledInstance(138, 126, Image.SCALE_SMOOTH);
            ImageIcon profileIcon = new ImageIcon(profileImage);
            imageLabel.setIcon(profileIcon);
            
        }
        
    }//GEN-LAST:event_imageLabelMouseClicked

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        String name = residentNameTxt.getText();
        String ageString = residentAgeTxt.getText();
        String gender = "";
        if(maleCheckBox.isSelected() && femaleCheckBox.isSelected())
        {
            gender = "two selected";
        }else{
            if(maleCheckBox.isSelected())
            {
                gender = "male";
            }else if(femaleCheckBox.isSelected())
            {
                gender = "female";
            }
        }
        String phone = residentPhoneTxt.getText();
        String unit = residentUnitTxt.getText();
        String userName = residentUsernameTxt.getText();
        String pwd = residentPwdTxt.getText();
        errorMessage.setText("");
        if(!name.isEmpty() && !ageString.isEmpty()
            && !gender.isEmpty() && !phone.isEmpty()
            && !unit.isEmpty() && !userName.isEmpty()
            && !pwd.isEmpty() && !imageName.equals(""))
        {
            if(!name.isBlank()&& !ageString.isBlank()
                && !gender.isBlank()&& !phone.isBlank()
                && !unit.isBlank()&& !userName.isBlank()
                && !pwd.isBlank())
            {
                if(gender.equals("two selected"))
                {
                    errorMessage.setText("Please Select Only One CheckBox");
                }
                try {
                    Integer.parseInt(ageString);
                } catch (NumberFormatException e) {
                    errorMessage.setText("Age Must be Integer !");
                }

                Matcher phoneMatcher = Pattern.compile("^(01)[0-9]*[0-9]{7,8}$").
                        matcher(phone);
                 //check dash
                Matcher phoneMatcher2 = Pattern.compile("^(01)[0-9]-*[0-9]{7,8}$").
                        matcher(phone);
                 //check space
                Matcher phoneMatcher3 = Pattern.compile("^(01)[0-9]-*[0-9 ]{7,8}$").
                        matcher(phone);
                if(phoneMatcher.matches() == false && phoneMatcher2.matches() == false && phoneMatcher3.matches() == false)
                {
                    errorMessage.setText("Phone Number is Invalid !");
                }

                if(userName.contains(" ") || pwd.contains(" "))
                {
                    errorMessage.setText("Username or Password cannot contain space ");
                }

                if(errorMessage.getText().equals(""))
                {
                    int dialog = JOptionPane.showConfirmDialog(null, 
                            "Are You Sure to Save?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if(dialog == JOptionPane.YES_OPTION){
                        resident main = new resident();
                        resident.residentMethod innerMethod = main.new residentMethod();
                        main.setUserId(idGet);
                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add(idGet);
                        dataList.add(name);
                        dataList.add(gender);
                        dataList.add(ageString);
                        dataList.add(phone);
                        dataList.add(unit);
                        dataList.add(imageName);
                        innerMethod.editProfile("residentProfile", dataList);
                        
                        ArrayList<String> dataList1 = new ArrayList<>();
                        dataList1.add(idGet);
                        dataList1.add(userName);
                        dataList1.add(pwd);
                        dataList1.add("Resident");
                        innerMethod.editCredential("loginCredential", dataList1);
                        File dest = new File("src/main/java/com/mycompany/image/" + imageName);
                        File source = sourceFile;
                        main.transferImage(source,dest); 
                        this.dispose();
                        residentProfileManageFrame residentProfile = new residentProfileManageFrame(idGet);
                        residentProfile.setVisible(true); 
                    }
                }
            }errorMessage.setText("Name/Gender/Age/Phone/Username/Password  Cannot be Empty !");
        }else{
            errorMessage.setText("Name/Gender/Age/Phone/Username/Password  Cannot be Empty !");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        residentProfileManageFrame residentProfile = new residentProfileManageFrame(idGet);
        residentProfile.setVisible(true); 
    }//GEN-LAST:event_cancelBtnActionPerformed

    
    private void displayData()
    {
        resident main = new resident();
        main.setUserId(idGet);
        main.displayDataViewOwn(0, "", "resident", "residentProfile");
        try {
            main.getCredentialData(main.getUserId());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(residentProfileEditFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(main.getUserId() != null)
        {
            residentIdTxt.setText(main.getUserId());
            residentNameTxt.setText(main.getUserName());
            String gender = main.getUserGender();
            if(gender.equals("male"))
            {
                maleCheckBox.setSelected(true);
            }else if(gender.equals("female"))
            {
                femaleCheckBox.setSelected(true);
            }
            residentAgeTxt.setText(main.getUserAge());
            residentPhoneTxt.setText(main.getUserPhone());
            residentUnitTxt.setText(main.getUserUnit());
            imageName = main.getUserImage();

            residentUsernameTxt.setText(main.getCredentialName());
            residentPwdTxt.setText(main.getPassword());

            try {
                //image
                BufferedImage bufferedImage = null;
                File imageFile = new File("src/main/java/com/mycompany/Image/"+imageName);
                bufferedImage = ImageIO.read(imageFile);
                Image profileImage = bufferedImage.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon profileIcon = new ImageIcon(profileImage);
                imageLabel.setIcon(profileIcon);
            } catch (IOException ex) {
                Logger.getLogger(residentProfileEditFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }else{
            residentIdTxt.setText("no data");
            residentNameTxt.setText("no data");
            maleCheckBox.setSelected(false);
            femaleCheckBox.setSelected(false);
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
            java.util.logging.Logger.getLogger(residentProfileEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(residentProfileEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(residentProfileEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(residentProfileEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new residentProfileEditFrame(idGet).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField errorMessage;
    private javax.swing.JCheckBox femaleCheckBox;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox maleCheckBox;
    private javax.swing.JTextField residentAgeLabel;
    private javax.swing.JTextField residentAgeTxt;
    private javax.swing.JTextField residentGenderLabel;
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
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables

}
