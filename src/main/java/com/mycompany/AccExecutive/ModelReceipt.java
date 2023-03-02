/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AccExecutive;

/**
 *
 * @author user
 */
public class ModelReceipt  implements ModelDescription {
    String receiptId;
    String UserId;
    String description;
    String paidAmount;
    String paidDate;
    String dateIssued;

    ModelReceipt() {}
    ModelReceipt(String line) {
        fromString(line);
    }

    public String getReceiptId() {
        return this.receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getUserId() {
        return this.UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaidAmount() {
        return this.paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getPaidDate() {
        return this.paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String getDateIssued() {
        return this.dateIssued;
    }

    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    public void fromString(String line) {
        String[] data = line.split(",");
        setReceiptId(data[0]);
        setUserId(data[1]);
        setDescription(data[2]);
        setPaidAmount(data[3]);
        setPaidDate(data[4]);
        setDateIssued(data[5]);
    }

    @Override
    public String toString() {
        return  getReceiptId() + "," +
                getUserId() + "," +
                getDescription() + "," +
                getPaidAmount() + "," +
                getPaidDate() + "," +
                getDateIssued() + ",";
    }
}
