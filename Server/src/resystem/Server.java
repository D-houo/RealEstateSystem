/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Youssef hamdi
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("aaa");
        System.out.println("The project started, let the game begin!");
        System.out.println("KIKOO IS HEREE ");
        System.out.println("Nazzz is here");
        System.out.println("GHUNGHUN");
        
        MongoClient mongoclient = new MongoClient();
        MongoDatabase db = mongoclient.getDatabase("RealState");
        MongoCollection creatDoc =  db.getCollection("Inquriey");
        
        
    }
    
}
