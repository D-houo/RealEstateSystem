/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Abd El Rahman
 */
public class Inquriey extends UnicastRemoteObject implements InqurieyROI, Serializable{
    
    private String complaint;
    private int ID;

    public Inquriey() throws RemoteException{
    }

    public Inquriey(String complaint, int ID) throws RemoteException {
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
        Inquriey i = new Inquriey();
        inquireyMapper mapper = new inquireyMapper();
        i.setComplaint(c);
        mapper.insert(i);
      
    }

    @Override
    public String getComplaint()  throws RemoteException{
 
        return null;
    }   
}
