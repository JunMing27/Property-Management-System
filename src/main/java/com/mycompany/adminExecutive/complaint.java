/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adminExecutive;

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
public class complaint implements displayController{

    
    private String complaintId;
    private String complaintDescription;
    private String complaintReply;
    private String residentId;
    
    public String getComplaintId(){
        return complaintId;
    }
    public String getComplaintDescription(){
        return complaintDescription;
    }
    public String getComplaintReply(){
        return complaintReply;
    }
    public String getUserId(){
        return residentId;
    }
    
    public void setComplaintId(String complaintId){
        this.complaintId=complaintId;
    }
    public void setComplaintDesc(String desc){
        this.complaintDescription=desc;
    }
    public void setComplaintReply(String reply){
        this.complaintReply=reply;
    }
    public void setUserId(String residentId){
        this.residentId=residentId;
    }
    
    private ArrayList<String> dropDownDatas = new ArrayList<String>();
    
    public ArrayList<String>  getDropDownData(){
        return dropDownDatas;
    }
    
    private Boolean Status;
    private String file="Complaint.txt";

    public Boolean getStatus(){
        return Status;
    }
    
    @Override
    public void chooseTxtFile(String Type) {
        file="Complaint.txt";
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
            setComplaintId(allData.get(dataLine).get(0));
            setComplaintDesc(allData.get(dataLine).get(1));
            setComplaintReply(allData.get(dataLine).get(2));
            setUserId(allData.get(dataLine).get(3));
            Status=true;
            
        }catch(Exception e){
            setDataNull(type);
            Status = false;
        }
        if(dataLine.equals(newSize-1)){
            Status = false;
        }
    }
    @Override
    public void setDataNull(String type) {
        setComplaintId(null);
        setComplaintDesc(null);
        setComplaintReply(null);
        setUserId(null);

    }
    @Override
    public void getDataViewSingle(String id, String file, String type) {
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    setComplaintId(singleData.get(0));
                    setComplaintDesc(singleData.get(1));
                    setComplaintReply(singleData.get(2));
                    setUserId(singleData.get(3));
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
                    String IDchar = ID.substring(0,1);
                    ID = ID.substring(1);
                    Integer IDnumber = Integer.parseInt(ID)+1;
                    ID = IDchar+ (IDnumber).toString();
                    setComplaintId(ID);
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
 
    class complaintMethod{
        public void getDropDownData(String file,String type) throws FileNotFoundException{
            String fileName = "src/main/java/com/mycompany/textFile/"+file;
            ArrayList<ArrayList<String>> allData = DataInfo(fileName);

            for (ArrayList<String> singleData : allData) {
                if(type=="Complaint"){
                    dropDownDatas.add(singleData.get(0));
                }

            }
        }
    }
    
    
    
    //add by hoiyi
    public void removeFromFile(String textFile, ArrayList<String> dataList) {
        try {
            String filePath = "src/main/java/com/mycompany/textFile/"+textFile+".txt";
            ArrayList<ArrayList<String>> allUsers = DataInfo(filePath);
            for(int j=0;j<allUsers.size();j++)
                {
                    if(allUsers.get(j).get(3).equals(dataList.get(0))
                            && allUsers.get(j).get(0).equals(dataList.get(1)))
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
            Logger.getLogger(complaint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void displayDataViewOwn(Integer dataLine, String fileName)
    {
        fileName = "src/main/java/com/mycompany/textFile/"+fileName+".txt";
        ArrayList<ArrayList<String>> allUserInfo = DataInfo(fileName);
        ArrayList<ArrayList<String>> onlyUserInfo = new ArrayList<>();
        int p,q;
        for (p=0,q=0; p<allUserInfo.size(); p++)
        {
            if(allUserInfo.get(p).contains(this.getUserId()))
            {
                ArrayList<String> item = allUserInfo.get(p);
                if(item.get(3).equals(this.getUserId()))
                {
                    onlyUserInfo.add(allUserInfo.get(p));
                    q++;
                }
            }
        }
        int newSize = onlyUserInfo.size();
        try{
            setComplaintId(onlyUserInfo.get(dataLine).get(0));
            setComplaintDesc(onlyUserInfo.get(dataLine).get(1));
            setComplaintReply(onlyUserInfo.get(dataLine).get(2));
            setUserId(onlyUserInfo.get(dataLine).get(3));
            Status=true;
            
        }catch(Exception e){
            setDataNull("");
            Status = false;
        }
        if(dataLine.equals(newSize-1)){
            Status = false;
        }
        
    }
    
    public void editFile(String textFile,  ArrayList<String> dataList) {
        try {
            File file = new File("src/main/java/com/mycompany/textFile/"+textFile+".txt");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(dataList.get(1)+","
                        +dataList.get(2)+","
                        +dataList.get(3)+","
                        +dataList.get(0)+"\n");
            
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(complaint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
