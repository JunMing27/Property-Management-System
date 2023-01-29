/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;

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
    
    // Business Manager Functionality : User Management (Admin and Building Executive)
    // Method to display User Data
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
                    this.UserImage = ScanEachString.next().trim();
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
    
    // Method to display User Data : if txt file no user record, it will display data as null 
    public void setDataNull(){
        this.id = null;
        this.name =  null;
        this.gender = null;
        this.age =  null;
        this.phoneNumber =  null;
        this.UserImage = null;
    }
    
    //Method to choose correct txt file based on userType, so no need to redundant code
    private String file="";
    public void chooseTxtFile(String UserType){
        if(UserType=="Admin Executive"){
            file ="AdminExecutive.txt";
        }else if (UserType=="Building Executive"){
            file ="BuildingExecutive.txt";
        }
        System.out.println(UserType);
    }
    
    // Method to add User data
    // method is set in BusManUserManageAddEdit file : insertDataToFile()
    //Method to edit User data
    public void EditAdminOrBuildingUser(String GetUserType, String UserID){
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
                System.out.println(UserID);
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
                    System.out.println(this.id);
                    break;
                }
            }
        }
        catch(Exception e){}
    }
    
        // Method to store uploaded image to a specific location
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
    
    // Method to restrict image upload function to only accept specific file type (IMAGE FOR EXAMPLE)
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
    
    
