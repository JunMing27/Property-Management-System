/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

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
import javax.swing.JOptionPane;

/**
 *
 * @author Jun Ming
 */
public class AdminExecutiveMain {
    //VARIABLES
    //GLOBAL VARIABLES, DIFFERENT FUNCTIONALITY USING SAME VARIABLE
    private Boolean Status;
    //FACILITY VARIABLES
    private String facilityId;
    private String facilityName;
    private String facilityLocation;
    
    
    
    
    //GET METHODS
     public boolean getStatus(){
        return Status;
    }
     
    //GET FACILITY
    public String getFacilityId(){
        return facilityId;
    }
    public String getFacilityName(){
        return facilityName;
    }
    public String getFacilityLocation(){
        return facilityLocation;
    }
    
    
    //Method to choose correct txt file based on userType, so no need to redundant code
    private String file="";
    
    public void chooseTxtFile(String Type){
        if(Type=="Unit Management"){
            file ="Unit.txt";
        }else if (Type=="Resident Management"){
            file ="Resident.txt";
        }else if (Type=="Complaint"){
            file = "Complaint.txt";
        }else if (Type=="Employee"){
            file = "Employee.txt";
        }else if (Type=="Facility Management"){
            file = "Facility.txt";
        }else if (Type=="Facility Booking Management"){
            file = "FacilityBooking.txt";
        }
    }
    
    // GLOBAL USE Method to display Data from txt file *** PAGINATION WITH SEARCH FEATURE IS ALLOWED
    // CREATED BY JUN MING :3
    //- store the current items from txt file to a 2d array, then loop to display user data at BusManuserManage
    public  void displayDataView(Integer dataLine,String searchTxt,String type) throws FileNotFoundException, IOException{
        BusinessManagerMain main = new BusinessManagerMain();
        String fileName = "src/main/java/com/mycompany/mavenproject1/"+file;
        ArrayList<ArrayList<String>> allData = main.UserInfo(fileName);
        int i =0;
        int fixedSize = allData.size();
        int changedSize = allData.size();
        if(!searchTxt.equals("")){
            System.out.println("can run searchTxt got value");
            for (int x=0;x<fixedSize+1;x++) {
                if(i ==changedSize){
                    break;
                }
                // user.get(0) is userID, user.get(1) is username
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
            if(type=="facility"){
                this.facilityId=allData.get(dataLine).get(0);
                this.facilityName = allData.get(dataLine).get(1);
                this.facilityLocation = allData.get(dataLine).get(2);
                this.Status = true;
            }else if(type=="budget"){
            }
        }catch(Exception e){
            setDataNull(type);
            this.Status = false;
        }
        if(dataLine.equals(newSize-1)){
            this.Status = false;
        }
    }
            
    
    // Method to display User Data : if txt file no user record, it will display data as null 
    public void setDataNull(String type){
        if(type=="facility"){
            this.facilityId = null;
            this.facilityName =  null;
            this.facilityLocation = null;
        }else if(type=="budget"){

        }
    }
    
    
    //GLOBAL USE Method to getData based on ID
    public void getDataViewSingle(String id, String file,String type) throws FileNotFoundException{
        BusinessManagerMain main = new BusinessManagerMain();
        String fileName = "src/main/java/com/mycompany/mavenproject1/"+file;
        ArrayList<ArrayList<String>> allData = main.UserInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    if(type=="facility"){
                        this.facilityId=singleData.get(0);
                        this.facilityName=singleData.get(1);
                        this.facilityLocation=singleData.get(2);
                    }
                    break;
                }
            }
    }
    
    //GLOBAL USE EDIT OR ADD DATA METHOD
    public void editOrAddData(ArrayList<String> dataList, String type, String file,String functionType){
        if(functionType=="edit"){
            try {
                BusinessManagerMain main = new BusinessManagerMain();
                String fileName = "src/main/java/com/mycompany/mavenproject1/"+file;
                ArrayList<ArrayList<String>> allData = main.UserInfo(fileName);
                for (ArrayList<String> user : allData) {
                    if (user.get(0).equals(dataList.get(0))) {
                        if(type=="facility"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            break;
                        }
                    }
                }
                new FileWriter(fileName, false).close();
                for (ArrayList<String> user : allData) {
                    try {
                        if(type=="facility"){
                            File userData = new File("src/main/java/com/mycompany/mavenproject1/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+"\n");
                            bw.close();
                        }
                    }
                    catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "failed to update file", "Warning", JOptionPane.ERROR_MESSAGE);
                    }
                }
                JOptionPane.showMessageDialog(null, "Edited Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
            } 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problem Occured, Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        }else if (functionType=="add"){
            try {
                BufferedWriter AddDataToFile;
                FileWriter AddNewItem = new FileWriter("src/main/java/com/mycompany/mavenproject1/"+file,true);
                AddDataToFile = new BufferedWriter(AddNewItem);
                if(type=="facility"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2));
                }
                AddDataToFile.newLine();
                AddDataToFile.close();
                AddNewItem.close();
                JOptionPane.showMessageDialog(null, "Added new data Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Failed to add new data", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }
    
    //GLOBAL USE METHOD TO DELETE DATA FROM FILE
    public void deleteFunction(String itemID){
        try {
            int i =0;
            String fileName = "src/main/java/com/mycompany/mavenproject1/"+file;
            ArrayList<ArrayList<String>> allUsers = dataInfo(fileName);
            for (ArrayList<String> user : allUsers) {
                
                if (user.get(0).equals(itemID)) {
                    allUsers.remove(i);
                    break;
                }
                
                i=i+1;
            }
            new FileWriter(fileName, false).close();
            for (ArrayList<String> user : allUsers) {
                if (!user.get(1).equals("")) {
                    try {
                        if(file=="Facility.txt" ){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/mavenproject1/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+"\n");
                            bw.close();
                        }
                        else if (file=="BudgetPlanning.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/mavenproject1/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+"\n");
                            bw.close();
                        }
                    }
                    catch (IOException e) {
                    }
                }
            }
        } 
        catch (Exception ex) {
        }
    }
    
    //GLOBAL USE METHOD TO GET INCREMENTED ID NUMBER TO AUTO FILL NEXT USER DATA ID 
    public void getIncreasedID(String file,String type){
         BufferedReader input;
        try {
            input = new BufferedReader(new FileReader("src/main/java/com/mycompany/mavenproject1/"+file));
            String last="";
            String line="";
            String ID="";
            try {
                while ((line = input.readLine()) != null) {
                    last = line;
                }
                Scanner ScanEachString = new Scanner(last);
                ScanEachString.useDelimiter("[,\n]");
                while (ScanEachString.hasNextLine()) {
                    // First character of a string
                    ID = (ScanEachString.next().trim());
                    break;
                }
                if(type=="facility"){
                    String IDchar = ID.substring(0,1);
                    ID = ID.substring(1);
                    Integer IDnumber = Integer.parseInt(ID)+1;
                    ID = IDchar+ (IDnumber).toString();
                    this.facilityId=ID;
                }
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    //- store the current items from txt file to a 2d array so we can use the arraylist for CRUD features.
    public  ArrayList<ArrayList<String>> dataInfo(String textFile) throws FileNotFoundException {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allDataInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = new Scanner(file);
            String oneUserInfo; 
            String[] itemArray;
            ArrayList<String> itemArrayList;
            allDataInfo = new ArrayList<>();
            while (sc.hasNextLine()) { 
                oneUserInfo = sc.nextLine().trim(); 
                itemArray = oneUserInfo.split(","); 
                itemArrayList = new ArrayList<>(Arrays.asList(itemArray));
                allDataInfo.add(itemArrayList);
            }
        } else {
        }
        return allDataInfo;
    }
}
