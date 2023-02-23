/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author user
 */
public class GuardCheckPointManage extends javax.swing.JFrame {

    public GuardCheckPointManage() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        topLabel = new javax.swing.JLabel();
        viewBtn1 = new javax.swing.JButton();
        blockTxt1 = new javax.swing.JLabel();
        blockTxt2 = new javax.swing.JLabel();
        viewBtn3 = new javax.swing.JButton();
        blockTxt3 = new javax.swing.JLabel();
        viewBtn2 = new javax.swing.JButton();
        blockTxt4 = new javax.swing.JLabel();
        viewBtn4 = new javax.swing.JButton();
        checkInBtn = new javax.swing.JButton();

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
        topLabel.setText("CHECKPOINT");

        viewBtn1.setBackground(new java.awt.Color(255, 255, 255));
        viewBtn1.setForeground(new java.awt.Color(0, 0, 0));
        viewBtn1.setText("VIEW");
        viewBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtn1ActionPerformed(evt);
            }
        });

        blockTxt1.setBackground(new java.awt.Color(233, 233, 233));
        blockTxt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        blockTxt1.setForeground(new java.awt.Color(0, 0, 0));
        blockTxt1.setText("BLOCK A CHECKPOINT");

        blockTxt2.setBackground(new java.awt.Color(233, 233, 233));
        blockTxt2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        blockTxt2.setForeground(new java.awt.Color(0, 0, 0));
        blockTxt2.setText("BLOCK B CHECKPOINT");

        viewBtn3.setBackground(new java.awt.Color(255, 255, 255));
        viewBtn3.setForeground(new java.awt.Color(0, 0, 0));
        viewBtn3.setText("VIEW");
        viewBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtn3ActionPerformed(evt);
            }
        });

        blockTxt3.setBackground(new java.awt.Color(233, 233, 233));
        blockTxt3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        blockTxt3.setForeground(new java.awt.Color(0, 0, 0));
        blockTxt3.setText("BLOCK C CHECKPOINT");

        viewBtn2.setBackground(new java.awt.Color(255, 255, 255));
        viewBtn2.setForeground(new java.awt.Color(0, 0, 0));
        viewBtn2.setText("VIEW");
        viewBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtn2ActionPerformed(evt);
            }
        });

        blockTxt4.setBackground(new java.awt.Color(233, 233, 233));
        blockTxt4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        blockTxt4.setForeground(new java.awt.Color(0, 0, 0));
        blockTxt4.setText("BLOCK D CHECKPOINT");

        viewBtn4.setBackground(new java.awt.Color(255, 255, 255));
        viewBtn4.setForeground(new java.awt.Color(0, 0, 0));
        viewBtn4.setText("VIEW");
        viewBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtn4ActionPerformed(evt);
            }
        });

        checkInBtn.setBackground(new java.awt.Color(255, 255, 255));
        checkInBtn.setForeground(new java.awt.Color(0, 0, 0));
        checkInBtn.setText("CHECK IN");
        checkInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(topLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(checkInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blockTxt1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(blockTxt4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(blockTxt2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(blockTxt3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(viewBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(123, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blockTxt1)
                    .addComponent(viewBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blockTxt2))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blockTxt3))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blockTxt4))
                .addGap(78, 78, 78)
                .addComponent(checkInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 591, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInBtnActionPerformed
        
    }//GEN-LAST:event_checkInBtnActionPerformed

    private void viewBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtn4ActionPerformed
        this.dispose();
        GuardCheckPointView view = new GuardCheckPointView("D");
        view.setVisible(true);
    }//GEN-LAST:event_viewBtn4ActionPerformed

    private void viewBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtn2ActionPerformed
        this.dispose();
        GuardCheckPointView view = new GuardCheckPointView("B");
        view.setVisible(true);
    }//GEN-LAST:event_viewBtn2ActionPerformed

    private void viewBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtn3ActionPerformed
        this.dispose();
        GuardCheckPointView view = new GuardCheckPointView("C");
        view.setVisible(true);
    }//GEN-LAST:event_viewBtn3ActionPerformed

    private void viewBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtn1ActionPerformed
        this.dispose();
        GuardCheckPointView view = new GuardCheckPointView("A");
        view.setVisible(true);
    }//GEN-LAST:event_viewBtn1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        GuardOption option = new GuardOption();
        option.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GuardCheckPointManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardCheckPointManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardCheckPointManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardCheckPointManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuardCheckPointManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel blockTxt1;
    private javax.swing.JLabel blockTxt2;
    private javax.swing.JLabel blockTxt3;
    private javax.swing.JLabel blockTxt4;
    private javax.swing.JButton checkInBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel topLabel;
    private javax.swing.JButton viewBtn1;
    private javax.swing.JButton viewBtn2;
    private javax.swing.JButton viewBtn3;
    private javax.swing.JButton viewBtn4;
    // End of variables declaration//GEN-END:variables
}
