/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Jun Ming
 */
//VARIABLESSS
public class BusinessManagerMain {
    private String id;
    private String name;
    private String gender;
    private String age;
    private String phoneNumber;
    private String UserImage;
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
    public String getAdminOrBuildingUserImage(){
        return UserImage;
    }
    
    public boolean getAdminOrBuildingUserStatus(){
        return Status;
    }
    
    //Method to choose correct txt file based on userType, so no need to redundant code
    private String file="";
    
    public void chooseTxtFile(String UserType){
        if(UserType=="Admin Executive"){
            file ="AdminExecutive.txt";
        }else if (UserType=="Building Executive"){
            file ="BuildingExecutive.txt";
        }
    }
    
    public void deleteFunction(String userID){
        try {
            int i =0;
            String fileName = "src/main/java/com/mycompany/mavenproject1/"+file;
            ArrayList<ArrayList<String>> allUsers = UserInfo(fileName);
            for (ArrayList<String> user : allUsers) {
                
                if (user.get(0).equals(userID)) {
                    allUsers.remove(i);
                    break;
                }
                
                i=i+1;
            }
            new FileWriter(fileName, false).close();
            for (ArrayList<String> user : allUsers) {
                if (!user.get(1).equals("")) {
                    try {
                        appendUserManage(user.get(0),user.get(1),user.get(2),user.get(3),user.get(4),user.get(5), this.file);
                    }
                    catch (IOException e) {
                    }
                }
            }
        } 
        catch (Exception ex) {
        }
    }
    
    
    // Method to display User Data
    //- store the current items from txt file to a 2d array, then loop to display user data at BusManuserManage
    public  void displayDataView(Integer dataLine,String searchTxt) throws FileNotFoundException, IOException{
        BusinessManagerMain main = new BusinessManagerMain();
        String fileName = "src/main/java/com/mycompany/mavenproject1/"+file;
        ArrayList<ArrayList<String>> allUsers = main.UserInfo(fileName);
        int i =0;
        int fixedSize = allUsers.size();
        int changedSize = allUsers.size();
        if(!searchTxt.equals("")){
            System.out.println("can run searchTxt got value");
            for (int x=0;x<fixedSize+1;x++) {
                if(i ==changedSize){
                    System.out.println("break");
                    System.out.println(allUsers);
                    break;
                }
                // user.get(0) is userID, user.get(1) is username
                if(!(allUsers.get(i)).contains(searchTxt)){
                    allUsers.remove(i);
                    changedSize=changedSize-1;
                    i=i-1;
                }
                i=i+1;
            }
        }
        int newSize = allUsers.size();
        try{
            allUsers.get(dataLine);
            this.id=allUsers.get(dataLine).get(0);
            this.name = allUsers.get(dataLine).get(1);
            this.gender = allUsers.get(dataLine).get(2);
            this.age = allUsers.get(dataLine).get(3);
            this.phoneNumber = allUsers.get(dataLine).get(4);
            this.UserImage = allUsers.get(dataLine).get(5);
            this.Status = true;
            System.out.println("error 1");
        }catch(Exception e){
            System.out.println("error 2");
            setDataNull();
            this.Status = false;
            System.out.println("error 3");
        }
        if(dataLine.equals(newSize-1)){
            this.Status = false;
        }
    }
            
    
    // Method to display User Data : if txt file no user record, it will display data as null 
    public void setDataNull(){
        this.id = null;
        this.name =  null;
        this.gender = null;
        this.age =  null;
        this.phoneNumber =  null;
        this.UserImage = null;
    }
    
    
    
    // Method to add User data
    // method is set in BusManUserManageAddEdit file : insertDataToFile()
    //Method to edit User data
    public void displayAdminOrBuildingUser(String GetUserType, String UserID){
        File userData = new File("src/main/java/com/mycompany/mavenproject1/"+this.file);
        try{
            Scanner userDataReader = new Scanner(userData);
            userDataReader.useDelimiter("[,\n]");
            while (userDataReader.hasNextLine()) {
                this.id = userDataReader.next().trim();
                this.name = userDataReader.next().trim();
                this.gender = userDataReader.next().trim();
                this.age = userDataReader.next().trim();
                this.phoneNumber = userDataReader.next().trim();
                this.UserImage = userDataReader.next().trim();
                // loop through the txt file, if user id matches with the userID in parameter, call method to display data in edit page
                if(this.id.equals(UserID)){
                    BusManUserManageAddEdit edit = new BusManUserManageAddEdit();
                    edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    edit.pack();
                    edit.setResizable(false);
                    edit.setLocationRelativeTo(null);
                    edit.setVisible(true);
                    edit.editUserToggle(GetUserType);
                    edit.editDataToFileDisplay(this.id, this.name, this.gender, this.age, this.phoneNumber, this.UserImage);
                    break;
                }
            }
        }
        catch(Exception e){}
    }
    
    
    //- Methods to edit/ delete specific line in txt file (CRUD)
    //- appendItem method is to append the item array that gotten from the ItemsInfo method into the txt file 
    public void appendUserManage(String userID ,String userName,String Gender,String Age,String phoneNumber, String ImageName,String filename) throws IOException {
        File userData = new File("src/main/java/com/mycompany/mavenproject1/"+filename);
        FileWriter fw = new FileWriter(userData,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(userID+",").append(userName+",").append(Gender+",").append(Age+",").append(phoneNumber+",").append(ImageName+"\n");
        bw.close();
    }
    
    //- store the current items from txt file to a 2d array 
    public  ArrayList<ArrayList<String>> UserInfo(String textFile) throws FileNotFoundException {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = new Scanner(file);
            String oneUserInfo; 
            String[] itemArray;
            ArrayList<String> itemArrayList;
            allUserInfo = new ArrayList<>();
            while (sc.hasNextLine()) { 
                oneUserInfo = sc.nextLine().trim(); // id;name;gender;age;phoneNumber;UserImage
                itemArray = oneUserInfo.split(","); // [id,name,gender,age,phoneNumber,UserImage]
                itemArrayList = new ArrayList<>(Arrays.asList(itemArray));
                allUserInfo.add(itemArrayList);
            }
        } else {
        }
        return allUserInfo;
    }
    
    //+ File method
    //+ Method to store uploaded image to a specific location
    public static void transferImage(File source, File destination) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(destination);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
    
    //+ Method to restrict image upload function to only accept specific file type (IMAGE FOR EXAMPLE)
    class ImageFilter extends FileFilter {
   public final static String JPEG = "jpeg";
   public final static String JPG = "jpg";
   public final static String GIF = "gif";
   public final static String TIFF = "tiff";
   public final static String TIF = "tif";
   public final static String PNG = "png";
   
   @Override
   public boolean accept(File f) {
      if (f.isDirectory()) {
         return true;
      }

      String extension = getExtension(f);
      if (extension != null) {
         if (extension.equals(TIFF) ||
            extension.equals(TIF) ||
            extension.equals(GIF) ||
            extension.equals(JPEG) ||
            extension.equals(JPG) ||
            extension.equals(PNG)) {
            return true;
         } else {
            return false;
         }
      }
      return false;
   }

   @Override
   public String getDescription() {
      return "Image Only";
   }

   String getExtension(File f) {
      String ext = null;
      String s = f.getName();
      int i = s.lastIndexOf('.');
   
      if (i > 0 &&  i < s.length() - 1) {
         ext = s.substring(i+1).toLowerCase();
      }
      return ext;
   } 
}
}
    
    
