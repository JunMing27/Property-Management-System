/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vendor;

import com.mycompany.resident.statement;

/**
 *
 * @author hoiyi
 */
public class vendorStatementMonthFrame extends javax.swing.JFrame {

    static String idGet;
    
    public vendorStatementMonthFrame(String id) {
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
        statement1 = new javax.swing.JLabel();
        backPageBtn = new javax.swing.JButton();
        nextPageBtn = new javax.swing.JButton();
        statement2 = new javax.swing.JLabel();
        statement3 = new javax.swing.JLabel();
        statement4 = new javax.swing.JLabel();
        statement5 = new javax.swing.JLabel();

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
        topLabel.setText("STATEMENT");

        statement1.setBackground(new java.awt.Color(233, 233, 233));
        statement1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statement1.setForeground(new java.awt.Color(0, 0, 0));
        statement1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statement1.setText("STATEMENT FOR JANUARY 2023");
        statement1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        statement1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statement1MouseClicked(evt);
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

        statement2.setBackground(new java.awt.Color(233, 233, 233));
        statement2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statement2.setForeground(new java.awt.Color(0, 0, 0));
        statement2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statement2.setText("EMPTY");
        statement2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        statement2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statement2MouseClicked(evt);
            }
        });

        statement3.setBackground(new java.awt.Color(233, 233, 233));
        statement3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statement3.setForeground(new java.awt.Color(0, 0, 0));
        statement3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statement3.setText("EMPTY");
        statement3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        statement3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statement3MouseClicked(evt);
            }
        });

        statement4.setBackground(new java.awt.Color(233, 233, 233));
        statement4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statement4.setForeground(new java.awt.Color(0, 0, 0));
        statement4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statement4.setText("EMPTY");
        statement4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        statement4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statement4MouseClicked(evt);
            }
        });

        statement5.setBackground(new java.awt.Color(233, 233, 233));
        statement5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statement5.setForeground(new java.awt.Color(0, 0, 0));
        statement5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statement5.setText("EMPTY");
        statement5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        statement5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statement5MouseClicked(evt);
            }
        });

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(topLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backPageBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(statement2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statement1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statement3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statement4, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statement5, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(nextPageBtn)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextPageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(statement1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statement2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statement3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statement4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statement5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
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
        vendorPaymentMenuFrame option = new vendorPaymentMenuFrame(idGet);
        option.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void statement1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statement1MouseClicked
        if(!statement1.getText().contains("EMPTY") || !statement1.getText().contains("no data"))
        {
            statement main = new statement();
            String labelPassed = statement1.getText();
            String month = labelPassed.substring(0,labelPassed.lastIndexOf(" "));
            String yearPassed = labelPassed.substring(labelPassed.lastIndexOf(" ")+1);
            month = month.substring(month.lastIndexOf(" ") +1);
            String monthPassed = main.monthNumber(month);
            this.dispose();
            vendorStatementTableFrame table = new vendorStatementTableFrame(idGet, monthPassed, yearPassed, labelPassed);
            table.setVisible(true);
        }
    }//GEN-LAST:event_statement1MouseClicked

    private void backPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backPageBtnActionPerformed

        backButtonFunction();
        nextPageBtn.setEnabled(true);
        displayData();
    }//GEN-LAST:event_backPageBtnActionPerformed

    private void nextPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageBtnActionPerformed

        backPageBtn.setEnabled(true);
        displayData();
    }//GEN-LAST:event_nextPageBtnActionPerformed

    private void statement2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statement2MouseClicked
        if(!statement2.getText().contains("EMPTY") || !statement2.getText().contains("no data"))
        {
            statement main = new statement();
            String labelPassed = statement2.getText();
            String month = labelPassed.substring(0,labelPassed.lastIndexOf(" "));
            String yearPassed = labelPassed.substring(labelPassed.lastIndexOf(" ")+1);
            month = month.substring(month.lastIndexOf(" ") +1);
            String monthPassed = main.monthNumber(month);
            this.dispose();
            vendorStatementTableFrame table = new vendorStatementTableFrame(idGet, monthPassed, yearPassed, labelPassed);
            table.setVisible(true);
        }
    }//GEN-LAST:event_statement2MouseClicked

    private void statement3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statement3MouseClicked
        if(!statement3.getText().contains("EMPTY") || !statement3.getText().contains("no data"))
        {
            statement main = new statement();
            String labelPassed = statement3.getText();
            String month = labelPassed.substring(0,labelPassed.lastIndexOf(" "));
            String yearPassed = labelPassed.substring(labelPassed.lastIndexOf(" ")+1);
            month = month.substring(month.lastIndexOf(" ") +1);
            String monthPassed = main.monthNumber(month);
            this.dispose();
            vendorStatementTableFrame table = new vendorStatementTableFrame(idGet, monthPassed, yearPassed, labelPassed);
            table.setVisible(true);
        }
    }//GEN-LAST:event_statement3MouseClicked

    private void statement4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statement4MouseClicked
        if(!statement4.getText().contains("EMPTY") || !statement4.getText().contains("no data"))
        {
            statement main = new statement();
            String labelPassed = statement4.getText();
            String month = labelPassed.substring(0,labelPassed.lastIndexOf(" "));
            String yearPassed = labelPassed.substring(labelPassed.lastIndexOf(" ")+1);
            month = month.substring(month.lastIndexOf(" ") +1);
            String monthPassed = main.monthNumber(month);
            this.dispose();
            vendorStatementTableFrame table = new vendorStatementTableFrame(idGet, monthPassed, yearPassed, labelPassed);
            table.setVisible(true);
        }
    }//GEN-LAST:event_statement4MouseClicked

    private void statement5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statement5MouseClicked
        if(!statement5.getText().contains("EMPTY") || !statement5.getText().contains("no data"))
        {
            statement main = new statement();
            String labelPassed = statement5.getText();
            String month = labelPassed.substring(0,labelPassed.lastIndexOf(" "));
            String yearPassed = labelPassed.substring(labelPassed.lastIndexOf(" ")+1);
            month = month.substring(month.lastIndexOf(" ") +1);
            String monthPassed = main.monthNumber(month);
            this.dispose();
            vendorStatementTableFrame table = new vendorStatementTableFrame(idGet, monthPassed, yearPassed, labelPassed);
            table.setVisible(true);
        }
    }//GEN-LAST:event_statement5MouseClicked

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
            java.util.logging.Logger.getLogger(vendorStatementMonthFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendorStatementMonthFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendorStatementMonthFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendorStatementMonthFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendorStatementMonthFrame(idGet).setVisible(true);
            }
        });
    }

    private int pageLine=-1;
    
    private void setPagination(){
        pageLine=pageLine+1;
    }
    
    public void backButtonFunction(){
        pageLine = pageLine - 10;
        if (pageLine == -1){
            backPageBtn.setEnabled(false);
        }
    }
    
    private void displayData(){
        String extractMonth, extractYear;
        statement main = new statement();
        main.setUserId(idGet);
        setPagination();
        main.displayDataViewOwn(pageLine, "", "statementMonth", "StatementContent");
        boolean boo = main.getStatus();
        if(boo==false){
            nextPageBtn.setEnabled(false);
        }
        if(main.getStatementId()!= null)
        {
            extractMonth = main.getPaidDate();
            extractYear = extractMonth.substring(extractMonth.lastIndexOf("-")+1);
            extractMonth = extractMonth.substring(extractMonth.indexOf("-")+1);
            extractMonth = extractMonth.substring(0,extractMonth.lastIndexOf("-"));
            
            extractMonth = main.monthString(extractMonth);
            statement1.setText("STATEMENT FOR "+extractMonth+" "+extractYear);
        }
        
        
        setPagination();
        main.displayDataViewOwn(pageLine, "", "statementMonth", "StatementContent");
        boolean boo2 = main.getStatus();
        if(boo2==false){
            nextPageBtn.setEnabled(false);
        }
        if(main.getStatementId()!= null)
        {
            extractMonth = main.getPaidDate();
            extractYear = extractMonth.substring(extractMonth.lastIndexOf("-")+1);
            extractMonth = extractMonth.substring(extractMonth.indexOf("-")+1);
            extractMonth = extractMonth.substring(0,extractMonth.lastIndexOf("-"));
            
            extractMonth = main.monthString(extractMonth);
            statement2.setText("STATEMENT FOR "+extractMonth+" "+extractYear);
        }
        
        setPagination();
        main.displayDataViewOwn(pageLine, "", "statementMonth", "StatementContent");
        boolean boo3 = main.getStatus();
        if(boo3==false){
            nextPageBtn.setEnabled(false);
        }
        if(main.getStatementId() != null)
        {
            extractMonth = main.getPaidDate();
            extractYear = extractMonth.substring(extractMonth.lastIndexOf("-")+1);
            extractMonth = extractMonth.substring(extractMonth.indexOf("-")+1);
            extractMonth = extractMonth.substring(0,extractMonth.lastIndexOf("-"));
            
            extractMonth = main.monthString(extractMonth);
            statement3.setText("STATEMENT FOR "+extractMonth+" "+extractYear);
        }
        
        setPagination();
        main.displayDataViewOwn(pageLine, "", "statementMonth", "StatementContent");
        boolean boo4 = main.getStatus();
        if(boo4==false){
            nextPageBtn.setEnabled(false);
        }
        if(main.getStatementId() != null)
        {
            extractMonth = main.getPaidDate();
            extractYear = extractMonth.substring(extractMonth.lastIndexOf("-")+1);
            extractMonth = extractMonth.substring(extractMonth.indexOf("-")+1);
            extractMonth = extractMonth.substring(0,extractMonth.lastIndexOf("-"));
            
            extractMonth = main.monthString(extractMonth);
            statement4.setText("STATEMENT FOR "+extractMonth+" "+extractYear);
        }
        
        setPagination();
        main.displayDataViewOwn(pageLine, "", "statementMonth", "StatementContent");
        boolean boo5 = main.getStatus();
        if(boo5==false){
            nextPageBtn.setEnabled(false);
        }
        if(main.getStatementId() != null)
        {
            extractMonth = main.getPaidDate();
            extractYear = extractMonth.substring(extractMonth.lastIndexOf("-")+1);
            extractMonth = extractMonth.substring(extractMonth.indexOf("-")+1);
            extractMonth = extractMonth.substring(0,extractMonth.lastIndexOf("-"));
            
            extractMonth = main.monthString(extractMonth);
            statement5.setText("STATEMENT FOR "+extractMonth+" "+extractYear);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backPageBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextPageBtn;
    private javax.swing.JLabel statement1;
    private javax.swing.JLabel statement2;
    private javax.swing.JLabel statement3;
    private javax.swing.JLabel statement4;
    private javax.swing.JLabel statement5;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables
}
