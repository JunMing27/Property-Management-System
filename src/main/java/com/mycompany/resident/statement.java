/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resident;

import com.mycompany.dataController.displayController1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoiyi
 */
public class statement implements displayController1{
    private String statementId;
    private String userId;
    private String userName;
    private String paidDate;
    private String paidAmount;
    private String paymentDesc;
    private boolean status;
    private int totalLine;
    private String monthYear;

    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getPaymentDesc() {
        return paymentDesc;
    }

    public void setPaymentDesc(String paymentDesc) {
        this.paymentDesc = paymentDesc;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotalLine() {
        return totalLine;
    }

    public void setTotalLine(int totalLine) {
        this.totalLine = totalLine;
    }

    public String getMonthYear() {
        return monthYear;
    }

    public void setMonthYear(String monthYear) {
        this.monthYear = monthYear;
    }

    
    
    @Override
    public void displayDataViewAll(Integer dataLine, String searchTxt, String type, String fileName) {
    
    }

    @Override
    public void setDataNull() {
        this.setPaidAmount(null);
        this.setPaidDate(null);
        this.setPaymentDesc(null);
        this.setStatementId(null);
        this.setUserName(null);
        this.setMonthYear(null);
    }

    @Override
    public void displayDataViewOwn(Integer dataLine, String searchTxt, String type, String fileName) {
        fileName = "src/main/java/com/mycompany/textFile/"+fileName+".txt";
        ArrayList<ArrayList<String>> allData = onlyUserDataInfo(fileName, type);
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
            if(type.equals("statementMonth"))
            {
                this.setStatementId(allData.get(dataLine).get(0));
                this.setPaidDate(allData.get(dataLine).get(3));
                this.status = true;
            }else if(type.equals("statementContent"))
            {
                this.setStatementId(allData.get(dataLine).get(0));
                this.setUserId(allData.get(dataLine).get(1));
                this.setUserName(allData.get(dataLine).get(2));
                this.setPaidDate(allData.get(dataLine).get(3));
                this.setPaidAmount(allData.get(dataLine).get(4));
                this.setPaymentDesc(allData.get(dataLine).get(5));
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
    
    public ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile, String type) {
        File file = new File(textFile);
        ArrayList<ArrayList<String>> allUserInfo = new ArrayList<>();
        if (file.exists()) {
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(statement.class.getName()).log(Level.SEVERE, null, ex);
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
        
        ArrayList<ArrayList<String>> onlyUserInfo = new ArrayList<>();
        
        int p,q;
        int totalRow = 0;
        if(type.equals("statementContent"))
        {
            for (p=0,q=0; p<allUserInfo.size(); p++)
            {
                if(allUserInfo.get(p).contains(this.getUserId()))
                {
                    ArrayList<String> item = allUserInfo.get(p);
                    if(item.get(1).equals(this.getUserId()))
                    {
                        String monthFile = item.get(3).substring(item.get(3).indexOf("-")+1);
                        
                        if(monthFile.equals(this.getMonthYear()))
                        {
                            System.out.println("equal");
                            totalRow = totalRow+1;
                            onlyUserInfo.add(allUserInfo.get(p));
                            q++;
                        }
                    }
                }
            }
            setTotalLine(totalRow);
            
        }else if (type.equals("statementMonth")) {
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
        
       
        
        return onlyUserInfo;
    }
    
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
}
