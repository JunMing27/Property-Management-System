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
 * @author Jun Ming
 */
public class AdminExecutiveMain {
    //VARIABLES
    //GLOBAL VARIABLES, DIFFERENT FUNCTIONALITY USING SAME VARIABLE
    private Boolean Status;
    private String userName;
    private String password;
    //FACILITY VARIABLES
    private String facilityId;
    private String facilityName;
    private String facilityLocation;
    //UNIT VARIABLES
    private String unitId;
    private String unitNo;
    private String unitBlock;
    private String unitAvailability;
    //EMPLOYEE VARIABLES
    private String employeeId;
    private String employeeName;
    private String employeeGender;
    private String employeeAge;
    private String employeeContact;
    private String employeeJob;
    private String employeeImage;
    //RESIDENT VARIABLES
    private String residentId;
    private String residentName;
    private String residentGender;
    private String residentAge;
    private String residentContact;
    private String residentUnit;
    private String residentImage;
    
    
    //GET METHODS
     public boolean getStatus(){
        return Status;
    }
    public String getUserName(){
       return userName;
   }
    public String getUserPass(){
       return password;
   }
     
    //GET FACILITY
    public String getFacilityId(){
        return facilityId;
    }
    public String getFacilityName(){
        return facilityName;
    }
    public String getFacilityLocation(){
        return facilityLocation;
    }
    
    //GET UNIT
    public String getUnitId(){
        return unitId;
    }
    public String getUnitNo(){
        return unitNo;
    }
    public String getUnitBlock(){
        return unitBlock;
    }
    public String getUnitAvail(){
        return unitAvailability;
    }
    
    //GET EMPLOYEE
    public String getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public String getEmployeeGender(){
        return employeeGender;
    }
    public String getEmployeeAge(){
        return employeeAge;
    }
    public String getEmployeeContact(){
        return employeeContact;
    }
    public String getEmployeeJob(){
        return employeeJob;
    }
    public String getEmployeeImage(){
        return employeeImage;
    }

    //GET RESIDENT
    public String getResidentId(){
        return residentId;
    }
    public String getResidentName(){
        return residentName;
    }
    public String getResidentGender(){
        return residentGender;
    }
    public String getResidentAge(){
        return residentAge;
    }
    public String getResidentContact(){
        return residentContact;
    }
    public String getResidentUnit(){
        return residentUnit;
    }
    public String getResidentImage(){
        return residentImage;
    }
    
    //SET DATA
    //SET CREDENTIAL
    public void setUserName(String username){
        this.userName= username;
    }
    public void setUserPass(String userPass){
        this.password= userPass;
    }
    
    //Method to choose correct txt file based on userType, so no need to redundant code
    private String file="";
    
    public void chooseTxtFile(String Type){
        if(Type=="Unit Management"){
            file ="Unit.txt";
        }else if (Type=="Resident Management"){
            file ="ResidentProfile.txt";
        }else if (Type=="Complaint"){
            file = "Complaint.txt";
        }else if (Type=="Employee"){
            file = "Employee.txt";
        }else if (Type=="Facility Management"){
            file = "Facility.txt";
        }else if (Type=="Facility Booking Management"){
            file = "FacilityBooking.txt";
        }
    }
    
    // GLOBAL USE Method to display Data from txt file *** PAGINATION WITH SEARCH FEATURE IS ALLOWED
    // CREATED BY JUN MING :3
    //- store the current items from txt file to a 2d array, then loop to display user data at BusManuserManage
    public  void displayDataView(Integer dataLine,String searchTxt,String type) throws FileNotFoundException, IOException{
        AdminExecutiveMain main = new AdminExecutiveMain();
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        System.out.println(file);
        ArrayList<ArrayList<String>> allData = main.dataInfo(fileName);
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
            if(type=="facility"){
                this.facilityId=allData.get(dataLine).get(0);
                this.facilityName = allData.get(dataLine).get(1);
                this.facilityLocation = allData.get(dataLine).get(2);
                this.Status = true;
            }else if(type=="unit"){
                this.unitId=allData.get(dataLine).get(0);
                this.unitNo = allData.get(dataLine).get(1);
                this.unitBlock = allData.get(dataLine).get(2);
                this.unitAvailability = allData.get(dataLine).get(3);
                this.Status = true;
            }else if(type=="employee"){
                this.employeeId=allData.get(dataLine).get(0);
                this.employeeName= allData.get(dataLine).get(1);
                this.employeeGender= allData.get(dataLine).get(2);
                this.employeeAge= allData.get(dataLine).get(3);
                this.employeeContact= allData.get(dataLine).get(4);
                this.employeeJob= allData.get(dataLine).get(5);
                this.employeeImage= allData.get(dataLine).get(6);
                this.Status=true;
            }else if(type=="resident"){
                System.out.println("can run resident "+allData.get(dataLine).get(0));
                this.residentId=allData.get(dataLine).get(0);
                this.residentName= allData.get(dataLine).get(1);
                this.residentGender= allData.get(dataLine).get(2);
                this.residentAge= allData.get(dataLine).get(3);
                this.residentContact= allData.get(dataLine).get(4);
                this.residentUnit= allData.get(dataLine).get(5);
                this.residentImage= allData.get(dataLine).get(6);
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
        if(type=="facility"){
            this.facilityId = null;
            this.facilityName =  null;
            this.facilityLocation = null;
        }else if(type=="unit"){
            this.unitId=null;
            this.unitNo=null;
            this.unitBlock=null;
            this.unitAvailability=null;
        }else if(type=="employee"){
            this.employeeId=null;
            this.employeeName=null;
            this.employeeGender=null;
            this.employeeAge=null;
            this.employeeContact=null;
            this.employeeJob=null;
            this.employeeImage=null;
        }else if(type=="resident"){
            this.residentId=null;
            this.residentName=null;
            this.residentGender=null;
            this.residentAge=null;
            this.residentContact=null;
            this.residentUnit=null;
            this.residentImage=null;
        }
    }
    
    
    //GLOBAL USE Method to getData based on ID
    public void getDataViewSingle(String id, String file,String type) throws FileNotFoundException{
        AdminExecutiveMain main = new AdminExecutiveMain();
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = main.dataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    if(type=="facility"){
                        this.facilityId=singleData.get(0);
                        this.facilityName=singleData.get(1);
                        this.facilityLocation=singleData.get(2);
                    }
                    if(type=="unit"){
                        this.unitId=singleData.get(0);
                        this.unitNo=singleData.get(1);
                        this.unitBlock=singleData.get(2);
                        this.unitAvailability=singleData.get(3);
                    }
                    if(type=="employee"){
                        this.employeeId=singleData.get(0);
                        this.employeeName= singleData.get(1);
                        this.employeeGender= singleData.get(2);
                        this.employeeAge= singleData.get(3);
                        this.employeeContact= singleData.get(4);
                        this.employeeJob= singleData.get(5);
                        this.employeeImage= singleData.get(6);
                        getCredentialData(employeeId);
                    }
                    if(type=="resident"){
                        this.residentId=singleData.get(0);
                        this.residentName= singleData.get(1);
                        this.residentGender= singleData.get(2);
                        this.residentAge= singleData.get(3);
                        this.residentContact= singleData.get(4);
                        this.residentUnit= singleData.get(5);
                        this.residentImage= singleData.get(6);
                        getCredentialData(residentId);
                    }
                    break;
                }
            }
    }
    
    //GLOBAL USE Method to get credential if data need login credential
    public void getCredentialData(String userId) throws FileNotFoundException{
        AdminExecutiveMain main = new AdminExecutiveMain();
        String fileName = "src/main/java/com/mycompany/textFile/loginCredential.txt";
        ArrayList<ArrayList<String>> allData = main.dataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(userId)) {
                    this.userName=singleData.get(1);
                    this.password=singleData.get(2);
                    break;
                }
            }
    }
    
    //GLOBAL USE EDIT OR ADD DATA METHOD
    public void editOrAddData(ArrayList<String> dataList, String type, String file,String functionType){
        if(functionType=="edit"){
            try {
                AdminExecutiveMain main = new AdminExecutiveMain();
                String fileName = "src/main/java/com/mycompany/textFile/"+file;
                ArrayList<ArrayList<String>> allData = main.dataInfo(fileName);
                for (ArrayList<String> user : allData) {
                    if (user.get(0).equals(dataList.get(0))) {
                        if(type=="facility"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            break;
                        }
                        if(type=="unit"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            break;
                        }
                        if(type=="employee"){
                            System.out.println("wanna see wassup in edit");
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            user.set(3, dataList.get(3));
                            user.set(4, dataList.get(4));
                            user.set(5, dataList.get(5));
                            user.set(6, dataList.get(6));
                            editCredential(dataList.get(0), dataList.get(7), dataList.get(8));
                            break;
                        }
                        if(type=="resident"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            user.set(3, dataList.get(3));
                            user.set(4, dataList.get(4));
                            user.set(5, dataList.get(5));
                            user.set(6, dataList.get(6));
                            editCredential(dataList.get(0), dataList.get(7), dataList.get(8));
                            break;
                        }
                    }
                }
                new FileWriter(fileName, false).close();
                for (ArrayList<String> user : allData) {
                    try {
                        if(type=="facility"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+"\n");
                            bw.close();
                        }
                        if(type=="unit"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+"\n");
                            bw.close();
                        }
                        if(type=="employee"){
                            System.out.println("data go thru in edit");
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+",").append(user.get(5)+",").append(user.get(6)+"\n");
                            bw.close();
                        }
                        if(type=="resident"){
                            System.out.println("data go thru in edit");
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+",").append(user.get(5)+",").append(user.get(6)+"\n");
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
                if(type=="facility"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2));
                }
                if(type=="unit"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2)+",");
                    AddDataToFile.write("available");
                }
                if(type=="employee"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2)+",");
                    AddDataToFile.write(dataList.get(3)+",");
                    AddDataToFile.write(dataList.get(4)+",");
                    AddDataToFile.write(dataList.get(5)+",");
                    AddDataToFile.write(dataList.get(6));
                    System.out.println(dataList.get(0)+" "+dataList.get(7)+" "+dataList.get(8));
                    addCredential(dataList.get(0),dataList.get(7),dataList.get(8),"employee");
                }
                if(type=="resident"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2)+",");
                    AddDataToFile.write(dataList.get(3)+",");
                    AddDataToFile.write(dataList.get(4)+",");
                    AddDataToFile.write(dataList.get(5)+",");
                    AddDataToFile.write(dataList.get(6));
                    addCredential(dataList.get(0),dataList.get(7),dataList.get(8),"resident");
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
    
    
    //GLOBAL USE METHOD TO DELETE DATA FROM FILE
    public void deleteFunction(String itemID){
        try {
            int i =0;
            String fileName = "src/main/java/com/mycompany/textFile/"+file;
            ArrayList<ArrayList<String>> allData = dataInfo(fileName);
            for (ArrayList<String> data : allData) {
                
                if (data.get(0).equals(itemID)) {
                    this.employeeId=itemID;
                    allData.remove(i);
                    break;
                }
                
                i=i+1;
            }
            new FileWriter(fileName, false).close();
            for (ArrayList<String> data : allData) {
                if (!data.get(1).equals("")) {
                    try {
                        if(file=="Facility.txt" ){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(data.get(0)+",").append(data.get(1)+",").append(data.get(2)+"\n");
                            bw.close();
                        }
                        else if (file=="BudgetPlanning.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(data.get(0)+",").append(data.get(1)+",").append(data.get(2)+",").append(data.get(3)+",").append(data.get(4)+"\n");
                            bw.close();
                        }
                        else if(file=="Employee.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(data.get(0)+",").append(data.get(1)+",").append(data.get(2)+",").append(data.get(3)+",").append(data.get(4)+",").append(data.get(5)+",").append(data.get(6)+"\n");
                            bw.close();
                            deleteUserCredential(employeeId);
                        }
                        else if(file=="ResidentProfile.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(data.get(0)+",").append(data.get(1)+",").append(data.get(2)+",").append(data.get(3)+",").append(data.get(4)+",").append(data.get(5)+",").append(data.get(6)+"\n");
                            bw.close();
                            deleteUserCredential(employeeId);
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
            ArrayList<ArrayList<String>> allCredential = dataInfo(fileName);
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
    
    
    //GLOBAL USE METHOD TO GET INCREMENTED ID NUMBER TO AUTO FILL NEXT USER DATA ID 
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
                if(type=="facility"){
                    String IDchar = ID.substring(0,1);
                    ID = ID.substring(1);
                    Integer IDnumber = Integer.parseInt(ID)+1;
                    ID = IDchar+ (IDnumber).toString();
                    this.facilityId=ID;
                }
                if(type=="unit"){
                    String IDchar = ID.substring(0,1);
                    ID = ID.substring(1);
                    Integer IDnumber = Integer.parseInt(ID)+1;
                    ID = IDchar+ (IDnumber).toString();
                    this.unitId=ID;
                }
                if(type=="employee"){
                    String IDchar = ID.substring(0,1);
                    ID = ID.substring(1);
                    Integer IDnumber = Integer.parseInt(ID)+1;
                    ID = IDchar+ (IDnumber).toString();
                    this.employeeId=ID;
                }
                if(type=="resident"){
                    System.out.println(ID);
                    String IDchar = ID.substring(0,1);
                    ID = ID.substring(1);
                    Integer IDnumber = Integer.parseInt(ID)+1;
                    ID = IDchar+ (IDnumber).toString();
                    System.out.println(ID);
                    this.residentId=ID;
                }
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "There is a problem with ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "There is a problem with ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    //- store the current items from txt file to a 2d array so we can use the arraylist for CRUD features.
    public  ArrayList<ArrayList<String>> dataInfo(String textFile) throws FileNotFoundException {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allDataInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = new Scanner(file);
            String oneUserInfo; 
            String[] itemArray;
            ArrayList<String> itemArrayList;
            allDataInfo = new ArrayList<>();
            while (sc.hasNextLine()) { 
                oneUserInfo = sc.nextLine().trim(); 
                itemArray = oneUserInfo.split(","); 
                itemArrayList = new ArrayList<>(Arrays.asList(itemArray));
                allDataInfo.add(itemArrayList);
            }
        } else {
        }
        return allDataInfo;
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
