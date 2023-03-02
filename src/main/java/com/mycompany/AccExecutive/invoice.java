/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AccExecutive;

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
import javax.swing.JOptionPane;

/**
 *
 * @author Edi
 */
public class invoice implements displayController{
    private String invoiceId;
    private String userId;
    private String userName;
    private String issuedDate;
    private String dueDate;
    private String dueAmount;
    private String totalAmount;
    private String paymentDesc;
    private boolean status;
    
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
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

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
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
     
//    private Boolean Status;
    private String file="InvoiceContent.txt";
    
    @Override
    public void chooseTxtFile(String Type) {
        file="InvoiceContent.txt";
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
            setInvoiceId(allData.get(dataLine).get(0));
            setUserId(allData.get(dataLine).get(1));
            setUserName(allData.get(dataLine).get(2));
            setIssuedDate(allData.get(dataLine).get(3));
            setDueDate(allData.get(dataLine).get(4));
            setDueAmount(allData.get(dataLine).get(5));
            setTotalAmount(allData.get(dataLine).get(6));
            setPaymentDesc(allData.get(dataLine).get(7));

//    private String invoiceId;
//    private String userId;
//    private String userName;
//    private String issuedDate;
//    private String dueDate;
//    private String dueAmount;
//    private String totalAmount;
//    private String paymentDesc;
//    private boolean status;
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
            setInvoiceId(null);
            setUserId(null);
            setUserName(null);
            setIssuedDate(null);
            setDueDate(null);
            setDueAmount(null);
            setTotalAmount(null);
            setPaymentDesc(null);
    }

    @Override
    public void getDataViewSingle(String id, String file, String type) {
       String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    setInvoiceId(singleData.get(0));
                    setUserId(singleData.get(1));
                    setUserName(singleData.get(2));
                    setIssuedDate(singleData.get(3));
                    setDueDate(singleData.get(4));
                    setDueAmount(singleData.get(5));
                    setTotalAmount(singleData.get(6));
                    setPaymentDesc(singleData.get(7));

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
                    ID = "IN1";
                    setInvoiceId(ID);
                }else{
                    Scanner ScanEachString = new Scanner(last);
                    ScanEachString.useDelimiter("[,\n]");
                    while (ScanEachString.hasNextLine()) {
                        // First character of a string
                        ID = (ScanEachString.next().trim());
                        break;
                    }
                        String IDchar = ID.substring(0,2);
                        ID = ID.substring(1);
                        Integer IDnumber = Integer.parseInt(ID)+1;
                        ID = IDchar+ (IDnumber).toString();
                        setInvoiceId(ID);
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
