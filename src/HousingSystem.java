/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HousingApplication;

/**
 *
 * @author adameinstein
 */
public class HousingSystem {
    private Users users;
    private Reviews reviews;
      
    public HousingSystem() {
        users = Users.getInstance();
        reviews = Reviews.getInstance();
    }
    
    public boolean userLogin() {
        return false;   
    }
    
    public boolean getHosuingList() {
        return false;       
    }
    
    public boolean searchByName() {
        return false;       
    }  
}
