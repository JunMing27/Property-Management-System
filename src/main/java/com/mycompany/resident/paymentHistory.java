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
public class paymentHistory implements displayController1{
    
    private String payHistoryId;
    private String payDescription;
    private String paidAmount;
    private String paidDate;
    private String UserId;
    private int totalLine;

    public String getPayHistoryId() {
        return payHistoryId;
    }

    public void setPayHistoryId(String payHistoryId) {
        this.payHistoryId = payHistoryId;
    }

    public String getPayDescription() {
        return payDescription;
    }

    public void setPayDescription(String payDescription) {
        this.payDescription = payDescription;
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

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
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
        this.setPayHistoryId(null);
        this.setPaidAmount(null);
        this.setPaidDate(null);
        this.setPayDescription(null);
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
            this.setPayHistoryId(allData.get(dataLine).get(0));
            this.setUserId(allData.get(dataLine).get(1));
            this.setPayDescription(allData.get(dataLine).get(2));
            this.setPaidAmount(allData.get(dataLine).get(3));
            this.setPaidDate(allData.get(dataLine).get(4));
            
        }catch(Exception e){
            setDataNull();
        }
    }
    
    public ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile) {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(paymentHistory.class.getName()).log(Level.SEVERE, null, ex);
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
        
        setTotalLine(totalRow);
        
        return onlyUserInfo;
    }
    
    
}
