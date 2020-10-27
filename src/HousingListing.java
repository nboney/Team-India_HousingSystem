import java.util.ArrayList;

public class HousingListing {
	
    private String listingTitle;
    private String address;
    private String description;
    private int rating;
    private int ratingCount;
    private double distance;
    private double price;
    private ArrayList<Review> reviews;
    private HousingType housingType;
    private ArrayList<Amenities> amenities;
    private LeasingUser manager;
    private HousingApplication application;
    private StudentUser applier;
    
    public HousingListing(String listingTitle, String address, String description, 
			double distance, double price, HousingType housingType, 
			ArrayList<Amenities> amenities, LeasingUser manager) {
            
        this.listingTitle = listingTitle;
        this.address = address;
        this.description = description;
        this.distance = distance;
        this.price = price;
        this.housingType = housingType;
        this.amenities = amenities;
        this.manager = manager;
	}
	
    public void receiveApplication(HousingApplication application, StudentUser applier) {
        this.application = application;
        this.applier = applier;         
	}
	
    public String getListingTitle() {
        return this.listingTitle;
    }
	
    public void setListingTitle(String title) {
		
    }
	
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
	this.address = address;
  
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
	
    public double getDistance() {
        return this.distance;
    }
	
    public double getPrice() {
        return price;
    }
	
    public void setPrice(double price) {
	this.price = price;	
    }
	
    public ArrayList<Review> getReviews() {
        ArrayList<Review> reviews = new ArrayList<Review>();
        return reviews;
    }
	
    public void addReview(StudentUser user, int rating, String comment) {
  
    }
	
    public ArrayList<Amenities> getAmenities() {
        ArrayList<Amenities> amenities = new ArrayList<Amenities>();
        return amenities;
    }
    
    public void setAmenities(ArrayList<Amenities> amenities) {
	this.amenities = amenities;
    }
	/*
	public LeasingUser getManager() {
		
	}
	*/
}
