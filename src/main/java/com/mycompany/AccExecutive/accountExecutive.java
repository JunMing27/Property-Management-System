/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AccExecutive;

import com.mycompany.adminExecutive.adminExecutive;
import com.mycompany.dataController.User;
import com.mycompany.dataController.dataManagementController;
import com.mycompany.dataController.displayController;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Edi
 */
public class accountExecutive extends User implements dataManagementController, displayController{
    @Override
    public String getUserId(){
        return super.getUserId();
    }
    @Override
    public String getUserName(){
        return super.getUserName();
    }
    @Override
    public String getUserGender(){
        return super.getUserGender();
    }
    @Override
    public String getUserAge(){
        return super.getUserAge();
    }
    @Override
    public String getUserPhone(){
        return super.getUserPhone();
    }
    @Override
    public String getUserImage(){
        return super.getUserImage();
    }
    @Override
    public String getUserType(){
        return super.getUserType();
    }
    @Override
    public String getCredentialName(){
        return super.getCredentialName();
    }
    
    @Override
    public String getPassword(){
        return super.getPassword();
    }
    
    
    @Override
    public void setUserId(String userId) {
        super.setUserId(userId); 
    }
    @Override
    public void setUserName(String userName) {
        super.setUserName(userName); 
    }
    @Override
    public void setUserGender(String userGender) {
        super.setUserGender(userGender); 
    }
    @Override
    public void setUserAge(String userAge) {
        super.setUserAge(userAge); 
    }
    @Override
    public void setUserPhoneNumber(String phoneNumber) {
        super.setUserPhoneNumber(phoneNumber); 
    }
    @Override
    public void setUserImage(String userImage) {
        super.setUserImage(userImage); 
    }
    @Override
    public void setUserType(String userType) {
        super.setUserType(userType); 
    }
    //SET from userCredential Superclass
    @Override
    public void setCredentialName(String credentialName){
        super.setCredentialName(credentialName);
    }
    @Override
    public void setPassword(String password){
        super.setPassword(password);
    }
    private Boolean Status;
    

    public Boolean getStatus(){
        return Status;
    }
    public void setStatus(Boolean status) {
        this.Status=status; 
    }
    private String dataId;
    private String file="";
    public String getFileType(){
        return file;
    }
    
    private ArrayList<String> dropDownDatas = new ArrayList<String>();
    
    public ArrayList<String>  getDropDownData(){
        return dropDownDatas;
    }
    
    @Override
    public void chooseTxtFile(String Type) {
        if(Type=="Payment"){
            file ="Payment.txt";
        }
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
            if(type=="Payment"){
//                this.setUserId(allData.get(dataLine).get(0));
//                this.setUserName(allData.get(dataLine).get(1));
//                this.setUserGender(allData.get(dataLine).get(2));
//                this.setUserAge(allData.get(dataLine).get(3));
//                this.setUserPhoneNumber(allData.get(dataLine).get(4));
//                this.setUserImage(allData.get(dataLine).get(5));
                this.Status = true;
            }
        }catch(Exception e){
            setDataNull(type);
            this.Status = false;
        }
        if(dataLine.equals(newSize-1)){
            this.Status = false;
        }
    }
    @Override
    public void setDataNull(String type) {
        
    }
    @Override
    public void getDataViewSingle(String id, String file, String type) {
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    if(type=="Payment"){                    
                        try {
                            getCredentialData(this.getUserId());
                        } catch (FileNotFoundException ex) {
                        }
                    }
                    break;
                }
            }
    }
    @Override
    public void editOrAddData(ArrayList<String> dataList, String type, String file, String functionType) {
        if(functionType=="edit"){
            try {
                String fileName = "src/main/java/com/mycompany/textFile/"+file;
                ArrayList<ArrayList<String>> allData = DataInfo(fileName);
                for (ArrayList<String> user : allData) {
                    if (user.get(0).equals(dataList.get(0))) {
                        if(type=="Payment"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            user.set(3, dataList.get(3));
                            user.set(4, dataList.get(4));
                            break;
                        }
                        if(type=="Statement"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            user.set(3, dataList.get(3));
                            user.set(4, dataList.get(4));
                            user.set(5, dataList.get(5));
                            break;
                        }
                        if(type=="Invoice"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            user.set(3, dataList.get(3));
                            user.set(4, dataList.get(4));
                            user.set(5, dataList.get(5));
                            user.set(6, dataList.get(6));
                            
                            break;
                        }
                        if(type=="Receipt"){
                            user.set(1, dataList.get(1));
                            user.set(2, dataList.get(2));
                            user.set(3, dataList.get(3));
                            user.set(4, dataList.get(4));
                            user.set(5, dataList.get(5));
                            
                            break;
                        }
                        
                        if(type=="Pending"){
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
                        if(type=="Payment"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+"\n");
                            bw.close();
                        }
                        if(type=="Statement"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+",").append(user.get(5)+"\n");
                            bw.close();
                        }
                        if(type=="Invoice"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+",").append(user.get(5)+",").append(user.get(6)+",").append(user.get(7)+"\n");
                            bw.close();
                        }
                        if(type=="Receipt"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+",").append(user.get(5)+"\n");
                            bw.close();
                        }
                        if(type=="Pending"){
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
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
                FileWriter AddNewItem = new FileWriter("src/main/java/com/mycompany/textFile/"+file,true);
                AddDataToFile = new BufferedWriter(AddNewItem);
                if(type=="Payment"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2)+",");
                    AddDataToFile.write(dataList.get(3)+",");
                    AddDataToFile.write(dataList.get(4));

                }
                if(type=="Statement"){
                    AddDataToFile.write(dataList.get(0)+",");
                    AddDataToFile.write(dataList.get(1)+",");
                    AddDataToFile.write(dataList.get(2)+",");
                    AddDataToFile.write(dataList.get(3)+",");
                    AddDataToFile.write(dataList.get(4)+",");
                    AddDataToFile.write(dataList.get(5));
                }
                if(type=="Invoice"){
                   AddDataToFile.write(dataList.get(0)+",");
                   AddDataToFile.write(dataList.get(1)+",");
                   AddDataToFile.write(dataList.get(2)+",");
                   AddDataToFile.write(dataList.get(3)+",");
                   AddDataToFile.write(dataList.get(4)+",");
                   AddDataToFile.write(dataList.get(5)+",");
                   AddDataToFile.write(dataList.get(6)+",");
                   AddDataToFile.write(dataList.get(7)); 
                }
                if(type=="Receipt"){
                   AddDataToFile.write(dataList.get(0)+",");
                   AddDataToFile.write(dataList.get(1)+",");
                   AddDataToFile.write(dataList.get(2)+",");
                   AddDataToFile.write(dataList.get(3)+",");
                   AddDataToFile.write(dataList.get(4)+",");
                   AddDataToFile.write(dataList.get(5)); 
                }
                if(type=="Pending"){
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

    @Override
    public void deleteFunction(String itemID) {
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
                        if(file=="Payment.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+"\n");
                            bw.close();
                        }
                        if(file=="StatementContent.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+"\n");
                            bw.close();
                            
                        }
                        if(file=="InvoiceContent.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+",").append(user.get(5)+",").append(user.get(6)+",").append(user.get(7)+"\n");
                            bw.close();

                        }
                        if(file=="ReceiptContent.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
                            FileWriter fw = new FileWriter(userData,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.append(user.get(0)+",").append(user.get(1)+",").append(user.get(2)+",").append(user.get(3)+",").append(user.get(4)+",").append(user.get(5)+"\n");

                            bw.close();

                        }
                        if(file=="Pending.txt"){
                            System.out.println(file);
                            File userData = new File("src/main/java/com/mycompany/textFile/"+file);
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

    @Override
    public void getIncreasedID(String file, String type) {
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
                if(last=="" && type.equals("Payment")){
                    ID = "P1";
                    setUserId(ID);
                }else if(last=="" && type.equals("Statement")){
                    ID = "ST1";
                    setUserId(ID);
                }else if(last=="" && type.equals("Building Executive")){
                    ID = "BE1";
                    setUserId(ID);
                    //you do not have to touch anything about increase id or display data only touch crud
                }else{
                    Scanner ScanEachString = new Scanner(last);
                    ScanEachString.useDelimiter("[,\n]");
                    while (ScanEachString.hasNextLine()) {
                        // First character of a string
                        ID = (ScanEachString.next().trim());
                        break;
                    }
                    if(type=="Admin Executive" || type=="Account Executive" || type=="Building Executive"){
                        String IDchar = ID.substring(0,2);
                        ID = ID.substring(2);
                        Integer IDnumber = Integer.parseInt(ID)+1;
                        ID = IDchar+ (IDnumber).toString();
                        setUserId(ID);
                    }
                }
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void getCredentialData(String userId) throws FileNotFoundException{
        String fileName = "src/main/java/com/mycompany/textFile/loginCredential.txt";
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(userId)) {
                    setCredentialName(singleData.get(1));
                    setPassword(singleData.get(2));
                    break;
                }
            }
    }
    
    // EDIT OR ADD DATA METHOD FOR CREDENTIAL
    @Override
    public void addCredential(String id, String userName, String pass,String role) throws IOException{
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
            String fileName = "src/main/java/com/mycompany/textFile/loginCredential.txt";
            ArrayList<ArrayList<String>> allData = DataInfo(fileName);
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
    
    //delete userCredential when admin delete user data
    public void deleteCredential(String userID){
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
    
    @Override
    public ArrayList<ArrayList<String>> DataInfo(String textFile) {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(adminExecutive.class.getName()).log(Level.SEVERE, null, ex);
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
        } else {
        }
        return allUserInfo;
    }

    @Override
    public void transferImage(File source, File destination) {
    }
    
    
    class accountExecutiveMethod{
        public void addEditPayment(ArrayList<String> dataList, String type, String file, String functionType){
            editOrAddData(dataList,type,file,functionType);
        }
        public void deletePayment(String itemId){
            deleteFunction(itemId);
        }
        public void addEditStatement(ArrayList<String> dataList, String type, String file, String functionType){
            editOrAddData(dataList,type,file,functionType);
        }
         public void deleteStatement(String itemId){
            deleteFunction(itemId);
        }
         public void addEditInvoice(ArrayList<String> dataList, String type, String file, String functionType){
            editOrAddData(dataList,type,file,functionType);
        }
         public void deleteInvoice(String itemId){
            deleteFunction(itemId);
        }
    }
}
