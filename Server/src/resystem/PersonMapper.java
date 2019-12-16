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
import com.mongodb.client.model.Filters;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author Mohamed Nazeem
 */
public class PersonMapper implements Serializable{
    
            private MongoClientURI url;
            private MongoClient client;
            private MongoDatabase database;
            private MongoCollection<Document> collection;
            private Gson gson = new Gson();

    public PersonMapper() {
        
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        url = new MongoClientURI("mongodb+srv://Ghunemi:ghunemiwbas@cluster0-xb4ji.mongodb.net/tes");
        client = new MongoClient(url);
        database = client.getDatabase("RealState");
       
    }
    
    
    
    public void insert(Person p){
        
               collection = database.getCollection("Owners"); 
    
                System.out.println("Owner inserted."); 
                
                 Document doc = new Document("First name", p.getFname())
                .append("Last name", p.getLname())
                .append("Email", p.getEmail())
                .append("Age", p.getAge())
                .append("username", p.getAuthObj().getUserName())
                .append("password", p.getAuthObj().getPassword())
                .append("phone",p.getPhone() )
                 .append("ID", null);

                 collection.insertOne(doc);

}
    
    public void update(Person p){
    
    }
    
    public void delete(Person p){
    
    }
    
    public void filter(int id){
    
    }
    /*
    System.out.println("Mapper");
        MongoCollection<Document> col;
        col  = database.getCollection("Owners");
        col.find( "{authObj.username : username}");
        col.fin
        System.out.println("Helooooo");
    */
    
    public Person getPerson(String username,String password) throws RemoteException{
        
        collection = database.getCollection("Owners"); // Collection name
 
        Document doc = collection.find(Filters.eq("username",username)).first();
        String fname = doc.getString("First name");
        String lname = doc.getString("Last name");
        String Email = doc.getString("Email");
        int Age = doc.getInteger("Age");
        String user = doc.getString("username");
        String pass = doc.getString("password");
        String Phone = doc.getString("phone");

        Account temp = new Account(user,pass);
        
        Person result = new Person(temp,fname,lname,Email,Age,Phone,0);
        
        System.out.println(result.getAge()+" " + result.getFname());
        return result;
    }
}
