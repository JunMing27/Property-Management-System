/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buildingManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jun Ming
 */
public class budgetPlanning extends buildingManager{
    
    //VARIABLESSS FOR BUILDING MANAGER FUNCTIONALITY : BUDGET PLANNING
    private String budgetId;
    private String projectName;
    private String projectBudget;
    private String projectStartDate;
    private String projectEndDate;
    
    public String getBudgetId(){
        return budgetId;
    }
    public String getBudgetProjectName(){
        return projectName;
    }
    public String getBudgetProjectBudget(){
        return projectBudget;
    }
    public String getBudgetProjectStartDate(){
        return projectStartDate;
    }
    public String getBudgetProjectEndDate(){
        return projectEndDate;
    }
    
    public void setBudgetId(String budgetId){
        this.budgetId=budgetId;
    }
    public void setBudgetProjectName(String budgetProjectName){
        this.projectName=budgetProjectName;
    }
    public void setBudgetProjectBudget(String projectBudget){
        this.projectBudget=projectBudget;
    }
    public void setBudgetProjectStartDate(String projectStartDate){
        this.projectStartDate=projectStartDate;
    }
    public void setBudgetProjectEndDate(String projectEndDate){
        this.projectEndDate=projectEndDate;
    }
    
    private Boolean Status;
    private String file="BudgetPlanning.txt";

    public Boolean getStatus(){
        return Status;
    }
    
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
            setBudgetId(allData.get(dataLine).get(0));
            setBudgetProjectName(allData.get(dataLine).get(1));
            setBudgetProjectBudget(allData.get(dataLine).get(2));
            setBudgetProjectStartDate(allData.get(dataLine).get(3));
            setBudgetProjectEndDate(allData.get(dataLine).get(4));
            Status=true;
            
        }catch(Exception e){
            setDataNull(type);
            Status = false;
        }
        if(dataLine.equals(newSize-1)){
            Status = false;
        }
    }
    public void setDataNull(String type) {
        setBudgetId(null);
        setBudgetProjectName(null);
        setBudgetProjectBudget(null);
        setBudgetProjectStartDate(null);
        setBudgetProjectEndDate(null);
    }
    
    public void getDataViewSingle(String id, String file, String type) {
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        ArrayList<ArrayList<String>> allData = DataInfo(fileName);
        for (ArrayList<String> singleData : allData) {
                if (singleData.get(0).equals(id)) {
                    setBudgetId(singleData.get(0));
                    setBudgetProjectName(singleData.get(1));
                    setBudgetProjectBudget(singleData.get(2));
                    setBudgetProjectStartDate(singleData.get(3));
                    setBudgetProjectEndDate(singleData.get(4));
                    break;
                }
            }
    }
    
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
                    String IDchar = ID.substring(0,2);
                    ID = ID.substring(2);
                    Integer IDnumber = Integer.parseInt(ID)+1;
                    ID = IDchar+ (IDnumber).toString();
                    setBudgetId(ID);
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "There is a problem with User ID. Try Again Later", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }
}
