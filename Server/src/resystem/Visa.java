/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

/**
 *
 * @author Abd El Rahman
 */
public class Visa implements Payment{
    
    private int visaNumber;
    private String expirationDate;

    public int getVisaNumber() {
        return visaNumber;
    }

    public void setVisaNumber(int visaNumber) {
        this.visaNumber = visaNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    } 

    @Override
    public void pay() {
        
    }
    
}
