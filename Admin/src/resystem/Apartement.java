/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

/**
 *
 * @author Youssef hamdi
 */
public class Apartement {
    private int id;
    private String discreption;
    private String category;
    private int price;
    private String location;
    private String area;
    private int numberOfRooms;
    private Person ownerObj;

    public Apartement() {
    }

    public Apartement(int id, String discreption, String category, int price, String location, String area, int numberOfRooms, Person ownerObj) {
        this.id = id;
        this.discreption = discreption;
        this.category = category;
        this.price = price;
        this.location = location;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.ownerObj = ownerObj;
    }
    
    public void viewAll(){
        
    }
    
    public void addPost(Apartement apObj){
        
    }
    
     public void editPost(Apartement apObj){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscreption() {
        return discreption;
    }

    public void setDiscreption(String discreption) {
        this.discreption = discreption;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Person getOwnerObj() {
        return ownerObj;
    }

    public void setOwnerObj(Person ownerObj) {
        this.ownerObj = ownerObj;
    }
    
    
}
