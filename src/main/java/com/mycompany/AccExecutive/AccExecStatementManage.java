/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.AccExecutive;


import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Edi
 */
public class AccExecStatementManage extends javax.swing.JFrame {

    /**
     * Creates new form AccExecStatementManage
     */
    public AccExecStatementManage() {
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
        BackAccExecPaymentManage = new javax.swing.JButton();
        AddNewAccExecPaymentManage = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ViewDetails1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UserID1 = new javax.swing.JLabel();
        Username1 = new javax.swing.JLabel();
        PaidDate1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        StatementID1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PaidAmount1 = new javax.swing.JLabel();
        Description1 = new javax.swing.JLabel();
        previousPage = new javax.swing.JButton();
        nextPage = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        ViewDetails2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        UserID2 = new javax.swing.JLabel();
        Username2 = new javax.swing.JLabel();
        PaidDate2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        StatementID2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        PaidAmount2 = new javax.swing.JLabel();
        Description2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ViewDetails3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        UserID3 = new javax.swing.JLabel();
        Username3 = new javax.swing.JLabel();
        PaidDate3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        StatementID3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        PaidAmount3 = new javax.swing.JLabel();
        Description3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BackAccExecPaymentManage.setBackground(new java.awt.Color(204, 204, 204));
        BackAccExecPaymentManage.setForeground(new java.awt.Color(0, 0, 0));
        BackAccExecPaymentManage.setText("Back");
        BackAccExecPaymentManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackAccExecPaymentManageActionPerformed(evt);
            }
        });

        AddNewAccExecPaymentManage.setBackground(new java.awt.Color(204, 204, 204));
        AddNewAccExecPaymentManage.setForeground(new java.awt.Color(0, 0, 0));
        AddNewAccExecPaymentManage.setText("Add New");
        AddNewAccExecPaymentManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewAccExecPaymentManageActionPerformed(evt);
            }
        });

        ViewDetails1.setBackground(new java.awt.Color(255, 255, 255));
        ViewDetails1.setForeground(new java.awt.Color(0, 0, 0));
        ViewDetails1.setText("View Details");
        ViewDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetails1ActionPerformed(evt);
            }
        });

        jLabel1.setText("User ID");

        jLabel4.setText("Username");

        jLabel5.setText("Paid Date");

        UserID1.setText("UserID1");

        Username1.setText("Username1");

        PaidDate1.setText("PaidDate1");

        jLabel2.setText("Statement ID");

        StatementID1.setText("StatementID1");

        jLabel13.setText("Paid Amount");

        jLabel14.setText("Description");

        PaidAmount1.setText("PaidAmount1");

        Description1.setText("Description1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatementID1))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserID1))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username1))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaidDate1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaidAmount1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Description1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewDetails1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserID1)
                    .addComponent(Username1)
                    .addComponent(PaidDate1)
                    .addComponent(StatementID1)
                    .addComponent(PaidAmount1)
                    .addComponent(Description1))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        previousPage.setBackground(new java.awt.Color(204, 204, 204));
        previousPage.setForeground(new java.awt.Color(0, 0, 0));
        previousPage.setText("Back");
        previousPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPageActionPerformed(evt);
            }
        });

        nextPage.setBackground(new java.awt.Color(204, 204, 204));
        nextPage.setForeground(new java.awt.Color(0, 0, 0));
        nextPage.setText("Next");
        nextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageActionPerformed(evt);
            }
        });

        ViewDetails2.setBackground(new java.awt.Color(255, 255, 255));
        ViewDetails2.setForeground(new java.awt.Color(0, 0, 0));
        ViewDetails2.setText("View Details");
        ViewDetails2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetails2ActionPerformed(evt);
            }
        });

        jLabel15.setText("User ID");

        jLabel16.setText("Username");

        jLabel17.setText("Paid Date");

        UserID2.setText("UserID2");

        Username2.setText("Username2");

        PaidDate2.setText("PaidDate2");

        jLabel18.setText("Statement ID");

        StatementID2.setText("StatementID2");

        jLabel19.setText("Paid Amount");

        jLabel20.setText("Description");

        PaidAmount2.setText("PaidAmount2");

        Description2.setText("Description2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatementID2))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserID2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username2))
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaidDate2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaidAmount2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Description2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewDetails2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserID2)
                    .addComponent(Username2)
                    .addComponent(PaidDate2)
                    .addComponent(StatementID2)
                    .addComponent(PaidAmount2)
                    .addComponent(Description2))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        ViewDetails3.setBackground(new java.awt.Color(255, 255, 255));
        ViewDetails3.setForeground(new java.awt.Color(0, 0, 0));
        ViewDetails3.setText("View Details");
        ViewDetails3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetails3ActionPerformed(evt);
            }
        });

        jLabel21.setText("User ID");

        jLabel22.setText("Username");

        jLabel23.setText("Paid Date");

        UserID3.setText("UserID3");

        Username3.setText("Username3");

        PaidDate3.setText("PaidDate3");

        jLabel24.setText("Statement ID");

        StatementID3.setText("StatementID3");

        jLabel25.setText("Paid Amount");

        jLabel26.setText("Description");

        PaidAmount3.setText("PaidAmount3");

        Description3.setText("Description3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StatementID3)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserID3))
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username3))
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaidDate3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaidAmount3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Description3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewDetails3)
                .addGap(8, 8, 8))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewDetails3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserID3)
                    .addComponent(Username3)
                    .addComponent(PaidDate3)
                    .addComponent(StatementID3)
                    .addComponent(PaidAmount3)
                    .addComponent(Description3))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackAccExecPaymentManage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddNewAccExecPaymentManage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 27, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackAccExecPaymentManage, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddNewAccExecPaymentManage, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackAccExecPaymentManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackAccExecPaymentManageActionPerformed

        this.dispose();
        AccExecMenuFrame AccExecOption = new AccExecMenuFrame();
        AccExecOption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccExecOption.pack();
        AccExecOption.setResizable(false);
        AccExecOption.setLocationRelativeTo(null);
        AccExecOption.setVisible(true);
    }//GEN-LAST:event_BackAccExecPaymentManageActionPerformed

    private void AddNewAccExecPaymentManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewAccExecPaymentManageActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AccExecAddEditStatement accExecAddEdit = new AccExecAddEditStatement();
        accExecAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        accExecAddEdit.pack();
        accExecAddEdit.setResizable(false);
        accExecAddEdit.setLocationRelativeTo(null);
        accExecAddEdit.setVisible(true);
        try {
            accExecAddEdit.addEditDetect("add","");
        } catch (FileNotFoundException ex) {
        }

    }//GEN-LAST:event_AddNewAccExecPaymentManageActionPerformed

    private void ViewDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetails1ActionPerformed
        // TODO add your handling code here:
        System.out.println(StatementID1);
        if(!(StatementID1.getText()).equals("no data")){
            this.dispose();
            AccExecAddEditStatement accExecAddEdit = new AccExecAddEditStatement();
            accExecAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            accExecAddEdit.pack();
            accExecAddEdit.setResizable(false);
            accExecAddEdit.setLocationRelativeTo(null);
            accExecAddEdit.setVisible(true);
            try {
                accExecAddEdit.addEditDetect("edit",StatementID1.getText());
            } catch (FileNotFoundException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty data", "Warning", JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_ViewDetails1ActionPerformed

    private void previousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPageActionPerformed
       
        backButtonFunction();
        setStatementData();
        nextPage.setEnabled(true);
    }//GEN-LAST:event_previousPageActionPerformed

    private void nextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageActionPerformed
        // TODO add your handling code here:
        previousPage.setEnabled(true);
        setStatementData();
    }//GEN-LAST:event_nextPageActionPerformed

    private void ViewDetails2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetails2ActionPerformed
        if(!(StatementID2.getText()).equals("no data")){
            this.dispose();
            AccExecAddEditStatement accExecAddEdit = new AccExecAddEditStatement();
            accExecAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            accExecAddEdit.pack();
            accExecAddEdit.setResizable(false);
            accExecAddEdit.setLocationRelativeTo(null);
            accExecAddEdit.setVisible(true);
            try {
                accExecAddEdit.addEditDetect("edit",StatementID2.getText());
            } catch (FileNotFoundException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty data", "Warning", JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_ViewDetails2ActionPerformed

    private void ViewDetails3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetails3ActionPerformed
        if(!(StatementID3.getText()).equals("no data")){
            this.dispose();
            AccExecAddEditStatement accExecAddEdit = new AccExecAddEditStatement();
            accExecAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            accExecAddEdit.pack();
            accExecAddEdit.setResizable(false);
            accExecAddEdit.setLocationRelativeTo(null);
            accExecAddEdit.setVisible(true);
            try {
                accExecAddEdit.addEditDetect("edit",StatementID3.getText());
            } catch (FileNotFoundException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty data", "Warning", JOptionPane.ERROR_MESSAGE);
    }    
    }//GEN-LAST:event_ViewDetails3ActionPerformed

    public void backButtonToggle(){
        previousPage.setEnabled(false);
}
    
    public void backButtonFunction(){
        PageLine = PageLine -6;
        if (PageLine==-1){
            previousPage.setEnabled(false);
        }
    }
    
    private String searchTxt ="";

    private Integer PageLine=-1;
    
    public void setPagination(){
        PageLine=PageLine+1;
    }
    
    
    public void setStatementData(){
        statement statementClass = new statement();
        setPagination();
        statementClass.displayDataView(PageLine,searchTxt,"Statement");
        boolean boo = statementClass.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        System.out.println(statementClass.getstatementId());
        if(statementClass.getstatementId() !=null){
            StatementID1.setText(statementClass.getstatementId());
            UserID1.setText(statementClass.getuserId());
            Username1.setText(statementClass.getuserName());
            PaidDate1.setText(statementClass.getpaidDate());
            PaidAmount1.setText(statementClass.getpaidAmount());
            Description1.setText(statementClass.getpaymentDesc());

        }else{
            StatementID1.setText("no data");
            UserID1.setText("no data");
            Username1.setText("no data");
            PaidDate1.setText("no data");
            PaidAmount1.setText("no data");
            Description1.setText("no data");

        }
        setPagination();
        statementClass.displayDataView(PageLine,searchTxt,"Statement");
        boo = statementClass.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        if(statementClass.getstatementId() !=null){
            StatementID2.setText(statementClass.getstatementId());
            UserID2.setText(statementClass.getuserId());
            Username2.setText(statementClass.getuserName());
            PaidDate2.setText(statementClass.getpaidDate());
            PaidAmount2.setText(statementClass.getpaidAmount());
            Description2.setText(statementClass.getpaymentDesc());
        }else{
            StatementID2.setText("no data");
            UserID2.setText("no data");
            Username2.setText("no data");
            PaidDate2.setText("no data");
            PaidAmount2.setText("no data");
            Description2.setText("no data");
        }
        setPagination();
        statementClass.displayDataView(PageLine,searchTxt,"Statement");
        boo = statementClass.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        if(statementClass.getstatementId() !=null){
            StatementID3.setText(statementClass.getstatementId());
            UserID3.setText(statementClass.getuserId());
            Username3.setText(statementClass.getuserName());
            PaidDate3.setText(statementClass.getpaidDate());
            PaidAmount3.setText(statementClass.getpaidAmount());
            Description3.setText(statementClass.getpaymentDesc());
        }else{
            StatementID3.setText("no data");
            UserID3.setText("no data");
            Username3.setText("no data");
            PaidDate3.setText("no data");
            PaidAmount3.setText("no data");
            Description3.setText("no data");
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
            java.util.logging.Logger.getLogger(AccExecStatementManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccExecStatementManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccExecStatementManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccExecStatementManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccExecStatementManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewAccExecPaymentManage;
    private javax.swing.JButton BackAccExecPaymentManage;
    private javax.swing.JLabel Description1;
    private javax.swing.JLabel Description2;
    private javax.swing.JLabel Description3;
    private javax.swing.JLabel PaidAmount1;
    private javax.swing.JLabel PaidAmount2;
    private javax.swing.JLabel PaidAmount3;
    private javax.swing.JLabel PaidDate1;
    private javax.swing.JLabel PaidDate2;
    private javax.swing.JLabel PaidDate3;
    private javax.swing.JLabel StatementID1;
    private javax.swing.JLabel StatementID2;
    private javax.swing.JLabel StatementID3;
    private javax.swing.JLabel UserID1;
    private javax.swing.JLabel UserID2;
    private javax.swing.JLabel UserID3;
    private javax.swing.JLabel Username1;
    private javax.swing.JLabel Username2;
    private javax.swing.JLabel Username3;
    private javax.swing.JButton ViewDetails1;
    private javax.swing.JButton ViewDetails2;
    private javax.swing.JButton ViewDetails3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton nextPage;
    private javax.swing.JButton previousPage;
    // End of variables declaration//GEN-END:variables
}
