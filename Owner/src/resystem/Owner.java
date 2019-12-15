/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Abd El Rahman
 */
public class Owner extends Person implements AppartmentFacade{
    
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

    @Override
    public void setAppartment(String discreption, String category, int price, String location, String area, int numberOfRooms) throws RemoteException {
    

    }

    @Override
    public String getAppartment() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
