/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ResidentInvoice extends javax.swing.JFrame {

    ResidentMain residentMain;
    String residentId;
    
    public ResidentInvoice() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        residentMain = new ResidentMain();
        residentId = residentMain.getId();
        displayData();
        backPageBtn.setEnabled(false);
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
        topLabel = new javax.swing.JLabel();
        backPageBtn = new javax.swing.JButton();
        nextPageBtn = new javax.swing.JButton();
        tenantNameLabel = new javax.swing.JLabel();
        tenantNameTxt = new javax.swing.JLabel();
        dateIssuedLabel = new javax.swing.JLabel();
        dueDateLabel = new javax.swing.JLabel();
        dateIssuedTxt = new javax.swing.JLabel();
        dueDateTxt = new javax.swing.JLabel();
        dueAmountLabel = new javax.swing.JLabel();
        totalAmountTxt = new javax.swing.JLabel();
        totalAmountLabel = new javax.swing.JLabel();
        dueAmountTxt = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        descTxt = new javax.swing.JLabel();

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

        topLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topLabel.setForeground(new java.awt.Color(0, 0, 0));
        topLabel.setText("INVOICE");

        backPageBtn.setBackground(new java.awt.Color(255, 255, 255));
        backPageBtn.setForeground(new java.awt.Color(0, 0, 0));
        backPageBtn.setText("Back");
        backPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backPageBtnActionPerformed(evt);
            }
        });

        nextPageBtn.setBackground(new java.awt.Color(255, 255, 255));
        nextPageBtn.setForeground(new java.awt.Color(0, 0, 0));
        nextPageBtn.setText("Next");
        nextPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageBtnActionPerformed(evt);
            }
        });

        tenantNameLabel.setBackground(new java.awt.Color(233, 233, 233));
        tenantNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tenantNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        tenantNameLabel.setText("Tenant Name :");

        tenantNameTxt.setBackground(new java.awt.Color(233, 233, 233));
        tenantNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tenantNameTxt.setForeground(new java.awt.Color(0, 0, 0));
        tenantNameTxt.setText("name");

        dateIssuedLabel.setBackground(new java.awt.Color(233, 233, 233));
        dateIssuedLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateIssuedLabel.setForeground(new java.awt.Color(0, 0, 0));
        dateIssuedLabel.setText("Date Issued :");

        dueDateLabel.setBackground(new java.awt.Color(233, 233, 233));
        dueDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dueDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        dueDateLabel.setText("Due Date :");

        dateIssuedTxt.setBackground(new java.awt.Color(233, 233, 233));
        dateIssuedTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateIssuedTxt.setForeground(new java.awt.Color(0, 0, 0));
        dateIssuedTxt.setText("01-01-2001");

        dueDateTxt.setBackground(new java.awt.Color(233, 233, 233));
        dueDateTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dueDateTxt.setForeground(new java.awt.Color(0, 0, 0));
        dueDateTxt.setText("01-02-2001");

        dueAmountLabel.setBackground(new java.awt.Color(233, 233, 233));
        dueAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dueAmountLabel.setForeground(new java.awt.Color(0, 0, 0));
        dueAmountLabel.setText("Due Amount(RM) :");

        totalAmountTxt.setBackground(new java.awt.Color(233, 233, 233));
        totalAmountTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalAmountTxt.setForeground(new java.awt.Color(0, 0, 0));
        totalAmountTxt.setText("1500.00");

        totalAmountLabel.setBackground(new java.awt.Color(233, 233, 233));
        totalAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalAmountLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalAmountLabel.setText("Total Amount(RM) :");

        dueAmountTxt.setBackground(new java.awt.Color(233, 233, 233));
        dueAmountTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dueAmountTxt.setForeground(new java.awt.Color(0, 0, 0));
        dueAmountTxt.setText("1000.00");

        descLabel.setBackground(new java.awt.Color(233, 233, 233));
        descLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descLabel.setForeground(new java.awt.Color(0, 0, 0));
        descLabel.setText("Description :");

        descTxt.setBackground(new java.awt.Color(233, 233, 233));
        descTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descTxt.setForeground(new java.awt.Color(0, 0, 0));
        descTxt.setText("sdn bhd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(topLabel)
                        .addGap(83, 83, 83)
                        .addComponent(backPageBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextPageBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tenantNameLabel)
                            .addComponent(dateIssuedLabel)
                            .addComponent(dueDateLabel)
                            .addComponent(dueAmountLabel)
                            .addComponent(descLabel)
                            .addComponent(totalAmountLabel))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tenantNameTxt)
                            .addComponent(descTxt)
                            .addComponent(dueDateTxt)
                            .addComponent(dateIssuedTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(totalAmountTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(dueAmountTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenantNameLabel)
                    .addComponent(tenantNameTxt))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateIssuedLabel)
                    .addComponent(dateIssuedTxt))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dueDateLabel)
                    .addComponent(dueDateTxt))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dueAmountLabel)
                    .addComponent(dueAmountTxt))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAmountLabel)
                    .addComponent(totalAmountTxt))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descTxt)
                    .addComponent(descLabel))
                .addContainerGap(108, Short.MAX_VALUE))
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

    private void nextPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageBtnActionPerformed

        backPageBtn.setEnabled(true);
        displayData();
    }//GEN-LAST:event_nextPageBtnActionPerformed

    private void backPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backPageBtnActionPerformed

        backButtonFunction();
        nextPageBtn.setEnabled(true);
        displayData();
    }//GEN-LAST:event_backPageBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        ResidentPaymentOption residentPaymentOption = new ResidentPaymentOption();
        residentPaymentOption.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ResidentInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentInvoice().setVisible(true);
            }
        });
    }

    private Integer pageLine=-1;
    
    private void setPagination(){
        pageLine=pageLine+1;
    }
    
    public void backButtonFunction(){
        pageLine = pageLine - 2;
        if (pageLine == -1){
            backPageBtn.setEnabled(false);
        }
    }
    
    private void displayData(){
        setPagination();
        try
        {
            String invoiceFile = "src/main/java/com/mycompany/textFile/InvoiceContent.txt";
            ArrayList<ArrayList<String>> userData = onlyUserDataInfo(invoiceFile);
            int newSize = userData.size();   
            try{
                userData.get(pageLine);
                tenantNameTxt.setText(userData.get(pageLine).get(1));
                dateIssuedTxt.setText(userData.get(pageLine).get(2));
                dueDateTxt.setText(userData.get(pageLine).get(3));
                dueAmountTxt.setText(userData.get(pageLine).get(4));
                totalAmountTxt.setText(userData.get(pageLine).get(5));
                descTxt.setText(userData.get(pageLine).get(6));
                residentMain.setStatus(true);
                
                if(tenantNameTxt.getText() == null)
                {
                    tenantNameTxt.setText("no data");
                    dateIssuedTxt.setText("no data");
                    dueDateTxt.setText("no data");
                    dueAmountTxt.setText("no data");
                    totalAmountTxt.setText("no data");
                    descTxt.setText("no data");
                }
                
            }
            catch (Exception ex) {
                residentMain.setStatus(false);
            }
            
            if(pageLine.equals(newSize-1)){
                residentMain.setStatus(false);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ResidentInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean boo = residentMain.getStatus();
        if(boo==false){
            nextPageBtn.setEnabled(false);
        }
        
    }
        

    private ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile) throws FileNotFoundException 
    {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        ArrayList<ArrayList<String>> onlyUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = new Scanner(file);
            String oneUserInfo; 
            String[] itemArray;
            ArrayList<String> itemArrayList;
            allUserInfo = new ArrayList<>();
            while (sc.hasNextLine()) { 
                oneUserInfo = sc.nextLine().trim(); 
                itemArray = oneUserInfo.split(","); 
                itemArrayList = new ArrayList<>(Arrays.asList(itemArray));
                allUserInfo.add(itemArrayList);
            }
        } 
        
        
        int p,q;
        for (p=0,q=0; p<allUserInfo.size(); p++)
        {
            if(allUserInfo.get(p).contains(residentId))
            {
                ArrayList<String> item = allUserInfo.get(p);
                if(item.get(1).equals(residentId))
                {
                    onlyUserInfo.add(allUserInfo.get(p));
                    q++;
                }
            }
        }
       
        return onlyUserInfo;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backPageBtn;
    private javax.swing.JLabel dateIssuedLabel;
    private javax.swing.JLabel dateIssuedTxt;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel descTxt;
    private javax.swing.JLabel dueAmountLabel;
    private javax.swing.JLabel dueAmountTxt;
    private javax.swing.JLabel dueDateLabel;
    private javax.swing.JLabel dueDateTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextPageBtn;
    private javax.swing.JLabel tenantNameLabel;
    private javax.swing.JLabel tenantNameTxt;
    private javax.swing.JLabel topLabel;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JLabel totalAmountTxt;
    // End of variables declaration//GEN-END:variables
}
