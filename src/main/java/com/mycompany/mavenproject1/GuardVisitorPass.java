/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GuardVisitorPass extends javax.swing.JFrame {

    GuardMain main;
    String id;
    
    public GuardVisitorPass() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        main = new GuardMain();
        id = main.getId();
//        displayData();
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
        idLabel1 = new javax.swing.JLabel();
        idTxt1 = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        nameTxt1 = new javax.swing.JLabel();
        dateTxt1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        statusLabel1 = new javax.swing.JLabel();
        statusText1 = new javax.swing.JLabel();
        idLabel2 = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        dateLabel2 = new javax.swing.JLabel();
        statusLabel2 = new javax.swing.JLabel();
        idTxt2 = new javax.swing.JLabel();
        nameTxt2 = new javax.swing.JLabel();
        statusText2 = new javax.swing.JLabel();
        dateTxt2 = new javax.swing.JLabel();
        searchTxtField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

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
        topLabel.setText("VISITOR PASS");

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

        idLabel1.setBackground(new java.awt.Color(233, 233, 233));
        idLabel1.setForeground(new java.awt.Color(0, 0, 0));
        idLabel1.setText("Visitor ID :");

        idTxt1.setBackground(new java.awt.Color(233, 233, 233));
        idTxt1.setForeground(new java.awt.Color(0, 0, 0));
        idTxt1.setText("V1");

        nameLabel1.setBackground(new java.awt.Color(233, 233, 233));
        nameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel1.setText("Visitor Name :");

        dateLabel1.setBackground(new java.awt.Color(233, 233, 233));
        dateLabel1.setForeground(new java.awt.Color(0, 0, 0));
        dateLabel1.setText("Date :");

        nameTxt1.setBackground(new java.awt.Color(233, 233, 233));
        nameTxt1.setForeground(new java.awt.Color(0, 0, 0));
        nameTxt1.setText("Halo");

        dateTxt1.setBackground(new java.awt.Color(233, 233, 233));
        dateTxt1.setForeground(new java.awt.Color(0, 0, 0));
        dateTxt1.setText("10/04/2023");

        statusLabel1.setBackground(new java.awt.Color(233, 233, 233));
        statusLabel1.setForeground(new java.awt.Color(0, 0, 0));
        statusLabel1.setText("Status :");

        statusText1.setBackground(new java.awt.Color(233, 233, 233));
        statusText1.setForeground(new java.awt.Color(0, 0, 0));
        statusText1.setText("Valid");

        idLabel2.setBackground(new java.awt.Color(233, 233, 233));
        idLabel2.setForeground(new java.awt.Color(0, 0, 0));
        idLabel2.setText("Visitor ID :");

        nameLabel2.setBackground(new java.awt.Color(233, 233, 233));
        nameLabel2.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel2.setText("Visitor Name :");

        dateLabel2.setBackground(new java.awt.Color(233, 233, 233));
        dateLabel2.setForeground(new java.awt.Color(0, 0, 0));
        dateLabel2.setText("Date :");

        statusLabel2.setBackground(new java.awt.Color(233, 233, 233));
        statusLabel2.setForeground(new java.awt.Color(0, 0, 0));
        statusLabel2.setText("Status :");

        idTxt2.setBackground(new java.awt.Color(233, 233, 233));
        idTxt2.setForeground(new java.awt.Color(0, 0, 0));
        idTxt2.setText("V1");

        nameTxt2.setBackground(new java.awt.Color(233, 233, 233));
        nameTxt2.setForeground(new java.awt.Color(0, 0, 0));
        nameTxt2.setText("Halo");

        statusText2.setBackground(new java.awt.Color(233, 233, 233));
        statusText2.setForeground(new java.awt.Color(0, 0, 0));
        statusText2.setText("Valid");

        dateTxt2.setBackground(new java.awt.Color(233, 233, 233));
        dateTxt2.setForeground(new java.awt.Color(0, 0, 0));
        dateTxt2.setText("10/04/2023");

        searchTxtField.setBackground(new java.awt.Color(255, 255, 255));
        searchTxtField.setForeground(new java.awt.Color(0, 0, 0));
        searchTxtField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchTxtField.setCaretColor(new java.awt.Color(0, 0, 0));
        searchTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtFieldActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn.setForeground(new java.awt.Color(0, 0, 0));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel2)
                            .addComponent(nameLabel2)
                            .addComponent(statusLabel2)
                            .addComponent(dateLabel2))
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statusText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(topLabel)
                                        .addGap(40, 40, 40)
                                        .addComponent(backPageBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nextPageBtn))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel1)
                                    .addComponent(idLabel1)
                                    .addComponent(dateLabel1)
                                    .addComponent(statusLabel1))
                                .addGap(121, 121, 121)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(statusText1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateTxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(nameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel1)
                    .addComponent(idTxt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTxt1)
                    .addComponent(nameLabel1))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTxt1)
                    .addComponent(dateLabel1))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel1)
                    .addComponent(statusText1))
                .addGap(63, 63, 63)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel2)
                    .addComponent(idTxt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel2)
                    .addComponent(nameTxt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel2)
                    .addComponent(dateTxt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel2)
                    .addComponent(statusText2))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        GuardOption option = new GuardOption();
        option.setVisible(true);
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

    private void searchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtFieldActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        searchTxt = searchTxtField.getText().trim();
        if(!searchTxt.isEmpty())
        {
           pageLine=-1;
           displaySearchedData(); 
        }
        
    }//GEN-LAST:event_searchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GuardVisitorPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardVisitorPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardVisitorPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardVisitorPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuardVisitorPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backPageBtn;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel dateLabel2;
    private javax.swing.JLabel dateTxt1;
    private javax.swing.JLabel dateTxt2;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel idLabel2;
    private javax.swing.JLabel idTxt1;
    private javax.swing.JLabel idTxt2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameTxt1;
    private javax.swing.JLabel nameTxt2;
    private javax.swing.JButton nextPageBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JLabel statusLabel1;
    private javax.swing.JLabel statusLabel2;
    private javax.swing.JLabel statusText1;
    private javax.swing.JLabel statusText2;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables

    private int pageLine=-1;
    private String searchTxt = "";
    
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
        displayDataView(pageLine, "", "upper");
        boolean boo = main.getStatus();
        if(boo==false){
            nextPageBtn.setEnabled(false);
        }
        
        setPagination();
        displayDataView(pageLine, "", "bottom");
        boolean boo2 = main.getStatus();
        if(boo2==false){
            nextPageBtn.setEnabled(false);
        }
        
        
    }

    
    private void displayDataView(Integer pageLine, String searchTxt, String part)
    {
        try{
            String visitorPassFile = "src/main/java/com/mycompany/textFile/VisitorPass.txt";
            ArrayList<ArrayList<String>> userData = allUserDataInfo(visitorPassFile);
            int i =0;
            int fixedSize = userData.size();
            int changedSize = userData.size();
            if(!searchTxt.equals("")){
                for (int x=0;x<fixedSize+1;x++) {
                    if(i ==changedSize){
                        break;
                    }
                    // user.get(0) is userID, user.get(1) is username
                    if(!(userData.get(i)).contains(searchTxt)){
                        userData.remove(i);
                        changedSize=changedSize-1;
                        i=i-1;
                    }
                    i=i+1;
                }
            }
            
            
            int newSize = userData.size();            
            try{
                userData.get(pageLine);
                if(part.equals("upper"))
                {
                    idTxt1.setText(userData.get(pageLine).get(0));
                    nameTxt1.setText(userData.get(pageLine).get(1));
                    dateTxt1.setText(userData.get(pageLine).get(2));
                    statusText1.setText(userData.get(pageLine).get(4));
                    idTxt2.setText("no data");
                    nameTxt2.setText("no data");
                    dateTxt2.setText("no data");
                    statusText2.setText("no data");
                    main.setStatus(true);
                }else{
                    idTxt2.setText(userData.get(pageLine).get(0));
                    nameTxt2.setText(userData.get(pageLine).get(1));
                    dateTxt2.setText(userData.get(pageLine).get(2));
                    statusText2.setText(userData.get(pageLine).get(4));
                    main.setStatus(true);
                }
                if(idTxt1.getText() == null)
                {
                    idTxt1.setText("no data");
                    nameTxt1.setText("no data");
                    dateTxt1.setText("no data");
                    statusText1.setText("no data");
                }
                if(idTxt2.getText() == null)
                {
                    idTxt2.setText("no data");
                    nameTxt2.setText("no data");
                    dateTxt2.setText("no data");
                    statusText2.setText("no data");
                }
                
            }
            catch (Exception ex) {
                main.setStatus(false);
            }
            
            if(pageLine.equals(newSize-1)){
                main.setStatus(false);
            }
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(GuardVisitorPass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


     
    private ArrayList<ArrayList<String>> allUserDataInfo(String textFile) throws FileNotFoundException 
    {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
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
        
        return allUserInfo;
    }
    
    
    
    private void displaySearchedData()
    {
        setPagination();
        displayDataView(pageLine, searchTxt, "upper");
        boolean boo = main.getStatus();
        if(boo==false){
            nextPageBtn.setEnabled(false);
        }
        
        setPagination();
        displayDataView(pageLine, searchTxt, "bottom");
        boolean boo2 = main.getStatus();
        if(boo2==false){
            nextPageBtn.setEnabled(false);
        }
    }

}
