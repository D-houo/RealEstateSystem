/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.rmi.RemoteException;

/**
 *
 * @author Youssef hamdi
 */
public class ApatmentToShare extends Apartement {
    
    private int numberOfPersons;

    public ApatmentToShare()throws RemoteException {
    }

    public ApatmentToShare(int numberOfPersons, int id, String discreption, String category, int price, String location, String area, int numberOfRooms, Person ownerObj) throws RemoteException {
        super(id, discreption, category, price, location, area, numberOfRooms, ownerObj);

        this.numberOfPersons = numberOfPersons;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }
    
    
}
