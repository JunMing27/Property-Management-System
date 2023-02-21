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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ResidentMain {
    //for ResidentProfile
    private String id;
    private String name;
    private String gender;
    private String age;
    private String phone;
    private String unit;
    private String image;
    private String userName;
    private String password;
    
    //for ResidentPay
    private String payTo;
    private String payAmount;
    private String dueDate;
    private boolean status;

    
    //get Profile
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getUnit() {
        return unit;
    }

    public String getImage() {
        return image;
    }

    //get credential data
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    
    
    //get ResidentPay
    public String getPayTo() {
        return payTo;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public String getDueDate() {
        return dueDate;
    }
    
    
    //get status
    public boolean getStatus() {
        return status;
    }
    
    
    //set profile
    public void setId(String id) {
        this.id = id;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setImage(String image) {
        this.image = image;
    }

    //set credential
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    //set ResidentPay
    public void setPayTo(String payTo) {
        this.payTo = payTo;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }
    
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    
    //set Status
    public  void setStatus(boolean status) {
        this.status = status;
    }

    
    public ArrayList<ArrayList<String>> dataInfo(String textFile) throws FileNotFoundException {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        ArrayList<ArrayList<String>> onlyUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = new Scanner(file);
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
        int p,q;
        for (p=0,q=0; p<allUserInfo.size(); p++)
        {
            if(allUserInfo.get(p).contains(id))
            {
                ArrayList<String> item = allUserInfo.get(p);
                if(item.get(0).equals(id))
                {
                    onlyUserInfo.add(allUserInfo.get(p));
                    q++;
                }
            }
        }
        return onlyUserInfo;
    }
    
    
    public void displayDataView(Integer dataLine, String file) throws FileNotFoundException, IOException
    {
        
        String fileName = "src/main/java/com/mycompany/textFile/"+file+".txt";
        ArrayList<ArrayList<String>> allData = dataInfo(fileName);
        
        int newSize = allData.size();
        try{
            allData.get(dataLine);
            //for ResidentProfile
            if(file.equals("ResidentProfile")) {
                setId(allData.get(dataLine).get(0));
                setName(allData.get(dataLine).get(1));
                setGender(allData.get(dataLine).get(2));
                setAge(allData.get(dataLine).get(3));
                setPhone(allData.get(dataLine).get(4));
                setUnit(allData.get(dataLine).get(5));
                setImage(allData.get(dataLine).get(6));
            }
            //for Credential Data
            else if(file.equals("loginCredential"))
            {
                setId(allData.get(dataLine).get(0));
                setUserName(allData.get(dataLine).get(1));
                setPassword(allData.get(dataLine).get(2));
            }
            //for ResidentPay
            else if (file.equals("ResidentPayment")) {
                setId(allData.get(dataLine).get(0));
                setPayTo(allData.get(dataLine).get(1));
                setPayAmount(allData.get(dataLine).get(2));
                setDueDate(allData.get(dataLine).get(3));
                this.status = true;
            }
            
        }
        catch(Exception e){
            setDataNull();
            this.status = false;
        }
        if(dataLine.equals(newSize-1)){
            this.status = false;
        }
    }
    
    
    
    public void setDataNull(){
        //for ResidentProfile
        this.id = null;
        this.name = null;
        this.gender = null;
        this.age = null;
        this.phone = null;
        this.unit = null;
        this.image = null;
        //for CredentialData
        this.userName = null;
        this.password = null;
        //for ResidentPay
        this.id = null;
        this.payTo = null;
        this.payAmount =  null;
        this.dueDate = null;
    }

}
