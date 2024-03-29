/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.resident;

import com.mycompany.adminExecutive.facilityBooking;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hoiyi
 */
public class residentFacBookManageFrame extends javax.swing.JFrame {

    static String idGet;
    
    public residentFacBookManageFrame(String id) {
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
        facilityIdLabel1 = new javax.swing.JLabel();
        facilityIdTxt1 = new javax.swing.JLabel();
        facilityNameLabel1 = new javax.swing.JLabel();
        bookDateLabel1 = new javax.swing.JLabel();
        facilityNameTxt1 = new javax.swing.JLabel();
        bookDateTxt1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bookTimeLabel1 = new javax.swing.JLabel();
        bookTimeTxt1 = new javax.swing.JLabel();
        bookDurationLabel1 = new javax.swing.JLabel();
        bookDurationTxt1 = new javax.swing.JLabel();
        deleteBtn1 = new javax.swing.JButton();
        facilityIdLabel2 = new javax.swing.JLabel();
        facilityIdTxt2 = new javax.swing.JLabel();
        facilityNameLabel2 = new javax.swing.JLabel();
        facilityNameTxt2 = new javax.swing.JLabel();
        bookDateLabel2 = new javax.swing.JLabel();
        bookDateTxt2 = new javax.swing.JLabel();
        bookTimeLabel2 = new javax.swing.JLabel();
        bookTimeTxt2 = new javax.swing.JLabel();
        bookDurationLabel2 = new javax.swing.JLabel();
        bookDurationTxt2 = new javax.swing.JLabel();
        editBtn2 = new javax.swing.JButton();
        deleteBtn2 = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        bookingIdLabel1 = new javax.swing.JLabel();
        bookingIdTxt1 = new javax.swing.JLabel();
        bookingIdLabel2 = new javax.swing.JLabel();
        bookingIdTxt2 = new javax.swing.JLabel();

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
        topLabel.setText("FACILITY BOOKING");

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

        facilityIdLabel1.setBackground(new java.awt.Color(233, 233, 233));
        facilityIdLabel1.setForeground(new java.awt.Color(0, 0, 0));
        facilityIdLabel1.setText("Facility ID :");

        facilityIdTxt1.setBackground(new java.awt.Color(233, 233, 233));
        facilityIdTxt1.setForeground(new java.awt.Color(0, 0, 0));
        facilityIdTxt1.setText("F1");

        facilityNameLabel1.setBackground(new java.awt.Color(233, 233, 233));
        facilityNameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        facilityNameLabel1.setText("Facility Name :");

        bookDateLabel1.setBackground(new java.awt.Color(233, 233, 233));
        bookDateLabel1.setForeground(new java.awt.Color(0, 0, 0));
        bookDateLabel1.setText("Booking Date :");

        facilityNameTxt1.setBackground(new java.awt.Color(233, 233, 233));
        facilityNameTxt1.setForeground(new java.awt.Color(0, 0, 0));
        facilityNameTxt1.setText("badminton court 1");

        bookDateTxt1.setBackground(new java.awt.Color(233, 233, 233));
        bookDateTxt1.setForeground(new java.awt.Color(0, 0, 0));
        bookDateTxt1.setText("01-01-2023");

        bookTimeLabel1.setBackground(new java.awt.Color(233, 233, 233));
        bookTimeLabel1.setForeground(new java.awt.Color(0, 0, 0));
        bookTimeLabel1.setText("Booking Time :");

        bookTimeTxt1.setBackground(new java.awt.Color(233, 233, 233));
        bookTimeTxt1.setForeground(new java.awt.Color(0, 0, 0));
        bookTimeTxt1.setText("16.00-19.00");

        bookDurationLabel1.setBackground(new java.awt.Color(233, 233, 233));
        bookDurationLabel1.setForeground(new java.awt.Color(0, 0, 0));
        bookDurationLabel1.setText("Booking Duration :");

        bookDurationTxt1.setBackground(new java.awt.Color(233, 233, 233));
        bookDurationTxt1.setForeground(new java.awt.Color(0, 0, 0));
        bookDurationTxt1.setText("3 hours 30 minutes");

        deleteBtn1.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn1.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn1.setText("DELETE");
        deleteBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn1ActionPerformed(evt);
            }
        });

        facilityIdLabel2.setBackground(new java.awt.Color(233, 233, 233));
        facilityIdLabel2.setForeground(new java.awt.Color(0, 0, 0));
        facilityIdLabel2.setText("Facility ID :");

        facilityIdTxt2.setBackground(new java.awt.Color(233, 233, 233));
        facilityIdTxt2.setForeground(new java.awt.Color(0, 0, 0));
        facilityIdTxt2.setText("F1");

        facilityNameLabel2.setBackground(new java.awt.Color(233, 233, 233));
        facilityNameLabel2.setForeground(new java.awt.Color(0, 0, 0));
        facilityNameLabel2.setText("Facility Name :");

        facilityNameTxt2.setBackground(new java.awt.Color(233, 233, 233));
        facilityNameTxt2.setForeground(new java.awt.Color(0, 0, 0));
        facilityNameTxt2.setText("badminton court 1");

        bookDateLabel2.setBackground(new java.awt.Color(233, 233, 233));
        bookDateLabel2.setForeground(new java.awt.Color(0, 0, 0));
        bookDateLabel2.setText("Booking Date :");

        bookDateTxt2.setBackground(new java.awt.Color(233, 233, 233));
        bookDateTxt2.setForeground(new java.awt.Color(0, 0, 0));
        bookDateTxt2.setText("01-01-2023");

        bookTimeLabel2.setBackground(new java.awt.Color(233, 233, 233));
        bookTimeLabel2.setForeground(new java.awt.Color(0, 0, 0));
        bookTimeLabel2.setText("Booking Time :");

        bookTimeTxt2.setBackground(new java.awt.Color(233, 233, 233));
        bookTimeTxt2.setForeground(new java.awt.Color(0, 0, 0));
        bookTimeTxt2.setText("16.00-19.00");

        bookDurationLabel2.setBackground(new java.awt.Color(233, 233, 233));
        bookDurationLabel2.setForeground(new java.awt.Color(0, 0, 0));
        bookDurationLabel2.setText("Booking Duration :");

        bookDurationTxt2.setBackground(new java.awt.Color(233, 233, 233));
        bookDurationTxt2.setForeground(new java.awt.Color(0, 0, 0));
        bookDurationTxt2.setText("3 hours 30 minutes");

        editBtn2.setBackground(new java.awt.Color(255, 255, 255));
        editBtn2.setForeground(new java.awt.Color(0, 0, 0));
        editBtn2.setText("EDIT");
        editBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtn2ActionPerformed(evt);
            }
        });

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

        bookingIdLabel1.setBackground(new java.awt.Color(233, 233, 233));
        bookingIdLabel1.setForeground(new java.awt.Color(0, 0, 0));
        bookingIdLabel1.setText("Facility Booking ID :");

        bookingIdTxt1.setBackground(new java.awt.Color(233, 233, 233));
        bookingIdTxt1.setForeground(new java.awt.Color(0, 0, 0));
        bookingIdTxt1.setText("FB1");

        bookingIdLabel2.setBackground(new java.awt.Color(233, 233, 233));
        bookingIdLabel2.setForeground(new java.awt.Color(0, 0, 0));
        bookingIdLabel2.setText("Facility Booking ID :");

        bookingIdTxt2.setBackground(new java.awt.Color(233, 233, 233));
        bookingIdTxt2.setForeground(new java.awt.Color(0, 0, 0));
        bookingIdTxt2.setText("FB1");

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
                                    .addComponent(facilityIdLabel2)
                                    .addComponent(facilityNameLabel2)
                                    .addComponent(bookDateLabel2)
                                    .addComponent(bookTimeLabel2)
                                    .addComponent(bookDurationLabel2)
                                    .addComponent(editBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(bookDurationTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(facilityNameTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(facilityIdTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(bookDateTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(bookingIdTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(bookTimeTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(deleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bookingIdLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(topLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(backPageBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextPageBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bookDurationLabel1)
                                .addComponent(editBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(facilityIdLabel1)
                                .addComponent(facilityNameLabel1)
                                .addComponent(bookingIdLabel1)
                                .addComponent(bookDateLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bookTimeLabel1)
                                .addGap(27, 27, 27)))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bookTimeTxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(facilityNameTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookDateTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookDurationTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facilityIdTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingIdTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingIdLabel1)
                    .addComponent(bookingIdTxt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facilityIdTxt1)
                    .addComponent(facilityIdLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facilityNameLabel1)
                    .addComponent(facilityNameTxt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookDateLabel1)
                    .addComponent(bookDateTxt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookTimeLabel1)
                    .addComponent(bookTimeTxt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookDurationLabel1)
                    .addComponent(bookDurationTxt1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingIdLabel2)
                    .addComponent(bookingIdTxt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facilityIdLabel2)
                    .addComponent(facilityIdTxt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facilityNameLabel2)
                    .addComponent(facilityNameTxt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookDateLabel2)
                    .addComponent(bookDateTxt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookTimeTxt2)
                    .addComponent(bookTimeLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookDurationLabel2)
                    .addComponent(bookDurationTxt2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        dataList.add(bookingIdTxt1.getText());
        dataList.add(facilityIdTxt1.getText());
        dataList.add(facilityNameTxt1.getText());
        dataList.add(bookDateTxt1.getText());
        dataList.add(bookTimeTxt1.getText());
        dataList.add(bookDurationTxt1.getText());
        this.dispose();
        residentFacBookAddEditFrame facilityBookingAddEdit = new residentFacBookAddEditFrame(idGet, "edit", dataList );
        facilityBookingAddEdit.setVisible(true);
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

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Click 'YES' Will Delete Selected Booking ",
            "WARNING", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add(bookingIdTxt1.getText());
            dataList.add(facilityIdTxt1.getText());
            dataList.add(facilityNameTxt1.getText());
            dataList.add(bookDateTxt1.getText());
            dataList.add(bookTimeTxt1.getText());
            dataList.add(bookDurationTxt1.getText());
            resident main = new resident();
            resident.residentMethod innerMethod = main.new residentMethod();
            main.setUserId(idGet);
            innerMethod.deleteFacilityReservation("FacilityBooking", dataList);
            this.dispose();
            residentFacBookManageFrame manage = new residentFacBookManageFrame(idGet);
            manage.setVisible(true);
        }
    }//GEN-LAST:event_deleteBtn1ActionPerformed

    private void editBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtn2ActionPerformed
        ArrayList<String> dataList = new ArrayList<>();
        dataList.add(bookingIdTxt2.getText());
        dataList.add(facilityIdTxt2.getText());
        dataList.add(facilityNameTxt2.getText());
        dataList.add(bookDateTxt2.getText());
        dataList.add(bookTimeTxt2.getText());
        dataList.add(bookDurationTxt2.getText());
        this.dispose();
        residentFacBookAddEditFrame facilityBookingAddEdit = new residentFacBookAddEditFrame(idGet, "edit", dataList );
        facilityBookingAddEdit.setVisible(true);
    }//GEN-LAST:event_editBtn2ActionPerformed

    private void deleteBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn2ActionPerformed
        
        int result = JOptionPane.showConfirmDialog(null, "Click 'YES' Will Delete Selected Booking ",
            "WARNING", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION)
        {
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add(bookingIdTxt2.getText());
            dataList.add(facilityIdTxt2.getText());
            dataList.add(facilityNameTxt2.getText());
            dataList.add(bookDateTxt2.getText());
            dataList.add(bookTimeTxt2.getText());
            dataList.add(bookDurationTxt2.getText());
            resident main = new resident();
            resident.residentMethod innerMethod = main.new residentMethod();
            main.setUserId(idGet);
            innerMethod.deleteFacilityReservation("FacilityBooking", dataList);
            this.dispose();
            residentFacBookManageFrame manage = new residentFacBookManageFrame(idGet);
            manage.setVisible(true);
        }
    }//GEN-LAST:event_deleteBtn2ActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        ArrayList<String> dataList = new ArrayList<>();
        this.dispose();
        residentFacBookAddEditFrame facilityBookingAddEdit = new residentFacBookAddEditFrame(idGet, "add", dataList );
        facilityBookingAddEdit.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

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
        facilityBooking main = new facilityBooking();
        main.setResidentId(idGet);
        main.chooseTxtFile("");
        
        setPagination();
        main.displayDataView(pageLine, "", "facility");
        boolean boo = main.getStatus();
        if(boo==false){
            nextPageBtn.setEnabled(false);
        }
        if(main.getFacilityBookingId()!= null)
        {
            bookingIdTxt1.setText(main.getFacilityBookingId());
            facilityIdTxt1.setText(main.getFacilityId());
            facilityNameTxt1.setText(main.getFacilityName());
            bookDateTxt1.setText(main.getBookingDate());
            bookTimeTxt1.setText(main.getBookingStartTime());
            bookDurationTxt1.setText(main.getBookingDuration());
        }else{
            bookingIdTxt1.setText("no data");
            facilityIdTxt1.setText("no data");
            facilityNameTxt1.setText("no data");
            bookDateTxt1.setText("no data");
            bookTimeTxt1.setText("no data");
            bookDurationTxt1.setText("no data");
            editBtn1.setEnabled(false);
            deleteBtn1.setEnabled(false);
        }
        
        setPagination();
        main.displayDataView(pageLine, "", "facility");
        boolean boo2 = main.getStatus();
        if(boo2==false){
            nextPageBtn.setEnabled(false);
        }
        
        if(main.getFacilityBookingId()!= null)
        {
            bookingIdTxt2.setText(main.getFacilityBookingId());
            facilityIdTxt2.setText(main.getFacilityId());
            facilityNameTxt2.setText(main.getFacilityName());
            bookDateTxt2.setText(main.getBookingDate());
            bookTimeTxt2.setText(main.getBookingStartTime());
            bookDurationTxt2.setText(main.getBookingDuration());
        }else{
            bookingIdTxt2.setText("no data");
            facilityIdTxt2.setText("no data");
            facilityNameTxt2.setText("no data");
            bookDateTxt2.setText("no data");
            bookTimeTxt2.setText("no data");
            bookDurationTxt2.setText("no data");
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
            java.util.logging.Logger.getLogger(residentFacBookManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(residentFacBookManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(residentFacBookManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(residentFacBookManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new residentFacBookManageFrame(idGet).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backPageBtn;
    private javax.swing.JLabel bookDateLabel1;
    private javax.swing.JLabel bookDateLabel2;
    private javax.swing.JLabel bookDateTxt1;
    private javax.swing.JLabel bookDateTxt2;
    private javax.swing.JLabel bookDurationLabel1;
    private javax.swing.JLabel bookDurationLabel2;
    private javax.swing.JLabel bookDurationTxt1;
    private javax.swing.JLabel bookDurationTxt2;
    private javax.swing.JLabel bookTimeLabel1;
    private javax.swing.JLabel bookTimeLabel2;
    private javax.swing.JLabel bookTimeTxt1;
    private javax.swing.JLabel bookTimeTxt2;
    private javax.swing.JLabel bookingIdLabel1;
    private javax.swing.JLabel bookingIdLabel2;
    private javax.swing.JLabel bookingIdTxt1;
    private javax.swing.JLabel bookingIdTxt2;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JButton deleteBtn2;
    private javax.swing.JButton editBtn1;
    private javax.swing.JButton editBtn2;
    private javax.swing.JLabel facilityIdLabel1;
    private javax.swing.JLabel facilityIdLabel2;
    private javax.swing.JLabel facilityIdTxt1;
    private javax.swing.JLabel facilityIdTxt2;
    private javax.swing.JLabel facilityNameLabel1;
    private javax.swing.JLabel facilityNameLabel2;
    private javax.swing.JLabel facilityNameTxt1;
    private javax.swing.JLabel facilityNameTxt2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nextPageBtn;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables
}
