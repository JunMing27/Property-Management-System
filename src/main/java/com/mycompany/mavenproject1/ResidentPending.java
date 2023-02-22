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


public class ResidentPending extends javax.swing.JFrame {
    ResidentMain residentMain = new ResidentMain();
    String residentId = residentMain.getId();
    
    public ResidentPending() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
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
        payToLabel1 = new javax.swing.JLabel();
        payToTxt1 = new javax.swing.JLabel();
        payAmountLabel1 = new javax.swing.JLabel();
        paidDateLabel1 = new javax.swing.JLabel();
        payAmountTxt1 = new javax.swing.JLabel();
        paidDateTxt1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        payToLabel2 = new javax.swing.JLabel();
        payToTxt2 = new javax.swing.JLabel();
        payAmountLabel2 = new javax.swing.JLabel();
        payAmountTxt2 = new javax.swing.JLabel();
        paidDateLabel2 = new javax.swing.JLabel();
        paidDateTxt2 = new javax.swing.JLabel();

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
        topLabel.setText("PENDING FEE");

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

        payToLabel1.setBackground(new java.awt.Color(233, 233, 233));
        payToLabel1.setForeground(new java.awt.Color(0, 0, 0));
        payToLabel1.setText("Payment To :");

        payToTxt1.setBackground(new java.awt.Color(233, 233, 233));
        payToTxt1.setForeground(new java.awt.Color(0, 0, 0));
        payToTxt1.setText("Example Sdn Bhd");

        payAmountLabel1.setBackground(new java.awt.Color(233, 233, 233));
        payAmountLabel1.setForeground(new java.awt.Color(0, 0, 0));
        payAmountLabel1.setText("Payment Amount(RM) :");

        paidDateLabel1.setBackground(new java.awt.Color(233, 233, 233));
        paidDateLabel1.setForeground(new java.awt.Color(0, 0, 0));
        paidDateLabel1.setText("Paid Date :");

        payAmountTxt1.setBackground(new java.awt.Color(233, 233, 233));
        payAmountTxt1.setForeground(new java.awt.Color(0, 0, 0));
        payAmountTxt1.setText("RM 1000");

        paidDateTxt1.setBackground(new java.awt.Color(233, 233, 233));
        paidDateTxt1.setForeground(new java.awt.Color(0, 0, 0));
        paidDateTxt1.setText("10/04/2023");

        payToLabel2.setBackground(new java.awt.Color(233, 233, 233));
        payToLabel2.setForeground(new java.awt.Color(0, 0, 0));
        payToLabel2.setText("Payment To :");

        payToTxt2.setBackground(new java.awt.Color(233, 233, 233));
        payToTxt2.setForeground(new java.awt.Color(0, 0, 0));
        payToTxt2.setText("Example Sdn Bhd");

        payAmountLabel2.setBackground(new java.awt.Color(233, 233, 233));
        payAmountLabel2.setForeground(new java.awt.Color(0, 0, 0));
        payAmountLabel2.setText("Payment Amount(RM) :");

        payAmountTxt2.setBackground(new java.awt.Color(233, 233, 233));
        payAmountTxt2.setForeground(new java.awt.Color(0, 0, 0));
        payAmountTxt2.setText("1000");

        paidDateLabel2.setBackground(new java.awt.Color(233, 233, 233));
        paidDateLabel2.setForeground(new java.awt.Color(0, 0, 0));
        paidDateLabel2.setText("Paid Date :");

        paidDateTxt2.setBackground(new java.awt.Color(233, 233, 233));
        paidDateTxt2.setForeground(new java.awt.Color(0, 0, 0));
        paidDateTxt2.setText("10/04/2023");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(topLabel)
                        .addGap(58, 58, 58)
                        .addComponent(backPageBtn)
                        .addGap(18, 18, 18)
                        .addComponent(nextPageBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(paidDateLabel1)
                            .addComponent(payToLabel1)
                            .addComponent(payAmountLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payAmountTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payToTxt1)
                            .addComponent(paidDateTxt1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(payToLabel2)
                            .addComponent(payAmountLabel2)
                            .addComponent(paidDateLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payToTxt2)
                            .addComponent(paidDateTxt2)
                            .addComponent(payAmountTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
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
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payToLabel1)
                    .addComponent(payToTxt1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payAmountLabel1)
                    .addComponent(payAmountTxt1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paidDateLabel1)
                    .addComponent(paidDateTxt1))
                .addGap(54, 54, 54)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payToLabel2)
                    .addComponent(payToTxt2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payAmountLabel2)
                    .addComponent(payAmountTxt2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paidDateLabel2)
                    .addComponent(paidDateTxt2))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        ResidentPaymentOption residentPaymentOption = new ResidentPaymentOption();
        residentPaymentOption.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void backPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backPageBtnActionPerformed

        backButtonFunction();
        nextPageBtn.setEnabled(true);
        displayData();
    }//GEN-LAST:event_backPageBtnActionPerformed

    private void nextPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageBtnActionPerformed

        backPageBtn.setEnabled(true);
        displayData();
    }//GEN-LAST:event_nextPageBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ResidentPending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentPending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentPending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentPending.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentPending().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backPageBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nextPageBtn;
    private javax.swing.JLabel paidDateLabel1;
    private javax.swing.JLabel paidDateLabel2;
    private javax.swing.JLabel paidDateTxt1;
    private javax.swing.JLabel paidDateTxt2;
    private javax.swing.JLabel payAmountLabel1;
    private javax.swing.JLabel payAmountLabel2;
    private javax.swing.JLabel payAmountTxt1;
    private javax.swing.JLabel payAmountTxt2;
    private javax.swing.JLabel payToLabel1;
    private javax.swing.JLabel payToLabel2;
    private javax.swing.JLabel payToTxt1;
    private javax.swing.JLabel payToTxt2;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables


    private int pageLine=-1;
    
    private void setPagination(){
        pageLine=pageLine+1;
    }
    
    public void backButtonFunction(){
        pageLine = pageLine - 4;
        if (pageLine == -1){
            backPageBtn.setEnabled(false);
        }
    }
    
    private void displayData(){
        setPagination();
        displayDataView(pageLine, "upper");
        boolean boo = residentMain.getStatus();
        if(boo==false){
            nextPageBtn.setEnabled(false);
        }
        
        setPagination();
        displayDataView(pageLine, "bottom");
        boolean boo2 = residentMain.getStatus();
        if(boo2==false){
            nextPageBtn.setEnabled(false);
        }
        
    }

    
    private void displayDataView(Integer pageLine, String part)
    {
        try{
            String pendingFile = "src/main/java/com/mycompany/textFile/Pending.txt";
            ArrayList<ArrayList<String>> userData = onlyUserDataInfo(pendingFile);
            int newSize = userData.size();            
            try{
                userData.get(pageLine);
                if(part.equals("upper"))
                {
                    payToTxt1.setText(userData.get(pageLine).get(2));
                    payAmountTxt1.setText(userData.get(pageLine).get(3));
                    paidDateTxt1.setText(userData.get(pageLine).get(4));
                    payToTxt2.setText("no data");
                    payAmountTxt2.setText("no data");
                    paidDateTxt2.setText("no data");
                    residentMain.setStatus(true);
                }else{
                    payToTxt2.setText(userData.get(pageLine).get(2));
                    payAmountTxt2.setText(userData.get(pageLine).get(3));
                    paidDateTxt2.setText(userData.get(pageLine).get(4));
                    residentMain.setStatus(true);
                }
                if(payToTxt1.getText() == null)
                {
                    payToTxt1.setText("no data");
                    payAmountTxt1.setText("no data");
                    paidDateTxt1.setText("no data");
                }
                if(payToTxt2.getText() == null)
                {
                    payToTxt2.setText("no data");
                    payAmountTxt2.setText("no data");
                    paidDateTxt2.setText("no data");
                }
                
            }
            catch (Exception ex) {
                residentMain.setStatus(false);
            }
            
            if(pageLine.equals(newSize-1)){
                residentMain.setStatus(false);
            }
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(ResidentPay.class.getName()).log(Level.SEVERE, null, ex);
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



}