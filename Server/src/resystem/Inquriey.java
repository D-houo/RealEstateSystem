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
 * @author Abd El Rahman
 */
public class Inquriey extends UnicastRemoteObject implements InqurieyROI{
    
    String complaint;
    int ID;

    public Inquriey() throws RemoteException{
    }

    public Inquriey(String complaint, int ID) {
        this.complaint = complaint;
        this.ID = ID;
    }
    
    public void Respond()
    {
    
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public void setComplaint(String c)  throws RemoteException{
      
    }

    @Override
    public String getComplaint()  throws RemoteException{
 
        return null;
    }
    
    
    
}
