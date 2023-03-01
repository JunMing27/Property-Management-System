package com.mycompany.employee;

import com.mycompany.dataController.displayController1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoiyi
 */
public class checkpoint implements displayController1{
    
    //for checkpoint record
    private String checkPointRecordID;
    private String userId;
    private String blockNumber;
    private String checkPointRecordDate;
    private String checkPointRecordTime;
    private int totalLine;

    public String getCheckPointRecordID() {
        return checkPointRecordID;
    }

    public void setCheckPointRecordID(String checkPointRecordID) {
        this.checkPointRecordID = checkPointRecordID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getCheckPointRecordDate() {
        return checkPointRecordDate;
    }

    public void setCheckPointRecordDate(String checkPointRecordDate) {
        this.checkPointRecordDate = checkPointRecordDate;
    }

    public String getCheckPointRecordTime() {
        return checkPointRecordTime;
    }

    public void setCheckPointRecordTime(String checkPointRecordTime) {
        this.checkPointRecordTime = checkPointRecordTime;
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
        setBlockNumber(null);
        setCheckPointRecordDate(null);
        setCheckPointRecordID(null);
        setCheckPointRecordTime(null);
    }

    @Override
    public void displayDataViewOwn(Integer dataLine, String searchTxt, String type, String fileName) {
        fileName = "src/main/java/com/mycompany/textFile/"+fileName+".txt";
        ArrayList<ArrayList<String>> allData = onlyUserDataInfo(fileName);
        try{
            setCheckPointRecordID(allData.get(dataLine).get(0));
            setUserId(allData.get(dataLine).get(1));
            setBlockNumber(allData.get(dataLine).get(2));
            setCheckPointRecordDate(allData.get(dataLine).get(3));
            setCheckPointRecordTime(allData.get(dataLine).get(4));
             
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
                Logger.getLogger(checkpoint.class.getName()).log(Level.SEVERE, null, ex);
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
                    totalRow = totalRow +1;
                    onlyUserInfo.add(allUserInfo.get(p));
                    q++;
                }
            }
        }
        setTotalLine(totalRow);
        return onlyUserInfo;
    }

    
    
}
