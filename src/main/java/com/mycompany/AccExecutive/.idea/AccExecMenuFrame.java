/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.AccExecutive;

import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class AccExecMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form AccExecMenuFrame
     */
    public AccExecMenuFrame() {
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
        PaymentManage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewBuildingExecutive = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        viewAdminExecutive = new javax.swing.JButton();
        viewBuildingExecutive1 = new javax.swing.JButton();
        viewBuildingExecutive2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        PaymentManage.setBackground(new java.awt.Color(255, 255, 255));
        PaymentManage.setForeground(new java.awt.Color(0, 0, 0));
        PaymentManage.setText("Payment Manage");
        PaymentManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentManageActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Welcome Account Executive");

        viewBuildingExecutive.setBackground(new java.awt.Color(255, 255, 255));
        viewBuildingExecutive.setForeground(new java.awt.Color(0, 0, 0));
        viewBuildingExecutive.setText("Invoice Manage");
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
        viewAdminExecutive.setText("Receipt Manage");
        viewAdminExecutive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdminExecutiveActionPerformed(evt);
            }
        });

        viewBuildingExecutive1.setBackground(new java.awt.Color(255, 255, 255));
        viewBuildingExecutive1.setForeground(new java.awt.Color(0, 0, 0));
        viewBuildingExecutive1.setText("Pending Payment");
        viewBuildingExecutive1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBuildingExecutive1ActionPerformed(evt);
            }
        });

        viewBuildingExecutive2.setBackground(new java.awt.Color(255, 255, 255));
        viewBuildingExecutive2.setForeground(new java.awt.Color(0, 0, 0));
        viewBuildingExecutive2.setText("Statement Manage");
        viewBuildingExecutive2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBuildingExecutive2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewBuildingExecutive2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBuildingExecutive1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewAdminExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBuildingExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaymentManage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BackBtn)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(PaymentManage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewBuildingExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewAdminExecutive, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewBuildingExecutive2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewBuildingExecutive1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PaymentManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentManageActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AccExecPaymentManage AccExecPayment = new AccExecPaymentManage();
        AccExecPayment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccExecPayment.pack();
        AccExecPayment.setResizable(false);
        AccExecPayment.setLocationRelativeTo(null);
        AccExecPayment.setVisible(true); 
        
        AccExecPayment.setPaymentData();
        
    }//GEN-LAST:event_PaymentManageActionPerformed

    private void viewBuildingExecutiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBuildingExecutiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBuildingExecutiveActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void viewAdminExecutiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdminExecutiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewAdminExecutiveActionPerformed

    private void viewBuildingExecutive1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBuildingExecutive1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBuildingExecutive1ActionPerformed

    private void viewBuildingExecutive2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBuildingExecutive2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBuildingExecutive2ActionPerformed

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
            java.util.logging.Logger.getLogger(AccExecMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccExecMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccExecMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccExecMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccExecMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton PaymentManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton viewAdminExecutive;
    private javax.swing.JButton viewBuildingExecutive;
    private javax.swing.JButton viewBuildingExecutive1;
    private javax.swing.JButton viewBuildingExecutive2;
    // End of variables declaration//GEN-END:variables
}