/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RemoteServer;
import java.util.Scanner;


/**
 *
 * @author Youssef hamdi
 */
public class Main {
    public static void main(String[] args){
 
        try 
        {
            // Connecting to the RMI Registry created on the server
           Registry registry = LocateRegistry.getRegistry(2222);
          
            AppartmentFacade af = (AppartmentFacade) registry.lookup("AP");
         
            System.out.print("Enter Apartment discreption: ");
            Scanner input = new Scanner(System.in);
            String d = input.nextLine();
            
            System.out.print("Enter Apartment Category: ");
            String c = input.nextLine();
            
            System.out.print("Enter Apartment Location: ");
            String l = input.nextLine();
            
            System.out.print("Enter Apartment Area: ");
            String a = input.nextLine();
            
            System.out.print("Enter Apartment Number of rooms: ");
            int ns = input.nextInt();
            
                System.out.print("Enter Apartment price: ");
            int p = input.nextInt();
            
            af.setAppartment(d, c, p, l, a,ns);
            
        } 
        catch (Exception ex) 
        {
            System.out.println("Exception occured"+ex);
        }
    }
}
