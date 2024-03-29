/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.AccExecutive;

import com.mycompany.dataController.LoginPage;
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
        InvoiceManage = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        ReceiptManage = new javax.swing.JButton();
        PendingPayment = new javax.swing.JButton();
        StatementManage = new javax.swing.JButton();

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

        InvoiceManage.setBackground(new java.awt.Color(255, 255, 255));
        InvoiceManage.setForeground(new java.awt.Color(0, 0, 0));
        InvoiceManage.setText("Invoice Manage");
        InvoiceManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceManageActionPerformed(evt);
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

        ReceiptManage.setBackground(new java.awt.Color(255, 255, 255));
        ReceiptManage.setForeground(new java.awt.Color(0, 0, 0));
        ReceiptManage.setText("Receipt Manage");
        ReceiptManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptManageActionPerformed(evt);
            }
        });

        PendingPayment.setBackground(new java.awt.Color(255, 255, 255));
        PendingPayment.setForeground(new java.awt.Color(0, 0, 0));
        PendingPayment.setText("Pending Payment");
        PendingPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendingPaymentActionPerformed(evt);
            }
        });

        StatementManage.setBackground(new java.awt.Color(255, 255, 255));
        StatementManage.setForeground(new java.awt.Color(0, 0, 0));
        StatementManage.setText("Statement Manage");
        StatementManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatementManageActionPerformed(evt);
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
                    .addComponent(StatementManage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PendingPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReceiptManage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvoiceManage, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(InvoiceManage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReceiptManage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StatementManage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PendingPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        AccExecPayment.backButtonToggle();
        AccExecPayment.setPaymentData();
        
    }//GEN-LAST:event_PaymentManageActionPerformed

    private void InvoiceManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceManageActionPerformed
        this.dispose();
        AccExecInvoiceManage AccExecInvoice = new AccExecInvoiceManage();
        AccExecInvoice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccExecInvoice.pack();
        AccExecInvoice.setResizable(false);
        AccExecInvoice.setLocationRelativeTo(null);
        AccExecInvoice.setVisible(true); 
        AccExecInvoice.backButtonToggle();
        AccExecInvoice.setInvoiceData();
    }//GEN-LAST:event_InvoiceManageActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        this.dispose();
        LoginPage.main(null);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ReceiptManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptManageActionPerformed
        AccExecManageReceiptFrame AccExecReceipt = new AccExecManageReceiptFrame();
        AccExecReceipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccExecReceipt.pack();
        AccExecReceipt.setResizable(false);
        AccExecReceipt.setLocationRelativeTo(null);
        AccExecReceipt.setVisible(true); 
        AccExecReceipt.backButtonToggle();
        AccExecReceipt.setReceiptData();
    }//GEN-LAST:event_ReceiptManageActionPerformed

    private void PendingPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendingPaymentActionPerformed
        this.dispose();
        AccExecManagePendingFrame AccExecPending = new AccExecManagePendingFrame();
        AccExecPending.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccExecPending.pack();
        AccExecPending.setResizable(false);
        AccExecPending.setLocationRelativeTo(null);
        AccExecPending.setVisible(true); 
        AccExecPending.backButtonToggle();
        AccExecPending.setPendingData();
    }//GEN-LAST:event_PendingPaymentActionPerformed

    private void StatementManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatementManageActionPerformed
        this.dispose();
        AccExecStatementManage AccExecStatement = new AccExecStatementManage();
        AccExecStatement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccExecStatement.pack();
        AccExecStatement.setResizable(false);
        AccExecStatement.setLocationRelativeTo(null);
        AccExecStatement.setVisible(true); 
        AccExecStatement.backButtonToggle();
        AccExecStatement.setStatementData();
    }//GEN-LAST:event_StatementManageActionPerformed

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
    private javax.swing.JButton InvoiceManage;
    private javax.swing.JButton PaymentManage;
    private javax.swing.JButton PendingPayment;
    private javax.swing.JButton ReceiptManage;
    private javax.swing.JButton StatementManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
