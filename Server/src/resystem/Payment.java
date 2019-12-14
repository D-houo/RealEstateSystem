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
public interface Payment extends Remote{
    
    
    public void pay() throws RemoteException;
    
}
