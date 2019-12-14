/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Youssef hamdi
 */
public interface AppartmentFacade extends Remote{
    public void setAppartment(String discreption , String category, int price , String location , String area , int numberOfRooms) throws RemoteException;
    
    public String getAppartment() throws RemoteException;
}
