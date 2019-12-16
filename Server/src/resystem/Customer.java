/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.util.ArrayList;
/**
 *
 * @author Abd El Rahman
 */
public class Customer extends Person{
    
    private ArrayList<Apartement> AquiredApartements;

    public Customer() {
    }

    public Customer(ArrayList<Apartement> AquiredApartements) {
        this.AquiredApartements = AquiredApartements;
    }

    public Customer(ArrayList<Apartement> AquiredApartements, Account authObj, String fname, String lname, String Email, int age, String phone, int ID) {
        super(authObj, fname, lname, Email, age, phone, ID);
        this.AquiredApartements = AquiredApartements;
    }
    
    

    public ArrayList<Apartement> getAquiredApartements() {
        return AquiredApartements;
    }

    public void setAquiredApartements(ArrayList<Apartement> AquiredApartements) {
        this.AquiredApartements = AquiredApartements;
    }  
    
}
