/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

    
    public void setResidentData()
    {
        
        try {
            String fileName = "src/main/java/com/mycompany/textFile/ResidentProfile.txt";
            ArrayList<ArrayList<String>> all = dataInfo(fileName);
            for (ArrayList<String> one : all) {
                if (one.get(0).equals(id)) {
                    setName(one.get(1));
                    setGender(one.get(2));
                    setAge(one.get(3));
                    setPhone(one.get(4));
                    setUnit(one.get(5));
                    setImage(one.get(6));
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ResidentMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    
    }
    
    public void setCredentialData()
    {
        try {
            String fileName = "src/main/java/com/mycompany/textFile/loginCredential.txt";
            ArrayList<ArrayList<String>> allData = dataInfo(fileName);
            for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    setUserName(singleData.get(1));
                    setPassword(singleData.get(2));
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ResidentMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private  ArrayList<ArrayList<String>> dataInfo(String textFile) throws FileNotFoundException {
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
    
    
    public void displayDataView(Integer dataLine) throws FileNotFoundException, IOException{
        
        String fileName = "src/main/java/com/mycompany/textFile/ResidentDuePayment.txt";
        ArrayList<ArrayList<String>> allData = dataInfo(fileName);
        
        int newSize = allData.size();
        try{
            allData.get(dataLine);
            this.payTo = allData.get(dataLine).get(1);
            this.payAmount = allData.get(dataLine).get(2);
            this.dueDate = allData.get(dataLine).get(3);
            this.status = true;
            
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
        
        //for ResidentPay
        this.payTo = null;
        this.payAmount =  null;
        this.dueDate = null;
    }
    
    
    
    
    
    
    
}
