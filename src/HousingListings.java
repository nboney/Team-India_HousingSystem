import java.util.ArrayList;

public class HousingListings {
	private static HousingListings housingListings;
	private ArrayList<HousingListing> housingListingList;
	
	public HousingListings() {
		housingListingList = DataLoader.loadListings();
	}
	
	public static HousingListings getInstance() {
		if(housingListings == null) {
			housingListings = new HousingListings();
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
