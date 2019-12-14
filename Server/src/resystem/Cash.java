package resystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abd El Rahman
 */
public class Cash implements Payment{
    
    private float cashTendered;
    
    
    public float getCashTendered() {
        return cashTendered;
    }

    public void setCashTendered(float cashTendered) {
        this.cashTendered = cashTendered;
    }

    @Override
    public void pay() {
       
    }
    
    
    
}
