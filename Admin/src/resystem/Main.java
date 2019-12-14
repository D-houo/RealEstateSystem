/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Youssef hamdi
 */
public class Main {
    public static void main(String[] args){
        
        try 
        {
            // Connecting to the RMI Registry created on the server
            Registry registry = LocateRegistry.getRegistry(1099);

            // Search for the stub "calc"
            //CalculatorInterface c = (CalculatorInterface) registry.lookup("calc");

            // Invoke the remote methods on the remote object
           // System.out.println("The last result was " + c.getLastResult());
            //System.out.println("The new result is " + c.add(5, 3));
            //Result r = c.sub(10, 5);
           // System.out.println("Sub = " + r.getResult());
        } 
        catch (Exception ex) 
        {
            System.out.println("Exception occured");
        }
    }
}
