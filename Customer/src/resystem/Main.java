/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Youssef hamdi
 */
public class Main {
    public static void main(String[] args){
        
        try 
        {
            Registry registry = LocateRegistry.getRegistry(2222);
            
            AccountInterface af = (AccountInterface) registry.lookup("AC");
            
                   System.out.println("BEFORE");
           Person p =af.login("ghunemi","de7o");
            System.out.println(p.getAge()+" "+p.getFname());
            System.out.println("AFTER");

        } 
        catch (Exception ex) 
        {
            System.out.println("Exception occured"+ex);
        }
    
    }
}
