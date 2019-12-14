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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        MongoClient mongoclient = new MongoClient();
        MongoDatabase db = mongoclient.getDatabase("RealState");
        MongoCollection creatDoc =  db.getCollection("Inquriey");
        
        
       try 
       {
            // My remote object [Skeleton]
          //  CalculatorInterface c = new Calculator();
            
            // My RMI Registry
            Registry registry = LocateRegistry.createRegistry(1099);
            
            //Add my object to the RMI Registry
           // registry.bind("calc", c);
            System.out.println("Server is ready...");   
        } 
       catch (Exception ex) 
       {
          System.out.println("Exception occured");
       }      
    }
}
