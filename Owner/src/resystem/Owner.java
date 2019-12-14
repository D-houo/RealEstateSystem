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
