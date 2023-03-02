/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.BuildingExecutive;

import com.mycompany.dataController.displayController;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jun Ming
 */
public class employeeJob implements displayController{

    private String jobId;
    private String employeeId;
    private String employeeJob;
    private String employeeJobDescription;
    
    public String getJobId(){
        return jobId;
}
    public String getEmployeeId(){
        return employeeId;
}
    public String getEmployeeJob(){
        return employeeJob;
}
    public String getEmployeeJobDescription(){
        return employeeJobDescription;
}
    
    public void setEmployeeId(String employeeId){
        this.employeeId =employeeId;
    }
    
    public void setEmployeeJob(String employeeJob){
        this.employeeJob =employeeJob;
    }
    public void setEmployeeJobDescription(String employeeJobDescription){
        this.employeeJobDescription =employeeJobDescription;
    }
    public void setJobId(String jobId){
        this.jobId =jobId;
    }
    private ArrayList<String> dropDownDatas = new ArrayList<String>();
    
    public ArrayList<String>  getDropDownData(){
        return dropDownDatas;
    }
    
    private Boolean Status;
    private String file="EmployeeJob.txt";

    public Boolean getStatus(){
        return Status;
    }
    
    @Override
    public void chooseTxtFile(String Type) {
        file="EmployeeJob.txt";
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
            setJobId(allData.get(dataLine).get(0));
            setEmployeeJob(allData.get(dataLine).get(1));
            setEmployeeJobDescription(allData.get(dataLine).get(2));
            setEmployeeId(allData.get(dataLine).get(3));
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
        setJobId(null);
        setEmployeeJob(null);
        setEmployeeJobDescription(null);
        setEmployeeId(null);

    }
    @Override
    public void getDataViewSingle(String id, String file, String type) {
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    setJobId(singleData.get(0));
                    setEmployeeJob(singleData.get(1));
                    setEmployeeJobDescription(singleData.get(2));
                    setEmployeeId(singleData.get(3));
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
                    ID = "EJ1";
                    setJobId(ID);
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
                        setJobId(ID);
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
 
    class employeeJobMethod{
        public void getDropDownData(String file,String type) throws FileNotFoundException{
            String fileName = "src/main/java/com/mycompany/textFile/"+file;
            ArrayList<ArrayList<String>> allData = DataInfo(fileName);

            for (ArrayList<String> singleData : allData) {
                if(type=="EmployeeJob"){
                    dropDownDatas.add(singleData.get(0));
                }

            }
        }
    }
    
}
