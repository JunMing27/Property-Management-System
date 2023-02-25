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
public class pendingFee implements displayController1{
    private String pendingId;
    private String pendingAmount;
    private String paidDesc;
    private String paidDate;
    private String userId;
    private boolean status;

    public String getPendingId() {
        return pendingId;
    }

    public void setPendingId(String pendingId) {
        this.pendingId = pendingId;
    }

    public String getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(String pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public String getPaidDesc() {
        return paidDesc;
    }

    public void setPaidDesc(String paidDesc) {
        this.paidDesc = paidDesc;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
    @Override
    public void displayDataViewAll(Integer dataLine, String searchTxt, String type, String fileName) {
    
    }

    @Override
    public void setDataNull() {
        this.setUserId(null);
        this.setPaidDate(null);
        this.setPaidDesc(null);
        this.setPendingAmount(null);
        this.setPendingId(null);
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
        int newSize = allData.size();
        try{
            if(type.equals("pending"))
            {
                this.setPendingId(allData.get(dataLine).get(0));
                this.setUserId(allData.get(dataLine).get(1));
                this.setPaidDesc(allData.get(dataLine).get(2));
                this.setPendingAmount(allData.get(dataLine).get(3));
                this.setPaidDate(allData.get(dataLine).get(4));
                this.status = true;
            }
        }catch(Exception e){
            setDataNull();
            this.status = false;
        }
        if(dataLine.equals(newSize-1)){
            this.status = false;
        }
    }
    
    private ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile)
    {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(pendingFee.class.getName()).log(Level.SEVERE, null, ex);
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
        for (p=0,q=0; p<allUserInfo.size(); p++)
         {
             if(allUserInfo.get(p).contains(this.getUserId()))
             {
                 ArrayList<String> item = allUserInfo.get(p);
                 if(item.get(1).equals(this.getUserId()))
                 {
                     onlyUserInfo.add(allUserInfo.get(p));
                     q++;
                 }
             }
        }
        
        
        
        return onlyUserInfo;
    }
    
}
