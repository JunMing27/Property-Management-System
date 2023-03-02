package com.mycompany.AccExecutive;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.resident;

import com.mycompany.dataController.displayController;
import com.mycompany.dataController.displayController1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author edi
 */
public class statement implements displayController{

    private String statementId;
    private String userId;
    private String userName;
    private String paidDate;
    private String paidAmount;
    private String paymentDesc;
    private boolean status;

    
    public String getstatementId() {
        return statementId;
    }
    public void setstatementId(String statementId) {
        this.statementId = statementId;
    }

    public String getuserId() {
        return userId;
    }
    
    public void setuserId(String userId) {
        this.userId = userId;
    }
    
    
    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getpaidDate() {
        return paidDate;
    }

    public void setpaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String getpaidAmount() {
        return paidAmount;
    }

    public void setpaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }
    
    public void setpaymentDesc(String paymentDesc){
        this.paymentDesc = paymentDesc;
    }
    
    public String getpaymentDesc() {
        return paymentDesc;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    private Boolean Status;
    private String file="StatementContent.txt";
    @Override
    public void chooseTxtFile(String Type) {
        file="StatementContent.txt";
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
                // display.get(0) is userID, user.get(1) is username
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
            setstatementId(allData.get(dataLine).get(0));
            setuserId(allData.get(dataLine).get(1));
            setuserName(allData.get(dataLine).get(2));
            setpaidDate(allData.get(dataLine).get(3));
            setpaidAmount(allData.get(dataLine).get(4));
            setpaymentDesc(allData.get(dataLine).get(5));
           
            status=true;
            
        }catch(Exception e){
            setDataNull(type);
            status = false;
        }
        if(dataLine.equals(newSize-1)){
            status = false;
        }
    }
    
    @Override
    public void setDataNull(String type) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
        setstatementId(null);
        setuserId(null);
        setuserName(null);
        setpaidDate(null);
        setpaidAmount(null);
        setpaymentDesc(null);

    }

    @Override
    public void getDataViewSingle(String id, String file, String type) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    setstatementId(singleData.get(0));
                    setuserId(singleData.get(1));
                    setuserName(singleData.get(2));
                    setpaidDate(singleData.get(3));
                    setpaidAmount(singleData.get(4));
                    setpaymentDesc(singleData.get(5));
                    break;
                }
            }
    }

    @Override
    public void getIncreasedID(String file, String type) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
                    ID = "ST1";
                    setstatementId(ID);
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
                        setstatementId(ID);
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
 
//    class employeeJobMethod{
//        public void getDropDownData(String file,String type) throws FileNotFoundException{
//            String fileName = "src/main/java/com/mycompany/textFile/"+file;
//            ArrayList<ArrayList<String>> allData = DataInfo(fileName);
//
//            for (ArrayList<String> singleData : allData) {
//                if(type=="EmployeeJob"){
//                    dropDownDatas.add(singleData.get(0));
//                }

//    void displayDataView(Integer PageLine, String payment) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

            }
        
    

