/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.buildingManager;

import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jun Ming
 */
public class buildingManBudgetSingleViewFrame extends javax.swing.JFrame {

    /**
     * Creates new form buildingManBudgetSingleViewFrame
     */
    public buildingManBudgetSingleViewFrame() {
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
        projectNameLabel = new javax.swing.JLabel();
        projectBudgetTitle = new javax.swing.JLabel();
        projectStartDateTitle = new javax.swing.JLabel();
        projectEndDateTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        projectBudgetLabel = new javax.swing.JLabel();
        projectStartDateLabel = new javax.swing.JLabel();
        projectEndDateLabel = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        projectIdTitle = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        projectIdLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setForeground(new java.awt.Color(0, 0, 0));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        projectNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        projectNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projectNameLabel.setText("Project Name");
        projectNameLabel.setIconTextGap(5);

        projectBudgetTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        projectBudgetTitle.setForeground(new java.awt.Color(0, 0, 0));
        projectBudgetTitle.setText("Budget");

        projectStartDateTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        projectStartDateTitle.setForeground(new java.awt.Color(0, 0, 0));
        projectStartDateTitle.setText("Start Date");

        projectEndDateTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        projectEndDateTitle.setForeground(new java.awt.Color(0, 0, 0));
        projectEndDateTitle.setText("End Date");

        projectBudgetLabel.setForeground(new java.awt.Color(0, 0, 0));
        projectBudgetLabel.setText("RM");

        projectStartDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        projectStartDateLabel.setText("DATE");

        projectEndDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        projectEndDateLabel.setText("DATE");

        updateBtn.setBackground(new java.awt.Color(255, 255, 255));
        updateBtn.setForeground(new java.awt.Color(0, 0, 0));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        projectIdTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        projectIdTitle.setForeground(new java.awt.Color(0, 0, 0));
        projectIdTitle.setText("Project ID");

        projectIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        projectIdLabel.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(projectNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(projectStartDateTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(projectStartDateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addComponent(projectIdTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projectBudgetTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(projectEndDateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator3)
                                .addComponent(projectEndDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectBudgetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(projectNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectBudgetTitle)
                    .addComponent(projectIdTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(projectBudgetLabel)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(projectStartDateTitle)
                            .addComponent(projectEndDateTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projectStartDateLabel)
                            .addComponent(projectEndDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(projectIdLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        buildingManBudgetManageFrame budgetManage = new buildingManBudgetManageFrame();
        budgetManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        budgetManage.pack();
        budgetManage.setResizable(false);
        budgetManage.setLocationRelativeTo(null);
        budgetManage.setVisible(true);
        budgetManage.backButtonToggle();
        //Run Method set UserType and Data
        budgetManage.setBudgetPlanData();
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManBudgetAddEditFrame budgetAddEdit = new buildingManBudgetAddEditFrame();
        budgetAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        budgetAddEdit.pack();
        budgetAddEdit.setResizable(false);
        budgetAddEdit.setLocationRelativeTo(null);
        budgetAddEdit.setVisible(true);
        try{
            budgetAddEdit.addEditDetect("edit",projectIdLabel.getText());
        }catch(Exception e){}
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        buildingManager main = new buildingManager();
        main.chooseTxtFile("budgetPlanning");
        main.deleteFunction(projectIdLabel.getText());
        JOptionPane.showMessageDialog(null, "Deleted Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
        this.dispose();
        buildingManBudgetManageFrame budgetManage = new buildingManBudgetManageFrame();
        budgetManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        budgetManage.pack();
        budgetManage.setResizable(false);
        budgetManage.setLocationRelativeTo(null);
        budgetManage.setVisible(true);
        budgetManage.backButtonToggle();
        //Run Method set UserType and Data
        budgetManage.setBudgetPlanData();
    }//GEN-LAST:event_deleteBtnActionPerformed

    public void setDataViewSingle(String id) throws FileNotFoundException{
        budgetPlan budgetClass = new budgetPlan();
        budgetClass.getDataViewSingle(id, "BudgetPlanning.txt","budget");
        //after getting data, set text value 
        projectNameLabel.setText(budgetClass.getBudgetProjectName());
        projectBudgetLabel.setText("RM "+budgetClass.getBudgetProjectBudget());
        projectStartDateLabel.setText(budgetClass.getBudgetProjectStartDate());
        projectEndDateLabel.setText(budgetClass.getBudgetProjectEndDate());
        projectIdLabel.setText(budgetClass.getBudgetId());
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
            java.util.logging.Logger.getLogger(buildingManBudgetSingleViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buildingManBudgetSingleViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buildingManBudgetSingleViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buildingManBudgetSingleViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buildingManBudgetSingleViewFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel projectBudgetLabel;
    private javax.swing.JLabel projectBudgetTitle;
    private javax.swing.JLabel projectEndDateLabel;
    private javax.swing.JLabel projectEndDateTitle;
    private javax.swing.JLabel projectIdLabel;
    private javax.swing.JLabel projectIdTitle;
    private javax.swing.JLabel projectNameLabel;
    private javax.swing.JLabel projectStartDateLabel;
    private javax.swing.JLabel projectStartDateTitle;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
