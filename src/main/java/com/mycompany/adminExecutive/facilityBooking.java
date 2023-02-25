/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adminExecutive;

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
public class facilityBooking implements displayController, dataManagementController1{

    private String facilityBookingId;
    private String facilityId;
    private String facilityName;
    private String residentId;
    private String bookingDate;
    private String bookingStartTime;
    private String duration;
    
    public String getFacilityBookingId(){
        return facilityBookingId;
    }
    public String getFacilityId(){
        return facilityId;
    }
    public String getFacilityName(){
        return facilityName;
    }
    public String getResidentId(){
        return residentId;
    }
    public String getBookingDate(){
        return bookingDate;
    }
    public String getBookingStartTime(){
        return bookingStartTime;
    }
    public String getBookingDuration(){
        return duration;
    }
    
    public void setFacilityBookingId(String facilityBookingId){
        this.facilityBookingId=facilityBookingId;
    }
    public void setFacilityId(String facilityId){
        this.facilityId=facilityId;
    }
    public void setFacilityName(String facilityName){
        this.facilityName=facilityName;
    }
    public void setResidentId(String residentId){
        this.residentId=residentId;
    }
    public void setBookingDate(String bookingDate){
        this.bookingDate=bookingDate;
    }
    public void setBookingStartTime(String bookingStartTime){
        this.bookingStartTime=bookingStartTime;
    }
    public void setBookingDuration(String duration){
        this.duration=duration;
    }
    
    private Boolean Status;
    private String file="FacilityBooking.txt";

    public Boolean getStatus(){
        return Status;
    }
    private ArrayList<String> dropDownDatas = new ArrayList<String>();
    
    public ArrayList<String>  getDropDownData(){
        return dropDownDatas;
    }
    private ArrayList<String> dropDownDataTemp = new ArrayList<String>();
    
    public ArrayList<String>  getDropDownDataTemp(){
        return dropDownDataTemp;
    }
    public void setDropDownNull(){
        this.dropDownDatas.clear();
    }
    
    @Override
    public void chooseTxtFile(String Type) {
        file="FacilityBooking.txt";
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
            setFacilityBookingId(allData.get(dataLine).get(0));
            setFacilityId(allData.get(dataLine).get(1));
            setFacilityName(allData.get(dataLine).get(2));
            setResidentId(allData.get(dataLine).get(3));
            setBookingDate(allData.get(dataLine).get(4));
            setBookingStartTime(allData.get(dataLine).get(5));
            setBookingDuration(allData.get(dataLine).get(6));
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
        setFacilityBookingId(null);
        setFacilityId(null);
        setFacilityName(null);
        setResidentId(null);
        setBookingDate(null);
        setBookingStartTime(null);
        setBookingDuration(null);
    }
    @Override
    public void getDataViewSingle(String id, String file, String type) {
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    setFacilityBookingId(singleData.get(0));
                    setFacilityId(singleData.get(1));
                    setFacilityName(singleData.get(2));
                    setResidentId(singleData.get(3));
                    setBookingDate(singleData.get(4));
                    setBookingStartTime(singleData.get(5));
                    setBookingDuration(singleData.get(6));
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
                    ID = "FB1";
                    setFacilityBookingId(ID);
                }else{
                    Scanner ScanEachString = new Scanner(last);
                    ScanEachString.useDelimiter("[,\n]");
                    while (ScanEachString.hasNextLine()) {
                        // First character of a string
                        ID = (ScanEachString.next().trim());
                        break;
                    }
                        String IDchar = ID.substring(0,2);
                        ID = ID.substring(2);
                        Integer IDnumber = Integer.parseInt(ID)+1;
                        ID = IDchar+ (IDnumber).toString();
                        setFacilityBookingId(ID);
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
    class facilityBookingMethod{
        public void getDropDownData(String file,String type,String id) throws FileNotFoundException
        {
            String fileName = "src/main/java/com/mycompany/textFile/"+file;
            ArrayList<ArrayList<String>> allData = DataInfo(fileName);

            for (ArrayList<String> singleData : allData) {
                if(type=="FacilityBooking"){
                    dropDownDatas.add(singleData.get(0));
                }
                if(type=="FacilityBookingGetFacilityName" && singleData.get(0).equals(id) ){
                    dropDownDataTemp.add(singleData.get(1));
                }

            }
        }
    }
    
    
    
    
    //add by hoiyi

    @Override
    public ArrayList<ArrayList<String>> allUserDataInfo(String textFile) {
        return null;
    }

    @Override
    public ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile) {
        ArrayList<ArrayList<String>> allUserInfo = DataInfo(textFile);
        ArrayList<ArrayList<String>> onlyUserInfo = new ArrayList<>();
        
        int p,q;
        
        for (p=0,q=0; p<allUserInfo.size(); p++)
        {
            if(allUserInfo.get(p).contains(this.getResidentId()))
            {
                ArrayList<String> item = allUserInfo.get(p);
                if(item.get(3).equals(this.getResidentId()))
                {
                    onlyUserInfo.add(allUserInfo.get(p));
                    q++;
                }
            }
        }
        return onlyUserInfo;
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
            Logger.getLogger(facilityBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void editFile(String textFile, ArrayList<String> dataList) {
        try {
            File file = new File("src/main/java/com/mycompany/textFile/"+textFile+".txt");
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(dataList.get(0)+","
                    +dataList.get(1)+","
                    +dataList.get(2)+","
                    +dataList.get(3)+","
                    +dataList.get(4)+","
                    +dataList.get(5)+","
                    +dataList.get(6)+"\n");
            
            
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(facilityBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getNextId(String textFile) {
        return 0;
    }
    
}
