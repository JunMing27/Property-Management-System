/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AccExecutive;

/**
 *
 * @author user
 */
public class ModelInvoice implements ModelDescription {
    String invoiceId;
    String userId;
    String username;
    String issuedDate;
    String dueDate;
    String dueAmount;
    String dueAmount2;
    String description;

    ModelInvoice() {}
    ModelInvoice(String line) {
        fromString(line);
    }

    public String getInvoiceId() {
        return this.invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIssuedDate() {
        return this.issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueAmount() {
        return this.dueAmount;
    }

    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    public String getDueAmount2() {
        return this.dueAmount2;
    }

    public void setDueAmount2(String dueAmount2) {
        this.dueAmount2 = dueAmount2;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void fromString(String line) {
        String[] data = line.split(",");
        setInvoiceId(data[0]);
        setUserId(data[1]);
        setUsername(data[2]);
        setIssuedDate(data[3]);
        setDueDate(data[4]);
        setDueAmount(data[5]);
        setDueAmount2(data[6]);
        setDescription(data[7]);
    }

    @Override
    public String toString() {
        return  getInvoiceId() + "," +
                getUserId() + "," +
                getUsername() + "," +
                getIssuedDate() + "," +
                getDueDate() + "," +
                getDueAmount() + "," +
                getDueAmount2() + "," +
                getDescription() + ",";
    }
}
