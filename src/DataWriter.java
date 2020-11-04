//make sure to download the json-simple so all this can compile and build path
import java.io.FileWriter; //only one Plante had
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
	
	/*public static void saveUsers() {
		
		Users user = Users.getInstance();
		ArrayList<RegisteredUser> friends = user.getRegisteredUser();
		JSONArray jsonUsers = new JSONArray();
	
		for(int i = 0; i < users.size(); i++) {
				
			jsonUsers.add(getUserJSON(users.get(i)));
		}
			
		try (FileWriter file = new FileWriter(USERS_FILE_NAME)) {
				
			file.write(jsonUsers.toJSONString());
			file.flush();
				
		} catch (IOException e) {
				
			e.printStackTrace();
				
		}
	}
	
	public static JSONObject getUserJSON(RegisteredUser user) {
		
		JSONObject userDetails = new JSONObject();
		userDetails.put(USERS_USERNAME, user.getUsername());
		userDetails.put(USERS_FIRST_NAME, user.getFirstName());
		userDetails.put(USERS_LAST_NAME, user.getLastName());
		userDetails.put(USERS_PHONE, user.getPhone());
		
		return userDetails;
	}
	
	//Plante didn't have this method *here*
	public static void saveListings() {
		
	}
	
	public static JSONObject getListingJSON(HousingListing listing) {
		
		JSONObject listingDetails = new JSONObject();
		listingDetails.put(LISTINGS_TITLE, listing.getListingTitle());
		listingDetails.put(LISTINGS_ADDRESS, listing.getAddress());
		listingDetails.put(LISTINGS_DESCRIPTION, listing.getDescription());
		listingDetails.put(LISTINGS_PRICE, listing.getPrice());
		
		return listingDetails;
	}
	
	public static JSONObject getReviewsJSON(Review review) {
		
		JSONObject reviewDetails = new JSONObject();
		reviewDetails.put(REVIEWS_TITLE, review.getListingTitle());
		reviewDetails.put(REVIEWS_AUTHOR, review.getAuthor());
		reviewDetails.put(REVIEWS_RATING, review.getRating());
		reviewDetails.put(REVIEWS_COMMENT, review.getComment());
		
		return reviewDetails;
	}*/
}
