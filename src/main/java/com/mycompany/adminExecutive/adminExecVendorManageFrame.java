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
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jun Ming
 */
public class adminExecVendorManageFrame extends javax.swing.JFrame {

    /**
     * Creates new form adminExecVendorManageFrame
     */
    public adminExecVendorManageFrame() {
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
        RoleLabel = new javax.swing.JLabel();
        vendorImage1 = new javax.swing.JLabel();
        vendorId1 = new javax.swing.JLabel();
        vendorName1 = new javax.swing.JLabel();
        updateBtn1 = new javax.swing.JButton();
        deleteBtn1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        vendorId2 = new javax.swing.JLabel();
        vendorName2 = new javax.swing.JLabel();
        vendorImage2 = new javax.swing.JLabel();
        updateBtn2 = new javax.swing.JButton();
        deleteBtn2 = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        previousPage = new javax.swing.JButton();
        nextPage = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

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

        RoleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RoleLabel.setForeground(new java.awt.Color(0, 0, 0));
        RoleLabel.setText("Vendor");

        vendorImage1.setForeground(new java.awt.Color(0, 0, 0));
        vendorImage1.setText("IMAGE");

        vendorId1.setText("jLabel3");

        vendorName1.setText("jLabel4");

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

        vendorId2.setText("jLabel3");

        vendorName2.setText("jLabel4");

        vendorImage2.setForeground(new java.awt.Color(0, 0, 0));
        vendorImage2.setText("IMAGE");

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

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.setCaretColor(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                            .addComponent(vendorImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(updateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(vendorId1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                                .addComponent(vendorName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(vendorImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(vendorId2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(vendorName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(211, 211, 211)
                                    .addComponent(RoleLabel)
                                    .addGap(55, 55, 55)
                                    .addComponent(previousPage)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nextPage)))
                            .addGap(13, 13, 13))))
                .addGap(60, 60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backBtn)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBtn)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RoleLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vendorImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(vendorId1)
                        .addGap(27, 27, 27)
                        .addComponent(vendorName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(vendorId2)
                        .addGap(26, 26, 26)
                        .addComponent(vendorName2)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(vendorImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        adminExecutiveMenuFrame adminMenu = new adminExecutiveMenuFrame();
        adminMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminMenu.pack();
        adminMenu.setResizable(false);
        adminMenu.setLocationRelativeTo(null);
        adminMenu.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        // TODO add your handling code here:
        if(!(vendorId1.getText()).equals("no data")){
            this.dispose();
            adminExecVendorAddEditFrame vendorAddEdit = new adminExecVendorAddEditFrame();
            vendorAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vendorAddEdit.pack();
            vendorAddEdit.setResizable(false);
            vendorAddEdit.setLocationRelativeTo(null);
            vendorAddEdit.setVisible(true);
            vendorAddEdit.addEditDetect("edit",vendorId1.getText());
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty data", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtn1ActionPerformed

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
        // TODO add your handling code here:
        deleteBtn(vendorId1.getText());
    }//GEN-LAST:event_deleteBtn1ActionPerformed

    private void updateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn2ActionPerformed
        // TODO add your handling code here:
        if(!(vendorId2.getText()).equals("no data")){
            this.dispose();
            adminExecVendorAddEditFrame vendorAddEdit = new adminExecVendorAddEditFrame();
            vendorAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vendorAddEdit.pack();
            vendorAddEdit.setResizable(false);
            vendorAddEdit.setLocationRelativeTo(null);
            vendorAddEdit.setVisible(true);
            vendorAddEdit.addEditDetect("edit",vendorId2.getText());
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty data", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtn2ActionPerformed

    private void deleteBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn2ActionPerformed
        // TODO add your handling code here:
        deleteBtn(vendorId2.getText());
    }//GEN-LAST:event_deleteBtn2ActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        adminExecVendorAddEditFrame vendorAddEdit = new adminExecVendorAddEditFrame();
        vendorAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vendorAddEdit.pack();
        vendorAddEdit.setResizable(false);
        vendorAddEdit.setLocationRelativeTo(null);
        vendorAddEdit.setVisible(true);
        vendorAddEdit.addEditDetect("add","");
    }//GEN-LAST:event_addBtnActionPerformed

    private void previousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPageActionPerformed
        // TODO add your handling code here:
        backButtonFunction();
        try {
            setVendorData();
        } catch (IOException ex) {
        }
        nextPage.setEnabled(true);
    }//GEN-LAST:event_previousPageActionPerformed

    private void nextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageActionPerformed
        // TODO add your handling code here:
        previousPage.setEnabled(true);
        try {
            setVendorData();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_nextPageActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        this.searchTxt = jTextField1.getText();
        this.PageLine=-1;
        previousPage.setEnabled(false);
        nextPage.setEnabled(true);
        adminExecutive main = new adminExecutive();
        main.chooseTxtFile("Vendor");
        try {
            setVendorData();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private Integer PageLine=-1;
    
    public void setPagination(){
        PageLine=PageLine+1;
    }
    
    private String searchTxt ="";
    private String userType="Vendor";
    
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
    
    public void setVendorData() throws IOException{
        vendor main = new vendor();
        main.chooseTxtFile(userType);
        
        setPagination();
        main.displayDataView(PageLine,searchTxt,userType);
        boolean boo = main.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        if(main.getUserId() !=null){
            vendorId1.setText(main.getUserId());
            vendorName1.setText(main.getUserName());
            try{
                BufferedImage UserImage = ImageIO.read(new File("src/main/java/com/mycompany/image/"+main.getUserImage()));
                Image resizedImage = UserImage.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
                vendorImage1.setIcon(new ImageIcon(resizedImage));
                }catch(Exception e){}
        }else{
            vendorId1.setText("no data");
            vendorName1.setText("no data");
            vendorImage1.setIcon(null);
        }
        setPagination();
        main.displayDataView(PageLine,searchTxt,userType);
        boo = main.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        if(main.getUserId() !=null){
            vendorId2.setText(main.getUserId());
            vendorName2.setText(main.getUserName());
            try{
                BufferedImage UserImage = ImageIO.read(new File("src/main/java/com/mycompany/image/"+main.getUserImage()));
                Image resizedImage = UserImage.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
                vendorImage2.setIcon(new ImageIcon(resizedImage));
                }catch(Exception e){}
        }else{
            vendorId2.setText("no data");
            vendorName2.setText("no data");
            vendorImage2.setIcon(null);
        }
    
    }
    
    
    //Method for delete button, so no need to be repetitive
    public void deleteBtn(String getText){
        if(!getText.equals("no data")){
            int ques = JOptionPane.showConfirmDialog(null,"confirm to delete this data", "Quit", JOptionPane.YES_NO_OPTION);
            if (ques == JOptionPane.YES_OPTION){
                adminExecutive main = new adminExecutive();
                main.chooseTxtFile("Vendor");
                adminExecutive.adminExecutiveMethod mainInner = main.new adminExecutiveMethod();
                mainInner.deleteVendor(getText);
                JOptionPane.showMessageDialog(null, "Deleted Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                
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
            java.util.logging.Logger.getLogger(adminExecVendorManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminExecVendorManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminExecVendorManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminExecVendorManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminExecVendorManageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JButton deleteBtn2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nextPage;
    private javax.swing.JButton previousPage;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn1;
    private javax.swing.JButton updateBtn2;
    private javax.swing.JLabel vendorId1;
    private javax.swing.JLabel vendorId2;
    private javax.swing.JLabel vendorImage1;
    private javax.swing.JLabel vendorImage2;
    private javax.swing.JLabel vendorName1;
    private javax.swing.JLabel vendorName2;
    // End of variables declaration//GEN-END:variables
}
