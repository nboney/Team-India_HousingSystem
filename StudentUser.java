/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingsystem;

import java.util.ArrayList;

/**
 *
 * @author adameinstein
 */
public class StudentUser {
    private String studentID;
    private String currentAddress;
    private ArrayList<String> favorites = new ArrayList<String>();
    private HousingApplication application;
    
    public StudentUser(String firstName, String lastName, 
                       String username, String password,
                       String phone, String email,
                       String studentID) {
    }
    
    public void addFavorites(HousingListing listing) {
    }
    
    public ArrayList<HousingListing> getFavorites() {
        return null;    
    }
    
    public void leaveUserRating(LeasingUser user, int rating) {
    }
    
    public void leaveHousingReview (HousingListing listing, int rating, String comment) {
    }
    
    public void createApplication(String socialSecurityNum, double monthlyIncome) {     
    }
    
    public void sendApplication(HousingApplication application, HousingListing listing) {
    }
    
    @Override
    public String toString() {
        return "";
    }
}
