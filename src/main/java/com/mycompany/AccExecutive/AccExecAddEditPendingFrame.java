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
public class AccExecAddEditPendingFrame extends javax.swing.JFrame {

    
    /**
     * Creates new form AccExecAddEditPendingFrame
     */
    public AccExecAddEditPendingFrame() {
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
        PendingIdField = new javax.swing.JTextField();
        UserIdField = new javax.swing.JTextField();
        DescriptionField = new javax.swing.JTextField();
        PendingDueField = new javax.swing.JTextField();
        PendingAmountField = new javax.swing.JTextField();

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
        addEditBtn.setText("Update/ Add");
        addEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEditBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pending ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Description");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pending Amount");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("User ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Pending Due");

        PendingIdField.setBackground(new java.awt.Color(255, 255, 255));
        PendingIdField.setForeground(new java.awt.Color(0, 0, 0));
        PendingIdField.setEnabled(false);

        UserIdField.setBackground(new java.awt.Color(255, 255, 255));
        UserIdField.setForeground(new java.awt.Color(0, 0, 0));

        DescriptionField.setBackground(new java.awt.Color(255, 255, 255));
        DescriptionField.setForeground(new java.awt.Color(0, 0, 0));

        PendingDueField.setBackground(new java.awt.Color(255, 255, 255));
        PendingDueField.setForeground(new java.awt.Color(0, 0, 0));

        PendingAmountField.setBackground(new java.awt.Color(255, 255, 255));
        PendingAmountField.setForeground(new java.awt.Color(0, 0, 0));

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
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PendingIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PendingDueField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PendingAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(addEditBtn)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PendingIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PendingAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PendingDueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addComponent(addEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        this.dispose();
        AccExecManagePendingFrame AccExecPending = new AccExecManagePendingFrame();
        AccExecPending.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccExecPending.pack();
        AccExecPending.setResizable(false);
        AccExecPending.setLocationRelativeTo(null);
        AccExecPending.setVisible(true);
        AccExecPending.backButtonToggle();
        //Run Method in BusManUserManage to set UserType and Data
        AccExecPending.setPendingData();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void addEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEditBtnActionPerformed
        // TODO add your handling code here:
        if(addEditDetector=="edit"){

            accountExecutive main = new accountExecutive();
            ArrayList<String> dataList = new ArrayList<String>();
            dataList.add(PendingIdField.getText());
            dataList.add(UserIdField.getText());
            dataList.add(DescriptionField.getText());
            dataList.add(PendingAmountField.getText());
            dataList.add(PendingDueField.getText());
          
            main.editOrAddData(dataList, "Pending","Pending.txt","edit");
            //
        }else if(addEditDetector=="add"){

            accountExecutive main = new accountExecutive();
            accountExecutive.accountExecutiveMethod mainInner = main.new accountExecutiveMethod();
            pendingFee pendingClass = new pendingFee();
            ArrayList<String> dataList = new ArrayList<String>();
            pendingClass.getIncreasedID("Pending.txt","Pending");
            dataList.add(pendingClass.getpendingId());
            dataList.add(UserIdField.getText());
            dataList.add(DescriptionField.getText());
            dataList.add(PendingAmountField.getText());
            dataList.add(PendingDueField.getText());
            
            System.out.println(dataList);
            mainInner.addEditPayment(dataList,"Pending","Pending.txt","add");

        }
    }//GEN-LAST:event_addEditBtnActionPerformed

    private String addEditDetector;
    private String fileType="Pending.txt";
    private String userType="Pending";
    
    public void addEditDetect(String functionType,String id) throws FileNotFoundException{
        if(functionType=="edit"){
            this.addEditDetector="edit";
            pendingFee pendingClass = new pendingFee();
            pendingClass.chooseTxtFile("Pending");
            pendingClass.getDataViewSingle(id, fileType,userType);
//            payment.paymentMethod mainInner = employeeJobClass.new employeeJobMethod();
            
            addEditBtn.setText("Update");
            PendingIdField.setText(pendingClass.getpendingId());
            UserIdField.setText(pendingClass.getuserId());
            DescriptionField.setText(pendingClass.getpendingDesc());
            PendingAmountField.setText(pendingClass.getpendingAmount());
            PendingDueField.setText(pendingClass.getpendingdue());
            
        }else if (functionType=="add"){
            this.addEditDetector="add";
            addEditBtn.setText("Add");
            PendingIdField.setVisible(false);
            jLabel1.setVisible(false);
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
            java.util.logging.Logger.getLogger(AccExecAddEditPendingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccExecAddEditPendingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccExecAddEditPendingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccExecAddEditPendingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccExecAddEditPendingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField DescriptionField;
    private javax.swing.JTextField PendingAmountField;
    private javax.swing.JTextField PendingDueField;
    private javax.swing.JTextField PendingIdField;
    private javax.swing.JTextField UserIdField;
    private javax.swing.JButton addEditBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
