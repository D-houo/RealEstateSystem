/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;


/**
 *
 * @author Abd El Rahman
 */
public class inquireyMapper implements Serializable{
    
         private MongoClientURI url;
            private MongoClient client;
            private MongoDatabase database;
            private MongoCollection<Document> collection;
            private Gson gson = new Gson();

    public inquireyMapper() {
        
         Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        url = new MongoClientURI("mongodb+srv://Ghunemi:ghunemiwbas@cluster0-xb4ji.mongodb.net/tes");
        client = new MongoClient(url);
        database = client.getDatabase("RealState");
    }
    
    
    
    public void insert(Inquriey i) throws RemoteException
    {
                collection = database.getCollection("Inquriey"); 
    
                System.out.println("in inserted."); 
                
                 Document doc = new Document("Inquiry", i.getComplaint());

                 collection.insertOne(doc);
    }
    
    public void update(Inquriey i)
    {
    
    }
    
    public void delete(Inquriey i)
    {
    
    }
    
    public Inquriey getInquriey()
    {
        return null;
    }
    
}
