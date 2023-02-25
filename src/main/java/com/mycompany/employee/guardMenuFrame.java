/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.employee;

import com.mycompany.mavenproject1.LoginPage;
import javax.swing.JOptionPane;

/**
 *
 * @author hoiyi
 */
public class guardMenuFrame extends javax.swing.JFrame {

    static String idGet;
    
    public guardMenuFrame(String id) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        idGet = id;
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
        visitorPassBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        visitorEntryBtn = new javax.swing.JButton();
        topLabel = new javax.swing.JLabel();
        checkpointBtn = new javax.swing.JButton();
        incidentBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));
        jPanel1.setPreferredSize(new java.awt.Dimension(566, 600));

        visitorPassBtn.setBackground(new java.awt.Color(255, 255, 255));
        visitorPassBtn.setForeground(new java.awt.Color(0, 0, 0));
        visitorPassBtn.setText("Visitor Pass");
        visitorPassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visitorPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorPassBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setForeground(new java.awt.Color(0, 0, 0));
        exitBtn.setText("Log Out");
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        visitorEntryBtn.setBackground(new java.awt.Color(255, 255, 255));
        visitorEntryBtn.setForeground(new java.awt.Color(0, 0, 0));
        visitorEntryBtn.setText("Visitor Entry");
        visitorEntryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        visitorEntryBtn.setMaximumSize(new java.awt.Dimension(72, 22));
        visitorEntryBtn.setMinimumSize(new java.awt.Dimension(72, 22));
        visitorEntryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorEntryBtnActionPerformed(evt);
            }
        });

        topLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topLabel.setForeground(new java.awt.Color(0, 0, 0));
        topLabel.setText("WELCOME SECURITY GUARD !");

        checkpointBtn.setBackground(new java.awt.Color(255, 255, 255));
        checkpointBtn.setForeground(new java.awt.Color(0, 0, 0));
        checkpointBtn.setText("Checkpoint Check-In");
        checkpointBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkpointBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkpointBtnActionPerformed(evt);
            }
        });

        incidentBtn.setBackground(new java.awt.Color(255, 255, 255));
        incidentBtn.setForeground(new java.awt.Color(0, 0, 0));
        incidentBtn.setText("Incident");
        incidentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        incidentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incidentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(incidentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topLabel)
                    .addComponent(visitorEntryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visitorPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkpointBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(visitorPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(visitorEntryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(checkpointBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(incidentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visitorPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorPassBtnActionPerformed
        this.dispose();
        guardVisPassFrame visitorPass = new guardVisPassFrame(idGet);
        visitorPass.setVisible(true);
    }//GEN-LAST:event_visitorPassBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // Direct to Login Page
        int dialog = JOptionPane.showConfirmDialog(null,
            "Are You Sure to Log Out?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(dialog == JOptionPane.YES_OPTION){
            this.dispose();
            LoginPage loginPage = new LoginPage();
            loginPage.setVisible(true);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void visitorEntryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorEntryBtnActionPerformed
        this.dispose();
        guardVisEntryManageFrame visitorEntry = new guardVisEntryManageFrame(idGet);
        visitorEntry.setVisible(true);
    }//GEN-LAST:event_visitorEntryBtnActionPerformed

    private void checkpointBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkpointBtnActionPerformed
        this.dispose();
        guardCheckPointViewFrame checkpoint = new guardCheckPointViewFrame(idGet);
        checkpoint.setVisible(true);
    }//GEN-LAST:event_checkpointBtnActionPerformed

    private void incidentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incidentBtnActionPerformed
        this.dispose();
        guardIncidentManageFrame incident = new guardIncidentManageFrame(idGet);
        incident.setVisible(true);
    }//GEN-LAST:event_incidentBtnActionPerformed

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
            java.util.logging.Logger.getLogger(guardMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guardMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guardMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guardMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guardMenuFrame(idGet).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkpointBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton incidentBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel topLabel;
    private javax.swing.JButton visitorEntryBtn;
    private javax.swing.JButton visitorPassBtn;
    // End of variables declaration//GEN-END:variables
}
