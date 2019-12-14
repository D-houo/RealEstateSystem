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
public class ApartmentToBuy extends Apartement{
    private float installments;

    public ApartmentToBuy() {
    }

    public ApartmentToBuy(float installments, int id, String discreption, String category, int price, String location, String area, int numberOfRooms, Person ownerObj) {
        super(id, discreption, category, price, location, area, numberOfRooms, ownerObj);
        this.installments = installments;
    }

    public float getInstallments() {
        return installments;
    }

    public void setInstallments(float installments) {
        this.installments = installments;
    }
    
    
}
