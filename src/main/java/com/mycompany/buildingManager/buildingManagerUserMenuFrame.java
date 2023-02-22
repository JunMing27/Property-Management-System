/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.buildingManager;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Jun Ming
 */
public class buildingManagerUserMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form buildingManagerUserMenu
     */
    public buildingManagerUserMenuFrame() {
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
        viewAccountExecutive = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewBuildingExecutive = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        viewAdminExecutive = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        viewAccountExecutive.setBackground(new java.awt.Color(255, 255, 255));
        viewAccountExecutive.setForeground(new java.awt.Color(0, 0, 0));
        viewAccountExecutive.setText("Account Executive");
        viewAccountExecutive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAccountExecutiveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Select User Type");

        viewBuildingExecutive.setBackground(new java.awt.Color(255, 255, 255));
        viewBuildingExecutive.setForeground(new java.awt.Color(0, 0, 0));
        viewBuildingExecutive.setText("Building Executive");
        viewBuildingExecutive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBuildingExecutiveActionPerformed(evt);
            }
        });

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setForeground(new java.awt.Color(0, 0, 0));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        viewAdminExecutive.setBackground(new java.awt.Color(255, 255, 255));
        viewAdminExecutive.setForeground(new java.awt.Color(0, 0, 0));
        viewAdminExecutive.setText("Admin Executive");
        viewAdminExecutive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdminExecutiveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewBuildingExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewAccountExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewAdminExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(207, 207, 207))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BackBtn)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(viewAccountExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewBuildingExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewAdminExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
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

    private void viewAccountExecutiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAccountExecutiveActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManUserManageFrame BusManUserManage = new buildingManUserManageFrame();
        BusManUserManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BusManUserManage.pack();
        BusManUserManage.setResizable(false);
        BusManUserManage.setLocationRelativeTo(null);
        BusManUserManage.setVisible(true);
        BusManUserManage.backButtonToggle();
        //Run Method in BusManUserManage to set UserType and Data
        try {
            BusManUserManage.setUserType("Account Executive");
            BusManUserManage.setUserData();
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_viewAccountExecutiveActionPerformed

    private void viewBuildingExecutiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBuildingExecutiveActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManUserManageFrame BusManUserManage = new buildingManUserManageFrame();
        BusManUserManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BusManUserManage.pack();
        BusManUserManage.setResizable(false);
        BusManUserManage.setLocationRelativeTo(null);
        BusManUserManage.setVisible(true);
        BusManUserManage.backButtonToggle();
        //Run Method in BusManUserManage to set UserType and Data
        try {
            BusManUserManage.setUserType("Building Executive");
            BusManUserManage.setUserData();
        } catch (IOException ex) {
            
        }

    }//GEN-LAST:event_viewBuildingExecutiveActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManagerMenuFrame mainMenu = new buildingManagerMenuFrame();
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.pack();
        mainMenu.setResizable(false);
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void viewAdminExecutiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdminExecutiveActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManUserManageFrame BusManUserManage = new buildingManUserManageFrame();
        BusManUserManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BusManUserManage.pack();
        BusManUserManage.setResizable(false);
        BusManUserManage.setLocationRelativeTo(null);
        BusManUserManage.setVisible(true);
        BusManUserManage.backButtonToggle();
        //Run Method in BusManUserManage to set UserType and Data
        try {
            BusManUserManage.setUserType("Admin Executive");
            BusManUserManage.setUserData();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_viewAdminExecutiveActionPerformed

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
            java.util.logging.Logger.getLogger(buildingManagerUserMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buildingManagerUserMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buildingManagerUserMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buildingManagerUserMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buildingManagerUserMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton viewAccountExecutive;
    private javax.swing.JButton viewAdminExecutive;
    private javax.swing.JButton viewBuildingExecutive;
    // End of variables declaration//GEN-END:variables
}