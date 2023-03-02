/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AccExecutive;

/**
 *
 * @author user
 */
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class ModelStatement implements ModelDescription {
    String statementId;
    String userId;
    String username;
    String paidDate;
    String paidAmount;
    String description;

    ModelStatement() {}
    ModelStatement(String line) {
        fromString(line);
    }

    public String getStatementId() {
        return this.statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
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

    public String getPaidDate() {
        return this.paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String getPaidAmount() {
        return this.paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void fromString(String line) {
        String[] data = line.split(",");
        setStatementId(data[0]);
        setUserId(data[1]);
        setUsername(data[2]);
        setPaidDate(data[3]);
        setPaidAmount(data[4]);
        setDescription(data[5]);
    }

    @Override
    public String toString() {
        return  getStatementId() + "," +
                getUserId() + "," +
                getUsername() + "," +
                getPaidDate() + "," +
                getPaidAmount() + "," +
                getDescription() + ",";
    }
}