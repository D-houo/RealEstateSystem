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
 * @author Mohamed Nazeem
 */
public class Account extends UnicastRemoteObject implements AccountInterface {
    String userName;
    String password;

    public Account() throws RemoteException {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public void register(Person perobj)throws RemoteException{
    
    }
    
    @Override
    public Person login(String username , String password)throws RemoteException{
     
        return null;
    }
}
