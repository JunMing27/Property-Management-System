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
public class visitorPass implements displayController1{
    
    private String visitorPassId;
    private String visitorName;
    private String visitDate;
    private String userId;
    private String visitorPassStatus;
    private boolean status;

    public String getVisitorPassId() {
        return visitorPassId;
    }

    public void setVisitorPassId(String visitorPassId) {
        this.visitorPassId = visitorPassId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVisitorPassStatus() {
        return visitorPassStatus;
    }

    public void setVisitorPassStatus(String visitorPassStatus) {
        this.visitorPassStatus = visitorPassStatus;
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
        int i =0;
        int fixedSize = allData.size();
        int changedSize = allData.size();
        if(!searchTxt.equals("")){
            for (int x=0;x<fixedSize+1;x++) {
                if(i ==changedSize){
                    break;
                }
                
                if(!(allData.get(i).toString().toLowerCase()).contains(searchTxt.toLowerCase()))
                {
                    allData.remove(i);
                    changedSize=changedSize-1;
                    i=i-1;
                }
                i=i+1;
            }
        }
        int newSize = allData.size();
        try{
            this.setVisitorPassId(allData.get(dataLine).get(0));
            this.setVisitorName(allData.get(dataLine).get(1));
            this.setVisitDate(allData.get(dataLine).get(2));
            this.setUserId(allData.get(dataLine).get(3));
            this.setVisitorPassStatus(allData.get(dataLine).get(4));
            this.status = true;  
            
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
        this.setVisitorPassId(null);
        this.setVisitDate(null);
        this.setVisitorName(null);
        this.setVisitorPassStatus(null);
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
                
                if(!(allData.get(i).toString().toLowerCase()).contains(searchTxt.toLowerCase())){
                    allData.remove(i);
                    changedSize=changedSize-1;
                    i=i-1;
                }
                i=i+1;
            }
        }
        int newSize = allData.size();
        try{
            this.setVisitorPassId(allData.get(dataLine).get(0));
            this.setVisitorName(allData.get(dataLine).get(1));
            this.setVisitDate(allData.get(dataLine).get(2));
            this.setUserId(allData.get(dataLine).get(3));
            this.setVisitorPassStatus(allData.get(dataLine).get(4));
            this.status = true;  
        }catch(Exception e){
            setDataNull();
            this.status = false;
        }
        if(dataLine.equals(newSize-1)){
            this.status = false;
        }
    }

    public ArrayList<ArrayList<String>> allUserDataInfo(String textFile) {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(visitorPass.class.getName()).log(Level.SEVERE, null, ex);
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

    public ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile) {
        ArrayList<ArrayList<String>> allUserInfo = allUserDataInfo(textFile);
        ArrayList<ArrayList<String>> onlyUserInfo = new ArrayList<>();
        
        int p,q;
        if(this.getUserId() != null) //if is resident
        {
            for (p=0,q=0; p<allUserInfo.size(); p++)
            {
                if(allUserInfo.get(p).contains(this.getUserId()))
                {
                    ArrayList<String> item = allUserInfo.get(p);
                    if(item.get(3).equals(this.getUserId()))
                    {
                        onlyUserInfo.add(allUserInfo.get(p));
                        System.out.println("enter first part");
                        q++;
                    }
                }
            }
        }else if(this.getVisitorPassId()!= null ) //if is visitor
        {
            for (p=0,q=0; p<allUserInfo.size(); p++)
            {
                if(allUserInfo.get(p).contains(this.getUserId()))
                {
                    ArrayList<String> item = allUserInfo.get(p);
                    if(item.get(0).equals(this.getVisitorPassId()))
                    {
                        onlyUserInfo.add(allUserInfo.get(p));
                        q++;
                    }
                    System.out.println("second part "+onlyUserInfo);
                }
            }
        }
        
        return onlyUserInfo;
    }
    
    
    
}
