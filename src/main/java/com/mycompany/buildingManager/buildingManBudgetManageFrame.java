/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.buildingManager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jun Ming
 */
public class buildingManBudgetManageFrame extends javax.swing.JFrame {

    /**
     * Creates new form buildingManBudgetManageFrame
     */
    public buildingManBudgetManageFrame(){
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
        jPanel2 = new javax.swing.JPanel();
        ProjectTitle1 = new javax.swing.JLabel();
        ProjectBudgetTitle1 = new javax.swing.JLabel();
        ProjectIdTitle1 = new javax.swing.JLabel();
        viewDetailBtn1 = new javax.swing.JButton();
        ProjectIdLabel1 = new javax.swing.JLabel();
        ProjectTitleLabel1 = new javax.swing.JLabel();
        ProjectBudgetLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        backBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ProjectTitle2 = new javax.swing.JLabel();
        ProjectBudgetTitle2 = new javax.swing.JLabel();
        ProjectIdTitle2 = new javax.swing.JLabel();
        viewDetailBtn2 = new javax.swing.JButton();
        ProjectIdLabel2 = new javax.swing.JLabel();
        ProjectTitleLabel2 = new javax.swing.JLabel();
        ProjectBudgetLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        ProjectTitle3 = new javax.swing.JLabel();
        ProjectBudgetTitle3 = new javax.swing.JLabel();
        ProjectIdTitle3 = new javax.swing.JLabel();
        viewDetailBtn3 = new javax.swing.JButton();
        ProjectIdLabel3 = new javax.swing.JLabel();
        ProjectTitleLabel3 = new javax.swing.JLabel();
        ProjectBudgetLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        nextPage = new javax.swing.JButton();
        previousPage = new javax.swing.JButton();
        addNewBudgetPlanning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        ProjectTitle1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProjectTitle1.setForeground(new java.awt.Color(0, 0, 0));
        ProjectTitle1.setText("Project Title");

        ProjectBudgetTitle1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProjectBudgetTitle1.setForeground(new java.awt.Color(0, 0, 0));
        ProjectBudgetTitle1.setText("Project Budget");

        ProjectIdTitle1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProjectIdTitle1.setForeground(new java.awt.Color(0, 0, 0));
        ProjectIdTitle1.setText("Project ID");
        ProjectIdTitle1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        viewDetailBtn1.setBackground(new java.awt.Color(204, 204, 204));
        viewDetailBtn1.setForeground(new java.awt.Color(0, 0, 0));
        viewDetailBtn1.setText("View Details");
        viewDetailBtn1.setBorder(null);
        viewDetailBtn1.setBorderPainted(false);
        viewDetailBtn1.setContentAreaFilled(false);
        viewDetailBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewDetailBtn1.setFocusPainted(false);
        viewDetailBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailBtn1ActionPerformed(evt);
            }
        });

        ProjectIdLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ProjectIdLabel1.setText("jLabel4");

        ProjectTitleLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ProjectTitleLabel1.setText("jLabel5");

        ProjectBudgetLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ProjectBudgetLabel1.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProjectIdLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProjectIdTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProjectTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectTitleLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProjectBudgetTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectBudgetLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175)
                .addComponent(viewDetailBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectIdTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectBudgetTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectTitleLabel1)
                    .addComponent(ProjectIdLabel1)
                    .addComponent(ProjectBudgetLabel1))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(viewDetailBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setForeground(new java.awt.Color(0, 0, 0));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        ProjectTitle2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProjectTitle2.setForeground(new java.awt.Color(0, 0, 0));
        ProjectTitle2.setText("Project Title");

        ProjectBudgetTitle2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProjectBudgetTitle2.setForeground(new java.awt.Color(0, 0, 0));
        ProjectBudgetTitle2.setText("Project Budget");

        ProjectIdTitle2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProjectIdTitle2.setForeground(new java.awt.Color(0, 0, 0));
        ProjectIdTitle2.setText("Project ID");
        ProjectIdTitle2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        viewDetailBtn2.setBackground(new java.awt.Color(204, 204, 204));
        viewDetailBtn2.setForeground(new java.awt.Color(0, 0, 0));
        viewDetailBtn2.setText("View Details");
        viewDetailBtn2.setBorder(null);
        viewDetailBtn2.setBorderPainted(false);
        viewDetailBtn2.setContentAreaFilled(false);
        viewDetailBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewDetailBtn2.setFocusPainted(false);
        viewDetailBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailBtn2ActionPerformed(evt);
            }
        });

        ProjectIdLabel2.setForeground(new java.awt.Color(0, 0, 0));
        ProjectIdLabel2.setText("jLabel4");

        ProjectTitleLabel2.setForeground(new java.awt.Color(0, 0, 0));
        ProjectTitleLabel2.setText("jLabel5");

        ProjectBudgetLabel2.setForeground(new java.awt.Color(0, 0, 0));
        ProjectBudgetLabel2.setText("jLabel6");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProjectIdLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProjectIdTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProjectTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectTitleLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jSeparator5))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProjectBudgetTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectBudgetLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175)
                .addComponent(viewDetailBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectIdTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectBudgetTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectTitleLabel2)
                    .addComponent(ProjectIdLabel2)
                    .addComponent(ProjectBudgetLabel2))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(viewDetailBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        ProjectTitle3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProjectTitle3.setForeground(new java.awt.Color(0, 0, 0));
        ProjectTitle3.setText("Project Title");

        ProjectBudgetTitle3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProjectBudgetTitle3.setForeground(new java.awt.Color(0, 0, 0));
        ProjectBudgetTitle3.setText("Project Budget");

        ProjectIdTitle3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProjectIdTitle3.setForeground(new java.awt.Color(0, 0, 0));
        ProjectIdTitle3.setText("Project ID");
        ProjectIdTitle3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        viewDetailBtn3.setBackground(new java.awt.Color(204, 204, 204));
        viewDetailBtn3.setForeground(new java.awt.Color(0, 0, 0));
        viewDetailBtn3.setText("View Details");
        viewDetailBtn3.setBorder(null);
        viewDetailBtn3.setBorderPainted(false);
        viewDetailBtn3.setContentAreaFilled(false);
        viewDetailBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewDetailBtn3.setFocusPainted(false);
        viewDetailBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailBtn3ActionPerformed(evt);
            }
        });

        ProjectIdLabel3.setForeground(new java.awt.Color(0, 0, 0));
        ProjectIdLabel3.setText("jLabel4");

        ProjectTitleLabel3.setForeground(new java.awt.Color(0, 0, 0));
        ProjectTitleLabel3.setText("jLabel5");

        ProjectBudgetLabel3.setForeground(new java.awt.Color(0, 0, 0));
        ProjectBudgetLabel3.setText("jLabel6");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProjectIdLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProjectIdTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProjectTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectTitleLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jSeparator8))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProjectBudgetTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectBudgetLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175)
                .addComponent(viewDetailBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectIdTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProjectBudgetTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProjectTitleLabel3)
                    .addComponent(ProjectIdLabel3)
                    .addComponent(ProjectBudgetLabel3))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(viewDetailBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        nextPage.setBackground(new java.awt.Color(255, 255, 255));
        nextPage.setForeground(new java.awt.Color(0, 0, 0));
        nextPage.setText("Next");
        nextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageActionPerformed(evt);
            }
        });

        previousPage.setBackground(new java.awt.Color(255, 255, 255));
        previousPage.setForeground(new java.awt.Color(0, 0, 0));
        previousPage.setText("Back");
        previousPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPageActionPerformed(evt);
            }
        });

        addNewBudgetPlanning.setBackground(new java.awt.Color(255, 255, 255));
        addNewBudgetPlanning.setForeground(new java.awt.Color(0, 0, 0));
        addNewBudgetPlanning.setText("Add new");
        addNewBudgetPlanning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewBudgetPlanningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addNewBudgetPlanning, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNewBudgetPlanning, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousPage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailBtn1ActionPerformed
        // TODO add your handling code here:
        if(!ProjectIdLabel1.getText().equals("no data")){
            this.dispose();
            buildingManBudgetSingleViewFrame singleView = new buildingManBudgetSingleViewFrame();
            singleView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            singleView.pack();
            singleView.setResizable(false);
            singleView.setLocationRelativeTo(null);
            singleView.setVisible(true);
            try {
                singleView.setDataViewSingle(ProjectIdLabel1.getText());
            } catch (FileNotFoundException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty record", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewDetailBtn1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManagerMenuFrame mainMenu = new buildingManagerMenuFrame();
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.pack();
        mainMenu.setResizable(false);
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewDetailBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailBtn2ActionPerformed
        // TODO add your handling code here:
        if(!ProjectIdLabel2.getText().equals("no data")){
            this.dispose();
            buildingManBudgetSingleViewFrame singleView = new buildingManBudgetSingleViewFrame();
            singleView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            singleView.pack();
            singleView.setResizable(false);
            singleView.setLocationRelativeTo(null);
            singleView.setVisible(true);
            try {
                singleView.setDataViewSingle(ProjectIdLabel2.getText());
            } catch (FileNotFoundException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty record", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewDetailBtn2ActionPerformed

    private void viewDetailBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailBtn3ActionPerformed
        // TODO add your handling code here:
        if(!ProjectIdLabel3.getText().equals("no data")){
            this.dispose();
            buildingManBudgetSingleViewFrame singleView = new buildingManBudgetSingleViewFrame();
            singleView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            singleView.pack();
            singleView.setResizable(false);
            singleView.setLocationRelativeTo(null);
            singleView.setVisible(true);
            try {
                singleView.setDataViewSingle(ProjectIdLabel3.getText());
            } catch (FileNotFoundException ex) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "This is an empty record", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewDetailBtn3ActionPerformed

    private void nextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageActionPerformed
        // TODO add your handling code here:
        previousPage.setEnabled(true);
        setBudgetPlanData();
    }//GEN-LAST:event_nextPageActionPerformed

    private void previousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPageActionPerformed
        // TODO add your handling code here:
        backButtonFunction();
        setBudgetPlanData();
        nextPage.setEnabled(true);
    }//GEN-LAST:event_previousPageActionPerformed

    private void addNewBudgetPlanningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBudgetPlanningActionPerformed
        // TODO add your handling code here:
        this.dispose();
        buildingManBudgetAddEditFrame budgetAddEdit = new buildingManBudgetAddEditFrame();
        budgetAddEdit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        budgetAddEdit.pack();
        budgetAddEdit.setResizable(false);
        budgetAddEdit.setLocationRelativeTo(null);
        budgetAddEdit.setVisible(true);
        try {
            budgetAddEdit.addEditDetect("add","");
        } catch (FileNotFoundException ex) {
        }
    }//GEN-LAST:event_addNewBudgetPlanningActionPerformed

    private Integer PageLine=-1;
    
    public void setPagination(){
        PageLine=PageLine+1;
    }
    
    private String searchTxt ="";
    
    public void backButtonToggle(){
        previousPage.setEnabled(false);
}
    
    public void backButtonFunction(){
        PageLine = PageLine -6;
        if (PageLine==-1){
            previousPage.setEnabled(false);
        }
    }
    
    public void setBudgetPlanData(){
        budgetPlan budgetClass = new budgetPlan();
        setPagination();
        budgetClass.displayDataView(PageLine,searchTxt,"budget");
        boolean boo = budgetClass.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        if(budgetClass.getBudgetId() !=null){
            ProjectIdLabel1.setText(budgetClass.getBudgetId());
            ProjectTitleLabel1.setText(budgetClass.getBudgetProjectName());
            ProjectBudgetLabel1.setText(budgetClass.getBudgetProjectBudget());
        }else{
            ProjectIdLabel1.setText("no data");
            ProjectTitleLabel1.setText("no data");
            ProjectBudgetLabel1.setText("no data");
        }
        setPagination();
        budgetClass.displayDataView(PageLine,searchTxt,"budget");
        boo = budgetClass.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        if(budgetClass.getBudgetId() !=null){
            ProjectIdLabel2.setText(budgetClass.getBudgetId());
            ProjectTitleLabel2.setText(budgetClass.getBudgetProjectName());
            ProjectBudgetLabel2.setText(budgetClass.getBudgetProjectBudget());
        }else{
            ProjectIdLabel2.setText("no data");
            ProjectTitleLabel2.setText("no data");
            ProjectBudgetLabel2.setText("no data");
        }
        setPagination();
        budgetClass.displayDataView(PageLine,searchTxt,"budget");
        boo = budgetClass.getStatus();
        if(boo==false){
            nextPage.setEnabled(false);
        }
        if(budgetClass.getBudgetId() !=null){
            ProjectIdLabel3.setText(budgetClass.getBudgetId());
            ProjectTitleLabel3.setText(budgetClass.getBudgetProjectName());
            ProjectBudgetLabel3.setText(budgetClass.getBudgetProjectBudget());
        }else{
            ProjectIdLabel3.setText("no data");
            ProjectTitleLabel3.setText("no data");
            ProjectBudgetLabel3.setText("no data");
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
            java.util.logging.Logger.getLogger(buildingManBudgetManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buildingManBudgetManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buildingManBudgetManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buildingManBudgetManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buildingManBudgetManageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProjectBudgetLabel1;
    private javax.swing.JLabel ProjectBudgetLabel2;
    private javax.swing.JLabel ProjectBudgetLabel3;
    private javax.swing.JLabel ProjectBudgetTitle1;
    private javax.swing.JLabel ProjectBudgetTitle2;
    private javax.swing.JLabel ProjectBudgetTitle3;
    private javax.swing.JLabel ProjectIdLabel1;
    private javax.swing.JLabel ProjectIdLabel2;
    private javax.swing.JLabel ProjectIdLabel3;
    private javax.swing.JLabel ProjectIdTitle1;
    private javax.swing.JLabel ProjectIdTitle2;
    private javax.swing.JLabel ProjectIdTitle3;
    private javax.swing.JLabel ProjectTitle1;
    private javax.swing.JLabel ProjectTitle2;
    private javax.swing.JLabel ProjectTitle3;
    private javax.swing.JLabel ProjectTitleLabel1;
    private javax.swing.JLabel ProjectTitleLabel2;
    private javax.swing.JLabel ProjectTitleLabel3;
    private javax.swing.JButton addNewBudgetPlanning;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton nextPage;
    private javax.swing.JButton previousPage;
    private javax.swing.JButton viewDetailBtn1;
    private javax.swing.JButton viewDetailBtn2;
    private javax.swing.JButton viewDetailBtn3;
    // End of variables declaration//GEN-END:variables
}
