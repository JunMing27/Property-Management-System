/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.adminExecutive;

import com.mycompany.mavenproject1.LoginPage;
import java.io.IOException;
import javax.swing.JFrame;


/**
 *
 * @author Jun Ming
 */
public class adminExecutiveMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form adminExecutiveOption
     */
    public adminExecutiveMenuFrame() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        unitManagePage = new javax.swing.JButton();
        residentManagePage = new javax.swing.JButton();
        complaintManagePage = new javax.swing.JButton();
        employeeManagePage = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        facilityManagePage = new javax.swing.JButton();
        facilityBookingManagePage = new javax.swing.JButton();
        vendorManagePage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(233, 233, 233));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Welcome Admin Executive !");

        unitManagePage.setBackground(new java.awt.Color(255, 255, 255));
        unitManagePage.setForeground(new java.awt.Color(0, 0, 0));
        unitManagePage.setText("Unit Management");
        unitManagePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitManagePageActionPerformed(evt);
            }
        });

        residentManagePage.setBackground(new java.awt.Color(255, 255, 255));
        residentManagePage.setForeground(new java.awt.Color(0, 0, 0));
        residentManagePage.setText("Resident Management");
        residentManagePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residentManagePageActionPerformed(evt);
            }
        });

        complaintManagePage.setBackground(new java.awt.Color(255, 255, 255));
        complaintManagePage.setForeground(new java.awt.Color(0, 0, 0));
        complaintManagePage.setText("Complaint Management");
        complaintManagePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaintManagePageActionPerformed(evt);
            }
        });

        employeeManagePage.setBackground(new java.awt.Color(255, 255, 255));
        employeeManagePage.setForeground(new java.awt.Color(0, 0, 0));
        employeeManagePage.setText("Employee Management");
        employeeManagePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeManagePageActionPerformed(evt);
            }
        });

        LogoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        LogoutBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogoutBtn.setText("Log Out");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        facilityManagePage.setBackground(new java.awt.Color(255, 255, 255));
        facilityManagePage.setForeground(new java.awt.Color(0, 0, 0));
        facilityManagePage.setText("Facility Management");
        facilityManagePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilityManagePageActionPerformed(evt);
            }
        });

        facilityBookingManagePage.setBackground(new java.awt.Color(255, 255, 255));
        facilityBookingManagePage.setForeground(new java.awt.Color(0, 0, 0));
        facilityBookingManagePage.setText("Facility Booking Management");
        facilityBookingManagePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilityBookingManagePageActionPerformed(evt);
            }
        });

        vendorManagePage.setBackground(new java.awt.Color(255, 255, 255));
        vendorManagePage.setForeground(new java.awt.Color(0, 0, 0));
        vendorManagePage.setText("Vendor Management");
        vendorManagePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorManagePageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(complaintManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facilityBookingManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facilityManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(unitManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(residentManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(complaintManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vendorManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employeeManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(facilityManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(facilityBookingManagePage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unitManagePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitManagePageActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_unitManagePageActionPerformed

    private void residentManagePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residentManagePageActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_residentManagePageActionPerformed

    private void complaintManagePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaintManagePageActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_complaintManagePageActionPerformed

    private void employeeManagePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeManagePageActionPerformed
        // TODO add your handling code here:
        this.dispose();
        adminExecEmployeeManageFrame employeePage = new adminExecEmployeeManageFrame();
        employeePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeePage.pack();
        employeePage.setResizable(false);
        employeePage.setLocationRelativeTo(null);
        employeePage.setVisible(true);
        employeePage.backButtonToggle();
        try {
            employeePage.setUserType("Employee");
            employeePage.setEmployeeData();
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_employeeManagePageActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginPage.main(null);
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void facilityManagePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilityManagePageActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_facilityManagePageActionPerformed

    private void facilityBookingManagePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilityBookingManagePageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facilityBookingManagePageActionPerformed

    private void vendorManagePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorManagePageActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_vendorManagePageActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(adminExecutiveMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminExecutiveMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminExecutiveMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminExecutiveMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminExecutiveMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton complaintManagePage;
    private javax.swing.JButton employeeManagePage;
    private javax.swing.JButton facilityBookingManagePage;
    private javax.swing.JButton facilityManagePage;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton residentManagePage;
    private javax.swing.JButton unitManagePage;
    private javax.swing.JButton vendorManagePage;
    // End of variables declaration//GEN-END:variables
}