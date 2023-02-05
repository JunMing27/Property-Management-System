/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
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
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Jun Ming
 */

public class BusinessManagerMain {
    //VARIABLESSS FOR BUSINESS MANAGER FUNCTIONALITY : USER MANAGEMENT
    private String id;
    private String name;
    private String gender;
    private String age;
    private String phoneNumber;
    private String UserImage;
    private Boolean Status;
        
    //VARIABLESSS FOR BUSINESS MANAGER FUNCTIONALITY : BUDGET PLANNING
    private String budgetId;
    private String projectName;
    private String projectBudget;
    private String projectStartDate;
    private String projectEndDate;
    
    //GET FOR BUSINESS MANAGER FUNCTIONALITY : USER MANAGEMENT
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
    
    public boolean getStatus(){
        return Status;
    }
    
    //GET FOR BUSINESS MANAGER FUNCTIONALITY : BUDGET PLANNING
    public String getBudgetId(){
        return budgetId;
    }
    public String getBudgetProjectName(){
        return projectName;
    }
    public String getBudgetProjectBudget(){
        return projectBudget;
    }
    public String getBudgetProjectStartDate(){
        return projectStartDate;
    }
    public String getBudgetProjectEndDate(){
        return projectEndDate;
    }
    //Method to choose correct txt file based on userType, so no need to redundant code
    private String file="";
    
    public void chooseTxtFile(String Type){
        if(Type=="Admin Executive"){
            file ="AdminExecutive.txt";
        }else if (Type=="Building Executive"){
            file ="BuildingExecutive.txt";
        }else if (Type=="budgetPlanning"){
            file = "BudgetPlanning.txt";
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
                        if(file=="AdminExecutive.txt" || file=="BuildingExecutive.txt" ){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/mavenproject1/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+",").append(user.get(5)+"\n");
                            bw.close();
                        }
                        else if (file=="BudgetPlanning.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/mavenproject1/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+"\n");
                            bw.close();
                        }
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
    public  void displayDataView(Integer dataLine,String searchTxt,String type) throws FileNotFoundException, IOException{
        BusinessManagerMain main = new BusinessManagerMain();
        String fileName = "src/main/java/com/mycompany/mavenproject1/"+file;
        ArrayList<ArrayList<String>> allData = main.UserInfo(fileName);
        int i =0;
        int fixedSize = allData.size();
        int changedSize = allData.size();
        if(!searchTxt.equals("")){
            System.out.println("can run searchTxt got value");
            for (int x=0;x<fixedSize+1;x++) {
                if(i ==changedSize){
                    break;
                }
                // user.get(0) is userID, user.get(1) is username
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
            if(type=="user"){
                allData.get(dataLine);
                this.id=allData.get(dataLine).get(0);
                this.name = allData.get(dataLine).get(1);
                this.gender = allData.get(dataLine).get(2);
                this.age = allData.get(dataLine).get(3);
                this.phoneNumber = allData.get(dataLine).get(4);
                this.UserImage = allData.get(dataLine).get(5);
                this.Status = true;
            }else if(type=="budget"){
                this.budgetId=allData.get(dataLine).get(0);
                this.projectName=allData.get(dataLine).get(1);
                this.projectBudget=allData.get(dataLine).get(2);
                this.projectStartDate=allData.get(dataLine).get(3);
                this.projectEndDate=allData.get(dataLine).get(4);
                this.Status=true;
            }
        }catch(Exception e){
            setDataNull(type);
            this.Status = false;
        }
        if(dataLine.equals(newSize-1)){
            this.Status = false;
        }
    }
            
    
    // Method to display User Data : if txt file no user record, it will display data as null 
    public void setDataNull(String type){
        if(type=="user"){
            this.id = null;
            this.name =  null;
            this.gender = null;
            this.age =  null;
            this.phoneNumber =  null;
            this.UserImage = null;
        }else if(type=="budget"){
            this.budgetId=null;
            this.projectName=null;
            this.projectBudget=null;
            this.projectStartDate=null;
            this.projectEndDate=null;
        }
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
    
    
    // Method to getData based on ID
    public void getDataViewSingle(String id, String file,String type) throws FileNotFoundException{
        BusinessManagerMain main = new BusinessManagerMain();
        String fileName = "src/main/java/com/mycompany/mavenproject1/"+file;
        ArrayList<ArrayList<String>> allData = main.UserInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    if(type=="budget"){
                        this.budgetId=singleData.get(0);
                        this.projectName=singleData.get(1);
                        this.projectBudget=singleData.get(2);
                        this.projectStartDate=singleData.get(3);
                        this.projectEndDate=singleData.get(4);
                    }
                    break;
                }
            }
    }
    
    //GLOBAL USE EDIT OR ADD DATA METHOD
    public void editOrAddData(ArrayList<String> dataList, String type, String file,String functionType){
        if(functionType=="edit"){
            try {
                BusinessManagerMain main = new BusinessManagerMain();
                String fileName = "src/main/java/com/mycompany/mavenproject1/"+file;
                ArrayList<ArrayList<String>> allData = main.UserInfo(fileName);
                for (ArrayList<String> user : allData) {
                    if (user.get(0).equals(dataList.get(0))) {
                        if(type=="budget"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            user.set(3, dataList.get(3));
                            user.set(4, dataList.get(4));
                            break;
                        }
                    }
                }
                new FileWriter(fileName, false).close();
                for (ArrayList<String> user : allData) {
                    try {
                        if(type=="budget"){
                            File userData = new File("src/main/java/com/mycompany/mavenproject1/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+"\n");
                            bw.close();
                        }
                    }
                    catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "failed to update file", "Warning", JOptionPane.ERROR_MESSAGE);
                    }
                }
                JOptionPane.showMessageDialog(null, "Edited Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
            } 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problem Occured, Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        }else if (functionType=="add"){
            try {
                BufferedWriter AddDataToFile;
                FileWriter AddNewItem = new FileWriter("src/main/java/com/mycompany/mavenproject1/"+file,true);
                AddDataToFile = new BufferedWriter(AddNewItem);
                if(type=="budget"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2)+",");
                    AddDataToFile.write(dataList.get(3)+",");
                    AddDataToFile.write(dataList.get(4));
                }
                AddDataToFile.newLine();
                AddDataToFile.close();
                AddNewItem.close();
                JOptionPane.showMessageDialog(null, "Added new data Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Failed to add new data", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }
    
    //GLOBAL USE METHOD TO INCREASE ID NUMBER 
    public void getIncreasedID(String file,String type){
         BufferedReader input;
        try {
            input = new BufferedReader(new FileReader("src/main/java/com/mycompany/mavenproject1/"+file));
            String last="";
            String line="";
            String ID="";
            try {
                while ((line = input.readLine()) != null) {
                    last = line;
                }
                Scanner ScanEachString = new Scanner(last);
                ScanEachString.useDelimiter("[,\n]");
                while (ScanEachString.hasNextLine()) {
                    // First character of a string
                    ID = (ScanEachString.next().trim());
                    break;
                }
                if(type=="budget"){
                    String IDchar = ID.substring(0,2);
                    ID = ID.substring(2);
                    Integer IDnumber = Integer.parseInt(ID)+1;
                    ID = IDchar+ (IDnumber).toString();
                    this.budgetId=ID;
                }
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
        }
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
                oneUserInfo = sc.nextLine().trim(); 
                itemArray = oneUserInfo.split(","); 
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
    
    
