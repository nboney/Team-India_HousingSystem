
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
	
	public static void saveUsers() {
		
	}
	
	public static JSONObject getUserJSON(RegisteredUser user) {
		JSONObject userDetails = new JSONObject();
		
		return userDetails;
	}
	
	public static void saveListings() {
		
	}
	
	public static JSONObject getListingJSON(HousingListing listing) {
		JSONObject listingDetails = new JSONObject();
		
		return listingDetails;
	}
}
