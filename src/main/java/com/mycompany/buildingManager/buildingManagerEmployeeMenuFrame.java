/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.buildingManager;

import javax.swing.JFrame;

/**
 *
 * @author Jun Ming
 */
public class buildingManagerEmployeeMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form buildingManagerEmployeeMenu
     */
    public buildingManagerEmployeeMenuFrame() {
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
        viewSecurity = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewCleaner = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        viewTechnician = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        viewSecurity.setBackground(new java.awt.Color(255, 255, 255));
        viewSecurity.setForeground(new java.awt.Color(0, 0, 0));
        viewSecurity.setText("Security");
        viewSecurity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSecurityActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Select Employee Type");

        viewCleaner.setBackground(new java.awt.Color(255, 255, 255));
        viewCleaner.setForeground(new java.awt.Color(0, 0, 0));
        viewCleaner.setText("Cleaner");
        viewCleaner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCleanerActionPerformed(evt);
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

        viewTechnician.setBackground(new java.awt.Color(255, 255, 255));
        viewTechnician.setForeground(new java.awt.Color(0, 0, 0));
        viewTechnician.setText("Technician");
        viewTechnician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTechnicianActionPerformed(evt);
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
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewCleaner, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BackBtn)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(viewSecurity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewCleaner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void viewSecurityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSecurityActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManagerEmployeeManageFrame employeeManage = new buildingManagerEmployeeManageFrame();
        employeeManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeManage.pack();
        employeeManage.setResizable(false);
        employeeManage.setLocationRelativeTo(null);
        employeeManage.setVisible(true);
        employeeManage.backButtonToggle();

        employeeManage.setUserType("Security");
        employeeManage.setEmployeeTeamData("Security");
    }//GEN-LAST:event_viewSecurityActionPerformed

    private void viewCleanerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCleanerActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManagerEmployeeManageFrame employeeManage = new buildingManagerEmployeeManageFrame();
        employeeManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeManage.pack();
        employeeManage.setResizable(false);
        employeeManage.setLocationRelativeTo(null);
        employeeManage.setVisible(true);
        employeeManage.backButtonToggle();

        employeeManage.setUserType("Cleaner");
        employeeManage.setEmployeeTeamData("Cleaner");
    }//GEN-LAST:event_viewCleanerActionPerformed

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

    private void viewTechnicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTechnicianActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManagerEmployeeManageFrame employeeManage = new buildingManagerEmployeeManageFrame();
        employeeManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeManage.pack();
        employeeManage.setResizable(false);
        employeeManage.setLocationRelativeTo(null);
        employeeManage.setVisible(true);
        employeeManage.backButtonToggle();

        employeeManage.setUserType("Technician");
        employeeManage.setEmployeeTeamData("Technician");
    }//GEN-LAST:event_viewTechnicianActionPerformed

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
            java.util.logging.Logger.getLogger(buildingManagerEmployeeMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buildingManagerEmployeeMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buildingManagerEmployeeMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buildingManagerEmployeeMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buildingManagerEmployeeMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton viewCleaner;
    private javax.swing.JButton viewSecurity;
    private javax.swing.JButton viewTechnician;
    // End of variables declaration//GEN-END:variables
}
