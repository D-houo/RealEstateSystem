/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;
import java.rmi.Remote;
import java.rmi.RemoteException;

import java.util.ArrayList;

/**
 *
 * @author Mostafa-PC
 */
public interface ContractDTO extends Remote{
    
    public ArrayList<Contract> getAllContract() throws RemoteException;
    public void setAllContract(ArrayList<Contract> contracts) throws RemoteException;
    
}
