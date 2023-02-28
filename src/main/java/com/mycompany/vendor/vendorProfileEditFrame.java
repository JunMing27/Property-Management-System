/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vendor;

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
public class vendorProfileEditFrame extends javax.swing.JFrame {

    String imageName = null;
    File sourceFile = null;
    static String idGet;
    
    public vendorProfileEditFrame(String id) {
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
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        errorMessage = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        pwdTxt = new javax.swing.JTextField();
        maleCheckBox = new javax.swing.JCheckBox();
        femaleCheckBox = new javax.swing.JCheckBox();
        idLabel = new javax.swing.JTextField();
        nameLabel = new javax.swing.JTextField();
        genderLabel = new javax.swing.JTextField();
        ageLabel = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        pwdLabel = new javax.swing.JLabel();

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

        idTxt.setEditable(false);
        idTxt.setBackground(new java.awt.Color(233, 233, 233));
        idTxt.setForeground(new java.awt.Color(0, 0, 0));
        idTxt.setText("V1");
        idTxt.setBorder(null);
        idTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nameTxt.setBackground(new java.awt.Color(233, 233, 233));
        nameTxt.setForeground(new java.awt.Color(0, 0, 0));
        nameTxt.setText("User 1");
        nameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        nameTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        ageTxt.setBackground(new java.awt.Color(233, 233, 233));
        ageTxt.setForeground(new java.awt.Color(0, 0, 0));
        ageTxt.setText("38");
        ageTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ageTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        phoneTxt.setBackground(new java.awt.Color(233, 233, 233));
        phoneTxt.setForeground(new java.awt.Color(0, 0, 0));
        phoneTxt.setText("012-345 6789");
        phoneTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        phoneTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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

        usernameTxt.setBackground(new java.awt.Color(233, 233, 233));
        usernameTxt.setForeground(new java.awt.Color(0, 0, 0));
        usernameTxt.setText("User1");
        usernameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        usernameTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pwdTxt.setBackground(new java.awt.Color(233, 233, 233));
        pwdTxt.setForeground(new java.awt.Color(0, 0, 0));
        pwdTxt.setText("user123");
        pwdTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pwdTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        maleCheckBox.setBackground(new java.awt.Color(233, 233, 233));
        maleCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        maleCheckBox.setText("Male");

        femaleCheckBox.setBackground(new java.awt.Color(233, 233, 233));
        femaleCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        femaleCheckBox.setText("Female");

        idLabel.setEditable(false);
        idLabel.setBackground(new java.awt.Color(233, 233, 233));
        idLabel.setForeground(new java.awt.Color(0, 0, 0));
        idLabel.setText("ID :");
        idLabel.setBorder(null);
        idLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nameLabel.setEditable(false);
        nameLabel.setBackground(new java.awt.Color(233, 233, 233));
        nameLabel.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel.setText("Name :");
        nameLabel.setBorder(null);
        nameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        genderLabel.setEditable(false);
        genderLabel.setBackground(new java.awt.Color(233, 233, 233));
        genderLabel.setForeground(new java.awt.Color(0, 0, 0));
        genderLabel.setText("Gender :");
        genderLabel.setBorder(null);
        genderLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ageLabel.setEditable(false);
        ageLabel.setBackground(new java.awt.Color(233, 233, 233));
        ageLabel.setForeground(new java.awt.Color(0, 0, 0));
        ageLabel.setText("Age :");
        ageLabel.setBorder(null);
        ageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        phoneLabel.setEditable(false);
        phoneLabel.setBackground(new java.awt.Color(233, 233, 233));
        phoneLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneLabel.setText("Phone No. :");
        phoneLabel.setBorder(null);
        phoneLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        usernameLabel.setBackground(new java.awt.Color(233, 233, 233));
        usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel.setText("Username :");

        pwdLabel.setBackground(new java.awt.Color(233, 233, 233));
        pwdLabel.setForeground(new java.awt.Color(0, 0, 0));
        pwdLabel.setText("Password :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(topLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameLabel)
                                    .addComponent(pwdLabel))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(91, 91, 91)))
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
                            .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleCheckBox)
                            .addComponent(femaleCheckBox)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwdLabel)
                            .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
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
        vendorProfileManageFrame profile = new vendorProfileManageFrame(idGet);
        profile.setVisible(true);
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
            Image profileImage = bufferedImage.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon profileIcon = new ImageIcon(profileImage);
            imageLabel.setIcon(profileIcon);

        }
    }//GEN-LAST:event_imageLabelMouseClicked

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String name = nameTxt.getText();
        String ageString = ageTxt.getText();
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
        String phone = phoneTxt.getText();
        String userName = usernameTxt.getText();
        String pwd = pwdTxt.getText();
        errorMessage.setText("");
        if(!name.isEmpty() && !ageString.isEmpty() && !gender.isEmpty()
            && !phone.isEmpty() && !userName.isEmpty() && !pwd.isEmpty() && !imageName.equals(""))
        {
            if(!name.isBlank()&& !ageString.isBlank()&& !gender.isBlank()
                && !phone.isBlank()&& !userName.isBlank()&& !pwd.isBlank())
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

                //check phone
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
                        vendor main = new vendor();
                        main.setUserId(idGet);
                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add(idGet);
                        main.removeFromFile("VendorProfile", dataList);
                        main.removeFromFile("loginCredential", dataList);
                        dataList.add(name);
                        dataList.add(gender);
                        dataList.add(ageString);
                        dataList.add(phone);
                        dataList.add(imageName);
                        main.editFile("VendorProfile", dataList);
                        dataList = new ArrayList<>();
                        dataList.add(idGet);
                        dataList.add(userName);
                        dataList.add(pwd);
                        dataList.add("vendor");
                        main.editFile("loginCredential", dataList);
                        this.dispose();
                        vendorProfileManageFrame profile = new vendorProfileManageFrame(idGet);
                        profile.setVisible(true);
                    }
                }
            }else{
                errorMessage.setText("Name/Gender/Age/Phone/Username/Password  Cannot be Empty !");
            }
        }else{
            errorMessage.setText("Name/Gender/Age/Phone/Username/Password  Cannot be Empty !");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        vendorProfileManageFrame profile = new vendorProfileManageFrame(idGet);
        profile.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    
    private void displayData()
    {
        vendor main = new vendor();
        main.setUserId(idGet);
        main.chooseTxtFile("Vendor");
        main.displayDataView(0, "", "vendorOwn");
        try {
            main.getCredentialData(main.getUserId());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(vendorProfileEditFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(main.getUserId() != null)
        {
            idTxt.setText(main.getUserId());
            nameTxt.setText(main.getUserName());
            String gender = main.getUserGender();
            if(gender.equals("male"))
            {
                maleCheckBox.setSelected(true);
            }else if(gender.equals("female"))
            {
                femaleCheckBox.setSelected(true);
            }
            ageTxt.setText(main.getUserAge());
            phoneTxt.setText(main.getUserPhone());
            imageName = main.getUserImage();
            usernameTxt.setText(main.getCredentialName());
            pwdTxt.setText(main.getPassword());
            
            try {
                //image
                BufferedImage bufferedImage = null;
                File imageFile = new File("src/main/java/com/mycompany/Image/"+imageName);
                bufferedImage = ImageIO.read(imageFile);
                Image profileImage = bufferedImage.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon profileIcon = new ImageIcon(profileImage);
                imageLabel.setIcon(profileIcon);
            } catch (IOException ex) {
                Logger.getLogger(vendorProfileEditFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else
        {
            idTxt.setText("no data");
            nameTxt.setText("no data");
            maleCheckBox.setSelected(false);
            femaleCheckBox.setSelected(false);
            ageTxt.setText("no data");
            phoneTxt.setText("no data");
            imageLabel.setText("no data");
            usernameTxt.setText("no data");
            pwdTxt.setText("no data");
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
            java.util.logging.Logger.getLogger(vendorProfileEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendorProfileEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendorProfileEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendorProfileEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendorProfileEditFrame(idGet).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageLabel;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField errorMessage;
    private javax.swing.JCheckBox femaleCheckBox;
    private javax.swing.JTextField genderLabel;
    private javax.swing.JTextField idLabel;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox maleCheckBox;
    private javax.swing.JTextField nameLabel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneLabel;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JTextField pwdTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel topLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
