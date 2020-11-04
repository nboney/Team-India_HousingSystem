import java.util.ArrayList;

public class LeasingUser extends RegisteredUser {
	private String address;
	private ArrayList<HousingListing> listings;
	
	public LeasingUser(String firstName, String lastName, String username, String password,
			           String phone, String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	
	public void createListing(String listingTitle, String address, String description, double price,
			                  double distance, HousingType housingType, ArrayList<Amenities> amenities,
			                  String managerUsername, int bedrooms, int bathrooms, int availableUnits) {
		
		HousingListing newListing = new HousingListing(listingTitle, address, description, distance,
				                                       price, housingType, amenities, managerUsername,
				                                       bedrooms, bathrooms, availableUnits);
		HousingListings housingListings = null;
		housingListings = housingListings.getInstance();
		
		newListing.setListingID(housingListings.generateListingID());
		
		listings.add(newListing);
		housingListings.addListing(newListing);

	}
	
	public void addProperty(HousingListing listing) {
		this.listings.add(listing);
	}
	
	public void deleteListing(String listingID, HousingListing listing, HousingListings housingListings) {
		this.listings.remove(listing);
		housingListings.removeListing(listing);
	}
	
	/*
	public void leaveStudentRating(String username, int rating, Users users) {
		for(int i = 0; i < users.getStudentList().size(); ++i) {
			if(users.getStudentList().get(i).getUsername().contentEquals(username)) {
				users.getStudentList().get(i).updateRating(rating);
			}
		}
		
	}*/
	
	public void setRatingInfo(int rating, int ratingCount) {
    	this.rating = rating;
    	this.ratingCount = ratingCount;
    }
	
	
	
}
