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
	//private LeasingUser manager;
	
	/*public HousingListing(String listingTitle, String address, String description, 
			double distance, double price, HousingType housingType, 
			ArrayList<Amenities> amenities, LeasingUser manager) {
		
	}*/
	
	public void receiveApplication(HousingApplication application, StudentUser applier) {
		
	}
	
	public String getListingTitle() {
		return "";
	}
	
	public void setListingTitle(String title) {
		
	}
	
	public String getAddress() {
		return "";
	}
	
	public void setAddress(String address) {
		
	}
	
	public String getDescription() {
		return "";
	}
	
	public void setDescription(String description) {
		
	}
	
	public int getRating() {
		return 0;
	}
	
	public void setRating(int rating) {
		
	}
	
	public int getRatingCount() {
		return 0;
	}
	
	public double getDistance() {
		return 0.0;
	}
	
	public double getPrice() {
		return 0.0;
	}
	
	public void setPrice(double price) {
		
	}
	
	public ArrayList<Review> getReviews() {
		return null;
	}
	
	public void addReview(StudentUser user, int rating, String comment) {
		
	}
	
	public ArrayList<Amenities> getAmenities() {
		return null;
	}
	
	public void setAmenities(ArrayList<Amenities> amenities) {
	
	}
	
	/*
	public LeasingUser getManager() {
		
	}
	*/
	
}
