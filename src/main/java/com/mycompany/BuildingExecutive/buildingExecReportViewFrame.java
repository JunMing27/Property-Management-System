/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.BuildingExecutive;

import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jun Ming
 */
public class buildingExecReportViewFrame extends javax.swing.JFrame {

    /**
     * Creates new form buildingManagerReportViewFrame
     */
    public buildingExecReportViewFrame() {
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

        jPanel2 = new javax.swing.JPanel();
        reportOutputPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reportOutputTextArea1 = new javax.swing.JTextArea();
        reportSelectedDataGenerator = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataReportTable = new javax.swing.JTable();
        RoleLabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(233, 233, 233));

        reportOutputPanel1.setBackground(new java.awt.Color(233, 233, 233));
        reportOutputPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        reportOutputTextArea1.setEditable(false);
        reportOutputTextArea1.setBackground(new java.awt.Color(233, 233, 233));
        reportOutputTextArea1.setColumns(20);
        reportOutputTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        reportOutputTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        reportOutputTextArea1.setRows(5);
        jScrollPane3.setViewportView(reportOutputTextArea1);

        javax.swing.GroupLayout reportOutputPanel1Layout = new javax.swing.GroupLayout(reportOutputPanel1);
        reportOutputPanel1.setLayout(reportOutputPanel1Layout);
        reportOutputPanel1Layout.setHorizontalGroup(
            reportOutputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );
        reportOutputPanel1Layout.setVerticalGroup(
            reportOutputPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reportSelectedDataGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(335, 335, 335))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reportOutputPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoleLabel)
                    .addComponent(BackBtn))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addComponent(reportOutputPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(reportSelectedDataGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reportSelectedDataGeneratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportSelectedDataGeneratorActionPerformed
        try {
            // TODO add your handling code here:
            reportOutputTextArea1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(buildingExecReportViewFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reportSelectedDataGeneratorActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingExecReportMenuFrame reportMenu = new buildingExecReportMenuFrame();
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
            
                reportOutputTextArea1.setText("*************************************** \n"
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
            
                reportOutputTextArea1.setText("************************************************************************************** \n"
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
            
                reportOutputTextArea1.setText("************************************************************************************** \n"
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
            java.util.logging.Logger.getLogger(buildingExecReportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buildingExecReportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buildingExecReportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buildingExecReportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buildingExecReportViewFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JTable dataReportTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel reportOutputPanel;
    private javax.swing.JPanel reportOutputPanel1;
    private javax.swing.JTextArea reportOutputTextArea;
    private javax.swing.JTextArea reportOutputTextArea1;
    private javax.swing.JButton reportSelectedDataGenerator;
    // End of variables declaration//GEN-END:variables
}
