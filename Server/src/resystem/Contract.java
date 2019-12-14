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
    
    
    public Contract() throws RemoteException{
    }
    
    public void viewContract() throws RemoteException
    {
        
    }
    
    public void RespondContract(Contract obj) throws RemoteException
    {
    
    }
    
    public void setPaymentMethod(Payment Obj) throws RemoteException
    {
        
    }
    
    public void setID(int ID) throws RemoteException
    {
        this.ID = ID;
    }
    
    public int getID() throws RemoteException
    {
        return ID;
    }
    
}
