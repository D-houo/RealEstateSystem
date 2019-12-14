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
public class Admin {
    public static Admin adminOcj;
    ArrayList<Inquriey> inquireyArray;
    ArrayList<Apartement> salesArray;

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
