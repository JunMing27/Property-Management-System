/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dataController;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jun Ming
 */
public class userCredential {
    private String credentialName;
    private String password;
    
    public String getCredentialName(){
        return credentialName;
    }
    public String getPassword(){
        return password;
    }
    
    public void setCredentialName(String credentialName){
        this.credentialName= credentialName;
    }
    public void setPassword(String password){
        this.password= password;
    }
    
    public void getCredentialData(String userId) throws FileNotFoundException{
        ;
    }
    
    // EDIT OR ADD DATA METHOD FOR CREDENTIAL
    public void addCredential(String id, String userName, String pass,String role) throws IOException{
        ;
    }
    
    public void editCredential(String id ,String userName, String userPass){
        ;
    }
    
    //delete userCredential when admin delete user data
    public void deleteUserCredential(String userID){
        ;
    }
}
