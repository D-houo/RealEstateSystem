/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.util.ArrayList;

/**
 *
 * @author Mohamed Nazeem
 */



public class Admin extends Person{

    public static Admin adminOcj;
    ArrayList<Inquriey> inquireyArray;
    ArrayList<Apartement> salesArray;

    public Admin(ArrayList<Inquriey> inquireyArray, ArrayList<Apartement> salesArray) {
        this.inquireyArray = inquireyArray;
        this.salesArray = salesArray;
    }

    public Admin(ArrayList<Inquriey> inquireyArray, ArrayList<Apartement> salesArray, Account authObj, String fname, String lname, String Email, int age, String phone, int ID) {
        super(authObj, fname, lname, Email, age, phone, ID);
        this.inquireyArray = inquireyArray;
        this.salesArray = salesArray;
    }

    public Admin() {
    }

    
    public void setInquireyArray(ArrayList<Inquriey> inquireyArray) {
        this.inquireyArray = inquireyArray;
    }

    public void setSalesArray(ArrayList<Apartement> salesArray) {
        this.salesArray = salesArray;
    }
    
    public static Admin getAdminInstance(){
        if(adminOcj == null)
        {
        adminOcj = new Admin();
        return adminOcj;
        }
        return adminOcj;
    }
    
    public ArrayList<Apartement> generateReport(){
        return null;
        
    }
    
}
