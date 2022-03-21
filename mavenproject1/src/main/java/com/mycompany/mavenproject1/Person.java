/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.*;
import java.util.Date;

/**
 *
 * @author gloriasingh
 */
public class Person implements Serializable {
     private static final long serialVersionUID= -897626244093472561L;
    private String first_name;
    private String last_name;
     private long phone_num;
    private String community;
    private int house_no;
    private String city;
     private String gender;
     Date date_of_birth;
    private int SSN;
    public Person(String first_name, String last_name, long phone_num, String community, int house_no, String city,String gender, Date date_of_birth,int SSN) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_num = phone_num;
        this.community = community;
        this.house_no = house_no;
        this.city = city;
      this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.SSN=SSN;
    }
//    public boolean equals(Person person)
//    {
//        return (this.first_name.equals(person.first_name)&& 
//                this.last_name.equals(person.last_name)&& 
//                this.phone_num==person.phone_num && 
//                this.community.equals(person.community)&&
//                this.house_no==person.house_no &&
//                this.city.equals(person.city) &&
//                
//                this.date_of_birth==person.date_of_birth &&
//                this.SSN==person.SSN);
//    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public long getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(long phone_num) {
        this.phone_num = phone_num;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public int getHouse_no() {
        return house_no;
    }

    public void setHouse_no(int house_no) {
        this.house_no = house_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
    
    
   
    
    
    
}
