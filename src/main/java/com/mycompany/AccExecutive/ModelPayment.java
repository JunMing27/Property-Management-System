/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AccExecutive;

/**
 *
 * @author user
 */
public class ModelPayment implements ModelDescription {
    String paymentId;
    String userId;
    String payDescription;
    String payAmount;
    String dueDate;

    public ModelPayment() {
    }

    public ModelPayment(String line) {
        fromString(line);
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPayDescription() {
        return this.payDescription;
    }

    public void setPayDescription(String payDescription) {
        this.payDescription = payDescription;
    }

    public String getPayAmount() {
        return this.payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void fromString(String line) {
        String[] data = line.split(",");
        setPaymentId(data[0]);
        setUserId(data[1]);
        setPayDescription(data[2]);
        setPayAmount(data[3]);
        setDueDate(data[4]);
    }

    @Override
    public String toString() {
        return  getPaymentId() + "," +
                getUserId() + "," +
                getPayDescription() + "," +
                getPayAmount() + "," +
                getDueDate() + ",";
    }
    
}
