/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.resident;

import com.mycompany.dataController.User;
import com.mycompany.dataController.dataManagementController;
import com.mycompany.dataController.dataManagementController1;
import com.mycompany.dataController.displayController;
import com.mycompany.dataController.displayController1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HoiYi
 */
public class resident extends User implements dataManagementController1, displayController1{

    @Override
    public String getUserType() {
        return super.getUserType(); 
    }

    @Override
    public String getUserImage() {
        return super.getUserImage(); 
    }

    @Override
    public String getUserPhone() {
        return super.getUserPhone();
    }

    @Override
    public String getUserAge() {
        return super.getUserAge();
    }

    @Override
    public String getUserGender() {
        return super.getUserGender();
    }

    @Override
    public String getUserName() {
        return super.getUserName();
    }

    @Override
    public String getUserId() {
        return super.getUserId(); 
    }
    @Override
    public void setUserType(String userType) {
        super.setUserType(userType); 
    }

    @Override
    public void setUserImage(String userImage) {
        super.setUserImage(userImage); 
    }

    @Override
    public void setUserPhoneNumber(String phoneNumber) {
        super.setUserPhoneNumber(phoneNumber); 
    }

    @Override
    public void setUserAge(String userAge) {
        super.setUserAge(userAge); 
    }

    @Override
    public void setUserGender(String userGender) {
        super.setUserGender(userGender);
    }

    @Override
    public void setUserName(String userName) {
        super.setUserName(userName);
    }

    @Override
    public void setUserId(String userId) {
        super.setUserId(userId); 
    }
    
    
    
    //for credential
    @Override
    public void setPassword(String password) {
        super.setPassword(password); 
    }

    @Override
    public void setCredentialName(String credentialName) {
        super.setCredentialName(credentialName);
    }

    @Override
    public String getPassword() {
        return super.getPassword(); 
    }

    @Override
    public String getCredentialName() {
        return super.getCredentialName();
    }

    
    //add uner unit
    private String userUnit;

    public String getUserUnit() {
        return userUnit;
    }

    public void setUserUnit(String userUnit) {
        this.userUnit = userUnit;
    }
    
    
    //add status
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    //declare variable for methods
    private String file = "";
    private String userId = this.getUserId();
    
    

    @Override
    public void deleteUserCredential(String userID) {
        
    }

    @Override
    public void editCredential(String id, String userName, String userPass) {
        
    }

    @Override
    public void addCredential(String id, String userName, String pass, String role) throws IOException {
        
    }

    @Override
    public void getCredentialData(String userId) throws FileNotFoundException {
        
    }

    @Override
    public ArrayList<ArrayList<String>> allUserDataInfo(String textFile) {
        File file = new File("src/main/java/com/mycompany/textFile/"+textFile+".txt");
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(resident.class.getName()).log(Level.SEVERE, null, ex);
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
        ArrayList<ArrayList<String>> allUserInfo = this.allUserDataInfo(textFile);
        ArrayList<ArrayList<String>> onlyUserInfo = new ArrayList<>();
        
        int p,q;
        //for ResidentProfile.txt & vendorProfile.txt
        if(textFile.equals("ResidentProfile") || textFile.equals("VendorProfile"))
        {
            for (p=0,q=0; p<allUserInfo.size(); p++)
            {
                if(allUserInfo.get(p).contains(userId))
                {
                    ArrayList<String> item = allUserInfo.get(p);
                    if(item.get(0).equals(userId))
                    {
                        onlyUserInfo.add(allUserInfo.get(p));
                        q++;
                    }
                }
            }
        }
        return onlyUserInfo;
    }

    @Override
    public void displayDataViewAll(Integer dataLine, String searchTxt, String type) {
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = allUserDataInfo(fileName);
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
            if(type.equals("resident")){
                this.setUserId(allData.get(dataLine).get(0));
                this.setUserName(allData.get(dataLine).get(1));
                this.setUserGender(allData.get(dataLine).get(2));
                this.setUserAge(allData.get(dataLine).get(3));
                this.setUserPhoneNumber(allData.get(dataLine).get(4));
                this.setUserUnit(allData.get(dataLine).get(5));
                this.setUserImage(allData.get(dataLine).get(6));
                this.status = true;
            }else if(type.equals("vendor"))
            {
                this.setUserId(allData.get(dataLine).get(0));
                this.setUserName(allData.get(dataLine).get(1));
                this.setUserGender(allData.get(dataLine).get(2));
                this.setUserAge(allData.get(dataLine).get(3));
                this.setUserPhoneNumber(allData.get(dataLine).get(4));
                this.setUserImage(allData.get(dataLine).get(5));
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
    public void setDataNull() {
        //no matter what type, set all data null
//        if(type.equals("resident") || type.equals("vendor"))
//        {
            this.setUserId(null);
            this.setUserName(null);
            this.setUserGender(null);
            this.setUserAge(null);
            this.setUserPhoneNumber(null);
            this.setUserImage(null);
            this.setUserUnit(null);
//        }
    }

    @Override
    public void displayDataViewOwn(Integer dataLine, String searchTxt, String type) {
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
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
            if(type.equals("resident")){
                this.setUserId(allData.get(dataLine).get(0));
                this.setUserName(allData.get(dataLine).get(1));
                this.setUserGender(allData.get(dataLine).get(2));
                this.setUserAge(allData.get(dataLine).get(3));
                this.setUserPhoneNumber(allData.get(dataLine).get(4));
                this.setUserUnit(allData.get(dataLine).get(5));
                this.setUserImage(allData.get(dataLine).get(6));
                this.status = true;
            }else if(type.equals("vendor"))
            {
                this.setUserId(allData.get(dataLine).get(0));
                this.setUserName(allData.get(dataLine).get(1));
                this.setUserGender(allData.get(dataLine).get(2));
                this.setUserAge(allData.get(dataLine).get(3));
                this.setUserPhoneNumber(allData.get(dataLine).get(4));
                this.setUserImage(allData.get(dataLine).get(5));
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
   
}
