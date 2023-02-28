/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visitor;

import com.mycompany.dataController.dataManagementController1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoiyi
 */
public class visitor implements dataManagementController1{
    
    private String visitorId;
    private String visitorName;

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
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
            Logger.getLogger(visitor.class.getName()).log(Level.SEVERE, null, ex);
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
                    +dataList.get(4)+"\n");
            
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(visitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getNextId(String textFile) {
        return 0;
    }

    @Override
    public void transferImage(File source, File destination) {
    
    }
    
    
    class visitorMethod
    {
        public void changeStatus(String textFile, ArrayList<String> dataList)
        {
            removeFromFile(textFile, dataList);
            editFile(textFile, dataList);
        }
    }
    
}
