/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.resident;

import com.mycompany.dataController.User;
import com.mycompany.dataController.dataManagementController;
import com.mycompany.dataController.displayController;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author HoiYi
 */
public class resident extends User implements dataManagementController, displayController{

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
    public void editOrAddData(ArrayList<String> dataList, String type, String file, String functionType) {
        
    }

    @Override
    public void deleteFunction(String itemID) {
        
    }

    @Override
    public ArrayList<ArrayList<String>> DataInfo(String textFile) {
        return null;
    }

    @Override
    public void transferImage(File source, File destination) {
        
    }

    @Override
    public void chooseTxtFile(String Type) {
        
    }

    @Override
    public void displayDataView(Integer dataLine, String searchTxt, String type) {
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
            //for profile
            if(type.equals("Resident")){
                this.setUserId(allData.get(dataLine).get(0));
                this.setUserName(allData.get(dataLine).get(1));
                this.setUserGender(allData.get(dataLine).get(2));
                this.setUserAge(allData.get(dataLine).get(3));
                this.setUserPhoneNumber(allData.get(dataLine).get(4));
                this.setUserUnit(allData.get(dataLine).get(5));
                this.setUserImage(allData.get(dataLine).get(6));
                this.status = true;
            }
            //for profile
            else if(type.equals("vendor"))
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
            setDataNull(type);
            this.status = false;
        }
        if(dataLine.equals(newSize-1)){
            this.status = false;
        }
    }

    @Override
    public void setDataNull(String type) {
        
    }

    @Override
    public void getDataViewSingle(String id, String file, String type) {
        
    }

    @Override
    public void getIncreasedID(String file, String type) {
        
    }
    
}
