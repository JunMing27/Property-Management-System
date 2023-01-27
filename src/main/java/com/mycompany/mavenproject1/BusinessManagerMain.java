/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Jun Ming
 */
public class BusinessManagerMain {
    private String id;
    private String name;
    private String gender;
    private String age;
    private String phoneNumber;
    private String emailAddress;
    private Boolean Status;
        
    public String getAdminOrBuildingUserId(){
        return id;
    }
    public String getAdminOrBuildingUserName(){
        return name;
    }
    public String getAdminOrBuildingUserGender(){
        return gender;
    }
    public String getAdminOrBuildingUserAge(){
        return age;
    }
    public String getAdminOrBuildingUserPhone(){
        return phoneNumber;
    }
    public String getAdminOrBuildingUserEmail(){
        return emailAddress;
    }
    
    public boolean getAdminOrBuildingUserStatus(){
        return Status;
    }
    
    public void setAdminOrBuildingUser(String UserType,Integer PageLine) throws IOException{ 
            String listOfString=null;
            List <String> getLineNumber = new ArrayList<String>();
            Integer lineNumber=0;
            
            if (UserType =="Admin Executive"){
                // access file to get data
                try{
                    listOfString = Files.readAllLines(Paths.get("src/main/java/com/mycompany/mavenproject1/AdminExecutive.txt")).get(PageLine);
                    getLineNumber= Files.readAllLines(Paths.get("src/main/java/com/mycompany/mavenproject1/AdminExecutive.txt"));
                }
                catch(Exception e){
                    setDataNull();
                }
                
            }else if(UserType =="Building Executive"){
                // access file to get data
                try{
                    listOfString = Files.readAllLines(Paths.get("src/main/java/com/mycompany/mavenproject1/BuildingExecutive.txt")).get(PageLine);
                    getLineNumber= Files.readAllLines(Paths.get("src/main/java/com/mycompany/mavenproject1/BuildingExecutive.txt"));
                }
                catch(Exception e){
                    setDataNull();
                }
            }
            if (listOfString != null){
                Scanner ScanEachString = new Scanner(listOfString);
                ScanEachString.useDelimiter("[,\n]");
                while (ScanEachString.hasNextLine()) {
                    this.id = ScanEachString.next().trim();
                    this.name = ScanEachString.next().trim();
                    this.gender = ScanEachString.next().trim();
                    this.age = ScanEachString.next().trim();
                    this.phoneNumber = ScanEachString.next().trim();
                    this.emailAddress = ScanEachString.next().trim();
                    this.Status = true;
                }
            }
            else {
                setDataNull();
                this.Status = false;
            }
                
            for (String  StringlineNumber : getLineNumber){
                lineNumber= lineNumber +1;
            }
            if (PageLine.equals(lineNumber-1)){
                this.Status= false;
                
            }
          
        }
    
    public void setDataNull(){
        this.id = null;
        this.name =  null;
        this.gender = null;
        this.age =  null;
        this.phoneNumber =  null;
        this.emailAddress = null;
    }
    
    
    
    
}
    
    
