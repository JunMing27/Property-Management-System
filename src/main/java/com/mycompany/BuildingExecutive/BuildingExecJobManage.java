/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.BuildingExecutive;

import com.mycompany.mavenproject1.AdminExecComAddEdit;
import com.mycompany.mavenproject1.AdminExecOption;
import com.mycompany.mavenproject1.AdminExecutiveMain;
import com.mycompany.mavenproject1.BusManBudgetPlanningView;
import com.mycompany.mavenproject1.BusManUserManageOption;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.io.*; 
import com.mycompany.BuildingExecutive.ModelJob;

/**
 *
 * @author user
 */
public class BuildingExecJobManage extends javax.swing.JFrame {

    String userId;

    /**
     * Creates new form BuildingExecJobManage
     */
    public BuildingExecJobManage() {
        initComponents();
    }
    public BuildingExecJobManage(String userId) {
        this();
        this.userId = userId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        DataPanel = new JPanel();
        HeaderPanel = new JPanel();
        // NavigationPanel = new JPanel();

        OptionBuildingExecJobManage = new javax.swing.JButton();
        AddNewBuildingExecJobManage = new javax.swing.JButton();

        OptionBuildingExecJobManage.setBackground(new java.awt.Color(204, 204, 204));
        OptionBuildingExecJobManage.setForeground(new java.awt.Color(0, 0, 0));
        OptionBuildingExecJobManage.setText("Back");
        OptionBuildingExecJobManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                BuildingExecMain nextFrame = new BuildingExecMain();
                nextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nextFrame.pack();
                nextFrame.setResizable(false);
                nextFrame.setLocationRelativeTo(null);
                nextFrame.setVisible(true);
            }
        });

        AddNewBuildingExecJobManage.setBackground(new java.awt.Color(204, 204, 204));
        AddNewBuildingExecJobManage.setForeground(new java.awt.Color(0, 0, 0));
        AddNewBuildingExecJobManage.setText("Add New");
        AddNewBuildingExecJobManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // AddNewBuildingExecJobManageActionPerformed(evt);
                changeFrame(new ModelJob());
            }
        });

        HeaderPanel.setBackground(new java.awt.Color(254, 204, 204));
        // NavigationPanel.setBackground(new java.awt.Color(254, 204, 254));


        JTextField searchTf = new JTextField("Enter Job Id", 20);
        JButton searchBtn = new JButton("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {


                String fileName = "./com/mycompany/textFile/EmployeeJob.txt";
                String idToSearch = searchTf.getText();

                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.startsWith(idToSearch.split(",")[0])) {
                            changeFrame(new ModelJob(line));
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Error reading file: " + e.getMessage());
                }

            }
        });

        add(HeaderPanel, BorderLayout.PAGE_START);
        HeaderPanel.add(OptionBuildingExecJobManage, BorderLayout.LINE_START);
        HeaderPanel.add(searchTf, BorderLayout.LINE_END);
        HeaderPanel.add(searchBtn, BorderLayout.LINE_END);
        HeaderPanel.add(AddNewBuildingExecJobManage, BorderLayout.LINE_END);

        add(new JScrollPane(DataPanel));
        DataPanel.setSize(500, 450);
        DataPanel.setLayout(new BoxLayout(DataPanel, BoxLayout.Y_AXIS));

        String fileName = "./com/mycompany/textFile/EmployeeJob.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                newJob(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        DataPanel.setBackground(Color.BLUE);
        setSize(500, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void changeFrame(ModelJob job) {
        dispose();
        BuildingExecJobView nextFrame = new BuildingExecJobView(job);
        nextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // nextFrame.pack();
        // nextFrame.setResizable(false);
        nextFrame.setLocationRelativeTo(null);
        nextFrame.setVisible(true);
    }

    private void newJob(String line) {
        ModelJob job = new ModelJob(line);
        JPanel jobPanel = new JPanel();

        jobPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black), new EmptyBorder(0,40,0,0)));
        // jobPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // jobPanel.setBorder();
        jobPanel.setPreferredSize(new Dimension(300, 180));
        jobPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;


        jobPanel.add(new JLabel("Job ID: "), gbc);
        gbc.gridy++;
        jobPanel.add(new JLabel("Employee Name: "), gbc);
        gbc.gridy++;
        jobPanel.add(new JLabel("Employee Job: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        jobPanel.add(new JLabel(job.getJobId()), gbc);
        gbc.gridy++;
        jobPanel.add(new JLabel(job.getEmployeeName()), gbc);
        gbc.gridy++;
        jobPanel.add(new JLabel(job.getEmployeeJob()), gbc);

        JButton viewBtn = new JButton("View Details");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFrame(job);
            }
        });

        JButton removeBtn = new JButton("Remove Details");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                String fileName = "./com/mycompany/textFile/EmployeeJob.txt";
                String lineToRemove = job.toString();

                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (!line.trim().equals(lineToRemove)) {
                            sb.append(line).append("\n");
                        }
                    }
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
                        bw.write(sb.toString());
                    } catch (IOException e) {
                        System.err.println("Error writing to file: " + e.getMessage());
                    }
                } catch (IOException e) {
                    System.err.println("Error reading file: " + e.getMessage());
                }

                System.out.println("REMOVED! "+job);
                DataPanel.remove(jobPanel);
                invalidate();
                validate();
                repaint();
            }
        });

        gbc.gridx = 2;
        gbc.gridy = 1;
        jobPanel.add(viewBtn, gbc);
        gbc.gridy = 2;
        jobPanel.add(removeBtn, gbc);

        DataPanel.add(jobPanel, BorderLayout.CENTER);
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
            java.util.logging.Logger.getLogger(BuildingExecJobManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildingExecJobManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildingExecJobManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildingExecJobManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuildingExecJobManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DataPanel;
    private javax.swing.JPanel HeaderPanel;
    // private javax.swing.JPanel NavigationPanel;

    private javax.swing.JButton AddNewBuildingExecJobManage;
    private javax.swing.JButton OptionBuildingExecJobManage;
    // private javax.swing.JButton BackBuildingExecJobManage;
    // private javax.swing.JButton NextBuildingExecJobManage;

    // End of variables declaration//GEN-END:variables
}
