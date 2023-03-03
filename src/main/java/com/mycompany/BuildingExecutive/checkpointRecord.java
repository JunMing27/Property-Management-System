/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.BuildingExecutive;

import com.mycompany.dataController.displayController;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author edi
 */
public class checkpointRecord implements displayController {
    private String checkPointRecordID;
    private String userId;
    private String blockNumber;
    private String checkPointRecordDate;
    private String checkPointRecordTime;
    private boolean status;

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
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private int totalLine;

    public int getTotalLine() {
        return totalLine;
    }

    public void setTotalLine(int totalLine) {
        this.totalLine = totalLine;
    }
    
    
    
   private String file="CheckpointRecord.txt";

    @Override
    public void chooseTxtFile(String Type) {
        file="CheckpointRecord.txt";
    }

    @Override
    public void displayDataView(Integer dataLine, String searchTxt, String type) {
//       
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        int i =0;
        int fixedSize = allData.size();
        int changedSize = allData.size();
        if(!searchTxt.equals("")){
            for (int x=0;x<fixedSize+1;x++) {
                if(i ==changedSize){
                    break;
                }
                // display.get(0) is userID, user.get(1) is username
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
            setCheckPointRecordID(allData.get(dataLine).get(0));
            setUserId(allData.get(dataLine).get(1));
            setBlockNumber(allData.get(dataLine).get(2));
            setCheckPointRecordDate(allData.get(dataLine).get(3));
            setCheckPointRecordTime(allData.get(dataLine).get(4));
               
            status=true;
            
        }catch(Exception e){
            setDataNull(type);
            status = false;
        }
        if(dataLine.equals(newSize-1)){
            status = false;
        }
    }

    @Override
    public void setDataNull(String type) {
            setCheckPointRecordID(null);
            setUserId(null);
            setBlockNumber(null);
            setCheckPointRecordDate(null);
            setCheckPointRecordTime(null);
    }

    @Override
    public void getDataViewSingle(String id, String file, String type) {
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    setCheckPointRecordID(singleData.get(0));
                    setUserId(singleData.get(1));
                    setBlockNumber(singleData.get(2));
                    setCheckPointRecordDate(singleData.get(3));
                    setCheckPointRecordTime(singleData.get(4));
                    break;
                }
            }
    }

    @Override
    public void getIncreasedID(String file, String type) {
           BufferedReader input;
        try {
            input = new BufferedReader(new FileReader("src/main/java/com/mycompany/textFile/"+file));
            String last="";
            String line="";
            String ID="";
            try {
                while ((line = input.readLine()) != null) {
                    last = line;
                }
                if(last==""){
                    ID = "CP1";
                    setCheckPointRecordID(ID);
                }else{
                    Scanner ScanEachString = new Scanner(last);
                    ScanEachString.useDelimiter("[,\n]");
                    while (ScanEachString.hasNextLine()) {
                        // First character of a string
                        ID = (ScanEachString.next().trim());
                        break;
                    }
                        String IDchar = ID.substring(0,2);
                        ID = ID.substring(2);
                        Integer IDnumber = Integer.parseInt(ID)+1;
                        ID = IDchar+ (IDnumber).toString();
                        setCheckPointRecordID(ID);
                }
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }
    public ArrayList<ArrayList<String>> DataInfo(String textFile) {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
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
        } else {
        }
        return allUserInfo;
    }
    
    public ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile) {
        ArrayList<ArrayList<String>> allUserInfo = DataInfo(textFile);
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
            setDataNull("");
            
        }
        
    }
}
