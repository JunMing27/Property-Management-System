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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author user
 */
public class BuildingExecMain {
    private String userID;
    private String userName;
    private String userGender;
    private String userAge;
    private String phoneNumber;
    private String UserImage;
    private String userType;

    //VARIABLESSS FOR Building Executive FUNCTIONALITY :Job management
    private String JobID;
    private String EmployeeName;
    private String EmployeeJob;
  
//    Statement ID, User ID, Username, Paid Date, Paid Amount, Description
    //Variables for AccExecutive Functionality: Complaint Manager
    private String ComplaintID;
    private String ComplaintDetails;
    private String ComplaintReply;
  

//    Receipt ID, User ID, Description, Paid Amount, Paid Date, Date Issued
    //Variables for AccExecutive Functionality: Patrol Management
    private String CheckpointRecordID; 
    private String UserID;
    private String BlockNumber;
    private String CheckpointDate;
    private String CheckpointTime;
    
    
    //COMMON VARIABLES (USABLE FOR SEVERAL FUNCTION)
    private String dataId;
    private Boolean Status;
    private String credentialName;
    private String password;
    
    
   //Acc Exec Functionality : User Profile
    public String getId() {
        return userID;
    }
    public String getName() {
        return userName;
    }
    public String getGender() {
        return userGender;
    }
    public String getAge() {
        return userAge;
    }
    public String getPhone() {
        return phoneNumber;
    }
    public String getUserImage() {
        return UserImage;
    }
    public String getUserType() {
        return userType;
    }
    
    //GET For Acc Executive FUNCTIONALITY : Job Management
    public String getJobID(){
        return JobID;
    }
    public String getEmployeeName(){
        return EmployeeName;
    }
    public String getEmployeeJob(){
        return EmployeeJob;
    }
    
    
    //Get for Acc Executive Functionality : Complaint Management
    public String getComplaintID(){
        return ComplaintID;
    }
    public String getComplaintDetails(){
        return ComplaintDetails;
    }
    public String getComplaintReply(){
        return ComplaintReply;
    }
    
    //get for Acc Exec Functionality : Receipt Management
    public String getCheckpointRecordID(){
        return CheckpointRecordID;
    }
    public String getUserID(){
        return UserID;
    }
    public String getBlockNumber(){
        return BlockNumber;
    }
    public String getCheckpointDate(){
        return CheckpointDate;
    }
    public String getCheckpointTime(){
        return CheckpointTime;
    }

    //SET USER TYPE
    public void setUserType(String userType1){
        this.userType=userType1;
    }
    
    // GET FUNCTION FOR COMMON VARIABLE
    public boolean getStatus(){
        return Status;
    }
    public String getCredentialName(){
        return credentialName;
    }
    public String getPassword(){
        return password;
    }
    public String getFileType(){
        return file;
    }
    
    private String file="";
    
    public void chooseTxtFile(String Type){
        if(Type=="Job"){
            file ="EmployeeJob.txt";
        }else if (Type=="Patrol"){
            file ="CheckpointRecord.txt";
        }else if (Type=="Complaint"){
            file ="Complaint.txt";
        }
    }
    
    // Method to display User Data
    //- store the current items from txt file to a 2d array, then loop to display user data at Manage
    public  void displayDataView(Integer dataLine,String searchTxt,String type) throws FileNotFoundException, IOException{
        BuildingExecMain main = new BuildingExecMain();
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = main.DataInfo(fileName);
        int i =0;
        int fixedSize = allData.size();
        int changedSize = allData.size();
        if(!searchTxt.equals("")){
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
            if(type=="Job" || type=="Patrol" || type=="Complaint"){
                allData.get(dataLine);
                this.userID=allData.get(dataLine).get(0);
                this.userName = allData.get(dataLine).get(1);
                this.userGender = allData.get(dataLine).get(2);
                this.userAge = allData.get(dataLine).get(3);
                this.phoneNumber = allData.get(dataLine).get(4);
                this.UserImage = allData.get(dataLine).get(5);
                this.Status = true;
            }else if(type=="Job"){
                this.JobID=allData.get(dataLine).get(0);
                this.EmployeeName=allData.get(dataLine).get(1);
                this.EmployeeJob=allData.get(dataLine).get(2);
                this.Status=true;
            }else if(type=="Patrol"){
                this.CheckpointRecordID=allData.get(dataLine).get(0);
                this.UserID=allData.get(dataLine).get(1);
                this.BlockNumber=allData.get(dataLine).get(2);
                this.CheckpointDate=allData.get(dataLine).get(3);
                this.CheckpointTime=allData.get(dataLine).get(4);
                this.Status=true;
            }else if(type=="Complaint"){
                this.ComplaintID=allData.get(dataLine).get(0);
                this.ComplaintDetails=allData.get(dataLine).get(1);
                this.ComplaintReply=allData.get(dataLine).get(2);
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
        if(type=="Job" || type=="Patrol" || type=="Complaint"){
            this.userID = null;
            this.userName =  null;
            this.userGender = null;
            this.userAge =  null;
            this.phoneNumber =  null;
            this.UserImage = null;
        }else if(type=="Job"){
            this.JobID=null;
            this.EmployeeName=null;
            this.EmployeeJob=null;
        }else if(type=="Patrol"){
            this.CheckpointRecordID=null;
            this.UserID=null;
            this.BlockNumber=null;
            this.CheckpointDate=null;
            this.CheckpointTime=null;
        }else if(type=="Complaint"){
            this.ComplaintID=null;
            this.ComplaintDetails=null;
            this.ComplaintReply=null;
        }
    }
    
    // Method to getData based on ID
    public void getDataViewSingle(String id, String file,String type) throws FileNotFoundException{
        AccExecMain main = new AccExecMain();
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = main.DataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    if(type=="Job" || type=="Patrol" || type=="Complaint"){
                        this.userID = singleData.get(0);
                        this.userName = singleData.get(1);
                        this.userGender = singleData.get(2);
                        this.userAge = singleData.get(3);
                        this.phoneNumber = singleData.get(4);
                        this.UserImage = singleData.get(5);
                        getCredentialData(userID);
                    }
                    if(type=="Job"){
                        this.JobID=singleData.get(0);
                        this.EmployeeName=singleData.get(1);
                        this.EmployeeJob=singleData.get(2);
                    }
                    if(type=="Patrol"){
                         this.CheckpointRecordID=singleData.get(0);
                         this.UserID=singleData.get(1);
                         this.BlockNumber=singleData.get(2);
                         this.CheckpointDate=singleData.get(3);
                         this.CheckpointTime=singleData.get(4);
                    }
                    if(type=="Complaint"){
                        this.ComplaintID=singleData.get(0);
                        this.ComplaintDetails=singleData.get(1);
                        this.ComplaintReply=singleData.get(2);
                    }
                    break;
                }
            }
    }

//COMMON USE Method to get credential if data need login credential
    public void getCredentialData(String userId) throws FileNotFoundException{
        AdminExecutiveMain main = new AdminExecutiveMain();
        String fileName = "src/main/java/com/mycompany/textFile/loginCredential.txt";
        ArrayList<ArrayList<String>> allData = main.dataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(userId)) {
                    this.credentialName=singleData.get(1);
                    this.password=singleData.get(2);
                    break;
                }
            }
    }
    
    //COMMON USE EDIT OR ADD DATA METHOD
    public void editOrAddData(ArrayList<String> dataList, String type, String file,String functionType){
        if(functionType=="edit"){
            try {
                BuildingExecMain main = new BuildingExecMain();
                String fileName = "src/main/java/com/mycompany/textFile/"+file;
                ArrayList<ArrayList<String>> allData = main.DataInfo(fileName);
                for (ArrayList<String> user : allData) {
                    if (user.get(0).equals(dataList.get(0))) {
                        if(type=="Account Executive" || type=="Building Executive" || type=="Admin Executive"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            user.set(3, dataList.get(3));
                            user.set(4, dataList.get(4));
                            user.set(5, dataList.get(5));
                            editCredential(dataList.get(0),dataList.get(6),dataList.get(7));
                            break;
                        }
                        if(type=="Job"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            break;
                        }
                        if(type=="Patrol"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            user.set(3, dataList.get(3));
                            user.set(4, dataList.get(4));
                            break;
                        }
                        if(type=="Complaint"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                        }
                    }
                }
                new FileWriter(fileName, false).close();
                for (ArrayList<String> user : allData) {
                    try {
                        if(type=="Account Executive" || type=="Building Executive" || type=="Admin Executive"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+",").append(user.get(5)+"\n");
                            bw.close();
                        }
                        if(type=="Job"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+"\n");
                            bw.close();
                        }
                        if(type=="Patrol"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+"\n");
                            bw.close();
                        }
                        if(type=="Complaint"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+"\n");
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
                FileWriter AddNewItem = new FileWriter("src/main/java/com/mycompany/textFile/"+file,true);
                AddDataToFile = new BufferedWriter(AddNewItem);
                if(type=="Account Executive" || type=="Building Executive" || type=="Admin Executive"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2)+",");
                    AddDataToFile.write(dataList.get(3)+",");
                    AddDataToFile.write(dataList.get(4)+",");
                    AddDataToFile.write(dataList.get(5));
                    System.out.println(dataList.get(0)+" "+dataList.get(6)+" "+dataList.get(7)+" "+userType);
                    addCredential(dataList.get(0),dataList.get(6),dataList.get(7),userType);
                   
                }
                if(type=="Job"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2)+",");
                }
                if(type=="Patrol"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2)+",");
                    AddDataToFile.write(dataList.get(3)+",");
                    AddDataToFile.write(dataList.get(4)+",");
                }
                if(type=="Complaint"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2)+",");
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
    
    // EDIT OR ADD DATA METHOD FOR CREDENTIAL
    public void addCredential(String id, String userName, String pass,String role) throws IOException{
        System.out.println("wanna see wassup in add cred");
        BufferedWriter AddCredentialToFile;
        FileWriter AddNewCredential = new FileWriter("src/main/java/com/mycompany/textFile/loginCredential.txt",true);
        AddCredentialToFile = new BufferedWriter(AddNewCredential);
        AddCredentialToFile.write(id+",");
        AddCredentialToFile.write(userName+",");
        AddCredentialToFile.write(pass+",");
        AddCredentialToFile.write(role);
        AddCredentialToFile.newLine();
        AddCredentialToFile.close();
        AddNewCredential.close();
    }
    
    public void editCredential(String id ,String userName, String userPass){
        try {
            AdminExecutiveMain main = new AdminExecutiveMain();
            String fileName = "src/main/java/com/mycompany/textFile/loginCredential.txt";
            ArrayList<ArrayList<String>> allData = main.dataInfo(fileName);
            for (ArrayList<String> data : allData) {
                if (data.get(0).equals(id)) {
                    data.set(1, userName);
                    data.set(2, userPass);
                    }
            }
            new FileWriter(fileName, false).close();
            for (ArrayList<String> user : allData) {
                try {
                    File userData = new File("src/main/java/com/mycompany/textFile/loginCredential.txt");
                    FileWriter fw = new FileWriter(userData,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+"\n");
                    bw.close();
                }
                catch (IOException e) {
                }
            }
        } 
        catch (Exception ex) {
        }
    }
        public void deleteFunction(String itemID){
        try {
            int i =0;
            String fileName = "src/main/java/com/mycompany/textFile/"+file;
            ArrayList<ArrayList<String>> allUsers = DataInfo(fileName);
            for (ArrayList<String> user : allUsers) {
                
                if (user.get(0).equals(itemID)) {
                    this.dataId=itemID;
                    allUsers.remove(i);
                    break;
                }
                
                i=i+1;
            }
            new FileWriter(fileName, false).close();
            for (ArrayList<String> user : allUsers) {
                if (!user.get(1).equals("")) {
                    try {
                        if(file=="AccountExecutive.txt" || file=="BuildingExecutive.txt" || file=="AdminExecutive.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+",").append(user.get(5)+"\n");
                            bw.close();
                            deleteUserCredential(itemID);
                        }
                        else if (file=="EmployeeJob.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+"\n");
                            bw.close();
                        }
                        else if(file=="CheckpointRecord.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+"\n");
                            bw.close();
                        }
                        else if(file=="Complaint.txt"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+"\n");
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
        
        //delete userCredential when admin delete user data
    public void deleteUserCredential(String userID){
        try {
            int i =0;
            String fileName = "src/main/java/com/mycompany/textFile/loginCredential.txt";
            ArrayList<ArrayList<String>> allCredential = DataInfo(fileName);
            for (ArrayList<String> credential : allCredential) {
                
                if (credential.get(0).equals(userID)) {
                    allCredential.remove(i);
                    break;
                }
                
                i=i+1;
            }
            new FileWriter(fileName, false).close();
            for (ArrayList<String> credential : allCredential) {
                try {
                    System.out.println(file);
                    File userData = new File("src/main/java/com/mycompany/textFile/loginCredential.txt");
                    FileWriter fw = new FileWriter(userData,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.append(credential.get(0)+",").append(credential.get(1)+",").append(credential.get(2)+",").append(credential.get(3)+"\n");
                    bw.close();
                }
                catch (IOException e) {
                }
            }
        } 
        catch (Exception ex) {
        }
    }
    //COMMON USE METHOD TO INCREASE ID NUMBER 
    public void getIncreasedID(String file,String type){
         BufferedReader input;
        try {
            input = new BufferedReader(new FileReader("src/main/java/com/mycompany/textFile/"+file));
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
                if(type=="Job"){
                    String IDchar = ID.substring(0,2);
                    ID = ID.substring(2);
                    Integer IDnumber = Integer.parseInt(ID)+1;
                    ID = IDchar+ (IDnumber).toString();
                    this.JobID=ID;
                }
                if(type=="Admin Executive" || type=="Account Executive" || type=="Building Executive"){
                    String IDchar = ID.substring(0,2);
                    ID = ID.substring(2);
                    Integer IDnumber = Integer.parseInt(ID)+1;
                    ID = IDchar+ (IDnumber).toString();
                    this.userID=ID;
                }
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }
    //- store the current items from txt file to a 2d array 
    public  ArrayList<ArrayList<String>> DataInfo(String textFile) throws FileNotFoundException {
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
