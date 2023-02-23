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
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GuardVisEntryAddEdit extends javax.swing.JFrame {

    String id,name,date,enterTime,leaveTime; 
    static ArrayList<String> dataListGet;
    static String addEditDetector;
    
    public GuardVisEntryAddEdit(String addEditString, ArrayList<String> dataList) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        dataListGet = new ArrayList<String>();
        addEditDetector = addEditString;
        dataListGet = dataList;
        
        String pattern = "dd-MM-YYYY";
        jDateChooser1.setDateFormatString(pattern);
        enterTimePicker.setTimeToNow();
        
        if(addEditDetector.equals("edit"))
        {
            jDateChooser1.setVisible(false);
            enterTimePicker.setVisible(false);
            displayData(dataListGet);
        }else{
            dateTxt.setVisible(false);
            enterTimeTxt.setVisible(false);
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
        statusLabel2 = new javax.swing.JLabel();
        enterTimePicker = new com.github.lgooddatepicker.components.TimePicker();
        leaveTimePicker = new com.github.lgooddatepicker.components.TimePicker();
        enterTimeTxt = new javax.swing.JLabel();

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
        topLabel.setText("VISITOR ENTRY");

        idLabel1.setBackground(new java.awt.Color(233, 233, 233));
        idLabel1.setForeground(new java.awt.Color(0, 0, 0));
        idLabel1.setText("Visitor Entry ID :");

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
        statusLabel1.setText("Enter Time :");

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

        statusLabel2.setBackground(new java.awt.Color(233, 233, 233));
        statusLabel2.setForeground(new java.awt.Color(0, 0, 0));
        statusLabel2.setText("Leave Time :");

        enterTimeTxt.setBackground(new java.awt.Color(233, 233, 233));
        enterTimeTxt.setForeground(new java.awt.Color(0, 0, 0));
        enterTimeTxt.setText("02:00");

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
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusLabel1)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel1)
                            .addComponent(nameLabel1)
                            .addComponent(idLabel1)
                            .addComponent(statusLabel2))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leaveTimePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(enterTimeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(56, 56, 56)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterTimePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(idTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(topLabel)))
                .addContainerGap(46, Short.MAX_VALUE))
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
                    .addComponent(enterTimePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterTimeTxt))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel2)
                    .addComponent(leaveTimePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        VisitorPassManage visitorPass = new VisitorPassManage();
        visitorPass.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        id = idTxt1.getText();
        name = nameTxt.getText();
        String pattern = "dd-MM-YYYY";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
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
        if(enterTimePicker.isVisible())
        {
            enterTime = enterTimePicker.getText();
            if(enterTime.contains("a"))
            {
                enterTime = enterTime.substring(0,enterTime.lastIndexOf("a"));
                
            }else if(enterTime.contains("p"))
            {
                enterTime = enterTime.substring(0,enterTime.lastIndexOf("p"));
                String hour = enterTime.substring(0,enterTime.indexOf(":"));
                String minute = enterTime.substring(enterTime.indexOf(":")+1);
                Integer hourInt = Integer.parseInt(hour);
                hourInt = hourInt+12;
                hour = hourInt.toString();
                enterTime = hour+":"+minute;
            }
        }else{
            enterTime = enterTimeTxt.getText();
        }
        
        leaveTime = leaveTimePicker.getText();
        if(enterTime.contains("a"))
            {
                leaveTime = leaveTime.substring(0,leaveTime.lastIndexOf("a"));
            }else if(leaveTime.contains("p"))
            {
                leaveTime = leaveTime.substring(0,leaveTime.lastIndexOf("p"));
                String hour = leaveTime.substring(0,leaveTime.indexOf(":"));
                String minute = leaveTime.substring(leaveTime.indexOf(":")+1);
                Integer hourInt = Integer.parseInt(hour);
                hourInt = hourInt+12;
                hour = hourInt.toString();
                leaveTime = hour+":"+minute;
            }
        if(leaveTime.isEmpty() || leaveTime.isBlank())
        {
            leaveTime = "-";
        }
        if(!id.isEmpty() && !name.isEmpty() && !date.isEmpty() && !enterTime.isEmpty())
        {
            if(!id.isBlank()&& !name.isBlank()&& !date.isBlank()&& !enterTime.isBlank())
            {
                int dialog = JOptionPane.showConfirmDialog(null,
                    "DATE and TIME Cannot be Changed After Saved", "Confirmation", JOptionPane.YES_NO_OPTION);
                if(dialog == JOptionPane.YES_OPTION){
                    if(addEditDetector.equals("edit"))
                    {
                        removeFromFile("VisitorEntry");
                    }
                    editFile(id, name, date, enterTime, leaveTime);
                    this.dispose();
                    GuardVisEntryManage visitorEntry = new GuardVisEntryManage();
                    visitorEntry.setVisible(true);
                }
            }else{  
                errorMessage.setText("Name/Date/Enter Time is Empty!");
            }
        }else{
            errorMessage.setText("Name/Date/Enter Time is Empty!");
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        VisitorPassManage visitorPass = new VisitorPassManage();
        visitorPass.setVisible(true);
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
            java.util.logging.Logger.getLogger(GuardVisEntryAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardVisEntryAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardVisEntryAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardVisEntryAddEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuardVisEntryAddEdit(addEditDetector,dataListGet).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel dateTxt;
    private com.github.lgooddatepicker.components.TimePicker enterTimePicker;
    private javax.swing.JLabel enterTimeTxt;
    private javax.swing.JTextField errorMessage;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JLabel idTxt1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private com.github.lgooddatepicker.components.TimePicker leaveTimePicker;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel statusLabel1;
    private javax.swing.JLabel statusLabel2;
    private javax.swing.JLabel topLabel;
    // End of variables declaration//GEN-END:variables

    private void displayData(ArrayList<String> dataListGet)
    {
        idTxt1.setText(dataListGet.get(0));
        nameTxt.setText(dataListGet.get(1));
        dateTxt.setText(dataListGet.get(2));
        enterTimeTxt.setText(dataListGet.get(3));
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
                if(allUsers.get(j).get(0).equals(idTxt1.getText()))
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
            Logger.getLogger(GuardVisEntryAddEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }

    
    private void editFile(String id, String name, String date, String enterTime, String leaveTime)
    {
        try {
            String fileName = "VisitorEntry";
            File file = new File("src/main/java/com/mycompany/textFile/"+fileName+".txt");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(id+","
                    +name+","
                    +date+","
                    +enterTime+","
                    +leaveTime+"\n");
            
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(GuardVisEntryAddEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    private void emptyData()
    {
        try {
            String fileName = "VisitorEntry";
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
                    totalRow = Integer.parseInt(dataRow[0].substring(dataRow[0].indexOf("VE")+2));
                }
                line = br.readLine();
            }
            
            br.close();
            
            totalRow = totalRow+1;
            idTxt1.setText("VE"+totalRow);
            nameTxt.setText("");
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuardVisEntryAddEdit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GuardVisEntryAddEdit.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
