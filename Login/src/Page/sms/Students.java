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
public class Students extends Person implements Serializable{
    private String clas = null;
    private String contact = null;
    private String id = null;
    
    public Students(){
        
    }

    public Students(String name, String father, String surname, String cnic,
            String birthDate, String gender, String address, String religion,
            String nationality,String clas,String contact,String id) {
        super(name, father, surname, cnic, birthDate, gender, address, religion, nationality);
        setClas(clas);
        setContact(contact);
        setId(id);
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
