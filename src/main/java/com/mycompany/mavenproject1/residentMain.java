/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

    
    private  ArrayList<ArrayList<String>> DataInfo(String textFile) throws FileNotFoundException {
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
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        
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
        this.payTo = null;
        this.payAmount =  null;
        this.dueDate = null;
    }
    
    
    
    
    
    
    
}
