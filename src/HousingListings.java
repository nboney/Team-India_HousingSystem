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
	
	public boolean haveListing(String listingTitle, int index) {
		if(housingListingList.get(index).getListingTitle().contains(listingTitle)) {
			return true;
		}
		
		return false;
	}
	
	public boolean haveListing(HousingType housingType, int index) {
		if(housingListingList.get(index).getHousingType().equals(housingType)) {
			return true;
		}
		
		return false;
	}
	
	public boolean hasListing(ArrayList<Amenities> amenities, int index) {
		ArrayList<Amenities> compareList = this.housingListingList.get(index).getAmenities();
		
		if(compareList.containsAll(amenities)) {
			return true;
		}
		
		return false;
		/*for(int i = 0; i < compareList.size(); i++) {
			for(int j = 0; j < amenities.size(); ++i) {
				if(compareList.con)
			}
		}*/
	}
	
	public HousingListing getListing(String listingTitle) {
		return null;
	}
	
	public HousingListing addListing(HousingListing listing) {
		listing.setListingID(Integer.toString(housingListingList.size()));
		housingListingList.add(listing);
		return listing;
		
	}
	
	public void removeListing(HousingListing listing) {
		housingListingList.remove(listing);
	}
	
	public ArrayList<HousingListing> getAllListings() {
		return this.housingListingList;
	}
	
	public ArrayList<HousingListing> housingSearch(String listingTitle){
		ArrayList<HousingListing> results = null;
		for(int i = 0; i < this.housingListingList.size(); i++) {
			if(this.haveListing(listingTitle, i)) {
				results.add(this.housingListingList.get(i));
			}
		}
		
		return results;
	}
	
	public ArrayList<HousingListing> housingSearch(HousingType housingType, ArrayList<Amenities> amenities) {
		ArrayList<HousingListing> results = null;
		for(int i = 0; i < this.housingListingList.size(); ++i) {
			if(housingType != null) {
				if(this.haveListing(housingType, i)) {
					results.add(this.housingListingList.get(i));
				} else {
					continue;
				}
			}
	
			if(amenities != null) {
				if(this.hasListing(amenities, i)) {
					if(!results.contains(this.housingListingList.get(i))) {
						results.add(this.housingListingList.get(i));
					}
				} else {
					results.remove((results.size()-1));
				}
			}
		}
		
		return results;
	}
}
