import java.util.ArrayList;

public class StudentUser extends RegisteredUser {
    private String studentID;
    private ArrayList<HousingListing> favorites;
    
    
    public StudentUser(String studentID, String firstName, String lastName, 
                       String username, String password,
                       String phone, String email) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.userID = studentID;
        this.studentID = this.userID;
        favorites = new ArrayList<HousingListing>();
    }
    
    public void addFavorites(HousingListing listing) {
        this.favorites.add(listing);
    }
    
    public ArrayList<HousingListing> getFavorites() {
        return this.favorites;    
    }
    /*
    public void leaveUserRating(LeasingUser user, int rating) {
    }*/
    
    public void leaveHousingReview (HousingListing listing, int rating, String comment) {
          
    }
    
    public void setRatingInfo(int rating, int ratingCount) {
    	this.rating = rating;
    	this.ratingCount = ratingCount;
    }
    //Incomplete method - going to revisit later
    /*
    public void updateRating(int rating) {
    	this.ratingCount = this.ratingCount++;
    }*/
    
    @Override
    public String toString() {
<<<<<<< HEAD
        return this.firstName + " " + this.lastName + "\n" + this.username + this.studentID +
        		"\n" + this.phone;
=======
        return "Name: " + this.firstName + " " + this.lastName +
                "\nPassword: " + this.password + "\nPhone: " +
                this.phone + "\nEmail: " + this.email +
                "\nStudentID: " + this.studentID;;
>>>>>>> af42c5b5f0dc4ac27932bd8cf672e3f4e370c54e
    }
}
