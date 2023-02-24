/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dataController;

import java.util.ArrayList;

/**
 *
 * @author HoiYi
 */
public interface dataManagementController1 {
    public  ArrayList<ArrayList<String>> allUserDataInfo(String textFile);
    public  ArrayList<ArrayList<String>> onlyUserDataInfo(String textFile);
    public void removeFromFile(String textFile);
    public void editFile(String textFile, ArrayList<String> dataList);
}
