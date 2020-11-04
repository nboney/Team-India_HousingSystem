import java.util.ArrayList;

public class HousingListing {
	
    private String listingID;
    private String listingTitle;
    private String address;
    private String billingAddress;
    private String description;
    private int rating;
    private int ratingCount;
    private double distance;
    private double price;
    private ArrayList<Review> reviews;
    private HousingType housingType;
    private ArrayList<Amenities> amenities;
    private String managerUsername;
    private String managerName;
    private int bedrooms;
    private int bathrooms;
    private int availableUnits;
    
    public HousingListing(String listingTitle, String address, String description, 
			              double distance, double price, HousingType housingType, 
			              ArrayList<Amenities> amenities, String managerUsername, int bedrooms, int bathrooms,
			              int availableUnits) {
            
        this.listingTitle = listingTitle;
        this.address = address;
        this.description = description;
        this.distance = distance;
        this.price = price;
        this.housingType = housingType;
        this.amenities = amenities;
<<<<<<< HEAD
	}
=======
        this.manager = manager;
    }
>>>>>>> af42c5b5f0dc4ac27932bd8cf672e3f4e370c54e
	
    public String getListingID() {
	return this.listingID;
    }
	
    public void setListingID(String id) {
	this.listingID = id;
    }
    public String getListingTitle() {
        return this.listingTitle;
    }
	
    public void setListingTitle(String title) {
	this.listingTitle = title;
    }
	
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
    	this.address = address;
  
    }
    
    public String getPaymentAddress() {
    	return this.billingAddress;
    }
    
    public void setBillingAddress(String address) {
    	
    }
	
    public void setManagerName(String firstName, String lastName) {
    	this.managerName = firstName + " " + lastName;
    }
    
    public String getManagerName() {
    	return this.managerName;
    }
    
    public String getDescription() {
        return this.description;
    }
	
    public void setDescription(String description) {
    	this.description = description;	
    }
	
    public int getRating() {
        return (int) rating;
    }
	
    public void setRating(int rating) {
    	this.rating = rating;	
    }
	
    public int getRatingCount() {
        return (int) ratingCount;
    }
	
    public void setRatingCount(int ratingCount) {
    	this.ratingCount = ratingCount;
    }
    
    public double getDistance() {
        return this.distance;
    }
	
    public double getPrice() {
        return price;
    }
	
    public void setPrice(double price) {
    	this.price = price;	
    }
    
    public void setBedrooms(int bedrooms) {
    	this.bedrooms = bedrooms;
    }
    
    public int getBedrooms() {
    	return this.bedrooms;
    }
    
    public void setBathrooms(int bathrooms) {
    	this.bathrooms = bathrooms;
    }
    
    public int getBathrooms() {
    	return this.bathrooms;
    }
    
    public HousingType getHousingType() {
    	return this.housingType;
    }
	
    public ArrayList<Review> getReviews() {
        ArrayList<Review> reviews = new ArrayList<Review>();
        return reviews;
    }
	
<<<<<<< HEAD
    public void addNewReview(StudentUser user, int rating, String comment) {
  
=======
   /**
    public void addReview(Review review, StudentUser user, int rating, String comment) {
        review.addReview(review, user, rating, comment);
>>>>>>> af42c5b5f0dc4ac27932bd8cf672e3f4e370c54e
    }
    */
	
    public void addReview(Review review) {
    	this.reviews.add(review);
    }
    
    public ArrayList<Amenities> getAmenities() {
        return this.amenities;
    }
    
    public void setAmenities(ArrayList<Amenities> amenities) {
    	this.amenities = amenities;
    }
    
    public void addAmenity(Amenities amenity) {
    	this.amenities.add(amenity);
    }
	
<<<<<<< HEAD
    public String toString() {
    	return this.listingTitle + "\n" + this.address + "\nProperty Manager: " + this.managerName +
    			"\n$" + this.price + " per month\n" + this.distance + " miles from campus\n";
=======
    public LeasingUser getManager() {
	return this.manager;
>>>>>>> af42c5b5f0dc4ac27932bd8cf672e3f4e370c54e
    }
	
    public void setManager(LeasingUser leaser) {
	this.manager = leaser;
	this.managerUsername = leaser.getUsername();
    }	
}
