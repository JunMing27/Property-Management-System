/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;


import com.mycompany.dataController.User;
import com.mycompany.dataController.dataManagementController;
import com.mycompany.dataController.dataManagementController1;
import com.mycompany.dataController.displayController;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jun Ming
 */
public class employee extends User implements dataManagementController, displayController, dataManagementController1{

    private String employeeJobScope;
    
    public String getEmployeeJobScope(){
        return employeeJobScope;
    }
    
    public void setEmployeeJobScope(String jobscope){
        this.employeeJobScope=jobscope;
    }
    
    private Boolean Status;
    
    public employee() {
        Status = false;
  }

    public Boolean getStatus(){
        return Status;
    }
    public void setStatus(Boolean status) {
        this.Status=status; 
    }
    private String dataId;
    private String file="Employee.txt";
    public String getFileType(){
        return file;
    }
    
    @Override
    public void chooseTxtFile(String Type) {
        if (Type=="Employee"){
            file ="Employee.txt";
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
            if(type=="Employee"){
                this.setUserId(allData.get(dataLine).get(0));
                this.setUserName(allData.get(dataLine).get(1));
                this.setUserGender(allData.get(dataLine).get(2));
                this.setUserAge(allData.get(dataLine).get(3));
                this.setUserPhoneNumber(allData.get(dataLine).get(4));
                this.setEmployeeJobScope(allData.get(dataLine).get(5));
                this.setUserImage(allData.get(dataLine).get(6));
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
        if(type=="Employee"){
            this.setUserId(null);
            this.setUserName(null);
            this.setUserGender(null);
            this.setUserAge(null);
            this.setUserPhoneNumber(null);
            this.setEmployeeJobScope(null);
            this.setUserImage(null);
        }
    }

    @Override
    public void getDataViewSingle(String id, String file, String type) {
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    if(type=="Employee"){
                        this.setUserId(singleData.get(0));
                        this.setUserName(singleData.get(1));
                        this.setUserGender(singleData.get(2));
                        this.setUserAge(singleData.get(3));
                        this.setUserPhoneNumber(singleData.get(4));
                        this.setEmployeeJobScope(singleData.get(5));
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
                if(last==""){
                    ID = "E1";
                    setUserId(ID);
                }else{
                    Scanner ScanEachString = new Scanner(last);
                    ScanEachString.useDelimiter("[,\n]");
                    while (ScanEachString.hasNextLine()) {
                        // First character of a string
                        ID = (ScanEachString.next().trim());
                        break;
                    }
                    if(type=="Employee"){
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

    @Override
    public void editOrAddData(ArrayList<String> dataList, String type, String file, String functionType) {
        
    }

    @Override
    public void deleteFunction(String itemID) {
        
    }

    @Override
    public void transferImage(File source, File destination) {
        
    }

    @Override
    public ArrayList<ArrayList<String>> allUserDataInfo(String textFile) {
        return null;
    }

    @Override
    public ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile) {
        return null;
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
            
        } catch (IOException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editFile(String textFile, ArrayList<String> dataList) {
        try {
            File file = new File("src/main/java/com/mycompany/textFile/"+textFile+".txt");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            if(textFile.equals("VisitorEntry"))
            {
                bw.write(dataList.get(0)+","
                        +dataList.get(1)+","
                        +dataList.get(2)+","
                        +dataList.get(3)+","
                        +dataList.get(4)+"\n");
            }
            else if(textFile.equals("Incident"))
            {
                bw.write(dataList.get(0)+","
                        +dataList.get(1)+","
                        +dataList.get(2)+"\n");
            }
            
            
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
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
            if(textFile.equals("VisitorEntry"))
            {
                while(line != null )
                {
                    String[] dataRow = line.split(",");
                    for(int i=0; i<dataRow.length; i++)
                    {
                        id = Integer.parseInt(dataRow[0].substring(dataRow[0].indexOf("VE")+2));
                    }
                    line = br.readLine();
                }
            }
            else if(textFile.equals("Incident"))
            {
                while(line != null )
                {
                    String[] dataRow = line.split(",");
                    for(int i=0; i<dataRow.length; i++)
                    {
                        id = Integer.parseInt(dataRow[0].substring(dataRow[0].indexOf("IC")+2));
                    }
                    line = br.readLine();
                }
            }
            
            br.close();
            id = id+1;
            
        } catch (IOException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    
    
    
    
    
    
    
    
    
    class employeeMethod{
        
        public void addVisitorEntry(String textFile, ArrayList<String> dataList)
        {
            editFile(textFile, dataList);
        }
        
        public void editVisitorEntry(String textFile, ArrayList<String> dataList)
        {
            removeFromFile(textFile, dataList);
            editFile(textFile, dataList);
        }
        
        public void checkInCheckpoint(String textFile, ArrayList<String> dataList)
        {
            editFile(textFile, dataList);
        }
        
        public void addIncident(String textFile, ArrayList<String> dataList)
        {
            editFile(textFile, dataList);
        }
        
        public void editIncident(String textFile, ArrayList<String> dataList)
        {
            removeFromFile(textFile, dataList);
            editFile(textFile, dataList);
        }
    }
    
    
}
