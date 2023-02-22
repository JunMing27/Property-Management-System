/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JFrame;

public class ResidentPaymentOption extends javax.swing.JFrame {

    public ResidentPaymentOption() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topLabel = new javax.swing.JLabel();
        payBtn = new javax.swing.JButton();
        payHistoryBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        statementBtn = new javax.swing.JButton();
        invoiceBtn = new javax.swing.JButton();
        receiptBtn = new javax.swing.JButton();
        pendingFeeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(566, 600));

        topLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topLabel.setForeground(new java.awt.Color(0, 0, 0));
        topLabel.setText("PAYMENT PAGE");

        payBtn.setBackground(new java.awt.Color(255, 255, 255));
        payBtn.setForeground(new java.awt.Color(0, 0, 0));
        payBtn.setText("Pay");
        payBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        payHistoryBtn.setBackground(new java.awt.Color(255, 255, 255));
        payHistoryBtn.setForeground(new java.awt.Color(0, 0, 0));
        payHistoryBtn.setText("Payment History");
        payHistoryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payHistoryBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setForeground(new java.awt.Color(0, 0, 0));
        backBtn.setText("Back");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        statementBtn.setBackground(new java.awt.Color(255, 255, 255));
        statementBtn.setForeground(new java.awt.Color(0, 0, 0));
        statementBtn.setText("Statement");
        statementBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statementBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statementBtnActionPerformed(evt);
            }
        });

        invoiceBtn.setBackground(new java.awt.Color(255, 255, 255));
        invoiceBtn.setForeground(new java.awt.Color(0, 0, 0));
        invoiceBtn.setText("Invoice");
        invoiceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBtnActionPerformed(evt);
            }
        });

        receiptBtn.setBackground(new java.awt.Color(255, 255, 255));
        receiptBtn.setForeground(new java.awt.Color(0, 0, 0));
        receiptBtn.setText("Receipt");
        receiptBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        receiptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptBtnActionPerformed(evt);
            }
        });

        pendingFeeBtn.setBackground(new java.awt.Color(255, 255, 255));
        pendingFeeBtn.setForeground(new java.awt.Color(0, 0, 0));
        pendingFeeBtn.setText("Pending Fee");
        pendingFeeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pendingFeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingFeeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(454, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(invoiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statementBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receiptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pendingFeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(topLabel)
                        .addGap(213, 213, 213))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(543, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(payHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(pendingFeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(statementBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(invoiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(receiptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        this.dispose();
        ResidentPay residentPay = new ResidentPay();
        residentPay.setVisible(true);
    }//GEN-LAST:event_payBtnActionPerformed

    private void payHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payHistoryBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payHistoryBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        ResidentOption residentOption = new ResidentOption();
        residentOption.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void statementBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statementBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statementBtnActionPerformed

    private void invoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBtnActionPerformed
        this.dispose();
        ResidentInvoice residentInvoice = new ResidentInvoice();
        residentInvoice.setVisible(true);
    }//GEN-LAST:event_invoiceBtnActionPerformed

    private void receiptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiptBtnActionPerformed

    private void pendingFeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingFeeBtnActionPerformed
        this.dispose();
        ResidentPending residentPending = new ResidentPending();
        residentPending.setVisible(true);
    }//GEN-LAST:event_pendingFeeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ResidentPaymentOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentPaymentOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentPaymentOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentPaymentOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentPaymentOption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton invoiceBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton payHistoryBtn;
    private javax.swing.JButton pendingFeeBtn;
    private javax.swing.JButton receiptBtn;
    private javax.swing.JButton statementBtn;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables
}
