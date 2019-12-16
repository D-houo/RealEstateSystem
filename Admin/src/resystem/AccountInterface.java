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
 * @author Mohamed Nazeem
 */
public interface AccountInterface extends Remote{
    public void register(String fname, String lname, String Email, int age, String phone, String username, String password) throws RemoteException;
    public Person login(String username , String password) throws RemoteException;
}
