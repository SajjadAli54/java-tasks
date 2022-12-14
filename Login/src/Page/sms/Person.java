/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Page.sms;

import java.io.Serializable;

/**
 *
 * @author Sajjad Ali
 */
public class Person implements  Serializable{
    private String name = null;
    private String father = null;
    private String surname = null;
    private String cnic = null;
    private String birthDate = null;
    private String gender = null;
    private String religion = null;
    private String nationality = null;
    private String address = null;

    public Person(){
        
    }
    public Person(String name,String father,String surname,
            String cnic,String birthDate,String gender,
            String address,String religion,String nationality){
        setName(name);
        setFather(father);
        setSurname(surname);
        setCnic(cnic);
        setBirthDate(birthDate);
        setGender(gender);
        setAddress(address);
        setReligion(religion);
        setNationality(nationality);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
}
