/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class ResidentComplaintAddEdit extends javax.swing.JFrame {

    ResidentMain residentMain = new ResidentMain();
    String residentId, id, detail, reply;
    
    static ArrayList<String> dataListGet = new ArrayList<String>();
    static String addEditDetector;
    
    public ResidentComplaintAddEdit(String addEditString, ArrayList<String> dataList) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        residentId = residentMain.getId();
        addEditDetector = addEditString;
        dataListGet = dataList;
        
        if(addEditDetector.equals("edit"))
        {
            displayData(dataListGet);
        }else{
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
        idTxt1 = new javax.swing.JLabel();
        dateLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        replyTxt = new javax.swing.JLabel();
        errorMessage = new javax.swing.JTextField();
        idLabel1 = new javax.swing.JLabel();
        detailLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTxt = new javax.swing.JTextArea();

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
        topLabel.setText("COMPLAINT");

        idTxt1.setBackground(new java.awt.Color(233, 233, 233));
        idTxt1.setForeground(new java.awt.Color(0, 0, 0));
        idTxt1.setText("C1");

        dateLabel1.setBackground(new java.awt.Color(233, 233, 233));
        dateLabel1.setForeground(new java.awt.Color(0, 0, 0));
        dateLabel1.setText("Reply :");

        saveBtn.setBackground(new java.awt.Color(255, 255, 255));
        saveBtn.setForeground(new java.awt.Color(0, 0, 0));
        saveBtn.setText("SAVE");
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelBtn.setText("CANCEL");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        replyTxt.setBackground(new java.awt.Color(233, 233, 233));
        replyTxt.setForeground(new java.awt.Color(0, 0, 0));
        replyTxt.setText("null");

        errorMessage.setEditable(false);
        errorMessage.setBackground(new java.awt.Color(233, 233, 233));
        errorMessage.setForeground(new java.awt.Color(204, 0, 0));
        errorMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorMessage.setBorder(null);

        idLabel1.setBackground(new java.awt.Color(233, 233, 233));
        idLabel1.setForeground(new java.awt.Color(0, 0, 0));
        idLabel1.setText("Complaint ID :");

        detailLabel1.setBackground(new java.awt.Color(233, 233, 233));
        detailLabel1.setForeground(new java.awt.Color(0, 0, 0));
        detailLabel1.setText("Complaint Details :");

        detailTxt.setBackground(new java.awt.Color(233, 233, 233));
        detailTxt.setColumns(20);
        detailTxt.setForeground(new java.awt.Color(0, 0, 0));
        detailTxt.setRows(5);
        jScrollPane1.setViewportView(detailTxt);

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
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel1)
                            .addComponent(idLabel1)
                            .addComponent(detailLabel1))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(replyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel1)
                    .addComponent(idTxt1))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(detailLabel1)
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLabel1)
                            .addComponent(replyTxt))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        ResidentComplaintManage complaint = new ResidentComplaintManage();
        complaint.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        id = idTxt1.getText();
        detail = detailTxt.getText();
        reply = replyTxt.getText();
        
        if(!id.isEmpty() && !detail.isEmpty() )
        {
            int dialog = JOptionPane.showConfirmDialog(null,
                "Are You Sure to Save?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if(dialog == JOptionPane.YES_OPTION){
                removeFromFile("Complaint");
                editFile(id, detail, reply);
                this.dispose();
                ResidentComplaintManage complaint = new ResidentComplaintManage();
                complaint.setVisible(true);
            }
        }else{
            errorMessage.setText("DO NOT LEFT EMPTY DATA !");
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        ResidentComplaintManage complaint = new ResidentComplaintManage();
        complaint.setVisible(true);
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
            java.util.logging.Logger.getLogger(ResidentComplaintAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentComplaintAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentComplaintAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentComplaintAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentComplaintAddEdit(addEditDetector,dataListGet).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel detailLabel1;
    private javax.swing.JTextArea detailTxt;
    private javax.swing.JTextField errorMessage;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel idTxt1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel replyTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables


    private void displayData(ArrayList<String> dataListGet)
    {
        idTxt1.setText(dataListGet.get(0));
        detailTxt.setText(dataListGet.get(1));
        replyTxt.setText(dataListGet.get(2));
    }

    private  ArrayList<ArrayList<String>> allUserDataInfo(String textFile) throws FileNotFoundException 
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
    
    
    private void removeFromFile(String fileName)
    {
        try {
            String filePath = "src/main/java/com/mycompany/textFile/"+fileName+".txt";
            ArrayList<ArrayList<String>> allUsers = allUserDataInfo(filePath);
            for(int j=0;j<allUsers.size();j++)
            {
                if(allUsers.get(j).get(3).equals(residentId)
                            && allUsers.get(j).get(0).equals(idTxt1.getText()))
                    {
                        allUsers.remove(j);
                        break;
                    }
            }

            File file= new File(filePath);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int j=0; j<allUsers.size(); j++) 
            {
                ArrayList<String>item = allUsers.get(j);
                for(int k=0; k<item.size(); k++)
                {
                    if(k == item.size()-1)
                    {
                       bw.write(item.get(k));
                    }else{
                       bw.write(item.get(k)+",");
                    }
                }
                bw.write("\n");
            }
            bw.close();
            
        }catch (IOException ex) {
            Logger.getLogger(ResidentComplaintAddEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    private void editFile(String id, String detail, String reply)
    {
        try {
            String fileName = "Complaint";
            File file = new File("src/main/java/com/mycompany/textFile/"+fileName+".txt");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(id+","
                    +detail+","
                    +reply+","
                    +residentId+"\n");

            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(ResidentComplaintAddEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    private void emptyData()
    {
        try {
            String fileName = "Complaint";
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
                    totalRow = Integer.parseInt(dataRow[0].substring(dataRow[0].indexOf("C")+1));
                }
                line = br.readLine();
            }
            
            br.close();
            
            totalRow = totalRow+1;
            idTxt1.setText("C"+totalRow);
            detailTxt.setText("");
            replyTxt.setText("");
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ResidentComplaintAddEdit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ResidentComplaintAddEdit.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    



}