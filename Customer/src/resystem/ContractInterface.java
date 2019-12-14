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
 * @author Mostafa-PC
 */
public interface ContractInterface extends Remote {
    
    public void viewContract() throws RemoteException;
    //public void RespondContract(Contract obj) throws RemoteException;
    public void setPaymentMethod(Payment Obj) throws RemoteException;
    public void setID(int ID) throws RemoteException;
    public int getID() throws RemoteException;
    
}
