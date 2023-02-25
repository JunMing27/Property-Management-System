/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.resident;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class residentPayFrame extends javax.swing.JFrame {

    static String idGet;
    
    public residentPayFrame(String id) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        idGet = id;
        backPageBtn.setEnabled(false);
        displayData();
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
        selectBtn1 = new javax.swing.JButton();
        backPageBtn = new javax.swing.JButton();
        nextPageBtn = new javax.swing.JButton();
        payToLabel1 = new javax.swing.JLabel();
        payToTxt1 = new javax.swing.JLabel();
        payAmountLabel1 = new javax.swing.JLabel();
        dueDateLabel1 = new javax.swing.JLabel();
        payAmountTxt1 = new javax.swing.JLabel();
        dueDateTxt1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        payToLabel2 = new javax.swing.JLabel();
        payToTxt2 = new javax.swing.JLabel();
        payAmountLabel2 = new javax.swing.JLabel();
        payAmountTxt2 = new javax.swing.JLabel();
        dueDateLabel2 = new javax.swing.JLabel();
        dueDateTxt2 = new javax.swing.JLabel();
        selectBtn2 = new javax.swing.JButton();

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
        topLabel.setText("PAY");

        selectBtn1.setBackground(new java.awt.Color(255, 255, 255));
        selectBtn1.setForeground(new java.awt.Color(0, 0, 0));
        selectBtn1.setText("SELECT");
        selectBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtn1ActionPerformed(evt);
            }
        });

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

        dueDateLabel1.setBackground(new java.awt.Color(233, 233, 233));
        dueDateLabel1.setForeground(new java.awt.Color(0, 0, 0));
        dueDateLabel1.setText("Due Date :");

        payAmountTxt1.setBackground(new java.awt.Color(233, 233, 233));
        payAmountTxt1.setForeground(new java.awt.Color(0, 0, 0));
        payAmountTxt1.setText("1000");

        dueDateTxt1.setBackground(new java.awt.Color(233, 233, 233));
        dueDateTxt1.setForeground(new java.awt.Color(0, 0, 0));
        dueDateTxt1.setText("10/04/2023");

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

        dueDateLabel2.setBackground(new java.awt.Color(233, 233, 233));
        dueDateLabel2.setForeground(new java.awt.Color(0, 0, 0));
        dueDateLabel2.setText("Due Date :");

        dueDateTxt2.setBackground(new java.awt.Color(233, 233, 233));
        dueDateTxt2.setForeground(new java.awt.Color(0, 0, 0));
        dueDateTxt2.setText("10/04/2023");

        selectBtn2.setBackground(new java.awt.Color(255, 255, 255));
        selectBtn2.setForeground(new java.awt.Color(0, 0, 0));
        selectBtn2.setText("SELECT");
        selectBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtn2ActionPerformed(evt);
            }
        });

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
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payAmountLabel1)
                            .addComponent(payToLabel1)
                            .addComponent(dueDateLabel1))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payToTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dueDateTxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(payAmountTxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payAmountLabel2)
                            .addComponent(payToLabel2)
                            .addComponent(dueDateLabel2))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payToTxt2)
                            .addComponent(dueDateTxt2)
                            .addComponent(payAmountTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(selectBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(selectBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
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
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payToLabel1)
                    .addComponent(payToTxt1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payAmountLabel1)
                    .addComponent(payAmountTxt1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dueDateTxt1)
                    .addComponent(dueDateLabel1))
                .addGap(27, 27, 27)
                .addComponent(selectBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payToLabel2)
                    .addComponent(payToTxt2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payAmountLabel2)
                    .addComponent(payAmountTxt2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dueDateLabel2)
                    .addComponent(dueDateTxt2))
                .addGap(37, 37, 37)
                .addComponent(selectBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        residentPaymentMenuFrame residentPaymentOption = new residentPaymentMenuFrame(idGet);
        residentPaymentOption.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void selectBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtn1ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Click 'YES' will consider paid ",
            "INFORMATION", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add(idGet);
            dataList.add(payToTxt1.getText());
            dataList.add(payAmountTxt1.getText());
            dataList.add(dueDateTxt1.getText());
            payment main = new payment();
            main.setUserId(idGet);
            main.removeFromFile("Payment", dataList);
            int dataNextId = main.getNextId("Pending");
            dataList.add(Integer.toString(dataNextId));
            main.editFile("Pending", dataList);
            this.dispose();
            residentPayFrame residentPay = new residentPayFrame(idGet);
            residentPay.setVisible(true);
        }

    }//GEN-LAST:event_selectBtn1ActionPerformed

    private void backPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backPageBtnActionPerformed

        backButtonFunction();
        nextPageBtn.setEnabled(true);
        displayData();
    }//GEN-LAST:event_backPageBtnActionPerformed

    private void nextPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageBtnActionPerformed

        backPageBtn.setEnabled(true);
        displayData();
    }//GEN-LAST:event_nextPageBtnActionPerformed

    private void selectBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtn2ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Click 'YES' will consider paid ",
            "INFORMATION", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add(idGet);
            dataList.add(payToTxt2.getText());
            dataList.add(payAmountTxt2.getText());
            dataList.add(dueDateTxt2.getText());
            payment main = new payment();
            main.setUserId(idGet);
            main.removeFromFile("Payment", dataList);
            int dataNextId = main.getNextId("Pending");
            dataList.add(Integer.toString(dataNextId));
            main.editFile("Pending", dataList);
            this.dispose();
            residentPayFrame residentPay = new residentPayFrame(idGet);
            residentPay.setVisible(true);
        }

    }//GEN-LAST:event_selectBtn2ActionPerformed

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
        payment main = new payment();
        main.setUserId(idGet);
        setPagination();
        main.displayDataViewOwn(pageLine, "", "pay", "Payment");
        boolean boo = main.getStatus();
        if(boo==false){
            nextPageBtn.setEnabled(false);
        }
        if(main.getPaymentId()!= null){
            payToTxt1.setText(main.getPayDesc());
            payAmountTxt1.setText(main.getPayAmount());
            dueDateTxt1.setText(main.getDueDate());
        }else{
            payToTxt1.setText("no data");
            payAmountTxt1.setText("no data");
            dueDateTxt1.setText("no data");
            selectBtn1.setEnabled(false);
        }
        
        setPagination();
        main.displayDataViewOwn(pageLine, "", "pay", "Payment");
        boolean boo2 = main.getStatus();
        if(boo2==false){
            nextPageBtn.setEnabled(false);
        }
        if(main.getPaymentId()!= null){
            payToTxt2.setText(main.getPayDesc());
            payAmountTxt2.setText(main.getPayAmount());
            dueDateTxt2.setText(main.getDueDate());
        }else{
            payToTxt2.setText("no data");
            payAmountTxt2.setText("no data");
            dueDateTxt2.setText("no data");
            selectBtn2.setEnabled(false);
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
            java.util.logging.Logger.getLogger(residentPayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(residentPayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(residentPayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(residentPayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new residentPayFrame(idGet).setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backPageBtn;
    private javax.swing.JLabel dueDateLabel1;
    private javax.swing.JLabel dueDateLabel2;
    private javax.swing.JLabel dueDateTxt1;
    private javax.swing.JLabel dueDateTxt2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nextPageBtn;
    private javax.swing.JLabel payAmountLabel1;
    private javax.swing.JLabel payAmountLabel2;
    private javax.swing.JLabel payAmountTxt1;
    private javax.swing.JLabel payAmountTxt2;
    private javax.swing.JLabel payToLabel1;
    private javax.swing.JLabel payToLabel2;
    private javax.swing.JLabel payToTxt1;
    private javax.swing.JLabel payToTxt2;
    private javax.swing.JButton selectBtn1;
    private javax.swing.JButton selectBtn2;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables



}
