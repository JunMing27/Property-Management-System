/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dataController;

/**
 *
 * @author Jun Ming
 */
public class User extends userCredential{
    private String userId;
    private String userName;
    private String userGender;
    private String userAge;
    private String phoneNumber;
    private String userImage;
    private String userType;
    
    // GET 
    public String getUserId(){
        return userId;
    }
    public String getUserName(){
        return userName;
    }
    public String getUserGender(){
        return userGender;
    }
    public String getUserAge(){
        return userAge;
    }
    public String getUserPhone(){
        return phoneNumber;
    }
    public String getUserImage(){
        return userImage;
    }
    public String getUserType(){
        return userType;
    }
    
    // SET
    public void setUserId(String userId){
        this.userId=userId;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setUserGender(String userGender){
        this.userGender=userGender;
    }
    public void setUserAge(String userAge){
        this.userAge=userAge;
    }
    public void setUserPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setUserImage(String userImage){
        this.userImage=userImage;
    }
    public void setUserType(String userType){
        this.userType=userType;
    }

    
    // GET from userCredential Superclass
    @Override
    public String getCredentialName(){
        return super.getCredentialName();
    }
    
    @Override
    public String getPassword(){
        return super.getPassword();
    }
    
    //SET from userCredential Superclass
    public void setCredentialName(String credentialName){
        super.setCredentialName(credentialName);
    }
    public void setPassword(String password){
        super.setPassword(password);
    }
    
}
