/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.resident;

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
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author HoiYi
 */
public class resident extends User implements dataManagementController1, displayController1{

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

    
    
}
