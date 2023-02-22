/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dataController;

/**
 *
 * @author Jun Ming
 */
public interface displayController {
    public void chooseTxtFile(String Type);
    public void displayDataView(Integer dataLine,String searchTxt,String type);
    public void setDataNull(String type);
    public void getDataViewSingle(String id, String file,String type);
    public void getIncreasedID(String file,String type);
}
