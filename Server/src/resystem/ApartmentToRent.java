 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.rmi.RemoteException;

/**
 *
 * @author Youssef hamdi
 */
public class ApartmentToRent extends Apartement {
    private int periodOfRenting;
    private int insurance;

    public ApartmentToRent() throws RemoteException  {
    }

    public ApartmentToRent(int periodOfRenting, int insurance, int id, String discreption, String category, int price, String location, String area, int numberOfRooms, Person ownerObj) throws RemoteException  {
        super(id, discreption, category, price, location, area, numberOfRooms, ownerObj);
        this.periodOfRenting = periodOfRenting;
        this.insurance = insurance;
    }

    public int getPeriodOfRenting() {
        return periodOfRenting;
    }

    public void setPeriodOfRenting(int periodOfRenting) {
        this.periodOfRenting = periodOfRenting;
    }

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }
    
    
}
