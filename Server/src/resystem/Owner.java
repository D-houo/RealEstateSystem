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
public class Owner extends Person{
    
    private ArrayList<Apartement> apartementsArray;
    private ArrayList<Contract> contractsArray;

    public Owner() {
    }

    public Owner(ArrayList<Apartement> apartementsArray, ArrayList<Contract> contractsArray) {
        this.apartementsArray = apartementsArray;
        this.contractsArray = contractsArray;
    }

    public Owner(ArrayList<Apartement> apartementsArray, ArrayList<Contract> contractsArray, Account authObj, String fname, String lname, String Email, int age, String phone, int ID) {
        super(authObj, fname, lname, Email, age, phone, ID);
        this.apartementsArray = apartementsArray;
        this.contractsArray = contractsArray;
    }

    

    public void setApartementsArray(ArrayList<Apartement> apartementsArray) {
        this.apartementsArray = apartementsArray;
    }

    public void setContractsArray(ArrayList<Contract> contractsArray) {
        this.contractsArray = contractsArray;
    }
    
    public ArrayList<Apartement> viewPersonalPosts()
    {
    return null;
    }
    
    
}
