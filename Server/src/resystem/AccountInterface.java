/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resystem;

/**
 *
 * @author Mohamed Nazeem
 */
public interface AccountInterface {
    public void register(Person perobj);
    public Person login(String username , String password);
}
