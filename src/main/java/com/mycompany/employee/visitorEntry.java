/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

import com.mycompany.dataController.dataManagementController1;
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
public class visitorEntry implements displayController1, dataManagementController1{
    
    private String visitorEntryId;
    private String visitorName;
    private String visitDate;
    private String visitEnterTime;
    private String visitLeaveTime;
    private boolean status;

    public String getVisitorEntryId() {
        return visitorEntryId;
    }

    public void setVisitorEntryId(String visitorEntryId) {
        this.visitorEntryId = visitorEntryId;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getVisitEnterTime() {
        return visitEnterTime;
    }

    public void setVisitEnterTime(String visitEnterTime) {
        this.visitEnterTime = visitEnterTime;
    }

    public String getVisitLeaveTime() {
        return visitLeaveTime;
    }

    public void setVisitLeaveTime(String visitLeaveTime) {
        this.visitLeaveTime = visitLeaveTime;
    }

    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void displayDataViewAll(Integer dataLine, String searchTxt, String type, String fileName) {
        fileName = "src/main/java/com/mycompany/textFile/"+fileName+".txt";
        ArrayList<ArrayList<String>> allData = allUserDataInfo(fileName);
        
        int newSize = allData.size();
        try{
            setVisitorEntryId(allData.get(dataLine).get(0));
            setVisitorName(allData.get(dataLine).get(1));
            setVisitDate(allData.get(dataLine).get(2));
            setVisitEnterTime(allData.get(dataLine).get(3));
            setVisitLeaveTime(allData.get(dataLine).get(4));
        }catch(Exception e){
            setDataNull();
            this.status = false;
        }
        if(dataLine.equals(newSize-1)){
            this.status = false;
        }
    }

    @Override
    public void setDataNull() {
        setVisitDate(null);
        setVisitEnterTime(null);
        setVisitorEntryId(null);
        setVisitLeaveTime(null);
        setVisitorName(null);
    }

    @Override
    public void displayDataViewOwn(Integer dataLine, String searchTxt, String type, String fileName) {
        
    }

    @Override
    public ArrayList<ArrayList<String>> allUserDataInfo(String textFile) {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(visitorEntry.class.getName()).log(Level.SEVERE, null, ex);
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
        return allUserInfo;
    }

    @Override
    public ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile) {
       return null;
    }

    @Override
    public void removeFromFile(String textFile, ArrayList<String> dataList) {
        
    }

    @Override
    public void editFile(String textFile, ArrayList<String> dataList) {
        
    }

    @Override
    public int getNextId(String textFile) {
        
    }
    
    
    
}
