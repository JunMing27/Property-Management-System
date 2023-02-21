/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dataController;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Jun Ming
 */
public interface dataManagementController{
    public void chooseTxtFile(String Type);
    public void displayDataView(Integer dataLine,String searchTxt,String type);
    public void setDataNull(String type);
    public void getDataViewSingle(String id, String file,String type);
    public void editOrAddData(ArrayList<String> dataList, String type, String file,String functionType);
    public void deleteFunction(String itemID);
    public void getIncreasedID(String file,String type);
    public  ArrayList<ArrayList<String>> DataInfo(String textFile);
    public void transferImage(File source, File destination);
}
