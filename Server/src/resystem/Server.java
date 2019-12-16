/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
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
           
            // My remote object [Skeleton]
           AccountInterface af = new Account();
           AppartmentFacade ap = new Apartement();
            
            // My RMI Registry
            Registry registry = LocateRegistry.createRegistry(2222);
            
            //Add my object to the RMI Registry
            registry.bind("AC", af);
             registry.bind("AP", ap);
            System.out.println("Server is ready...");   
        } 
       catch (Exception ex) 
       {
          System.out.println("Exception occured");
       }      
    }
}
