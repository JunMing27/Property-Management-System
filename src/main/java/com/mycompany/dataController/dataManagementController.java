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
public interface dataManagementController {
    public void editOrAddData(ArrayList<String> dataList, String type, String file,String functionType);
    public void deleteFunction(String itemID);
    public  ArrayList<ArrayList<String>> DataInfo(String textFile);
    public void transferImage(File source, File destination);
}
