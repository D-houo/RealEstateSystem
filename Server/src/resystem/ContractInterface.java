/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

/**
 *
 * @author Mostafa-PC
 */
public interface ContractInterface {
    
    public void viewContract();
    public void RespondContract(Contract obj);
    public void setPaymentMethod(Payment Obj);
    public void setID(int ID);
    public int getID();
    
}
