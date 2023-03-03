/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.BuildingExecutive;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class buildingExecPatrolAddEdit extends javax.swing.JFrame {

    /**
     * Creates new form buildingExecPatrolAddEdit
     */
    public buildingExecPatrolAddEdit() {
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
        topLabel1 = new javax.swing.JLabel();
        cpIdLabel1 = new javax.swing.JLabel();
        guardIdLabel1 = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        timeLabel1 = new javax.swing.JLabel();
        errorMessage1 = new javax.swing.JTextField();
        blockLabel1 = new javax.swing.JLabel();
        CheckpointIdTxt = new javax.swing.JTextField();
        GuardIdTxt = new javax.swing.JTextField();
        BlockNumTxt = new javax.swing.JTextField();
        DateTxt = new javax.swing.JTextField();
        CheckInTimeTxt = new javax.swing.JTextField();
        addEditBtn = new javax.swing.JButton();

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

        topLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topLabel1.setForeground(new java.awt.Color(0, 0, 0));
        topLabel1.setText("Patrolling Schedule");

        cpIdLabel1.setBackground(new java.awt.Color(233, 233, 233));
        cpIdLabel1.setForeground(new java.awt.Color(0, 0, 0));
        cpIdLabel1.setText("Check Point ID :");

        guardIdLabel1.setBackground(new java.awt.Color(233, 233, 233));
        guardIdLabel1.setForeground(new java.awt.Color(0, 0, 0));
        guardIdLabel1.setText("Guard ID :");

        dateLabel1.setBackground(new java.awt.Color(233, 233, 233));
        dateLabel1.setForeground(new java.awt.Color(0, 0, 0));
        dateLabel1.setText("Date :");

        timeLabel1.setBackground(new java.awt.Color(233, 233, 233));
        timeLabel1.setForeground(new java.awt.Color(0, 0, 0));
        timeLabel1.setText("Check-In Time :");

        errorMessage1.setEditable(false);
        errorMessage1.setBackground(new java.awt.Color(233, 233, 233));
        errorMessage1.setForeground(new java.awt.Color(204, 0, 0));
        errorMessage1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorMessage1.setBorder(null);

        blockLabel1.setBackground(new java.awt.Color(233, 233, 233));
        blockLabel1.setForeground(new java.awt.Color(0, 0, 0));
        blockLabel1.setText("Block Number :");

        CheckpointIdTxt.setEnabled(false);
        CheckpointIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckpointIdTxtActionPerformed(evt);
            }
        });

        BlockNumTxt.setText("Block A / Block B/ Block C/ Block D");

        DateTxt.setText("DD-MM-YYYY");

        CheckInTimeTxt.setText("00:00");

        addEditBtn.setBackground(new java.awt.Color(255, 255, 255));
        addEditBtn.setForeground(new java.awt.Color(0, 0, 0));
        addEditBtn.setText("Add/Edit");
        addEditBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEditBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(topLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(errorMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(guardIdLabel1)
                            .addComponent(cpIdLabel1)
                            .addComponent(blockLabel1)
                            .addComponent(dateLabel1)
                            .addComponent(timeLabel1))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckpointIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuardIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BlockNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckInTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(addEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(topLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpIdLabel1)
                    .addComponent(CheckpointIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardIdLabel1)
                    .addComponent(GuardIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blockLabel1)
                    .addComponent(BlockNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel1)
                    .addComponent(DateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel1)
                    .addComponent(CheckInTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(addEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
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

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        buildingExecPatrolManage BuildingExecPatrol = new buildingExecPatrolManage();
        BuildingExecPatrol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BuildingExecPatrol.pack();
        BuildingExecPatrol.setResizable(false);
        BuildingExecPatrol.setLocationRelativeTo(null);
        BuildingExecPatrol.setVisible(true);
        BuildingExecPatrol.backButtonToggle();
        //Run Method in BusManUserManage to set UserType and Data
        BuildingExecPatrol.setPatrolData();
    }//GEN-LAST:event_backBtnActionPerformed

    private void CheckpointIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckpointIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckpointIdTxtActionPerformed

    private void addEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEditBtnActionPerformed
         if(addEditDetector=="edit"){

            buildingExecutive main = new buildingExecutive();
            ArrayList<String> dataList = new ArrayList<String>();
            dataList.add(CheckpointIdTxt.getText());
            dataList.add(GuardIdTxt.getText());
            dataList.add(BlockNumTxt.getText());
            dataList.add(DateTxt.getText());
            dataList.add(CheckInTimeTxt.getText());
          
            main.editOrAddData(dataList, "Pending","Pending.txt","edit");
            //
        }else if(addEditDetector=="add"){

            buildingExecutive main = new buildingExecutive();
//            buildingExecutive.buildingExecutiveMethod mainInner = main.new buildingExecutiveMethod();
            checkpointRecord checkpointClass = new checkpointRecord();
            ArrayList<String> dataList = new ArrayList<String>();
            checkpointClass.getIncreasedID("Checkpoint.txt","Patrol");
            dataList.add(checkpointClass.getCheckPointRecordID());
            dataList.add(GuardIdTxt.getText());
            dataList.add(BlockNumTxt.getText());
            dataList.add(DateTxt.getText());
            dataList.add(CheckInTimeTxt.getText());
            
            System.out.println(dataList);
//            mainInner.addEditPatrol(dataList,"Patrol","Checkpoint.txt","add");

        }
    }//GEN-LAST:event_addEditBtnActionPerformed

    private String addEditDetector;
    private String fileType="Checkpoint.txt";
    private String userType="Patrol";
    
    public void addEditDetect(String functionType,String id) throws FileNotFoundException{
        if(functionType=="edit"){
            this.addEditDetector="edit";
            checkpointRecord checkpointClass = new checkpointRecord();
            checkpointClass.chooseTxtFile("Patrol");
            checkpointClass.getDataViewSingle(id, fileType,userType);
//            payment.paymentMethod mainInner = employeeJobClass.new employeeJobMethod();
            
            addEditBtn.setText("Update");
            CheckpointIdTxt.setText(checkpointClass.getCheckPointRecordID());
            GuardIdTxt.setText(checkpointClass.getUserId());
            BlockNumTxt.setText(checkpointClass.getBlockNumber());
            DateTxt.setText(checkpointClass.getCheckPointRecordDate());
            CheckInTimeTxt.setText(checkpointClass.getCheckPointRecordTime());
            
        }else if (functionType=="add"){
            this.addEditDetector="add";
            addEditBtn.setText("Add");
            CheckpointIdTxt.setVisible(false);
            cpIdLabel1.setVisible(false);
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
            java.util.logging.Logger.getLogger(buildingExecPatrolAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buildingExecPatrolAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buildingExecPatrolAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buildingExecPatrolAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buildingExecPatrolAddEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BlockNumTxt;
    private javax.swing.JTextField CheckInTimeTxt;
    private javax.swing.JTextField CheckpointIdTxt;
    private javax.swing.JTextField DateTxt;
    private javax.swing.JTextField GuardIdTxt;
    private javax.swing.JButton addEditBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel blockLabel1;
    private javax.swing.JLabel cpIdLabel1;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JTextField errorMessage1;
    private javax.swing.JLabel guardIdLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel timeLabel1;
    private javax.swing.JLabel topLabel1;
    // End of variables declaration//GEN-END:variables
}
