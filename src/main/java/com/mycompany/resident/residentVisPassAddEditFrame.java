/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.resident;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author hoiyi
 */
public class residentVisPassAddEditFrame extends javax.swing.JFrame {

    static String idGet, addEditGet;
    static ArrayList<String> dataListGet;
    
    public residentVisPassAddEditFrame(String id, String addEdit, ArrayList<String> dataList) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        String pattern = "dd-MM-yyyy";
        jDateChooser1.setDateFormatString(pattern);
        
        idGet = id;
        addEditGet = addEdit;
        dataListGet = dataList;
        addEditGet = "add";
        if(addEditGet.equals("edit"))
        {
            jDateChooser1.setVisible(false);
            displayData(dataListGet);
        }else{
            dateTxt.setVisible(false);
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
        topLabel = new javax.swing.JLabel();
        idLabel1 = new javax.swing.JLabel();
        idTxt1 = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        statusLabel1 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        errorMessage = new javax.swing.JTextField();
        validCheckBox = new javax.swing.JCheckBox();
        invalidCheckBox = new javax.swing.JCheckBox();

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

        saveBtn.setBackground(new java.awt.Color(255, 255, 255));
        saveBtn.setForeground(new java.awt.Color(0, 0, 0));
        saveBtn.setText("SAVE");
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        statusLabel1.setBackground(new java.awt.Color(233, 233, 233));
        statusLabel1.setForeground(new java.awt.Color(0, 0, 0));
        statusLabel1.setText("Status :");

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelBtn.setText("CANCEL");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        nameTxt.setBackground(new java.awt.Color(233, 233, 233));
        nameTxt.setForeground(new java.awt.Color(0, 0, 0));
        nameTxt.setText("jTextField1");

        dateTxt.setBackground(new java.awt.Color(233, 233, 233));
        dateTxt.setForeground(new java.awt.Color(0, 0, 0));
        dateTxt.setText("date");

        errorMessage.setEditable(false);
        errorMessage.setBackground(new java.awt.Color(233, 233, 233));
        errorMessage.setForeground(new java.awt.Color(204, 0, 0));
        errorMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorMessage.setBorder(null);

        validCheckBox.setBackground(new java.awt.Color(233, 233, 233));
        validCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        validCheckBox.setText("Valid");

        invalidCheckBox.setBackground(new java.awt.Color(233, 233, 233));
        invalidCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        invalidCheckBox.setText("Invalid");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(topLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusLabel1)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel1)
                            .addComponent(nameLabel1)
                            .addComponent(idLabel1))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(validCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(invalidCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel1)
                    .addComponent(idTxt1))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel1)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateLabel1)
                        .addComponent(dateTxt))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel1)
                    .addComponent(validCheckBox)
                    .addComponent(invalidCheckBox))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
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
        residentVisPassManageFrame visitorPass = new residentVisPassManageFrame(idGet);
        visitorPass.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String id = idTxt1.getText();
        String name = nameTxt.getText();
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String date = "";
        if(jDateChooser1.isVisible()) //for add
        {
            Date date1 = jDateChooser1.getDate();
            if(date1 != null)
            {
                date = sdf.format(date1);
            }else{
                date = "";
            }
        }else{
            date = dateTxt.getText();
        }
        String status = "";
        if(validCheckBox.isSelected() && invalidCheckBox.isSelected())
        {
            status = "two selected";
        }else{
            if (validCheckBox.isSelected())
            {
                status = "Valid";
            }else if(invalidCheckBox.isSelected())
            {
                status = "Invalid";
            }
        }
        if(!id.isEmpty() && !name.isEmpty() && !date.isEmpty() && !status.isEmpty())
        {
            if(!id.isBlank()&& !name.isBlank()&& !date.isBlank() && !status.isBlank())
            {
                if(!status.equals("two selected"))
                {
                    int dialog = JOptionPane.showConfirmDialog(null,
                        "Are You Sure to Save?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if(dialog == JOptionPane.YES_OPTION){

                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add(id);
                        dataList.add(name);
                        dataList.add(date);
                        dataList.add(idGet);
                        dataList.add(status);
                        resident main = new resident();
                        resident.residentMethod innerMethod = main.new residentMethod();
                        main.setUserId(idGet);
                        
                        if(addEditGet.equals("edit"))
                        {
                            innerMethod.editVisitorPass("VisitorPass", dataList);
                        }else if(addEditGet.equals("add"))
                        {
                            innerMethod.addVisitorPass("VisitorPass", dataList);
                        }

                        this.dispose();
                        residentVisPassManageFrame visitorPass = new residentVisPassManageFrame(idGet);
                        visitorPass.setVisible(true);
                    }
                }else{
                    errorMessage.setText("Please Select Only One CheckBox !");
                }
            }else{
                errorMessage.setText("DO NOT LEFT EMPTY DATA !");
            }
        }else{
            errorMessage.setText("DO NOT LEFT EMPTY DATA !");
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        residentVisPassManageFrame visitorPass = new residentVisPassManageFrame(idGet);
        visitorPass.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void displayData(ArrayList<String> dataListGet)
    {
        idTxt1.setText(dataListGet.get(0));
        nameTxt.setText(dataListGet.get(1));
        dateTxt.setText(dataListGet.get(2));
        String status = dataListGet.get(3);
        if(status.equals("Valid"))
        {
            validCheckBox.isSelected();
        }else if(status.equals("Invalid")){
            invalidCheckBox.isSelected();
        }
    }
    
    private void emptyData()
    {
        resident main = new resident();
        int nextVPId = main.getNextId("VisitorPass");
        idTxt1.setText("VP"+nextVPId);
        nameTxt.setText("");
        validCheckBox.setSelected(false);
        invalidCheckBox.setSelected(false);
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
            java.util.logging.Logger.getLogger(residentVisPassAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(residentVisPassAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(residentVisPassAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(residentVisPassAddEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new residentVisPassAddEditFrame(idGet, addEditGet, dataListGet).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel dateTxt;
    private javax.swing.JTextField errorMessage;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel idTxt1;
    private javax.swing.JCheckBox invalidCheckBox;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel statusLabel1;
    private javax.swing.JLabel topLabel;
    private javax.swing.JCheckBox validCheckBox;
    // End of variables declaration//GEN-END:variables
}
