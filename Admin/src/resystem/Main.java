/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
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
          
            AccountInterface af = (AccountInterface) registry.lookup("AC");
            /* Scanner input = new Scanner(System.in);

           
            
            System.out.print("Enter your first name: ");
           String fname = input.nextLine();
          
            System.out.print("Enter your Last name: ");
            String lname = input.nextLine();
  
            System.out.print("Enter your Username: ");
            String username = input.nextLine();
            
            System.out.print("Enter your Password: ");
            String password = input.nextLine();
            
            System.out.print("Enter your Email: ");
            String Email = input.nextLine();
            
            System.out.print("Enter your Phone number: ");
            String phone = input.nextLine();
            
            System.out.print("Enter your age: ");
            int age = input.nextInt();
            
            af.register(fname, lname, Email, age, phone, username, password);
            */
           System.out.println("BEFORE");
           Person p =af.login("ghunemi","de7o");
            System.out.println(p.getAge()+" "+p.getFname());
            System.out.println("AFTER");
            
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
            System.out.println("Exception occured"+ex);
        }
    }
}
