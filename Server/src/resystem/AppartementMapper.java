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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author Mostafa-PC
 */
public class AppartementMapper implements Serializable {
    
    private MongoClientURI url;
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    private Gson gson = new Gson();

    public AppartementMapper() {
        // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        url = new MongoClientURI("mongodb+srv://Ghunemi:ghunemiwbas@cluster0-xb4ji.mongodb.net/tes");
        
        
        // Initialize
        client = new MongoClient(url);
        database = client.getDatabase("RealState"); // Database name
       
    }
    
    public void insert(Apartement a)
    {
        if(a!=null){
            if(a.getCategory() == "Renting"){
                 collection = database.getCollection("RentingApartment"); // Collection name
                collection.insertOne(Document.parse(gson.toJson(a)));
                System.out.println("Apartment inserted."); 
            }
            else if(a.getCategory() == "Buying"){
                 collection = database.getCollection("BuyingApartment"); // Collection name
                collection.insertOne(Document.parse(gson.toJson(a)));
                System.out.println("Apartment inserted."); 
            }else if(a.getCategory() == "Sharing"){
                 collection = database.getCollection("SharingApartment"); // Collection name
                collection.insertOne(Document.parse(gson.toJson(a)));
                System.out.println("Apartment inserted."); 
            }
        }
    }
    
    public void update(Apartement a)
    {
        
        
    }
    
    public void delete(Apartement a)
    {
        
        
    }
    
    public void filter(int ID)
    {
        
    }
    
    public Apartement getAppartement(int ID)
    {
        
        return null;
    }
    
    public void close(){
        client.close();
    }
    
}
