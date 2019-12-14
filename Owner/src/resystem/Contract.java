/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author Mostafa-PC
 */
class Contract extends UnicastRemoteObject{
    
    private int ID;
    private float price;
    private Apartement apartmentObj;
    private Person customerObj;
    
    public Contract() throws RemoteException{
    }
    
    public void viewContract() throws RemoteException
    {
        
    }
    
    public void RespondContract(Contract obj) throws RemoteException
    {
    
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Apartement getApartmentObj() {
        return apartmentObj;
    }

    public void setApartmentObj(Apartement apartmentObj) {
        this.apartmentObj = apartmentObj;
    }

    public Person getCustomerObj() {
        return customerObj;
    }

    public void setCustomerObj(Person customerObj) {
        this.customerObj = customerObj;
    }
    
    
    public void setID(int ID) throws RemoteException
    {
        this.ID = ID;
    }
    
    public int getID() throws RemoteException
    {
        return ID;
    }
      public void checkout()
    {
    
    }
}
