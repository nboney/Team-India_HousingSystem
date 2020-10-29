import java.util.ArrayList;

public class LeasingUser extends RegisteredUser {
	private ArrayList<HousingListing> listings;
	
	public LeasingUser(String firstName, String lastName, String username, String password,
			           String phone, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}
	
	public void createListing(String listingTitle, String address, String description, double price,
			                  double distance, HousingType housingType, ArrayList<Amenities> amenities,
			                  HousingListings housingListings) {
		HousingListing newListing = new HousingListing(listingTitle, address, description, distance,
				                                       price, housingType, amenities);
		newListing.setManager(this);
		listings.add(housingListings.addListing(newListing));
		//listings.add(newListing);
		
	}
	
	public void deleteListing(String listingID, HousingListing listing, HousingListings housingListings) {
		this.listings.remove(listing);
		housingListings.removeListing(listing);
	}
	
	public void leaveStudentRating(String username, int rating, Users users) {
		for(int i = 0; i < users.getStudentList().size(); ++i) {
			if(users.getStudentList().get(i).getUsername().contentEquals(username)) {
				users.getStudentList().get(i).updateRating(rating);
			}
		}
		
	}
	
	
	
	
}
