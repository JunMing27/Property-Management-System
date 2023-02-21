/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.buildingManager;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jun Ming
 */
public class buildingManUserManageFrame extends javax.swing.JFrame {

    /**
     * Creates new form BuildingManUserManageFrame
     */
    public buildingManUserManageFrame() {
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
        backButton = new javax.swing.JButton();
        roleTxtField = new javax.swing.JLabel();
        dataImage1 = new javax.swing.JLabel();
        idTxtField1 = new javax.swing.JLabel();
        nameTxtField1 = new javax.swing.JLabel();
        updateBtn1 = new javax.swing.JButton();
        deleteBtn1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        idTxtField2 = new javax.swing.JLabel();
        nameTxtField2 = new javax.swing.JLabel();
        dataImage2 = new javax.swing.JLabel();
        updateBtn2 = new javax.swing.JButton();
        deleteBtn2 = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        previousPage = new javax.swing.JButton();
        nextPage = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        searchTxtField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        roleTxtField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        roleTxtField.setForeground(new java.awt.Color(0, 0, 0));
        roleTxtField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roleTxtField.setText("User");

        dataImage1.setForeground(new java.awt.Color(0, 0, 0));
        dataImage1.setText("IMAGE");

        idTxtField1.setText("jLabel3");

        nameTxtField1.setText("jLabel4");

        updateBtn1.setBackground(new java.awt.Color(255, 255, 255));
        updateBtn1.setForeground(new java.awt.Color(0, 0, 0));
        updateBtn1.setText("UPDATE");
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });

        deleteBtn1.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn1.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn1.setText("DELETE");
        deleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn1ActionPerformed(evt);
            }
        });

        idTxtField2.setText("jLabel3");

        nameTxtField2.setText("jLabel4");

        dataImage2.setForeground(new java.awt.Color(0, 0, 0));
        dataImage2.setText("IMAGE");

        updateBtn2.setBackground(new java.awt.Color(255, 255, 255));
        updateBtn2.setForeground(new java.awt.Color(0, 0, 0));
        updateBtn2.setText("UPDATE");
        updateBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn2ActionPerformed(evt);
            }
        });

        deleteBtn2.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn2.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn2.setText("DELETE");
        deleteBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn2ActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 0, 0));
        addBtn.setText("ADD USER");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        previousPage.setBackground(new java.awt.Color(255, 255, 255));
        previousPage.setForeground(new java.awt.Color(0, 0, 0));
        previousPage.setText("back");
        previousPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPageActionPerformed(evt);
            }
        });

        nextPage.setBackground(new java.awt.Color(255, 255, 255));
        nextPage.setForeground(new java.awt.Color(0, 0, 0));
        nextPage.setText("next");
        nextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn.setForeground(new java.awt.Color(0, 0, 0));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        searchTxtField.setBackground(new java.awt.Color(255, 255, 255));
        searchTxtField.setForeground(new java.awt.Color(0, 0, 0));
        searchTxtField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchTxtField.setCaretColor(new java.awt.Color(0, 0, 0));
        searchTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(dataImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idTxtField2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(nameTxtField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(175, 175, 175)
                                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(82, 82, 82)
                                            .addComponent(dataImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(updateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(idTxtField1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                                .addComponent(nameTxtField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(57, 57, 57)
                                            .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(updateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(233, 233, 233)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(roleTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(previousPage)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nextPage))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backButton)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBtn)
                            .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roleTxtField)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(dataImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(idTxtField1)
                        .addGap(27, 27, 27)
                        .addComponent(nameTxtField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(idTxtField2)
                        .addGap(26, 26, 26)
                        .addComponent(nameTxtField2)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(dataImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManagerUserMenuFrame UserManageOption = new buildingManagerUserMenuFrame();
        UserManageOption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UserManageOption.pack();
        UserManageOption.setResizable(false);
        UserManageOption.setLocationRelativeTo(null);
        UserManageOption.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        // TODO add your handling code here:
        if(!(idTxtField1.getText()).equals("no data")){
            this.dispose();
            buildingManUserAddEditFrame userAddEdit = new buildingManUserAddEditFrame();
            userAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            userAddEdit.pack();
            userAddEdit.setResizable(false);
            userAddEdit.setLocationRelativeTo(null);
            userAddEdit.setVisible(true);
            userAddEdit.setUserAndFileType(userType);
            userAddEdit.addEditDetect("edit",idTxtField1.getText());
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty data", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtn1ActionPerformed

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
        // TODO add your handling code here:
        deleteBtn(idTxtField1.getText());
    }//GEN-LAST:event_deleteBtn1ActionPerformed

    private void updateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn2ActionPerformed
        // TODO add your handling code here:
        if(!(idTxtField2.getText()).equals("no data")){
            this.dispose();
            buildingManUserAddEditFrame userAddEdit = new buildingManUserAddEditFrame();
            userAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            userAddEdit.pack();
            userAddEdit.setResizable(false);
            userAddEdit.setLocationRelativeTo(null);
            userAddEdit.setVisible(true);
            userAddEdit.setUserAndFileType(userType);
            userAddEdit.addEditDetect("edit",idTxtField2.getText());
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty data", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtn2ActionPerformed

    private void deleteBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn2ActionPerformed
        // TODO add your handling code here:
        deleteBtn(idTxtField2.getText());
    }//GEN-LAST:event_deleteBtn2ActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManUserAddEditFrame userAddEdit = new buildingManUserAddEditFrame();
        userAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userAddEdit.pack();
        userAddEdit.setResizable(false);
        userAddEdit.setLocationRelativeTo(null);
        userAddEdit.setVisible(true);
        userAddEdit.setUserAndFileType(userType);
        userAddEdit.addEditDetect("add","");
    }//GEN-LAST:event_addBtnActionPerformed

    private void previousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPageActionPerformed
        // TODO add your handling code here:
        backButtonFunction();
        try {
            setUserData();
        } catch (IOException ex) {
        }
        nextPage.setEnabled(true);
    }//GEN-LAST:event_previousPageActionPerformed

    private void nextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageActionPerformed
        // TODO add your handling code here:
        previousPage.setEnabled(true);
        try {
            setUserData();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_nextPageActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        this.searchTxt = searchTxtField.getText();
        this.PageLine=-1;
        previousPage.setEnabled(false);
        nextPage.setEnabled(true);
        buildingManager main = new buildingManager();
        main.chooseTxtFile(userType);
        try {
            setUserData();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtFieldActionPerformed

    
    private Integer PageLine=-1;
    
    public void setPagination(){
        PageLine=PageLine+1;
    }
    
    private String searchTxt ="";
    private String userType="";
    
    public void setUserType(String type){
        this.userType=type;
    }
    
    public void backButtonToggle(){
        previousPage.setEnabled(false);
}
    
    public void backButtonFunction(){
        PageLine = PageLine -4;
        if (PageLine==-1){
            previousPage.setEnabled(false);
        }
    }
    
    public void setUserData() throws IOException{
        buildingManager main = new buildingManager();
        main.chooseTxtFile(userType);
        if(userType=="Account Executive"){
            roleTxtField.setText("Account Executive");
        }else if(userType=="Admin Executive"){
            roleTxtField.setText("Admin Executive");
        }else if(userType=="Building Executive"){
            roleTxtField.setText("Building Executive");
        }
        
        setPagination();
        main.displayDataView(PageLine,searchTxt,userType);
        boolean boo = main.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        if(main.getUserId() !=null){
            idTxtField1.setText(main.getUserId());
            nameTxtField1.setText(main.getUserName());
            try{
                BufferedImage UserImage = ImageIO.read(new File("src/main/java/com/mycompany/image/"+main.getUserImage()));
                Image resizedImage = UserImage.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
                dataImage1.setIcon(new ImageIcon(resizedImage));
                }catch(Exception e){}
        }else{
            idTxtField1.setText("no data");
            nameTxtField1.setText("no data");
            dataImage1.setIcon(null);
        }
        setPagination();
        main.displayDataView(PageLine,searchTxt,userType);
        boo = main.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        if(main.getUserId() !=null){
            idTxtField2.setText(main.getUserId());
            nameTxtField2.setText(main.getUserName());
            try{
                BufferedImage UserImage = ImageIO.read(new File("src/main/java/com/mycompany/image/"+main.getUserImage()));
                Image resizedImage = UserImage.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
                dataImage2.setIcon(new ImageIcon(resizedImage));
                }catch(Exception e){}
        }else{
            idTxtField2.setText("no data");
            nameTxtField2.setText("no data");
            dataImage2.setIcon(null);
        }
    
    }
    
    
    //Method for delete button, so no need to be repetitive
    public void deleteBtn(String getText){
        if(!getText.equals("no data")){
            int ques = JOptionPane.showConfirmDialog(null,"confirm to delete this data", "Quit", JOptionPane.YES_NO_OPTION);
            if (ques == JOptionPane.YES_OPTION){
                buildingManager main = new buildingManager();
                main.chooseTxtFile(userType);
                main.deleteFunction(getText);
                JOptionPane.showMessageDialog(null, "Deleted Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                
                this.dispose();
                com.mycompany.mavenproject1.BuildingManUserManageFrame manager = new com.mycompany.mavenproject1.BuildingManUserManageFrame();
                manager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                manager.pack();
                manager.setResizable(false);
                manager.setLocationRelativeTo(null);
                manager.setVisible(true);
                manager.backButtonToggle();
                try {
                    manager.setUserType(userType);
                    manager.setUserData();
                } catch (IOException ex) {

                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty data", "Warning", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(buildingManUserManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buildingManUserManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buildingManUserManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buildingManUserManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buildingManUserManageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel dataImage1;
    private javax.swing.JLabel dataImage2;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JButton deleteBtn2;
    private javax.swing.JLabel idTxtField1;
    private javax.swing.JLabel idTxtField2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameTxtField1;
    private javax.swing.JLabel nameTxtField2;
    private javax.swing.JButton nextPage;
    private javax.swing.JButton previousPage;
    private javax.swing.JLabel roleTxtField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JButton updateBtn1;
    private javax.swing.JButton updateBtn2;
    // End of variables declaration//GEN-END:variables
}
