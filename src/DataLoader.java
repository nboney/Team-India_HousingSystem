/*
 * 
 */
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {
	
	public static ArrayList<StudentUser> loadStudents() {
		/* Creates a new StudentUser array and new DataLoader */
		ArrayList<StudentUser> students = new ArrayList<StudentUser>();
		DataLoader dataLoader = new DataLoader();
		
		try {
			FileReader reader = new FileReader(USERS_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);
			
			HousingListings listings = null;
			listings = listings.getInstance();
			ArrayList<HousingListing> compareList = listings.getAllListings();
			
			for(int i=0; i < usersJSON.size(); i++) {
				JSONObject userJSON = (JSONObject)usersJSON.get(i);
				String studentID = (String)userJSON.get(STUDENTS_ID);
				String firstName = (String)userJSON.get(USERS_FIRST_NAME);
				String lastName = (String)userJSON.get(USERS_LAST_NAME);
				String username = (String)userJSON.get(USERS_USERNAME);
				String password = (String)userJSON.get(USERS_PASSWORD);
				String phone = (String)userJSON.get(USERS_PHONE);
				String email = (String)userJSON.get(USERS_EMAIL);
				String rating = (String)userJSON.get(USERS_RATING);
				String ratingCount = (String)userJSON.get(USERS_RATING_COUNT);
				ArrayList<String> favorites = (ArrayList<String>)userJSON.get(STUDENTS_FAVORITES);
				
				students.add(new StudentUser(studentID, firstName, lastName, username, password, phone,
						     email));
				students.get(i).setRatingInfo(Integer.parseInt(rating), Integer.parseInt(ratingCount));
								
				dataLoader.mapStudentFavorites(students.get(i), favorites, listings);
				}
			
			return students;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	/**
	 * method checks if the listing ID is empty, and if it is, the listing that the 
	 * student favorited is added
	 */
	private void mapStudentFavorites(StudentUser student, ArrayList<String> favoriteIDs, HousingListings housingListings) {
		for (int j = 0; j < favoriteIDs.size(); ++j) {
			HousingListing favListing = housingListings.retreiveByID(favoriteIDs.get(j).toString());
			if(favListing.getListingID().isEmpty()) {
				continue;
			}
			student.addFavorites(favListing);
		}
	}
	
	/**
	 * 
	 */
	public static ArrayList<LeasingUser> loadLeasers() {
		ArrayList<LeasingUser> leasers = new ArrayList<LeasingUser>();
		DataLoader dataLoader = new DataLoader();
		
		try {
			FileReader reader = new FileReader(LEASERS_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);
			
			HousingListings listings = null;
			listings = listings.getInstance();
			ArrayList<HousingListing> compareList = listings.getAllListings();
			
			for(int i=0; i < usersJSON.size(); i++) {
				JSONObject userJSON = (JSONObject)usersJSON.get(i);
				String userID = (String)userJSON.get(USERS_ID);
				String firstName = (String)userJSON.get(USERS_FIRST_NAME);
				String lastName = (String)userJSON.get(USERS_LAST_NAME);
				String username = (String)userJSON.get(USERS_USERNAME);
				String password = (String)userJSON.get(USERS_PASSWORD);
				String phone = (String)userJSON.get(USERS_PHONE);
				String email = (String)userJSON.get(USERS_EMAIL);
                		String address = (String)userJSON.get(LEASERS_ADDRESS);
				String rating = (String)userJSON.get(USERS_RATING);
				String ratingCount = (String)userJSON.get(USERS_RATING_COUNT);
				ArrayList<String> propertyIDs = (ArrayList<String>)userJSON.get(LEASERS_PROPERTIES);
				
				leasers.add(new LeasingUser(firstName, lastName, username, password, phone,
						     email, address));
				leasers.get(i).setRatingInfo(Integer.parseInt(rating), Integer.parseInt(ratingCount));
								
				dataLoader.mapLeaserProperties(leasers.get(i), propertyIDs, listings);
				}
			
			return leasers;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	private void mapLeaserProperties(LeasingUser leaser, ArrayList<String> propertyIDs, HousingListings housingListings) {
		for (int j = 0; j < propertyIDs.size(); ++j) {
			HousingListing propertyListing = housingListings.retreiveByID(propertyIDs.get(j).toString());
			if(propertyListing.getListingID().isEmpty()) {
				continue;
			}
			leaser.addProperty(propertyListing);
		}
	}
	
	public static ArrayList<HousingListing> loadListings() {
		ArrayList<HousingListing> listings = new ArrayList<HousingListing>();
		DataLoader dataLoader = new DataLoader();

		try {
			FileReader reader = new FileReader(LISTINGS_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray listingsJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < listingsJSON.size(); i++) {
				JSONObject listingJSON = (JSONObject)listingsJSON.get(i);
				String listingID = (String)listingJSON.get(LISTINGS_ID);
				String listingTitle = (String)listingJSON.get(LISTINGS_TITLE);
				String address = (String)listingJSON.get(LISTINGS_ADDRESS);
				String description = (String)listingJSON.get(LISTINGS_DESCRIPTION);
				String rating = (String)listingJSON.get(LISTINGS_RATING);
				String ratingCount = (String)listingJSON.get(LISTINGS_RATING);
				String distance = (String)listingJSON.get(LISTINGS_DISTANCE);
				String price = (String)listingJSON.get(LISTINGS_PRICE);
				String housingType = (String)listingJSON.get(LISTINGS_TYPE);
				ArrayList<String> amenities = (ArrayList<String>)listingJSON.get(LISTINGS_AMENITIES);
				String manager = (String)listingJSON.get(LISTINGS_MANAGER_USERNAME);
				String bedrooms = (String)listingJSON.get(LISTINGS_BEDROOMS);
				String bathrooms = (String)listingJSON.get(LISTINGS_BATHROOMS);
				String units = (String)listingJSON.get(LISTINGS_UNITS);
				
				HousingType housingENUM = dataLoader.getHousingType(housingType);
				ArrayList<Amenities> amenitiesList = dataLoader.getAmenities(amenities);
				
				listings.add(new HousingListing(listingTitle, address, description, 
			              Double.parseDouble(distance), Double.parseDouble(price), housingENUM, 
			              amenitiesList, manager, Integer.parseInt(bedrooms), Integer.parseInt(bathrooms),
			              Integer.parseInt(units)));
				
				listings.get(i).setListingID(listingID);
				listings.get(i).setRating(Integer.parseInt(rating));
				listings.get(i).setRatingCount(Integer.parseInt(ratingCount));
				dataLoader.mapListingReviews(listings.get(i), listingID);
				
			}
			
			return listings;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listings;
	}
	
	public HousingType getHousingType(String housingType) {
		HousingType type = null;
		
		if(type.APARTMENT.name().contentEquals(housingType)) {
			return type.APARTMENT;
		} else if (type.CONDO.name().contentEquals(housingType)) {
			return type.CONDO;
		} else if (type.COOP.name().contentEquals(housingType)) {
			return type.COOP;
		} else if (type.DUPLEX.name().contentEquals(housingType)) {
			return type.DUPLEX;
		} else if (type.HOUSE.name().contentEquals(housingType)) {
			return type.HOUSE;
		} else if (type.LOFT.name().contentEquals(housingType)) {
			return type.LOFT;
		} else if (type.STUDIO.name().contentEquals(housingType)) {
			return type.STUDIO;
		} else if (type.TOWNHOME.name().contentEquals(housingType)) {
			return type.TOWNHOME;
		} else {
			return null;
		}
		
	}
	
	public ArrayList<Amenities> getAmenities(ArrayList<String> amenities) {
		Amenities compareAmenity = null;
		ArrayList<Amenities> amenitiesList = null;
		
		for(int i = 0; i < amenities.size(); ++i) {
			if (compareAmenity.BIKE_RACKS.name().contentEquals(amenities.get(i))) {
				amenitiesList.add(compareAmenity.BIKE_RACKS);
			} else if (compareAmenity.CATS.name().contentEquals(amenities.get(i))) {
				amenitiesList.add(compareAmenity.CATS);
			} else if (compareAmenity.DOGS.name().contentEquals(amenities.get(i))) {
				amenitiesList.add(compareAmenity.DOGS);
			} else if (compareAmenity.FURNISHED.name().contentEquals(amenities.get(i))) {
				amenitiesList.add(compareAmenity.FURNISHED);
			} else if (compareAmenity.GARBAGE_PICKUP.name().contentEquals(amenities.get(i))) {
				amenitiesList.add(compareAmenity.GARBAGE_PICKUP);
			} else if (compareAmenity.PARKING.name().contentEquals(amenities.get(i))) {
				amenitiesList.add(compareAmenity.PARKING);
			} else if (compareAmenity.ONSITE_LAUNDRY.name().contentEquals(amenities.get(i))) {
				amenitiesList.add(compareAmenity.ONSITE_LAUNDRY);
			} else if (compareAmenity.GARBAGE_PICKUP.name().contentEquals(amenities.get(i))) {
				amenitiesList.add(compareAmenity.GARBAGE_PICKUP);
			} else if (compareAmenity.WASHER_DRYER_CONNECTIONS.name().contentEquals(amenities.get(i))) {
				amenitiesList.add(compareAmenity.WASHER_DRYER_CONNECTIONS);
			} else if (compareAmenity.WASHER_DRYER_INCLUDED.name().contentEquals(amenities.get(i))) {
				amenitiesList.add(compareAmenity.WASHER_DRYER_INCLUDED);
			} else if (compareAmenity.WHEELCHAIR_ACCESSIBLE.name().contentEquals(amenities.get(i))) {
				amenitiesList.add(compareAmenity.WHEELCHAIR_ACCESSIBLE);
			}	
		}
		
		return amenitiesList;
	}
	
	private void mapListingReviews(HousingListing listing, String listingID) {
		Reviews reviews = null;
		reviews = reviews.getInstance();
		
		ArrayList<Review> listingReviews = reviews.getReviews(listingID);
		for(int i = 0; i < listingReviews.size(); ++i) {
			listing.addReview(listingReviews.get(i));
		}
	}
	
	public static ArrayList<Review> loadReviews() {
		ArrayList<Review> reviews = new ArrayList<Review>();
		
		
		try {
			FileReader reader = new FileReader(REVIEWS_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < usersJSON.size(); i++) {
				JSONObject userJSON = (JSONObject)usersJSON.get(i);
				String listingID = (String)userJSON.get(REVIEWS_LISTING_ID);
				String listingTitle = (String)userJSON.get(REVIEWS_TITLE);
				String author = (String)userJSON.get(REVIEWS_AUTHOR);
				String rating = (String)userJSON.get(REVIEWS_RATING);
				String comment = (String)userJSON.get(REVIEWS_COMMENT);
				
				reviews.add(new Review(author, Integer.parseInt(rating), comment, listingID));
				
			}
			
			return reviews;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

