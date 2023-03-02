/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.AccExecutive;

//import com.mycompany.AccExecutive.AccExecMain;
import com.mycompany.mavenproject1.BusManBudgetPlanningManage;
import com.mycompany.mavenproject1.BusManUserManageOption;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Edi
 */
public class AccExecPaymentManage extends javax.swing.JFrame {

    /**
     * Creates new form AccExecPaymentManage
     */
    public AccExecPaymentManage() {
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
        PaymentDesc1 = new javax.swing.JLabel();
        Amount1 = new javax.swing.JLabel();
        DueDate1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PaymentID1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ViewDetails3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PaymentDesc3 = new javax.swing.JLabel();
        Amount3 = new javax.swing.JLabel();
        DueDate3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PaymentID3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ViewDetails2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PaymentDesc2 = new javax.swing.JLabel();
        Amount2 = new javax.swing.JLabel();
        DueDate2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PaymentID2 = new javax.swing.JLabel();
        previousPage = new javax.swing.JButton();
        nextPage = new javax.swing.JButton();

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

        jLabel1.setText("Payment Description");

        jLabel4.setText("Amount");

        jLabel5.setText("Due Date");

        PaymentDesc1.setText("PaymentDesc1");

        Amount1.setText("Amount1");

        DueDate1.setText("DueDate1");

        jLabel2.setText("Payment ID");

        PaymentID1.setText("PaymentID1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaymentID1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PaymentDesc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Amount1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DueDate1))
                .addGap(45, 45, 45)
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaymentDesc1)
                    .addComponent(Amount1)
                    .addComponent(DueDate1)
                    .addComponent(PaymentID1))
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

        jLabel7.setText("Due Date");

        jLabel9.setText("Payment Description");

        jLabel11.setText("Amount");

        PaymentDesc3.setText("PaymentDesc3");

        Amount3.setText("Amount3");

        DueDate3.setText("DueDate3");

        jLabel12.setText("Payment ID");

        PaymentID3.setText("PaymentID3");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaymentID3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaymentDesc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Amount3)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DueDate3)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(ViewDetails3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewDetails3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PaymentID3)
                            .addComponent(PaymentDesc3)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Amount3)
                            .addComponent(DueDate3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ViewDetails2.setBackground(new java.awt.Color(255, 255, 255));
        ViewDetails2.setForeground(new java.awt.Color(0, 0, 0));
        ViewDetails2.setText("View Details");
        ViewDetails2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetails2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Due Date");

        jLabel8.setText("Payment Description");

        jLabel10.setText("Amount");

        PaymentDesc2.setText("PaymentDesc2");

        Amount2.setText("Amount2");

        DueDate2.setText("DueDate2");

        jLabel3.setText("Payment ID");

        PaymentID2.setText("PaymentID2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaymentID2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaymentDesc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amount2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DueDate2))
                .addGap(51, 51, 51)
                .addComponent(ViewDetails2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DueDate2)
                    .addComponent(Amount2)
                    .addComponent(PaymentDesc2)
                    .addComponent(PaymentID2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackAccExecPaymentManage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddNewAccExecPaymentManage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(128, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackAccExecPaymentManage, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddNewAccExecPaymentManage, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void ViewDetails3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetails3ActionPerformed
        // TODO add your handling code here:
        if(!(PaymentID3.getText()).equals("no data")){
            this.dispose();
            AccExecAddEditPayment accExecAddEdit = new AccExecAddEditPayment();
            accExecAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            accExecAddEdit.pack();
            accExecAddEdit.setResizable(false);
            accExecAddEdit.setLocationRelativeTo(null);
            accExecAddEdit.setVisible(true);
            try {
                accExecAddEdit.addEditDetect("edit",PaymentID3.getText());
            } catch (FileNotFoundException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty data", "Warning", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_ViewDetails3ActionPerformed
    }
    
    private void ViewDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetails1ActionPerformed
        // TODO add your handling code here:
          if(!(PaymentID1.getText()).equals("no data")){
            this.dispose();
            AccExecAddEditPayment accExecAddEdit = new AccExecAddEditPayment();
            accExecAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            accExecAddEdit.pack();
            accExecAddEdit.setResizable(false);
            accExecAddEdit.setLocationRelativeTo(null);
            accExecAddEdit.setVisible(true);
            try {
                accExecAddEdit.addEditDetect("edit",PaymentID1.getText());
            } catch (FileNotFoundException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty data", "Warning", JOptionPane.ERROR_MESSAGE);
    }     
    }//GEN-LAST:event_ViewDetails1ActionPerformed

    private void AddNewAccExecPaymentManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewAccExecPaymentManageActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AccExecAddEditPayment accExecAddEdit = new AccExecAddEditPayment();
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

    private void ViewDetails2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetails2ActionPerformed
        // TODO add your handling code here:
        if(!(PaymentID2.getText()).equals("no data")){
            this.dispose();
            AccExecAddEditPayment accExecAddEdit = new AccExecAddEditPayment();
            accExecAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            accExecAddEdit.pack();
            accExecAddEdit.setResizable(false);
            accExecAddEdit.setLocationRelativeTo(null);
            accExecAddEdit.setVisible(true);
            try {
                accExecAddEdit.addEditDetect("edit",PaymentID2.getText());
            } catch (FileNotFoundException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty data", "Warning", JOptionPane.ERROR_MESSAGE);
    } 
        
    }//GEN-LAST:event_ViewDetails2ActionPerformed

    private void nextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageActionPerformed
        // TODO add your handling code here:
        previousPage.setEnabled(true);
        setPaymentData();
    }//GEN-LAST:event_nextPageActionPerformed

    private void BackAccExecPaymentManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackAccExecPaymentManageActionPerformed
//        // TODO add your handling code here:
        this.dispose();
        AccExecMenuFrame AccExecOption = new AccExecMenuFrame();
        AccExecOption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccExecOption.pack();
        AccExecOption.setResizable(false);
        AccExecOption.setLocationRelativeTo(null);
        AccExecOption.setVisible(true); 
    }//GEN-LAST:event_BackAccExecPaymentManageActionPerformed

    private void previousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPageActionPerformed
        // TODO add your handling code here:
        backButtonFunction();
        setPaymentData();
        nextPage.setEnabled(true);
    }//GEN-LAST:event_previousPageActionPerformed

    
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
    
    
    public void setPaymentData(){
        payment paymentClass = new payment();
        setPagination();
        paymentClass.displayDataView(PageLine,searchTxt,"Payment");
        boolean boo = paymentClass.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        System.out.println(paymentClass.getpaymentID());
        if(paymentClass.getpaymentID() !=null){
            PaymentID1.setText(paymentClass.getpaymentID());
            PaymentDesc1.setText(paymentClass.getPayDesc());
            Amount1.setText(paymentClass.getPayAmount());
            DueDate1.setText(paymentClass.getDueDate());

        }else{
            PaymentID1.setText("no data");
            PaymentDesc1.setText("no data");
            Amount1.setText("no data");
            DueDate1.setText("no data");

        }
        setPagination();
        paymentClass.displayDataView(PageLine,searchTxt,"Payment");
        boo = paymentClass.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        if(paymentClass.getpaymentID() !=null){
            PaymentID2.setText(paymentClass.getpaymentID());
            PaymentDesc2.setText(paymentClass.getPayDesc());
            Amount2.setText(paymentClass.getPayAmount());
            DueDate2.setText(paymentClass.getDueDate());
        }else{
            PaymentID2.setText("no data");
            PaymentDesc2.setText("no data");
            Amount2.setText("no data");
            DueDate2.setText("no data");
        }
        setPagination();
        paymentClass.displayDataView(PageLine,searchTxt,"Payment");
        boo = paymentClass.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        if(paymentClass.getpaymentID() !=null){
            PaymentID3.setText(paymentClass.getpaymentID());
            PaymentDesc3.setText(paymentClass.getPayDesc());
            Amount3.setText(paymentClass.getPayAmount());
            DueDate3.setText(paymentClass.getDueDate());
        }else{
            PaymentID3.setText("no data");
            PaymentDesc3.setText("no data");
            Amount3.setText("no data");
            DueDate3.setText("no data");
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
            java.util.logging.Logger.getLogger(AccExecPaymentManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccExecPaymentManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccExecPaymentManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccExecPaymentManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccExecPaymentManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewAccExecPaymentManage;
    private javax.swing.JLabel Amount1;
    private javax.swing.JLabel Amount2;
    private javax.swing.JLabel Amount3;
    private javax.swing.JButton BackAccExecPaymentManage;
    private javax.swing.JLabel DueDate1;
    private javax.swing.JLabel DueDate2;
    private javax.swing.JLabel DueDate3;
    private javax.swing.JLabel PaymentDesc1;
    private javax.swing.JLabel PaymentDesc2;
    private javax.swing.JLabel PaymentDesc3;
    private javax.swing.JLabel PaymentID1;
    private javax.swing.JLabel PaymentID2;
    private javax.swing.JLabel PaymentID3;
    private javax.swing.JButton ViewDetails1;
    private javax.swing.JButton ViewDetails2;
    private javax.swing.JButton ViewDetails3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton nextPage;
    private javax.swing.JButton previousPage;
    // End of variables declaration//GEN-END:variables
}
