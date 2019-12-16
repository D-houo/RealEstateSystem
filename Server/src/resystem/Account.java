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
 * @author Mohamed Nazeem
 */
public class Account extends UnicastRemoteObject implements AccountInterface, Serializable{
    String userName;
    String password;

    public Account() throws RemoteException {
    }

    public Account(String userName, String password) throws RemoteException {
        this.userName = userName;
        this.password = password;
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
    public Person login(String username , String password)throws RemoteException{
      
        PersonMapper mapper = new PersonMapper();
 
     
        return mapper.getPerson(username, password);
        
    }

    @Override
    public void register(String fname, String lname, String Email, int age, String phone, String username, String password) throws RemoteException {
        Person a = new Person();
        PersonMapper mapper = new PersonMapper();
        Account n = new Account();
        
        a.setAge(age);
        a.setEmail(Email);
        a.setFname(fname);
        a.setLname(lname);
        a.setPhone(phone);
       n.setUserName(username);
       n.setPassword(password);
       a.setAuthObj(n);
        mapper.insert(a);    
    }


}
