/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buildingManager;

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
public class report {

    ArrayList<ArrayList<String>> dataArray;
    
    public ArrayList<ArrayList<String>>  getDataArray(){
        return dataArray;
    }
    
    public void displayData(String userType,String file){
        String fileName = "src/main/java/com/mycompany/textFile/"+file;
        if(userType=="resident"){
            this.dataArray = DataInfo(fileName);
        }
        else if (userType=="patrolling"){
            this.dataArray = DataInfo(fileName);
        }
        else if (userType=="complaint"){
            this.dataArray = DataInfo(fileName);
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
