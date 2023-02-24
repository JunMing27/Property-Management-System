/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resident;

import com.mycompany.dataController.User;
import com.mycompany.dataController.dataManagementController;
import com.mycompany.dataController.dataManagementController1;
import com.mycompany.dataController.displayController;
import com.mycompany.dataController.displayController1;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.FileNameMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

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
    
    
    //add selectedImageString
    private String selectedImageString;

    public String getSelectedImageString() {
        return selectedImageString;
    }

    public void setSelectedImageString(String selectedImageString) {
        this.selectedImageString = selectedImageString;
    }
    
    
    
    //add selectedImageIcon
    private ImageIcon selectedImageIcon;
    
    public ImageIcon getSelectedImageIcon() {
        return selectedImageIcon;
    }

    public void setSelectedImageIcon(ImageIcon selectedImageIcon) {
        this.selectedImageIcon = selectedImageIcon;
    }
    
    
    //add for pay
    private String payTo;
    private String payAmount;
    private String dueDate;

    public String getPayTo() {
        return payTo;
    }

    public void setPayTo(String payTo) {
        this.payTo = payTo;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    
    //add for statement
    private String monthYear;
    private String date;

    public String getMonthYear() {
        return monthYear;
    }

    public void setMonthYear(String monthYear) {
        this.monthYear = monthYear;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //add for invoice
    private String dateIssued;
    private String dueAmount;

    public String getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    public String getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
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
        ArrayList<ArrayList<String>> allUserInfo = this.allUserDataInfo(textFile);
        ArrayList<ArrayList<String>> onlyUserInfo = new ArrayList<>();
        
        int p,q;
        //for ResidentProfile.txt & vendorProfile.txt
        
        if(textFile.contains("ResidentProfile") || textFile.contains("VendorProfile"))
        {
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
        }
        
        //for StatementContent.txt filter month
        else if(textFile.contains("StatementContent"))
        {
            this.setMonthYear(null);
            for (p=0,q=0; p<allUserInfo.size(); p++)
            {
                if(allUserInfo.get(p).contains(this.getUserId()))
                {
                    ArrayList<String> item = allUserInfo.get(p);
                    if(item.get(1).equals(this.getUserId()))
                    {
                        String monthYear = item.get(3);
                        monthYear = monthYear.substring(monthYear.indexOf("-")+1); //will be 02-2023
                        if(!monthYear.equals(this.getMonthYear()) )
                        {
                            this.setMonthYear(monthYear);
                            onlyUserInfo.add(allUserInfo.get(p));
                            q++;
                        }
                    }
                }
            }
        }
        else if(textFile.contains("InvoiceContent"))
        {
           for (p=0,q=0; p<allUserInfo.size(); p++)
            {
                if(allUserInfo.get(p).contains(this.getUserId()))
                {
                    ArrayList<String> item = allUserInfo.get(p);
                    if(item.get(1).equals(this.getUserId()))
                    {
                        onlyUserInfo.add(allUserInfo.get(p));
                        q++;
                    }
                }
            } 
        }
        
        return onlyUserInfo;
    }

    @Override
    public void displayDataViewAll(Integer dataLine, String searchTxt, String type, String fileName) {
        fileName = "src/main/java/com/mycompany/textFile/"+fileName+".txt";
        ArrayList<ArrayList<String>> allData = allUserDataInfo(fileName);
        int i =0;
        int fixedSize = allData.size();
        int changedSize = allData.size();
        if(!searchTxt.equals("")){
            for (int x=0;x<fixedSize+1;x++) {
                if(i ==changedSize){
                    break;
                }
                
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
            if(type.equals("resident")){
             //no one use yet
            }
            
        }catch(Exception e){
            setDataNull();
            this.status = false;
        }
        if(dataLine.equals(newSize-1)){
            this.status = false;
        }
    }

    @Override
    public void setDataNull() {
        //no matter what type, set all data null
        this.setUserId(null);
        this.setUserName(null);
        this.setUserGender(null);
        this.setUserAge(null);
        this.setUserPhoneNumber(null);
        this.setUserImage(null);
        this.setUserUnit(null);
        this.setPayTo(null);
        this.setPayAmount(null);
        this.setDueDate(null);
        this.setMonthYear(null);
        this.setDate(null);
        this.setDueAmount(null);
        this.setDateIssued(null);
    }

    @Override
    public void displayDataViewOwn(Integer dataLine, String searchTxt, String type, String fileName) {
        fileName = "src/main/java/com/mycompany/textFile/"+fileName+".txt";
        ArrayList<ArrayList<String>> allData = onlyUserDataInfo(fileName);
        int i =0;
        int fixedSize = allData.size();
        int changedSize = allData.size();
        if(!searchTxt.equals("")){
            for (int x=0;x<fixedSize+1;x++) {
                if(i ==changedSize){
                    break;
                }
                
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
            if(type.equals("resident")){
                this.setUserId(allData.get(dataLine).get(0));
                this.setUserName(allData.get(dataLine).get(1));
                this.setUserGender(allData.get(dataLine).get(2));
                this.setUserAge(allData.get(dataLine).get(3));
                this.setUserPhoneNumber(allData.get(dataLine).get(4));
                this.setUserUnit(allData.get(dataLine).get(5));
                this.setUserImage(allData.get(dataLine).get(6));
                this.status = true;
            }else if(type.equals("vendor"))
            {
                this.setUserId(allData.get(dataLine).get(0));
                this.setUserName(allData.get(dataLine).get(1));
                this.setUserGender(allData.get(dataLine).get(2));
                this.setUserAge(allData.get(dataLine).get(3));
                this.setUserPhoneNumber(allData.get(dataLine).get(4));
                this.setUserImage(allData.get(dataLine).get(5));
                this.status = true;
            }else if(type.equals("pay"))
            {
                this.setUserId(allData.get(dataLine).get(1));
                this.setPayTo(allData.get(dataLine).get(2));
                this.setPayAmount(allData.get(dataLine).get(3));
                this.setDueDate(allData.get(dataLine).get(4));
                this.status = true;
            }else if(type.equals("statement"))
            {
                this.setUserId(allData.get(dataLine).get(1));
                this.setDate(allData.get(dataLine).get(3));
                this.status = true;
            }else if(type.equals("invoice"))
            {
                
            }
            
        }catch(Exception e){
            setDataNull();
            this.status = false;
        }
        if(dataLine.equals(newSize-1)){
            this.status = false;
        }
    }


    @Override
    public void displayJFileChooserImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                final String name = f.getName();
                return name.endsWith(".png") || name.endsWith(".jpg");
            }
            @Override
            public String getDescription() {
                return "*.png,*.jpg";
            }
        });
        
        int result = fileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedImagePath = fileChooser.getSelectedFile();
            String selectedImageString = selectedImagePath.toString();
            
            BufferedImage bufferedImage = null;
            try {
                bufferedImage = ImageIO.read(selectedImagePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image profileImage = bufferedImage.getScaledInstance(138, 126, Image.SCALE_SMOOTH);
            ImageIcon profileIcon = new ImageIcon(profileImage);
            this.setSelectedImageIcon(profileIcon);
            
            String image = selectedImageString.substring(selectedImageString.lastIndexOf("/") + 1);
            this.setSelectedImageString(image);
        }
    }

    @Override
    public void removeFromFile(String textFile, ArrayList<String> dataList) {
        try {
            String filePath = "src/main/java/com/mycompany/textFile/"+textFile+".txt";
            ArrayList<ArrayList<String>> allUsers = allUserDataInfo(filePath);
            if(textFile.equals("ResidentProfile") || textFile.equals("vendorProfile") || textFile.equals("loginCredential"))
            {
                for(int j=0;j<allUsers.size();j++)
                {
                    if(allUsers.get(j).get(0).equals(dataList.get(0)))
                    {
                        allUsers.remove(j);
                        break;
                    }
                }
            }
            
            if(textFile.equals("Payment"))
            {
                for(int j=0;j<allUsers.size();j++)
                {
                    if(allUsers.get(j).get(1).equals(dataList.get(0))
                            && allUsers.get(j).get(2).equals(dataList.get(1))
                            && allUsers.get(j).get(3).equals(dataList.get(2))
                            && allUsers.get(j).get(4).equals(dataList.get(3)))
                    {
                        allUsers.remove(j);
                        break;
                    }
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
            if(textFile.equals("ResidentProfile"))
            {
                bw.write(dataList.get(0)+","
                        +dataList.get(1)+","
                        +dataList.get(2)+","
                        +dataList.get(3)+","
                        +dataList.get(4)+","
                        +dataList.get(5)+","
                        +dataList.get(6)+"\n");
            }
            if(textFile.equals("loginCredential"))
            {
                bw.write(dataList.get(0)+","
                        +dataList.get(1)+","
                        +dataList.get(2)+","
                        +dataList.get(3)+"\n");
            }
            if(textFile.equals("Pending"))
            {
                bw.write(dataList.get(4)+","
                        +dataList.get(0)+","
                        +dataList.get(1)+","
                        +dataList.get(2)+","
                        +dataList.get(3)+"\n");
            }
            
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(resident.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }

    @Override
    public int getNextId(String textFile) {
        int id = 0;
        try {
            File file = new File("src/main/java/com/mycompany/textFile/"+textFile+".txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            if(textFile.equals("Complaint"))
            {
                while(line != null )
                {
                    String[] dataRow = line.split(",");
                    for(int i=0; i<dataRow.length; i++)
                    {
                        id = Integer.parseInt(dataRow[0].substring(dataRow[0].indexOf("C")+1));
                    }
                    line = br.readLine();
                }
            }
            else if(textFile.equals("Pending"))
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
            
            br.close();
            
            id = id+1;
        } catch (IOException ex) {
            Logger.getLogger(resident.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    @Override
    public String monthString(String monthNumber) {
        String month = "empty"; 
        if(monthNumber.equals("01")) 
        { 
            month = "JANUARY"; 
        }else if(monthNumber.equals("02")) 
        { 
            month = "FEBRUARY"; 
        }else if(monthNumber.equals("03")) 
        { 
            month = "MARCH"; 
        }else if(monthNumber.equals("04")) 
        { 
            month = "APRIL"; 
        }else if(monthNumber.equals("05")) 
        { 
            month = "MAY"; 
        }else if(monthNumber.equals("06")) 
        { 
            month = "JUNE"; 
        }else if(monthNumber.equals("07")) 
        { 
            month = "JULY"; 
        }else if(monthNumber.equals("08")) 
        { 
            month = "AUGUST"; 
        }else if(monthNumber.equals("09")) 
        { 
            month = "SEPTEMBER"; 
        }else if(monthNumber.equals("10")) 
        { 
            month = "OCTOBER"; 
        }else if(monthNumber.equals("11")) 
        { 
            month = "NOVEMBER"; 
        }else if(monthNumber.equals("12")) 
        { 
            month = "DECEMBER";
        } 
        return month;
    }

    @Override
    public String monthNumber(String monthString) {
        String month = "empty"; 
        if(monthString.equals("JANUARY")) 
        { 
            month = "01"; 
        }else if(monthString.equals("FEBRUARY")) 
        { 
            month = "02"; 
        }else if(monthString.equals("MARCH")) 
        { 
            month = "03"; 
        }else if(monthString.equals("APRIL")) 
        { 
            month = "04"; 
        }else if(monthString.equals("MAY")) 
        { 
            month = "05"; 
        }else if(monthString.equals("JUNE")) 
        { 
            month = "06"; 
        }else if(monthString.equals("JULY")) 
        { 
            month = "07"; 
        }else if(monthString.equals("AUGUST")) 
        { 
            month = "08"; 
        }else if(monthString.equals("SEPTEMBER")) 
        { 
            month = "09"; 
        }else if(monthString.equals("OCTOBER")) 
        { 
            month = "10"; 
        }else if(monthString.equals("NOVEMBER")) 
        { 
            month = "11"; 
        }else if(monthString.equals("DECEMBER")) 
        { 
            month = "12";
        } 
        return month;
    
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
        if(dataLine.equals(newSize-1)){
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
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
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
                if(type=="Resident"){
                    String IDchar = ID.substring(0,1);
                    ID = ID.substring(1);
                    Integer IDnumber = Integer.parseInt(ID)+1;
                    ID = IDchar+ (IDnumber).toString();
                    setUserId(ID);
                }
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ArrayList<ArrayList<String>> DataInfo(String textFile) {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
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

    
}
