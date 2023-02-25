/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visitor;

import com.mycompany.mavenproject1.LoginPage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoiyi
 */
public class checkVisitorPassFrame extends javax.swing.JFrame {

    /**
     * Creates new form checkVisitorPassFrame
     */
    public checkVisitorPassFrame() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        invalidLabel.setVisible(false);
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
        nameLabel1 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        accessBtn = new javax.swing.JButton();
        invalidLabel = new javax.swing.JLabel();

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
        idLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        idLabel1.setForeground(new java.awt.Color(0, 0, 0));
        idLabel1.setText("Visitor Pass ID :");

        nameLabel1.setBackground(new java.awt.Color(233, 233, 233));
        nameLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        nameLabel1.setText("Visitor Name :");

        idTxt.setBackground(new java.awt.Color(233, 233, 233));
        idTxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        idTxt.setForeground(new java.awt.Color(0, 0, 0));

        nameTxt.setBackground(new java.awt.Color(233, 233, 233));
        nameTxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(0, 0, 0));

        accessBtn.setBackground(new java.awt.Color(233, 233, 233));
        accessBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        accessBtn.setForeground(new java.awt.Color(0, 0, 0));
        accessBtn.setText("ACCESS");
        accessBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessBtnActionPerformed(evt);
            }
        });

        invalidLabel.setBackground(new java.awt.Color(233, 233, 233));
        invalidLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        invalidLabel.setForeground(new java.awt.Color(255, 0, 0));
        invalidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invalidLabel.setText("Your Visitor Pass Is Invalid !");

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
                        .addGap(206, 206, 206)
                        .addComponent(topLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idLabel1)
                            .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(invalidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(accessBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel1)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel1)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(accessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(invalidLabel)
                .addGap(76, 76, 76))
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
        
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void accessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessBtnActionPerformed
        String id = idTxt.getText();
        String name = nameTxt.getText();
        String status = "";
        try{
            File file = new File("src/main/java/com/mycompany/textFile/VisitorPass.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null )
            {
                String[] dataRow = line.split(",");
                if(dataRow[0].equals(id) && dataRow[1].equals(name))
                {
                    status = dataRow[4];
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(checkVisitorPassFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(checkVisitorPassFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(status.equals("Valid"))
        {
            invalidLabel.setVisible(false);
            this.dispose();
            visitorViewVisitorPassFrame view = new visitorViewVisitorPassFrame(id);
            view.setVisible(true);
        }else if(status.equals("Invalid"))
        {
            invalidLabel.setText("Your Visitor Pass Is Invalid !");
            invalidLabel.setVisible(true);
        }else{
            invalidLabel.setText("Wrong Visitor Id or Visitor Name");
            invalidLabel.setVisible(true);
        }
    }//GEN-LAST:event_accessBtnActionPerformed

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
            java.util.logging.Logger.getLogger(checkVisitorPassFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkVisitorPassFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkVisitorPassFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkVisitorPassFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkVisitorPassFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accessBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel invalidLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables
}
