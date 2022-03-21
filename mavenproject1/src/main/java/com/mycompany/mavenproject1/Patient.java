/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;

/**
 *
 * @author gloriasingh
 */
public class Patient implements Serializable{
     private static final long serialVersionUID= -897626244093472561L;
    private int blood_pressure1;
    private int bloodpressure2;
    private int breathing;
    private int pulse;
    private int temperature;
    private int Insurance_Number;
    boolean doctor_avail;
    private String illness;
    private Person person;
    Long encounter_date;
    

    public Patient(int blood_pressure1,int bloodpressure2, int breathing, int pulse, int temperature, int Insurance_Number, boolean doctor_avail, String illness, Person person,Long encounter_date) {
        this.blood_pressure1 = blood_pressure1;
        this.bloodpressure2=bloodpressure2;
        this.breathing = breathing;
        this.pulse = pulse;
        this.temperature = temperature;
        this.Insurance_Number = Insurance_Number;
        this.doctor_avail = doctor_avail;
        this.illness = illness;
        this.person = person;
        this.encounter_date=encounter_date;
    }

    public Long getEncounter_date() {
        return encounter_date;
    }

    public void setEncounter_date(Long encounter_date) {
        this.encounter_date = encounter_date;
    }
    
    public boolean isDoctor_avail() {
        return doctor_avail;
    }

    public void setDoctor_avail(boolean doctor_avail) {
        this.doctor_avail = doctor_avail;
    }

    public int getBloodpressure2() {
        return bloodpressure2;
    }

    public void setBloodpressure2(int bloodpressure2) {
        this.bloodpressure2 = bloodpressure2;
    }
    

    public int getBlood_pressure1() {
        return blood_pressure1;
    }

    public void setBlood_pressure1(int blood_pressure) {
        this.blood_pressure1 = blood_pressure;
    }

    public int getBreathing() {
        return breathing;
    }

    public void setBreathing(int breathing) {
        this.breathing = breathing;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getInsurance_Number() {
        return Insurance_Number;
    }

    public void setInsurance_Number(int Insurance_Number) {
        this.Insurance_Number = Insurance_Number;
    }

 

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
}
