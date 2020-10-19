/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingsystem;

/**
 *
 * @author adameinstein
 */
public class RegisteredUser extends User {
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String password;
    protected String phone;
    protected String email;
    protected int rating;
    protected int ratingCount;
    
    public RegisteredUser() {
    }
    
    public void leaveUserRating(RegisteredUser user, int rating) {
    }
}
