/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.resident;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hoiyi
 */
public class residentVisPassManageFrame extends javax.swing.JFrame {

    static String idGet;
    
    public residentVisPassManageFrame(String id) {
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
        editBtn1 = new javax.swing.JButton();
        backPageBtn = new javax.swing.JButton();
        nextPageBtn = new javax.swing.JButton();
        idLabel1 = new javax.swing.JLabel();
        idTxt1 = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        nameTxt1 = new javax.swing.JLabel();
        dateTxt1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        editBtn2 = new javax.swing.JButton();
        statusLabel1 = new javax.swing.JLabel();
        statusText1 = new javax.swing.JLabel();
        deleteBtn1 = new javax.swing.JButton();
        idLabel2 = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        dateLabel2 = new javax.swing.JLabel();
        statusLabel2 = new javax.swing.JLabel();
        idTxt2 = new javax.swing.JLabel();
        nameTxt2 = new javax.swing.JLabel();
        statusText2 = new javax.swing.JLabel();
        dateTxt2 = new javax.swing.JLabel();
        deleteBtn2 = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
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

        editBtn1.setBackground(new java.awt.Color(255, 255, 255));
        editBtn1.setForeground(new java.awt.Color(0, 0, 0));
        editBtn1.setText("EDIT");
        editBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtn1ActionPerformed(evt);
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

        editBtn2.setBackground(new java.awt.Color(255, 255, 255));
        editBtn2.setForeground(new java.awt.Color(0, 0, 0));
        editBtn2.setText("EDIT");
        editBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtn2ActionPerformed(evt);
            }
        });

        statusLabel1.setBackground(new java.awt.Color(233, 233, 233));
        statusLabel1.setForeground(new java.awt.Color(0, 0, 0));
        statusLabel1.setText("Status :");

        statusText1.setBackground(new java.awt.Color(233, 233, 233));
        statusText1.setForeground(new java.awt.Color(0, 0, 0));
        statusText1.setText("Valid");

        deleteBtn1.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn1.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn1.setText("DELETE");
        deleteBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn1ActionPerformed(evt);
            }
        });

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

        deleteBtn2.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn2.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn2.setText("DELETE");
        deleteBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn2ActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 0, 0));
        addBtn.setText("ADD");
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idLabel2)
                                    .addComponent(nameLabel2)
                                    .addComponent(statusLabel2)
                                    .addComponent(dateLabel2))
                                .addGap(123, 123, 123)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statusText2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(editBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(deleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel1)
                            .addComponent(idLabel1)
                            .addComponent(dateLabel1)
                            .addComponent(statusLabel1)
                            .addComponent(editBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(statusText1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))))
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
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
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
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
        residentMenuFrame residentOption = new residentMenuFrame(idGet);
        residentOption.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void editBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtn1ActionPerformed
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add(idTxt1.getText());
        dataList.add(nameTxt1.getText());
        dataList.add(dateTxt1.getText());
        dataList.add(statusText1.getText());
        this.dispose();
        residentVisPassAddEditFrame edit = new residentVisPassAddEditFrame(idGet, "edit", dataList );
        edit.setVisible(true);
    }//GEN-LAST:event_editBtn1ActionPerformed

    private void backPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backPageBtnActionPerformed
        backButtonFunction();
        nextPageBtn.setEnabled(true);
        displayData();
    }//GEN-LAST:event_backPageBtnActionPerformed

    private void nextPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageBtnActionPerformed
        backPageBtn.setEnabled(true);
        displayData();
    }//GEN-LAST:event_nextPageBtnActionPerformed

    private void editBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtn2ActionPerformed
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add(idTxt2.getText());
        dataList.add(nameTxt2.getText());
        dataList.add(dateTxt2.getText());
        dataList.add(statusText2.getText());
        this.dispose();
        residentVisPassAddEditFrame edit = new residentVisPassAddEditFrame(idGet, "edit", dataList );
        edit.setVisible(true);
    }//GEN-LAST:event_editBtn2ActionPerformed

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Click 'YES' will Delete This Visitor Pass ",
            "INFORMATION", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add(idGet);
            dataList.add(idTxt1.getText());
            resident main = new resident();
            resident.residentMethod innerMethod = main.new residentMethod();
            main.setUserId(idGet);
            innerMethod.deleteVisitorPass("VisitorPass", dataList);
            this.dispose();
            residentVisPassManageFrame visitorPassManage = new residentVisPassManageFrame(idGet);
            visitorPassManage.setVisible(true);
        }
    }//GEN-LAST:event_deleteBtn1ActionPerformed

    private void deleteBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn2ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Click 'YES' Will Delete This Visitor Pass",
            "INFORMATION", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add(idGet);
            dataList.add(idTxt2.getText());
            resident main = new resident();
            resident.residentMethod innerMethod = main.new residentMethod();
            main.setUserId(idGet);
            innerMethod.deleteVisitorPass("VisitorPass", dataList);
            this.dispose();
            residentVisPassManageFrame visitorPassManage = new residentVisPassManageFrame(idGet);
            visitorPassManage.setVisible(true);
        }
    }//GEN-LAST:event_deleteBtn2ActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        ArrayList<String> dataList = new ArrayList<>();
        this.dispose();
        residentVisPassAddEditFrame add = new residentVisPassAddEditFrame(idGet, "add", dataList );
        add.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtFieldActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        searchTxt = searchTxtField.getText();
        if(!searchTxt.isEmpty() && !searchTxt.isBlank())
        {
            pageLine=-1;
            backPageBtn.setEnabled(false);
            nextPageBtn.setEnabled(true);
            displayData();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

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
        visitorPass main = new visitorPass();
        main.setUserId(idGet);
        setPagination();
        main.displayDataViewOwn(pageLine, searchTxt, "visitorPass", "VisitorPass");
        boolean boo = main.getStatus();
        if(boo==false){
            nextPageBtn.setEnabled(false);
        }
        if(main.getVisitorPassId()!= null){
            idTxt1.setText(main.getVisitorPassId());
            nameTxt1.setText(main.getVisitorName());
            dateTxt1.setText(main.getVisitDate());
            statusText1.setText(main.getVisitorPassStatus());
        }else{
            idTxt1.setText("no data");
            nameTxt1.setText("no data");
            dateTxt1.setText("no data");
            statusText1.setText("no data");
            editBtn1.setEnabled(false);
            deleteBtn2.setEnabled(false);
        }
        
        setPagination();
        main.displayDataViewOwn(pageLine, searchTxt, "visitorPass", "VisitorPass");
        boolean boo2 = main.getStatus();
        if(boo2==false){
            nextPageBtn.setEnabled(false);
        }
        if(main.getVisitorPassId()!= null){
            idTxt2.setText(main.getVisitorPassId());
            nameTxt2.setText(main.getVisitorName());
            dateTxt2.setText(main.getVisitDate());
            statusText2.setText(main.getVisitorPassStatus());
        }else{
            idTxt2.setText("no data");
            nameTxt2.setText("no data");
            dateTxt2.setText("no data");
            statusText2.setText("no data");
            editBtn2.setEnabled(false);
            deleteBtn2.setEnabled(false);
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
            java.util.logging.Logger.getLogger(residentVisPassManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(residentVisPassManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(residentVisPassManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(residentVisPassManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new residentVisPassManageFrame(idGet).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backPageBtn;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel dateLabel2;
    private javax.swing.JLabel dateTxt1;
    private javax.swing.JLabel dateTxt2;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JButton deleteBtn2;
    private javax.swing.JButton editBtn1;
    private javax.swing.JButton editBtn2;
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
}
