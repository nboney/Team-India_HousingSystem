import java.util.ArrayList;

public class StudentUser extends RegisteredUser {
    private String studentID;
    private String currentAddress;
    private ArrayList<HousingListing> favorites;
    
    
    public StudentUser(String firstName, String lastName, 
                       String username, String password,
                       String phone, String email,
                       String studentID) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.studentID = studentID;
    }
    
    public void addFavorites(HousingListing listing) {
        favorites.add(listing);
    }
    
    public ArrayList<HousingListing> getFavorites() {
        return this.favorites;    
    }
    /*
    public void leaveUserRating(LeasingUser user, int rating) {
    }*/
    
    public void leaveHousingReview (HousingListing listing, int rating, String comment) {
          
    }
    
    //Incomplete method - going to revisit later
    public void updateRating(int rating) {
    	this.ratingCount = this.ratingCount++;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName +
                "\nPassword: " + this.password + "\nPhone: " +
                this.phone + "\nEmail: " + this.email +
                "\nStudentID: " + this.studentID;;
    }
}
