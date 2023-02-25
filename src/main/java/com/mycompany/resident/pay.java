/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resident;

import com.mycompany.dataController.dataManagementController1;
import com.mycompany.dataController.displayController1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoiyi
 */
public class pay implements displayController1, dataManagementController1{

    private String payDesc;
    private String payAmount;
    private String dueDate;
    private boolean status;
    private String userId;

    public String getPayDesc() {
        return payDesc;
    }

    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    
    
    
    
    @Override
    public void displayDataViewAll(Integer dataLine, String searchTxt, String type, String fileName) {
    
    }

    @Override
    public void setDataNull() {
        this.setPayDesc(null);
        this.setPayAmount(null);
        this.setDueDate(null);
        this.setUserId(null);
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
            if(type.equals("pay"))
            {
                this.setUserId(allData.get(dataLine).get(1));
                this.setPayDesc(allData.get(dataLine).get(2));
                this.setPayAmount(allData.get(dataLine).get(3));
                this.setDueDate(allData.get(dataLine).get(4));
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

    
    @Override
    public ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile) {
        
        ArrayList<ArrayList<String>> allUserInfo = this.allUserDataInfo(textFile);
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

    @Override
    public ArrayList<ArrayList<String>> allUserDataInfo(String textFile) {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(pay.class.getName()).log(Level.SEVERE, null, ex);
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
    public void removeFromFile(String textFile, ArrayList<String> dataList) {
        
        try {
            String filePath = "src/main/java/com/mycompany/textFile/"+textFile+".txt";
            ArrayList<ArrayList<String>> allUsers = allUserDataInfo(filePath);
            for(int j=0;j<allUsers.size();j++)
            {
                if(allUsers.get(j).get(1).equals(dataList.get(0))
                        && allUsers.get(j).get(2).equals(dataList.get(1))
                        && allUsers.get(j).get(3).equals(dataList.get(2))
                        && allUsers.get(j).get(4).equals(dataList.get(3)))
                {
                    allUsers.remove(j);
                    break;
                }
            }   
            
            File file= new File(filePath);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int j=0; j<allUsers.size(); j++) 
            {
                ArrayList<String>item = allUsers.get(j);
                for(int k=0; k<item.size(); k++)
                {
                    if(k == item.size()-1)
                    {
                        bw.write(item.get(k));
                    }else{
                        bw.write(item.get(k)+",");
                    }
                }
                bw.write("\n");
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(pay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editFile(String textFile, ArrayList<String> dataList) {
        
        try {
            File file = new File("src/main/java/com/mycompany/textFile/"+textFile+".txt");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(dataList.get(4)+","
                    +dataList.get(0)+","
                    +dataList.get(1)+","
                    +dataList.get(2)+","
                    +dataList.get(3)+"\n");
        } catch (IOException ex) {
            Logger.getLogger(pay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getNextId(String textFile) {
        int id = 0;
        try {
            File file = new File("src/main/java/com/mycompany/textFile/"+textFile+".txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null )
                {
                    String[] dataRow = line.split(",");
                    for(int i=0; i<dataRow.length; i++)
                    {
                        id = Integer.parseInt(dataRow[0].substring(dataRow[0].indexOf("PE")+2));
                    }
                    line = br.readLine();
                }
        }catch (IOException ex) {
            Logger.getLogger(pay.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    
    
    
    
}