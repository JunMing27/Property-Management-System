/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class ResidentPay extends javax.swing.JFrame {
    
    
    ResidentMain residentMain = new ResidentMain();
    String residentId = residentMain.getId();
    
    
    //declare variable
    String fileLine = null;
    ArrayList<String> duePayment1D = new ArrayList<String>();
    int totalRow = 0;
    String[][] duePayment2D, onlyUserDue2D, remove2D1, remove2D2, remove2D3, remove2D4;
    int totalDue = 0;
    boolean runFirst = false, runSecond = false, runThird = false, runFourth = false, runFifth = false, runSixth = false;
    boolean firstPage = true, secondPage = false, thirdPage = false;
        
    public ResidentPay() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        readData();
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
        payAmountLabel1.setText("Payment Amount :");

        dueDateLabel1.setBackground(new java.awt.Color(233, 233, 233));
        dueDateLabel1.setForeground(new java.awt.Color(0, 0, 0));
        dueDateLabel1.setText("Due Date :");

        payAmountTxt1.setBackground(new java.awt.Color(233, 233, 233));
        payAmountTxt1.setForeground(new java.awt.Color(0, 0, 0));
        payAmountTxt1.setText("RM 1000");

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
        payAmountLabel2.setText("Payment Amount :");

        payAmountTxt2.setBackground(new java.awt.Color(233, 233, 233));
        payAmountTxt2.setForeground(new java.awt.Color(0, 0, 0));
        payAmountTxt2.setText("RM 1000");

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
                .addGap(259, 259, 259)
                .addComponent(topLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backPageBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextPageBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(selectBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(payToLabel1)
                            .addComponent(payAmountLabel1)
                            .addComponent(dueDateLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payToTxt1)
                            .addComponent(payAmountTxt1)
                            .addComponent(dueDateTxt1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dueDateLabel2)
                            .addComponent(payAmountLabel2)
                            .addComponent(payToLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payToTxt2)
                            .addComponent(payAmountTxt2)
                            .addComponent(dueDateTxt2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(selectBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dueDateLabel1)
                    .addComponent(dueDateTxt1))
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

    private void nextPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageBtnActionPerformed
        
        //if want click from second page to third page
        if(runFourth == true) //click from second page to third page
        {
            System.out.println("//click from second page to third page");
            secondPage = false;
            runThird = false;
            runFourth = false;
            thirdPage = true;
            firstPage = false;
            setVisibility(totalDue);
            displayData();
        }else{ //click from first page to second page
            System.out.println("//click from first page to second page");
            firstPage = false;
            runFirst = false;
            runSecond = false;
            secondPage = true;
            thirdPage = false;
            setVisibility(totalDue);
            displayData();
        }
    }//GEN-LAST:event_nextPageBtnActionPerformed

    private void backPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backPageBtnActionPerformed
        
        if(runFifth == true) //click from third page to second page
        {
            thirdPage = false;
            runFifth = false;
            runSixth = false;
            secondPage = true;
            firstPage = false;
            setVisibility(totalDue+1);
            displayData();
        }else{ //click from second page to third page
            firstPage = true;
            secondPage = false;
            runThird = false;
            runFourth = false;
            thirdPage = false;
            setVisibility(totalDue+1);
            displayData();
        }
    }//GEN-LAST:event_backPageBtnActionPerformed

    private void selectBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBtn1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        ResidentPaymentOption residentPaymentOption = new ResidentPaymentOption();
        residentPaymentOption.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void selectBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectBtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(ResidentPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentPay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentPay().setVisible(true);
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

    
    
    private void readData()
    {
        
        try {
            File file = new File("src/main/java/com/mycompany/textFile/ResidentDuePayment.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
        
            //save all data into arraylist
            while((fileLine = br.readLine()) != null)
            {
                duePayment1D.add(fileLine);
            }
            totalRow = duePayment1D.size();
            duePayment2D = new String[totalRow][1];
            br.close();
        
            
            //convert 1d array to 2d array
            for (int i=0; i<totalRow; i++ )
            {
                for (int j=0; j<1; j++)
                {
                    duePayment2D[i][j] = duePayment1D.get(i);
                }
            }
            
            
            //loop to find total number of due payment
            for (int i=0; i<duePayment2D.length; i++)
            {
                if(duePayment2D[i][0].contains(residentId))
                {
                    String[] item = duePayment2D[i][0].trim().split(",");
                    if(item[0].equals(residentId))
                    {
                        totalDue+=1;
                    }
                }
            }
            onlyUserDue2D = new String[totalDue][1];
            remove2D1 = new String[totalDue-1][1];
            remove2D2 = new String[totalDue-2][1];
            remove2D3 = new String[totalDue-3][1];
            remove2D4 = new String[totalDue-4][1];
            setVisibility(totalDue);
            
            int p,q;
            //set onlyUserDue2D
            if(totalDue>2)
            {
                for (p=0,q=0; p<duePayment2D.length; p++)
                {
                    if(duePayment2D[p][0].contains(residentId))
                    {
                        onlyUserDue2D[q] = duePayment2D[p];
                        q++;
                    }
                }
            }
            
            //set remove2D1
            for(int i=1; i<onlyUserDue2D.length; i++)
            {
                remove2D1[i-1] = onlyUserDue2D[i];
            }
            
            //set remove2D2
            for(int i=2; i<onlyUserDue2D.length; i++)
            {
                remove2D2[i-2] = onlyUserDue2D[i];
            }
            
            //set remove2D3
            for(int i=3; i<onlyUserDue2D.length; i++)
            {
                remove2D3[i-3] = onlyUserDue2D[i];
            }
            
            //set remove2D4
            for(int i=4; i<onlyUserDue2D.length; i++)
            {
                remove2D4[i-4] = onlyUserDue2D[i];
            }
            
        }catch (FileNotFoundException ex) {
            Logger.getLogger(ResidentPay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ResidentPay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void displayData() {
        
        if(firstPage == true)
        {
            for (int i=0; i<onlyUserDue2D.length; i++)
            {
                String[] item = onlyUserDue2D[i][0].trim().split(",");
                if(runFirst == false){
                    setRelevantData(item, payToTxt1, payAmountTxt1, dueDateTxt1);
                    runFirst = true;
                }else{
                    setRelevantData(item, payToTxt2, payAmountTxt2, dueDateTxt2);
                    runSecond = true;
                    break;
                }
            
            }
        }
        else if(secondPage == true)
        {
            for (int i=0; i<remove2D2.length; i++)
            {
                String[] item = remove2D2[i][0].trim().split(",");
                if(runThird == false){
                    setRelevantData(item, payToTxt1, payAmountTxt1, dueDateTxt1);
                    runThird = true;
                }else{
                    setRelevantData(item, payToTxt2, payAmountTxt2, dueDateTxt2);
                    runFourth = true;
                    break;
                }
            }
        }
        else if(thirdPage == true)
        {
            for (int i=0; i<remove2D4.length; i++)
            {
                String[] item = remove2D4[i][0].trim().split(",");
                if(runFifth == false)
                {
                    setRelevantData(item, payToTxt1, payAmountTxt1, dueDateTxt1);
                    runFifth = true;
                }else{
                    setRelevantData(item, payToTxt2, payAmountTxt2, dueDateTxt2);
                    runSixth = true;
                    break;
                }
            }
        }
        
        
            
    }


    private void setRelevantData(String[] item, JLabel payTo, JLabel payAmount, JLabel dueDate)
    {
        System.out.println("enter setRelevantData");
        for (int j=0; j<item.length; j++){
            payTo.setText(item[1]);
            payAmount.setText(item[2]);
            dueDate.setText(item[3]);
        }
    }
    
    
    private void setVisibility(int totalDue)
    {
        System.out.println("enter setVisibility totalDue == "+totalDue);
        if(firstPage == true)
        {
            backPageBtn.setVisible(false);
            if(totalDue<3)
            {
                nextPageBtn.setVisible(false);
            }
            else{
                nextPageBtn.setVisible(true);
            }
            
        }
        
        if(secondPage == true)
        {
            backPageBtn.setVisible(true);
            if(totalDue<5)
            {
                nextPageBtn.setVisible(false);
            }
            else{
                nextPageBtn.setVisible(true);
            }
            
        }
        
        
        if(thirdPage == true)
        {
            backPageBtn.setVisible(true);
            nextPageBtn.setVisible(false);
        }
        
        
        if(totalDue == 1 || totalDue == 3 || totalDue == 5)
        {
            payToLabel2.setVisible(false);
            payToTxt2.setVisible(false);
            payAmountLabel2.setVisible(false);
            payAmountTxt2.setVisible(false);
            dueDateLabel2.setVisible(false);
            dueDateTxt2.setVisible(false);
            selectBtn2.setVisible(false);
        }else{ //2,4,6
            payToLabel2.setVisible(true);
            payToTxt2.setVisible(true);
            payAmountLabel2.setVisible(true);
            payAmountTxt2.setVisible(true);
            dueDateLabel2.setVisible(true);
            dueDateTxt2.setVisible(true);
            selectBtn2.setVisible(true);
        }
        
    }
    
    
    
    
    

    
}

