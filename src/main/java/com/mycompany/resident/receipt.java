/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resident;

import com.mycompany.dataController.displayController1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoiyi
 */
public class receipt implements displayController1{
    
    private String receiptId;
    private String userId;
    private String paymentDesc;
    private String paidAmount;
    private String paidDate;
    private String issuedDate;
    private int totalLine;

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPaymentDesc() {
        return paymentDesc;
    }

    public void setPaymentDesc(String paymentDesc) {
        this.paymentDesc = paymentDesc;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public int getTotalLine() {
        return totalLine;
    }

    public void setTotalLine(int totalLine) {
        this.totalLine = totalLine;
    }
    
    
    @Override
    public void displayDataViewAll(Integer dataLine, String searchTxt, String type, String fileName) {
    
    }

    @Override
    public void setDataNull() {
        this.setIssuedDate(null);
        this.setPaymentDesc(null);
        this.setReceiptId(null);
        this.setUserId(null);
        this.setPaidAmount(null);
        this.setPaidDate(null);
    }

    @Override
    public void displayDataViewOwn(Integer dataLine, String searchTxt, String type, String fileName) {
        fileName = "src/main/java/com/mycompany/textFile/"+fileName+".txt";
        ArrayList<ArrayList<String>> allData = onlyUserDataInfo(fileName);
        int i =0;
        int fixedSize = allData.size();
        int changedSize = allData.size();
        if(!searchTxt.equals("")){
            for (int x=0;x<fixedSize+1;x++) {
                if(i ==changedSize){
                    break;
                }
                
                if(!(allData.get(i)).contains(searchTxt)){
                    allData.remove(i);
                    changedSize=changedSize-1;
                    i=i-1;
                }
                i=i+1;
            }
        }
        try{
            if(type.equals("receipt"))
            {
                this.setReceiptId(allData.get(dataLine).get(0));
                this.setUserId(allData.get(dataLine).get(1));
                this.setPaymentDesc(allData.get(dataLine).get(2));
                this.setPaidAmount(allData.get(dataLine).get(3));
                this.setPaidDate(allData.get(dataLine).get(4));
                this.setIssuedDate(allData.get(dataLine).get(5));
            }
        }catch(Exception e){
            setDataNull();
        }
    }
    
    private ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile) {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(receipt.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        
        ArrayList<ArrayList<String>> onlyUserInfo = new ArrayList<>();
        
        int p,q;
        int totalRow = 0;
        
        if(textFile.contains("ReceiptContent"))
        {
            for (p=0,q=0; p<allUserInfo.size(); p++)
            {
                if(allUserInfo.get(p).contains(this.getUserId()))
                {
                    ArrayList<String> item = allUserInfo.get(p);
                    if(item.get(1).equals(this.getUserId()))
                    {
                        totalRow = totalRow+1;
                        onlyUserInfo.add(allUserInfo.get(p));
                        q++;
                    }
                }
            }
        }
        setTotalLine(totalRow);
        
        return onlyUserInfo;
    }
}
