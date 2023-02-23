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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerListModel;

/**
 *
 * @author user
 */
public class GuardCheckPointAdd extends javax.swing.JFrame {

    /**
     * Creates new form GuardCheckPointEdit
     */
    public GuardCheckPointAdd() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
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
        topLabel1 = new javax.swing.JLabel();
        cpIdLabel1 = new javax.swing.JLabel();
        cpIdTxt1 = new javax.swing.JLabel();
        guardIdLabel1 = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        timeLabel1 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        dateTxt1 = new javax.swing.JLabel();
        errorMessage1 = new javax.swing.JTextField();
        timeTxt1 = new javax.swing.JLabel();
        guardIdTxt1 = new javax.swing.JLabel();
        blockLabel1 = new javax.swing.JLabel();
        blockSpinner = new javax.swing.JSpinner();

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

        topLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        topLabel1.setForeground(new java.awt.Color(0, 0, 0));
        topLabel1.setText("CHECKPOINT CHECK-IN");

        cpIdLabel1.setBackground(new java.awt.Color(233, 233, 233));
        cpIdLabel1.setForeground(new java.awt.Color(0, 0, 0));
        cpIdLabel1.setText("Check Point ID :");

        cpIdTxt1.setBackground(new java.awt.Color(233, 233, 233));
        cpIdTxt1.setForeground(new java.awt.Color(0, 0, 0));
        cpIdTxt1.setText("CP1");

        guardIdLabel1.setBackground(new java.awt.Color(233, 233, 233));
        guardIdLabel1.setForeground(new java.awt.Color(0, 0, 0));
        guardIdLabel1.setText("Guard ID :");

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

        timeLabel1.setBackground(new java.awt.Color(233, 233, 233));
        timeLabel1.setForeground(new java.awt.Color(0, 0, 0));
        timeLabel1.setText("Check-In Time :");

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelBtn.setText("CANCEL");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        dateTxt1.setBackground(new java.awt.Color(233, 233, 233));
        dateTxt1.setForeground(new java.awt.Color(0, 0, 0));
        dateTxt1.setText("date");

        errorMessage1.setEditable(false);
        errorMessage1.setBackground(new java.awt.Color(233, 233, 233));
        errorMessage1.setForeground(new java.awt.Color(204, 0, 0));
        errorMessage1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorMessage1.setBorder(null);

        timeTxt1.setBackground(new java.awt.Color(233, 233, 233));
        timeTxt1.setForeground(new java.awt.Color(0, 0, 0));
        timeTxt1.setText("02:00");

        guardIdTxt1.setBackground(new java.awt.Color(233, 233, 233));
        guardIdTxt1.setForeground(new java.awt.Color(0, 0, 0));
        guardIdTxt1.setText("date");

        blockLabel1.setBackground(new java.awt.Color(233, 233, 233));
        blockLabel1.setForeground(new java.awt.Color(0, 0, 0));
        blockLabel1.setText("Block Number :");

        blockSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blockSpinner.setValue("-","A","B","C","D");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(topLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(guardIdLabel1)
                                .addComponent(cpIdLabel1)
                                .addComponent(blockLabel1)
                                .addComponent(dateLabel1)
                                .addComponent(timeLabel1)))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateTxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cpIdTxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(guardIdTxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(blockSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(errorMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(topLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpIdLabel1)
                    .addComponent(cpIdTxt1))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardIdLabel1)
                    .addComponent(guardIdTxt1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blockLabel1)
                    .addComponent(blockSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel1)
                    .addComponent(dateTxt1))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel1)
                    .addComponent(timeTxt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        GuardCheckPointManage manage = new GuardCheckPointManage();
        manage.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String checkId = cpIdTxt1.getText();
        String guardId = guardIdTxt1.getText();
        String date = dateTxt1.getText();
        String time = timeTxt1.getText();
        
        int dialog = JOptionPane.showConfirmDialog(null,
            "RECORD Cannot be Changed After Saved", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(dialog == JOptionPane.YES_OPTION){
            addFile(checkId, guardId, date, enterTime, leaveTime);
            this.dispose();
            GuardCheckPointManage manage = new GuardCheckPointManage();
            manage.setVisible(true);
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        GuardCheckPointManage manage = new GuardCheckPointManage();
        manage.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GuardCheckPointAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardCheckPointAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardCheckPointAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardCheckPointAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuardCheckPointAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel blockLabel1;
    private javax.swing.JSpinner blockSpinner;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel cpIdLabel1;
    private javax.swing.JLabel cpIdTxt1;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel dateTxt1;
    private javax.swing.JTextField errorMessage1;
    private javax.swing.JLabel guardIdLabel1;
    private javax.swing.JLabel guardIdTxt1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel timeLabel1;
    private javax.swing.JLabel timeTxt1;
    private javax.swing.JLabel topLabel1;
    // End of variables declaration//GEN-END:variables

    private void displayData()
    {
       try {
            GuardMain main = new GuardMain();
            String fileName = "CheckpointRecord";
            File file = new File("src/main/java/com/mycompany/textFile/"+fileName+".txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int totalRow = 0;
            while(line != null )
            {
                String[] dataRow = line.split(",");
                for(int i=0; i<dataRow.length; i++)
                {
                    totalRow = Integer.parseInt(dataRow[0].substring(dataRow[0].indexOf("CP")+2));
                }
                line = br.readLine();
            }
            
            br.close();
            
            totalRow = totalRow+1;
            cpIdTxt1.setText("CP"+totalRow);
            guardIdTxt1.setText(main.getId());
            
            String[] blockList = {"-", "A", "B", "C", "D"};
            SpinnerListModel model = new SpinnerListModel(blockList);
            blockSpinner.setModel(model);
            
            Date todayDate = new Date();
            SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
            dateTxt1.setText(sdfDate.format(todayDate));
            
            SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm");
            timeTxt1.setText(sdfTime.format(todayDate));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuardCheckPointAdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GuardCheckPointAdd.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}
