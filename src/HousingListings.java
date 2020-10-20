import java.util.ArrayList;

public class HousingListings {
	private static HousingListings housingListings;
	private ArrayList<HousingListing> housingListingList;
	
	public HousingListings() {
		housingListingList = DataLoader.getHousingListings();
	}
	
	public static HousingListings getInstance() {
		if(housingListings == null) {
			housingListings = new HousingsListings();
		}
		
		return housingListings;
	}
	
	public boolean haveListing(String listingTitle) {
		return true;
	}
	
	public HousingListing getListing(String listingTitle) {
		return null;
	}
}
