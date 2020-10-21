import java.util.ArrayList;

public class StudentUser {
    private String studentID;
    private String currentAddress;
    private ArrayList<HousingListing> favorites;
    private HousingApplication application;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phone;
    private String email;
    private HousingListing listing;
    private int rating;
    private String comment;
    private String socialSecurityNum;
    private double monthlyIncome;
    
    
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
        this.listing = listing;
        this.rating = rating;
        this.comment = comment;    
    }
    
    public void createApplication(String socialSecurityNum, double monthlyIncome) {     
        this.socialSecurityNum = socialSecurityNum;
        this.monthlyIncome = monthlyIncome;
    }
    
    public void sendApplication(HousingApplication application, HousingListing listing) {
        this.application = application;
        this.listing = listing;      
    }
    
    @Override
    public String toString() {
        return "";
    }
}
