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
public class Inquriey implements InqurieyROI{
    
    String complaint;
    int ID;

    public Inquriey() {
    }

    public Inquriey(String complaint, int ID) {
        this.complaint = complaint;
        this.ID = ID;
    }
    
    public void Respond()
    {
    
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public void setComplaint(String c) {
      
    }

    @Override
    public String getComplaint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
