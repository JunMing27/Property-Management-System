/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.AccExecutive;

import com.mycompany.AccExecutive.AccExecMain;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;

import java.io.*; 

/**
 *
 * @author user
 */
public class AccExecPaymentView extends javax.swing.JFrame {

    ModelPayment payment;

    /**
     * Creates new form AccExecPaymentView
     */
    public AccExecPaymentView() {
        initComponents();
    }

    public AccExecPaymentView(ModelPayment payment) {
        this.payment = payment;
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
        JPanel HeaderPanel = new JPanel();
        JButton BackAccExecPaymentManage = new JButton();
        JButton UpdateNewAccExecPaymentManage = new JButton();
        
        JTextField paymentIdTf = new JTextField(payment.getPaymentId(), 20);
        JTextField userIdTf = new JTextField(payment.getUserId(), 20);
        JTextField payDescriptionTf = new JTextField(payment.getPayDescription(), 20);
        JTextField payAmountTf = new JTextField(payment.getPayAmount(), 20);
        JTextField dueDateTf = new JTextField(payment.getDueDate(), 20);

        BackAccExecPaymentManage.setBackground(new java.awt.Color(204, 204, 204));
        BackAccExecPaymentManage.setForeground(new java.awt.Color(0, 0, 0));
        BackAccExecPaymentManage.setText("Back");
        BackAccExecPaymentManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                AccExecPaymentManage nextFrame = new AccExecPaymentManage();
                nextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nextFrame.setLocationRelativeTo(null);
                nextFrame.setVisible(true);
            }
        });

        UpdateNewAccExecPaymentManage.setBackground(new java.awt.Color(204, 204, 204));
        UpdateNewAccExecPaymentManage.setForeground(new java.awt.Color(0, 0, 0));
        UpdateNewAccExecPaymentManage.setText("Update");
        UpdateNewAccExecPaymentManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment.setPaymentId(paymentIdTf.getText());
                payment.setUserId(userIdTf.getText());
                payment.setPayDescription(payDescriptionTf.getText());
                payment.setPayAmount(payAmountTf.getText());
                payment.setDueDate(dueDateTf.getText());

                boolean found = false;
                String fileName = "./com/mycompany/textFile/Payment.txt";
                String dataToAppendOrUpdate = payment.toString();
                StringBuilder sb = new StringBuilder();
        
                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.startsWith(dataToAppendOrUpdate.split(",")[0])) {
                            sb.append(dataToAppendOrUpdate).append("\n");
                            found = true;
                        } else {
                            sb.append(line).append("\n");
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Error reading file: " + e.getMessage());
                }
        
                if (!found) {
                    sb.append(dataToAppendOrUpdate).append("\n");
                }
        
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
                    bw.write(sb.toString());
                } catch (IOException e) {
                    System.err.println("Error writing to file: " + e.getMessage());
                }

                dispose();
                AccExecPaymentManage nextFrame = new AccExecPaymentManage();
                nextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                nextFrame.setLocationRelativeTo(null);
                nextFrame.setVisible(true);
            }
        });

        JPanel paymentPanel = new JPanel();

        paymentPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        paymentPanel.setPreferredSize(new Dimension(100, 180));
        paymentPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        paymentPanel.setBorder(new EmptyBorder(0,40,0,0));
        paymentPanel.add(new JLabel("Payment ID: "), gbc);
        gbc.gridy++;
        paymentPanel.add(new JLabel("User ID: "), gbc);
        gbc.gridy++;
        paymentPanel.add(new JLabel("Payment Description: "), gbc);
        gbc.gridy++;
        paymentPanel.add(new JLabel("Payment Amount: "), gbc);
        gbc.gridy++;
        paymentPanel.add(new JLabel("Payment Due Date: "), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        paymentPanel.add(paymentIdTf, gbc);
        gbc.gridy++;
        paymentPanel.add(userIdTf, gbc);
        gbc.gridy++;
        paymentPanel.add(payDescriptionTf, gbc);
        gbc.gridy++;
        paymentPanel.add(payAmountTf, gbc);
        gbc.gridy++;
        paymentPanel.add(dueDateTf, gbc);

        HeaderPanel.setBackground(new java.awt.Color(254, 204, 204));
        add(HeaderPanel, BorderLayout.PAGE_START);
        HeaderPanel.add(BackAccExecPaymentManage, BorderLayout.LINE_START);
        HeaderPanel.add(UpdateNewAccExecPaymentManage, BorderLayout.LINE_END);

        add(HeaderPanel, BorderLayout.PAGE_START);
        add(paymentPanel, BorderLayout.CENTER);
        setSize(500, 450);
    }


}
