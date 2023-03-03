/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.AccExecutive;

//import com.mycompany.AccExecutive.AccExecMain;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author edi
 */
public class AccExecAddEditStatement extends javax.swing.JFrame {

    /**
     * Creates new form AccExecAddEditStatement
     */
    public AccExecAddEditStatement() {
        initComponents();
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
        BackBtn = new javax.swing.JButton();
        addEditBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        StatementIDField = new javax.swing.JTextField();
        UserIDField = new javax.swing.JTextField();
        UsernameField = new javax.swing.JTextField();
        PaidAmountField = new javax.swing.JTextField();
        PaidDateField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        DescriptionField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BackBtn.setBackground(new java.awt.Color(204, 204, 204));
        BackBtn.setForeground(new java.awt.Color(0, 0, 0));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        addEditBtn.setBackground(new java.awt.Color(204, 204, 204));
        addEditBtn.setForeground(new java.awt.Color(0, 0, 0));
        addEditBtn.setText("Update/ Add Payment");
        addEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEditBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Statement ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Paid Date");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("User ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Paid Amount");

        StatementIDField.setBackground(new java.awt.Color(255, 255, 255));
        StatementIDField.setForeground(new java.awt.Color(0, 0, 0));
        StatementIDField.setEnabled(false);

        UserIDField.setBackground(new java.awt.Color(255, 255, 255));
        UserIDField.setForeground(new java.awt.Color(0, 0, 0));

        UsernameField.setBackground(new java.awt.Color(255, 255, 255));
        UsernameField.setForeground(new java.awt.Color(0, 0, 0));

        PaidAmountField.setBackground(new java.awt.Color(255, 255, 255));
        PaidAmountField.setForeground(new java.awt.Color(0, 0, 0));

        PaidDateField.setBackground(new java.awt.Color(255, 255, 255));
        PaidDateField.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Description");

        DescriptionField.setBackground(new java.awt.Color(255, 255, 255));
        DescriptionField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StatementIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaidAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaidDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addEditBtn)
                .addGap(201, 201, 201))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatementIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PaidDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PaidAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(addEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    StatementID, UserID, Username, Paid Date, Paid Amount, Description
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        this.dispose();
        AccExecStatementManage AccExecStatement = new AccExecStatementManage();
        AccExecStatement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AccExecStatement.pack();
        AccExecStatement.setResizable(false);
        AccExecStatement.setLocationRelativeTo(null);
        AccExecStatement.setVisible(true);
        AccExecStatement.backButtonToggle();
        //Run Method in BusManUserManage to set UserType and Data
        AccExecStatement.setStatementData();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void addEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEditBtnActionPerformed
        // TODO add your handling code here:
        if(addEditDetector=="edit"){
            
            accountExecutive main = new accountExecutive();
            ArrayList<String> dataList = new ArrayList<String>();
            dataList.add(StatementIDField.getText());
            dataList.add(UserIDField.getText());
            dataList.add(UsernameField.getText());
            dataList.add(PaidDateField.getText());
            dataList.add(PaidAmountField.getText());
            dataList.add(DescriptionField.getText());
            main.editOrAddData(dataList, "Statement","StatementContent.txt","edit");
//            
        }else if(addEditDetector=="add"){
            
            accountExecutive main = new accountExecutive();
            accountExecutive.accountExecutiveMethod mainInner = main.new accountExecutiveMethod();
            statement statementClass = new statement();
            ArrayList<String> dataList = new ArrayList<String>();
            statementClass.getIncreasedID("StatementContent.txt","Statement");
            dataList.add(statementClass.getstatementId());
            dataList.add(UserIDField.getText());
            dataList.add(UsernameField.getText());
            dataList.add(PaidDateField.getText());
            dataList.add(PaidAmountField.getText());
            dataList.add(DescriptionField.getText());
            System.out.println(dataList);
            mainInner.addEditPayment(dataList,"Statement","StatementContent.txt","add");

        }
    }//GEN-LAST:event_addEditBtnActionPerformed

    private String addEditDetector;   
    private String fileType="StatementContent.txt";
    private String userType="Statement";
    
    
    public void addEditDetect(String functionType,String id) throws FileNotFoundException{
        if(functionType=="edit"){
            this.addEditDetector="edit";
            statement statementClass = new statement();
            statementClass.chooseTxtFile("Statement");
            statementClass.getDataViewSingle(id, fileType,userType);
//            payment.paymentMethod mainInner = employeeJobClass.new employeeJobMethod();

            addEditBtn.setText("Update");
            StatementIDField.setText(statementClass.getstatementId());
            UserIDField.setText(statementClass.getuserId());
            UsernameField.setText(statementClass.getuserName());
            PaidDateField.setText(statementClass.getpaidDate());
            PaidAmountField.setText(statementClass.getpaidAmount());
            DescriptionField.setText(statementClass.getpaymentDesc());
            
        }else if (functionType=="add"){
            this.addEditDetector="add";
            addEditBtn.setText("Add");
            StatementIDField.setVisible(false);
            jLabel1.setVisible(false);
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
            java.util.logging.Logger.getLogger(AccExecAddEditStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccExecAddEditStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccExecAddEditStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccExecAddEditStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccExecAddEditStatement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField DescriptionField;
    private javax.swing.JTextField PaidAmountField;
    private javax.swing.JTextField PaidDateField;
    private javax.swing.JTextField StatementIDField;
    private javax.swing.JTextField UserIDField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JButton addEditBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
