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
 * @author Abd El Rahman
 */
public interface InqurieyROI extends Remote {
    
    public void setComplaint(String c) throws RemoteException;
    public String getComplaint() throws RemoteException;
    
    
    
}
