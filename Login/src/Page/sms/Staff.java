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
public class Staff extends Person implements Serializable{
    private String degree = null;
    private String designation = null;
    private String contact = null;
    private double salary = 0;
    private String id = null;
    
    public Staff(){
        
    }

    public Staff(String name, String father, String surname,
            String cnic, String birthDate, String gender,
            String address, String religion, String nationality,String degree,
            String contact,double salary,String designation,String id) {
        super(name, father, surname, cnic, birthDate, gender, address, religion, nationality);
        setDegree(degree);
        setSalary(salary);
        setContact(contact);
        setDesignation(designation);
        setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
    
    

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
    
}
