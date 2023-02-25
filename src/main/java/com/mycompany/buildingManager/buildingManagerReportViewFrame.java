/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.buildingManager;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Jun Ming
 */
public class buildingManagerReportViewFrame extends javax.swing.JFrame {

    /**
     * Creates new form buildingManagerReportViewFrame
     */
    public buildingManagerReportViewFrame() {
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
        reportOutputPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportOutputTextArea = new javax.swing.JTextArea();
        reportSelectedDataGenerator = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataReportTable = new javax.swing.JTable();
        RoleLabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        reportOutputPanel.setBackground(new java.awt.Color(233, 233, 233));
        reportOutputPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        reportOutputTextArea.setEditable(false);
        reportOutputTextArea.setBackground(new java.awt.Color(233, 233, 233));
        reportOutputTextArea.setColumns(20);
        reportOutputTextArea.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        reportOutputTextArea.setForeground(new java.awt.Color(0, 0, 0));
        reportOutputTextArea.setRows(5);
        jScrollPane2.setViewportView(reportOutputTextArea);

        javax.swing.GroupLayout reportOutputPanelLayout = new javax.swing.GroupLayout(reportOutputPanel);
        reportOutputPanel.setLayout(reportOutputPanelLayout);
        reportOutputPanelLayout.setHorizontalGroup(
            reportOutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );
        reportOutputPanelLayout.setVerticalGroup(
            reportOutputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        reportSelectedDataGenerator.setBackground(new java.awt.Color(255, 255, 255));
        reportSelectedDataGenerator.setForeground(new java.awt.Color(0, 0, 0));
        reportSelectedDataGenerator.setText("Generate Report");
        reportSelectedDataGenerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportSelectedDataGeneratorActionPerformed(evt);
            }
        });

        dataReportTable.setBackground(new java.awt.Color(233, 233, 233));
        dataReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(dataReportTable);

        RoleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RoleLabel.setForeground(new java.awt.Color(0, 0, 0));
        RoleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RoleLabel.setText("??? Report");

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setForeground(new java.awt.Color(0, 0, 0));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reportSelectedDataGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(335, 335, 335))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reportOutputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoleLabel)
                    .addComponent(BackBtn))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addComponent(reportOutputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(reportSelectedDataGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reportSelectedDataGeneratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportSelectedDataGeneratorActionPerformed
        try {
            // TODO add your handling code here:
            reportOutputTextArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(buildingManagerReportViewFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reportSelectedDataGeneratorActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManagerReportMenuFrame reportMenu = new buildingManagerReportMenuFrame();
        reportMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reportMenu.pack();
        reportMenu.setResizable(false);
        reportMenu.setLocationRelativeTo(null);
        reportMenu.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed


    ArrayList<ArrayList<String>> dataArray;
    public void setDataArray(ArrayList<ArrayList<String>> dataArray){
        this.dataArray=dataArray;
    }
//    ArrayList<ArrayList<String>> dataArray2;
//    public void setDataArray2(ArrayList<ArrayList<String>> dataArray){
//        this.dataArray2=dataArray;
//    }
    
    public void DisplayCurrentItem(String userType){
        if(userType=="resident"){
            RoleLabel.setText("Resident Report");
        }
        else if(userType=="complaint"){
            RoleLabel.setText("Complaint Report");
        }
        else if(userType=="patrolling"){
            RoleLabel.setText("Patrolling and CheckIn Report");
        }
        DefaultTableModel model = (DefaultTableModel)dataReportTable.getModel();
        System.out.println(dataArray);
        System.out.println("x");
        for (ArrayList<String> singleData : dataArray) {
            System.out.println(singleData);
             model.addRow(new Object[]{singleData.get(0), singleData.get(1), singleData.get(2), singleData.get(3)});
            }
                      
        dataReportTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){ 
        @Override
        // this method will pass the data to reportOutputPanel to show the report in brief view
        public void valueChanged(ListSelectionEvent e) {
            if(userType=="resident"){
                String userId;
                String userName = null;
                String userGender= null;
                String userAge= null;
                String phoneNumber= null;
                String unitId= null;
                int i = dataReportTable.getSelectedRow();
                userId = (String)model.getValueAt(i, 0);
                for (ArrayList<String> singleData : dataArray) {
                    if(singleData.get(0)==userId){
                        userName=singleData.get(1);
                        userGender=singleData.get(2);
                        userAge=singleData.get(3);
                        phoneNumber=singleData.get(4);
                        unitId=singleData.get(5);
                    }
                }
            
                reportOutputTextArea.setText("*************************************** \n"
                    + "     Resident Report \n"
                    + "***************************************\n\n"
                    +" User ID : "+userId 
                    +"\n User Name : " +userName
                    +"\n User Gender : " +userGender
                    +"\n User Age : " +userAge
                    +"\n User Number : " +phoneNumber
                    +"\n Resident of Unit ID : " +unitId);
                
                
            }
            else if(userType=="complaint"){
                String complaintId;
                String complaintDescription = null;
                String complaintReply= null;
                String complaintUserId= null;


                int i = dataReportTable.getSelectedRow();
                complaintId = (String)model.getValueAt(i, 0);
                for (ArrayList<String> singleData : dataArray) {
                    if(singleData.get(0)==complaintId){
                        complaintDescription=singleData.get(1);
                        complaintReply=singleData.get(2);
                        complaintUserId=singleData.get(3);
                    }
                }
            
                reportOutputTextArea.setText("************************************************************************************** \n"
                    + "     Complaint Report \n"
                    + "**************************************************************************************\n\n"
                    +" Complaint ID : "+complaintId 
                    +"\n Complaint Description : " +complaintDescription
                    +"\n Complaint Reply : " +complaintReply
                    +"\n Complained By : " +complaintUserId);
                
            }
            else if(userType=="patrolling"){
                String checkpointId;
                String employeeId = null;
                String CheckinLocation= null;
                String CheckinDate= null;
                String CheckinTime= null;


                int i = dataReportTable.getSelectedRow();
                checkpointId = (String)model.getValueAt(i, 0);
                for (ArrayList<String> singleData : dataArray) {
                    if(singleData.get(0)==checkpointId){
                        employeeId=singleData.get(1);
                        CheckinLocation=singleData.get(2);
                        CheckinDate=singleData.get(3);
                        CheckinTime=singleData.get(4);
                    }
                }
            
                reportOutputTextArea.setText("************************************************************************************** \n"
                    + "     Checkpoints Report \n"
                    + "**************************************************************************************\n\n"
                    +" Checkpoint ID : "+checkpointId 
                    +"\n Checked In By : " +employeeId
                    +"\n Checked In Location : " +CheckinLocation
                    +"\n Checked In Date : " +CheckinDate
                    +"\n Checked In Time : " +CheckinTime);
            }
            }
        });
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
            java.util.logging.Logger.getLogger(buildingManagerReportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buildingManagerReportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buildingManagerReportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buildingManagerReportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buildingManagerReportViewFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JTable dataReportTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel reportOutputPanel;
    private javax.swing.JTextArea reportOutputTextArea;
    private javax.swing.JButton reportSelectedDataGenerator;
    // End of variables declaration//GEN-END:variables
}
