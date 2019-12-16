/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.io.Serializable;

/**
 *
 * @author Mohamed Nazeem
 */
public class Person implements Serializable{
    String fname;
    String lname;
    String Email;
    int age;
    String phone;
    int ID;

    public Person() {
    }

    public Person(String fname, String lname, String Email, int age, String phone, int ID) {
        this.fname = fname;
        this.lname = lname;
        this.Email = Email;
        this.age = age;
        this.phone = phone;
        this.ID = ID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void EditProfile(Person perobj){
    
    
    }
}
