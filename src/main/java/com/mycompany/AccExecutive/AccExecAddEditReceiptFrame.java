/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.AccExecutive;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author edi
 */
public class AccExecAddEditReceiptFrame extends javax.swing.JFrame {

    /**
     * Creates new form AccExecAddEditReceiptFrame
     */
    public AccExecAddEditReceiptFrame() {
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
        BackBtn = new javax.swing.JButton();
        addEditBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ReceiptIDField = new javax.swing.JTextField();
        UserIDField = new javax.swing.JTextField();
        PayDescriptionField = new javax.swing.JTextField();
        PaidDateField = new javax.swing.JTextField();
        PayAmountField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        IssuedDateField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BackBtn.setBackground(new java.awt.Color(204, 204, 204));
        BackBtn.setForeground(new java.awt.Color(0, 0, 0));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        addEditBtn.setBackground(new java.awt.Color(204, 204, 204));
        addEditBtn.setForeground(new java.awt.Color(0, 0, 0));
        addEditBtn.setText("Update/ Add Payment");
        addEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEditBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Receipt ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Pay Description");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pay Amount");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("User ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Paid Date");

        ReceiptIDField.setBackground(new java.awt.Color(255, 255, 255));
        ReceiptIDField.setForeground(new java.awt.Color(0, 0, 0));
        ReceiptIDField.setEnabled(false);
        ReceiptIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptIDFieldActionPerformed(evt);
            }
        });

        UserIDField.setBackground(new java.awt.Color(255, 255, 255));
        UserIDField.setForeground(new java.awt.Color(0, 0, 0));

        PayDescriptionField.setBackground(new java.awt.Color(255, 255, 255));
        PayDescriptionField.setForeground(new java.awt.Color(0, 0, 0));

        PaidDateField.setBackground(new java.awt.Color(255, 255, 255));
        PaidDateField.setForeground(new java.awt.Color(0, 0, 0));

        PayAmountField.setBackground(new java.awt.Color(255, 255, 255));
        PayAmountField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Issued Date");

        IssuedDateField.setBackground(new java.awt.Color(255, 255, 255));
        IssuedDateField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ReceiptIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PayDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaidDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PayAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IssuedDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addEditBtn)
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReceiptIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PayAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PaidDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IssuedDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(addEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AccExecManageReceiptFrame AccExecReceipt = new AccExecManageReceiptFrame();
        AccExecReceipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccExecReceipt.pack();
        AccExecReceipt.setResizable(false);
        AccExecReceipt.setLocationRelativeTo(null);
        AccExecReceipt.setVisible(true);
        AccExecReceipt.backButtonToggle();
        //Run Method in BusManUserManage to set UserType and Data
        AccExecReceipt.setReceiptData();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void addEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEditBtnActionPerformed
        // TODO add your handling code here:
        if(addEditDetector=="edit"){
            
            accountExecutive main = new accountExecutive();
            ArrayList<String> dataList = new ArrayList<String>();
            dataList.add(ReceiptIDField.getText());
            dataList.add(UserIDField.getText());
            dataList.add(PayDescriptionField.getText());
            dataList.add(PayAmountField.getText());
            dataList.add(PaidDateField.getText());
            dataList.add(IssuedDateField.getText());
            main.editOrAddData(dataList, "Receipt","ReceiptContent.txt","edit");
        }else if(addEditDetector=="add"){

            accountExecutive main = new accountExecutive();
            accountExecutive.accountExecutiveMethod mainInner = main.new accountExecutiveMethod();
            receipt receiptClass = new receipt();
            ArrayList<String> dataList = new ArrayList<String>();
            receiptClass.getIncreasedID("ReceiptContent.txt","Receipt");
            dataList.add(receiptClass.getreceiptId());
            dataList.add(UserIDField.getText());
            dataList.add(PayDescriptionField.getText());
            dataList.add(PayAmountField.getText());
            dataList.add(PaidDateField.getText());
            dataList.add(IssuedDateField.getText());
            System.out.println(dataList);
            mainInner.addEditPayment(dataList,"Receipt","ReceiptContent.txt","add");

        }
    }//GEN-LAST:event_addEditBtnActionPerformed

    private String addEditDetector;
    private String fileType="ReceiptContent.txt";
    private String userType="Receipt";
    
    public void addEditDetect(String functionType,String id) throws FileNotFoundException{
        if(functionType=="edit"){
            this.addEditDetector="edit";
            receipt receiptClass = new receipt();
            receiptClass.chooseTxtFile("Receipt");
            receiptClass.getDataViewSingle(id, fileType,userType);
//            payment.paymentMethod mainInner = employeeJobClass.new employeeJobMethod();
            
            addEditBtn.setText("Update");
            ReceiptIDField.setText(receiptClass.getreceiptId());
            UserIDField.setText(receiptClass.getuserId());
            PayDescriptionField.setText(receiptClass.getpaymentDesc());
            PayAmountField.setText(receiptClass.getpaidAmount());
            PaidDateField.setText(receiptClass.getpaidDate());
            IssuedDateField.setText(receiptClass.getissuedDate());

            
        }else if (functionType=="add"){
            this.addEditDetector="add";
            addEditBtn.setText("Add");
            ReceiptIDField.setVisible(false);
            jLabel1.setVisible(false);
        }
    }
    
    private void ReceiptIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceiptIDFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AccExecAddEditReceiptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccExecAddEditReceiptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccExecAddEditReceiptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccExecAddEditReceiptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccExecAddEditReceiptFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField IssuedDateField;
    private javax.swing.JTextField PaidDateField;
    private javax.swing.JTextField PayAmountField;
    private javax.swing.JTextField PayDescriptionField;
    private javax.swing.JTextField ReceiptIDField;
    private javax.swing.JTextField UserIDField;
    private javax.swing.JButton addEditBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
