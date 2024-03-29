/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.resident;

import com.mycompany.adminExecutive.facilityBooking;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hoiyi
 */
public class residentFacBookAddEditFrame extends javax.swing.JFrame {

    static String idGet, addEditGet;
    static ArrayList<String> dataListGet;
    
    public residentFacBookAddEditFrame(String id, String addEditString, ArrayList<String> dataList) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        idGet = id;
        addEditGet = addEditString;
        dataListGet = dataList;
        
        String pattern = "dd-MM-yyyy";
        bookingDateDateChooser.setDateFormatString(pattern);
        if(addEditGet.equals("edit"))
        {
            facilityIdComboBox.setEditable(false);
            
            bookingDateLabel1.setVisible(true);
            bookingDateTxtField1.setVisible(true);
            
            bookingDateLabel2.setVisible(false);
            bookingDateDateChooser.setVisible(false);
            
            displayData(dataListGet);
        }else{
            facilityIdComboBox.setEditable(true);
            
            bookingDateLabel1.setVisible(false);
            bookingDateTxtField1.setVisible(false);
            
            bookingDateLabel2.setVisible(true);
            bookingDateDateChooser.setVisible(true);
            emptyData();
        }
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
        bookingIdLabel = new javax.swing.JLabel();
        facilityIdLabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        bookingIdField = new javax.swing.JTextField();
        facilityNameLabel = new javax.swing.JLabel();
        facilityNameField = new javax.swing.JTextField();
        bookingDateDateChooser = new com.toedter.calendar.JDateChooser();
        bookingDateLabel2 = new javax.swing.JLabel();
        bookingTimeLabel = new javax.swing.JLabel();
        bookingTimeDropDown = new javax.swing.JComboBox<>();
        bookingDurationDropDown = new javax.swing.JComboBox<>();
        bookingDurationLabel = new javax.swing.JLabel();
        residentIdLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        residentIdTxtField = new javax.swing.JTextField();
        bookingDateLabel1 = new javax.swing.JLabel();
        bookingDateTxtField1 = new javax.swing.JTextField();
        facilityIdComboBox = new javax.swing.JComboBox<>();
        errorMessage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));
        jPanel1.setPreferredSize(new java.awt.Dimension(566, 600));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setForeground(new java.awt.Color(0, 0, 0));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        bookingIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookingIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookingIdLabel.setText("Facility Booking ID");

        facilityIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        facilityIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        facilityIdLabel.setText("Facility ID");

        saveBtn.setBackground(new java.awt.Color(255, 255, 255));
        saveBtn.setForeground(new java.awt.Color(0, 0, 0));
        saveBtn.setText("SAVE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        bookingIdField.setEditable(false);
        bookingIdField.setBackground(new java.awt.Color(255, 255, 255));
        bookingIdField.setEnabled(false);

        facilityNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        facilityNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        facilityNameLabel.setText("Facility Name");

        facilityNameField.setEditable(false);
        facilityNameField.setBackground(new java.awt.Color(255, 255, 255));
        facilityNameField.setEnabled(false);

        bookingDateDateChooser.setBackground(new java.awt.Color(255, 255, 255));

        bookingDateLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookingDateLabel2.setForeground(new java.awt.Color(0, 0, 0));
        bookingDateLabel2.setText("Booking Date");

        bookingTimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookingTimeLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookingTimeLabel.setText("Start Time (24H format)");

        bookingTimeDropDown.setBackground(new java.awt.Color(255, 255, 255));
        bookingTimeDropDown.setForeground(new java.awt.Color(0, 0, 0));
        bookingTimeDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingTimeDropDownActionPerformed(evt);
            }
        });

        bookingDurationDropDown.setBackground(new java.awt.Color(255, 255, 255));
        bookingDurationDropDown.setForeground(new java.awt.Color(0, 0, 0));
        bookingDurationDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingDurationDropDownActionPerformed(evt);
            }
        });

        bookingDurationLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookingDurationLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookingDurationLabel.setText("Duration (Hours)");

        residentIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        residentIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        residentIdLabel.setText("Resident ID");

        jLabel1.setBackground(new java.awt.Color(233, 233, 233));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FACILITY BOOKING");

        residentIdTxtField.setEditable(false);
        residentIdTxtField.setBackground(new java.awt.Color(255, 255, 255));
        residentIdTxtField.setEnabled(false);

        bookingDateLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookingDateLabel1.setForeground(new java.awt.Color(0, 0, 0));
        bookingDateLabel1.setText("Booking Date");

        bookingDateTxtField1.setEditable(false);
        bookingDateTxtField1.setBackground(new java.awt.Color(255, 255, 255));
        bookingDateTxtField1.setEnabled(false);

        facilityIdComboBox.setBackground(new java.awt.Color(255, 255, 255));
        facilityIdComboBox.setForeground(new java.awt.Color(0, 0, 0));
        facilityIdComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilityIdComboBoxActionPerformed(evt);
            }
        });

        errorMessage.setEditable(false);
        errorMessage.setBackground(new java.awt.Color(233, 233, 233));
        errorMessage.setForeground(new java.awt.Color(204, 0, 0));
        errorMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorMessage.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(facilityIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookingIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(facilityNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookingDateLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookingTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookingDurationLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(residentIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookingDateLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookingDateDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingDateTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingTimeDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingDurationDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facilityNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residentIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facilityIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingIdLabel)
                    .addComponent(bookingIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facilityIdLabel)
                    .addComponent(facilityIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facilityNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facilityNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentIdLabel)
                    .addComponent(residentIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingDateLabel1)
                    .addComponent(bookingDateTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bookingDateDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookingTimeDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingTimeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookingDurationDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookingDurationLabel))
                        .addGap(40, 40, 40)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bookingDateLabel2))
                .addGap(18, 18, 18)
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        residentFacBookManageFrame manage = new residentFacBookManageFrame(idGet);
        manage.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String bookingId = bookingIdField.getText();
        String facilityId = facilityIdComboBox.getSelectedItem().toString();
        String facilityName = facilityNameField.getText();
        String residentId = residentIdTxtField.getText();
        String pattern = "dd-MM-yyyy";
        
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String bookingDate = "";
        if(bookingDateDateChooser.isVisible()) //mean add
        {
            Date date = bookingDateDateChooser.getDate();
            if(date != null)
            {
                bookingDate = sdf.format(date);
            }else{
                bookingDate = "";
            }  
        }else{ //invisible, mean edit
            bookingDate = bookingDateTxtField1.getText();
        }
        String bookingTime = bookingTimeDropDown.getSelectedItem().toString();
        String bookingDuration = bookingDurationDropDown.getSelectedItem().toString();
        if(!facilityId.isEmpty() && !bookingDate.isEmpty() && !bookingTime.isEmpty() && !bookingDuration.isEmpty())
        {
            if(!facilityId.isBlank()&& !bookingDate.isBlank() && !bookingTime.isBlank() && !bookingDuration.isBlank())
            {
                int dialog = JOptionPane.showConfirmDialog(null,
                        "Are You Sure to Save?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if(dialog == JOptionPane.YES_OPTION){

                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add(bookingId);
                        dataList.add(facilityId);
                        dataList.add(facilityName);
                        dataList.add(residentId);
                        dataList.add(bookingDate);
                        dataList.add(bookingTime);
                        dataList.add(bookingDuration);
                        resident main = new resident();
                        resident.residentMethod innerMethod = main.new residentMethod();
                        main.setUserId(idGet);
                        if(addEditGet.equals("edit"))
                        {
                            innerMethod.editFacilityReservation("FacilityBooking", dataList);
                        }else if(addEditGet.equals("add"))
                        {
                            innerMethod.addFacilityReservation("FacilityBooking", dataList);
                        }

                        this.dispose();
                        residentFacBookManageFrame manage = new residentFacBookManageFrame(idGet);
                        manage.setVisible(true);
                    }
            }else{
                errorMessage.setText("Do Not Left Empty Data !");
            }
        }else{
            errorMessage.setText("Do Not Left Empty Data !");
        }
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void facilityIdComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilityIdComboBoxActionPerformed
        if(!facilityIdComboBox.getSelectedItem().toString().equals(""))
        {
            facilityBooking main = new facilityBooking();
            main.setResidentId(idGet);
            facilityBooking.facilityBookingMethod mainInner = main.new facilityBookingMethod();
            try{
                mainInner.getDropDownData("Facility.txt", "FacilityBookingGetFacilityName", facilityIdComboBox.getSelectedItem().toString());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(residentFacBookAddEditFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            facilityNameField.setText(main.getDropDownDataTemp().get(0));
        }
    }//GEN-LAST:event_facilityIdComboBoxActionPerformed

    private void bookingDurationDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingDurationDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingDurationDropDownActionPerformed

    private void bookingTimeDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingTimeDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingTimeDropDownActionPerformed

    
    private void setTimeDropDown()
    {
        bookingTimeDropDown.addItem("1200");
        bookingTimeDropDown.addItem("1300");
        bookingTimeDropDown.addItem("1400");
        bookingTimeDropDown.addItem("1500");
        bookingTimeDropDown.addItem("1600");
        bookingTimeDropDown.addItem("1700");
        bookingTimeDropDown.addItem("1800");
        bookingTimeDropDown.addItem("1900");
        bookingTimeDropDown.addItem("2000");
    }
    
    
    private void setDurationDropDown()
    {
        bookingDurationDropDown.addItem("1");
        bookingDurationDropDown.addItem("2");
        bookingDurationDropDown.addItem("3");
    }
    private void displayData(ArrayList<String> dataListGet)
    {
        bookingIdField.setText(dataListGet.get(0));
        
        facilityBooking main = new facilityBooking();
        facilityBooking.facilityBookingMethod mainInner = main.new facilityBookingMethod();
        try {
            mainInner.getDropDownData("Facility.txt","FacilityBooking","");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(residentFacBookAddEditFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i=0; i<main.getDropDownData().size() ; i++) 
        {
            facilityIdComboBox.addItem((main.getDropDownData()).get(i));
        }
        facilityIdComboBox.setSelectedItem(dataListGet.get(1));
        
        
        facilityNameField.setText(dataListGet.get(2));
        residentIdTxtField.setText(idGet);
        bookingDateTxtField1.setText(dataListGet.get(3));
        
        setTimeDropDown();
        bookingTimeDropDown.setSelectedItem(dataListGet.get(4));
        
        setDurationDropDown();
        bookingDurationDropDown.setSelectedItem(dataListGet.get(5));
    }
    
    
    private void emptyData()
    {
        setTimeDropDown();
        setDurationDropDown();
        
        facilityBooking main = new facilityBooking();
        main.setResidentId(idGet);
        main.getIncreasedID("FacilityBooking.txt", "");
        bookingIdField.setText(main.getFacilityBookingId());
        
        facilityBooking.facilityBookingMethod mainInner = main.new facilityBookingMethod();
        try {
            mainInner.getDropDownData("Facility.txt", "FacilityBooking", "");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(residentFacBookAddEditFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i=0; i<main.getDropDownData().size() ; i++) 
        {
            facilityIdComboBox.addItem((main.getDropDownData()).get(i));
        }
        
        residentIdTxtField.setText(idGet);
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
            java.util.logging.Logger.getLogger(residentFacBookAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(residentFacBookAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(residentFacBookAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(residentFacBookAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new residentFacBookAddEditFrame(idGet, addEditGet, dataListGet).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser bookingDateDateChooser;
    private javax.swing.JLabel bookingDateLabel1;
    private javax.swing.JLabel bookingDateLabel2;
    private javax.swing.JTextField bookingDateTxtField1;
    private javax.swing.JComboBox<String> bookingDurationDropDown;
    private javax.swing.JLabel bookingDurationLabel;
    private javax.swing.JTextField bookingIdField;
    private javax.swing.JLabel bookingIdLabel;
    private javax.swing.JComboBox<String> bookingTimeDropDown;
    private javax.swing.JLabel bookingTimeLabel;
    private javax.swing.JTextField errorMessage;
    private javax.swing.JComboBox<String> facilityIdComboBox;
    private javax.swing.JLabel facilityIdLabel;
    private javax.swing.JTextField facilityNameField;
    private javax.swing.JLabel facilityNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel residentIdLabel;
    private javax.swing.JTextField residentIdTxtField;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
