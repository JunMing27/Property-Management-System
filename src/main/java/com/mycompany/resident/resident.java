/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resident;

import com.mycompany.dataController.User;
import com.mycompany.dataController.dataManagementController1;
import com.mycompany.dataController.displayController;
import com.mycompany.dataController.displayController1;
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

/**
 *
 * @author HoiYi
 */
public class resident extends User implements dataManagementController1, displayController1, displayController{

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

    
    //add user unit
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
        String fileName = "src/main/java/com/mycompany/textFile/loginCredential.txt";
        ArrayList<ArrayList<String>> allData = allUserDataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(this.getUserId())) {
                    setCredentialName(singleData.get(1));
                    setPassword(singleData.get(2));
                    break;
                }
            }
    
    }

    @Override
    public ArrayList<ArrayList<String>> allUserDataInfo(String textFile) {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(resident.class.getName()).log(Level.SEVERE, null, ex);
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
        } 
        return allUserInfo;
    }
    
    @Override
    public ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile) {
        ArrayList<ArrayList<String>> allUserInfo = allUserDataInfo(textFile);
        ArrayList<ArrayList<String>> onlyUserInfo = new ArrayList<>();
        
        int p,q;
        for (p=0,q=0; p<allUserInfo.size(); p++)
        {
            if(allUserInfo.get(p).contains(this.getUserId()))
            {
                ArrayList<String> item = allUserInfo.get(p);
                if(item.get(0).equals(this.getUserId()))
                {
                    onlyUserInfo.add(allUserInfo.get(p));
                    q++;
                }
            }
        }
        
        
        return onlyUserInfo;
    }

    @Override
    public void displayDataViewAll(Integer dataLine, String searchTxt, String type, String fileName) {
        
    }

    @Override
    public void setDataNull() {
        this.setUserId(null);
        this.setUserName(null);
        this.setUserGender(null);
        this.setUserAge(null);
        this.setUserPhoneNumber(null);
        this.setUserImage(null);
        this.setUserUnit(null);
    }

    @Override
    public void displayDataViewOwn(Integer dataLine, String searchTxt, String type, String fileName) {
        fileName = "src/main/java/com/mycompany/textFile/"+fileName+".txt";
        ArrayList<ArrayList<String>> allData = onlyUserDataInfo(fileName);
        
        int newSize = allData.size();
        try{
            
            this.setUserId(allData.get(dataLine).get(0));
            this.setUserName(allData.get(dataLine).get(1));
            this.setUserGender(allData.get(dataLine).get(2));
            this.setUserAge(allData.get(dataLine).get(3));
            this.setUserPhoneNumber(allData.get(dataLine).get(4));
            this.setUserUnit(allData.get(dataLine).get(5));
            this.setUserImage(allData.get(dataLine).get(6));
                        
        }catch(Exception e){
            setDataNull();
            this.status = false;
        }
        if(dataLine.equals(newSize-1)){
            this.status = false;
        }
    }



    @Override
    public void removeFromFile(String textFile, ArrayList<String> dataList) {
        try {
            String filePath = "src/main/java/com/mycompany/textFile/"+textFile+".txt";
            ArrayList<ArrayList<String>> allUsers = allUserDataInfo(filePath);
            
            for(int j=0;j<allUsers.size();j++)
            {
                if(allUsers.get(j).get(0).equals(dataList.get(0)))
                {
                    allUsers.remove(j);
                    break;
                }
            }
            
            File file= new File(filePath);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int j=0; j<allUsers.size(); j++) 
            {
                ArrayList<String>item = allUsers.get(j);
                for(int k=0; k<item.size(); k++)
                {
                    if(k == item.size()-1)
                    {
                       bw.write(item.get(k));
                    }else{
                       bw.write(item.get(k)+",");
                    }
                }
                bw.write("\n");
            }
            bw.close();
            
        }catch (IOException ex) {
            Logger.getLogger(resident.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editFile(String textFile,  ArrayList<String> dataList) {
        try {
            File file = new File("src/main/java/com/mycompany/textFile/"+textFile+".txt");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            if(textFile.equals("residentProfile") || textFile.equals("FacilityBooking"))
            {
                bw.write(dataList.get(0)+","
                        +dataList.get(1)+","
                        +dataList.get(2)+","
                        +dataList.get(3)+","
                        +dataList.get(4)+","
                        +dataList.get(5)+","
                        +dataList.get(6)+"\n");
            }
            else if(textFile.equals("loginCredential") || textFile.equals("Complaint"))
            {
                bw.write(dataList.get(0)+","
                        +dataList.get(1)+","
                        +dataList.get(2)+","
                        +dataList.get(3)+"\n");
            }
            else if(textFile.equals("Pending"))
            {
                bw.write(dataList.get(5)+","
                        +dataList.get(1)+","
                        +dataList.get(2)+","
                        +dataList.get(3)+","
                        +dataList.get(4)+"\n");
            }
            else if(textFile.equals("VisitorPass"))
            {
                bw.write(dataList.get(0)+","
                        +dataList.get(1)+","
                        +dataList.get(2)+","
                        +dataList.get(3)+","
                        +dataList.get(4)+"\n");
            }
            
            
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(resident.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }

    @Override
    public int getNextId(String textFile) {
        int id = 0;
        try 
        { 
            File file = new File("src/main/java/com/mycompany/textFile/"+textFile+".txt");
            FileReader fr = new FileReader(file); 
            BufferedReader br = new BufferedReader(fr); 
            String line = br.readLine(); 
            if(textFile.equals("Pending"))
            {
                while(line != null ) 
                { 
                    String[] dataRow = line.split(",");
                    for(int i=0; i<dataRow.length; i++) 
                    { 
                        id = Integer.parseInt(dataRow[0].substring(dataRow[0].indexOf("PE")+2));
                    }
                    line = br.readLine(); 
                } 
            }
            else if(textFile.equals("VisitorPass"))
            {
                while(line != null ) 
                { 
                    String[] dataRow = line.split(",");
                    for(int i=0; i<dataRow.length; i++) 
                    { 
                        id = Integer.parseInt(dataRow[0].substring(dataRow[0].indexOf("VP")+2));
                    }
                    line = br.readLine(); 
                }
            }
            br.close();
            id = id+1;
        }catch (IOException ex) { 
            Logger.getLogger(resident.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return id;
    }

    @Override
    public void transferImage(File source, File destination) {
        
        try {
            InputStream is = new FileInputStream(source);
            OutputStream os = new FileOutputStream(destination);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            is.close();
            os.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(resident.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(resident.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }


    
    
    class residentMethod{
        public void editProfile(String textFile, ArrayList<String> dataList)
        {
            removeFromFile(textFile, dataList);
            editFile(textFile, dataList);
        }
        
        public void editCredential(String textFile, ArrayList<String> dataList)
        {
            removeFromFile(textFile, dataList);
            editFile(textFile, dataList);
        }
        
        public void makePayment(String removeFile, String addingFile, ArrayList<String> dataList)
        {
            removeFromFile(removeFile, dataList);
            editFile(addingFile, dataList);
        }
        
        public void addFacilityReservation(String textFile, ArrayList<String> dataList)
        {
            editFile(textFile, dataList);
        }
        
        public void editFacilityReservation(String textFile, ArrayList<String> dataList)
        {
            removeFromFile(textFile, dataList);
            editFile(textFile, dataList);
        }
        
        public void deleteFacilityReservation(String textFile, ArrayList<String> dataList)
        {
            removeFromFile(textFile, dataList);
        }
        
        public void addVisitorPass(String textFile, ArrayList<String> dataList)
        {
            editFile(textFile, dataList);
        }
        
        public void editVisitorPass(String textFile, ArrayList<String> dataList)
        {
            removeFromFile(textFile, dataList);
            editFile(textFile, dataList);
        }
        
        public void deleteVisitorPass(String textFile, ArrayList<String> dataList)
        {
            removeFromFile(textFile, dataList);
        }
        
        public void addComplaint(String textFile, ArrayList<String> dataList)
        {
            editFile(textFile, dataList);
        }
        
        public void editComplaint(String textFile, ArrayList<String> dataList)
        {
            removeFromFile(textFile, dataList);
            editFile(textFile, dataList);
        }
        
        public void deleteComplaint(String textFile, ArrayList<String> dataList)
        {
            removeFromFile(textFile, dataList);
        }
    }
    
    
    
    
    
    
    
  
    private String file="residentProfile.txt";
    public String getFileType(){
        return file;
    }
    
    @Override
    public void chooseTxtFile(String Type) {
    if (Type=="Resident"){
            file ="residentProfile.txt";
        }
    }

    @Override
    public void displayDataView(Integer dataLine, String searchTxt, String type) {
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = allUserDataInfo(fileName);
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
            if(type=="Resident"){
                this.setUserId(allData.get(dataLine).get(0));
                this.setUserName(allData.get(dataLine).get(1));
                this.setUserGender(allData.get(dataLine).get(2));
                this.setUserAge(allData.get(dataLine).get(3));
                this.setUserPhoneNumber(allData.get(dataLine).get(4));
                this.setUserUnit(allData.get(dataLine).get(5));
                this.setUserImage(allData.get(dataLine).get(6));
                this.status = true;
            }
        }catch(Exception e){
            setDataNull(type);
            this.status = false;
        }    
    }

    @Override
    public void setDataNull(String type) {
        if(type=="Resident"){
            this.setUserId(null);
            this.setUserName(null);
            this.setUserGender(null);
            this.setUserAge(null);
            this.setUserPhoneNumber(null);
            this.setUserUnit(null);
            this.setUserImage(null);
        }    
    }

    @Override
    public void getDataViewSingle(String id, String file, String type) {
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = allUserDataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    if(type=="Resident"){
                        this.setUserId(singleData.get(0));
                        this.setUserName(singleData.get(1));
                        this.setUserGender(singleData.get(2));
                        this.setUserAge(singleData.get(3));
                        this.setUserPhoneNumber(singleData.get(4));
                        this.setUserUnit(singleData.get(5));
                        this.setUserImage(singleData.get(6));
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
                Scanner ScanEachString = new Scanner(last);
                ScanEachString.useDelimiter("[,\n]");
                while (ScanEachString.hasNextLine()) {
                    // First character of a string
                    ID = (ScanEachString.next().trim());
                    break;
                }
                if(last==""){
                    ID = "R1";
                    setUserId(ID);
                }else{
                if(type=="Resident"){
                    String IDchar = ID.substring(0,1);
                    ID = ID.substring(1);
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

    
    
}
