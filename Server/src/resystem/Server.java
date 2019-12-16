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
public class Server {

    public static void main(String[] args) {

        
       try 
       {
           AccountInterface af = new Account();
           AppartmentFacade ap = new Apartement();
           InqurieyROI in = new Inquriey();
           
           Registry registry = LocateRegistry.createRegistry(2222);
            
            registry.bind("accountInterface", af);
             registry.bind("aptFacade", ap);
             registry.bind("inROI", in);
            System.out.println("Server is ready...");   
        } 
       catch (Exception ex) 
       {
          System.out.println("Exception occured");
       }      
    }
}
