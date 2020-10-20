
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {
	public static ArrayList<RegisteredUser> loadUsers() {
		ArrayList<RegisteredUser> users = new ArrayList<RegisteredUser>();
		
		try {
			FileReader reader = new FileReader(USERS_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < usersJSON.size(); i++) {
				JSONObject userJSON = (JSONObject)usersJSON.get(i);
				String firstName = (String)userJSON.get(USERS_FIRST_NAME);
				String lastName = (String)userJSON.get(USERS_LAST_NAME);
				String username = (String)userJSON.get(USERS_USERNAME);
				String password = (String)userJSON.get(USERS_PASSWORD);
				String phoneNumber = (String)userJSON.get(USERS_PHONE);
				String email = (String)userJSON.get(USERS_EMAIL);
				String rating = (String)userJSON.get(USERS_RATING); //TODO parse int from String
				String ratingCount = (String)userJSON.get(USERS_RATING_COUNT); //TODO parse int from String
				
				users.add(new RegisteredUser(firstName, lastName, username, password, email,
						  Integer.parseInt(rating), Integer.parseInt(ratingCount)));
			}
			
			return users;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static ArrayList<HousingListing> loadListings() {
		ArrayList<HousingListing> listings = new ArrayList<HousingListing>();
		
		try {
			FileReader reader = new FileReader(LISTINGS_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray listingsJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < listingsJSON.size(); i++) {
				JSONObject listingJSON = (JSONObject)listingsJSON.get(i);
				String listingTitle = (String)listingJSON.get(LISTINGS_TITLE);
				String address = (String)listingJSON.get(LISTINGS_ADDRESS);
				String description = (String)listingJSON.get(LISTINGS_DESCRIPTION);
				String rating = (String)listingJSON.get(LISTINGS_RATING);
				String ratingCount = (String)listingJSON.get(LISTINGS_RATING);
				String distance = (String)listingJSON.get(LISTINGS_DISTANCE);
				String price = (String)listingJSON.get(LISTINGS_PRICE);
				
				listings.add(new HousingListing(listingTitle, address, description,
						     Integer.parseInt(rating), Integer.parseInt(ratingCount),
						     Double.parseDouble(distance), Double.parseDouble(price)));
			}
			
			return listings;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

