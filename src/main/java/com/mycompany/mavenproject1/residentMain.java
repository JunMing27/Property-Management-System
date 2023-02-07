/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author user
 */
public class residentMain {
    private String id;
    private String name;
    private String gender;
    private String age;
    private String phone;
    private String unit;
    private String image;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getUnit() {
        return unit;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "residentMain{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phone=" + phone + ", unit=" + unit + ", image=" + image + '}';
    }
    
    
}
