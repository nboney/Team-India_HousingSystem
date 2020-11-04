public class HousingSystem {
    private Users users;
    private Reviews reviews;
    private static HousingListings housingListings;
    private ArrayList<HousingListing> housingListingList;
      
    public HousingSystem() {
        users = Users.getInstance();
        reviews = Reviews.getInstance();
        housingListings = HousingListings.getInstance();
        this.housingListingList = housingListingList;        
    }
    
    //Returns true if item is found, and false otherwise
    public boolean StudentUserLogin(String username, String password) {
        if(users.equals(username) && users.equals(password)) {
            return users.studentLogin(username, password);
        }
        else {
            return false;
        }
    }
    
    //Returns true if item is found, and false otherwise
    public boolean NoneStudentLogin(String username, String password) {
        if(users.equals(username) && users.equals(password)) {
            return users.leaserLogin(username, password);
        }
        else {
            return false;
        }
    }  
     
    public boolean UserSignUp(String username, String password) {
        if(users.equals(users)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean NewStudent(String studentuser, String username, String password) {
	    if(users.equals(username) && users.equals(password)) { 
	    	return true;
	    }
	    else {
	        return false;     
	    }
    }
    
    public boolean NewPropertyManagers(String propertymanagers) {
	    if(users.equals(propertymanagers)) { 
            return true;
	    }
	    else {
            return false;     
	    }     
    }
    
    public boolean StudentMainMenu(String student) {
        if(users.equals(student)) {
            return true;
        }
        else {
            return false;
        }      
    }
    
    public boolean PropertyManagersMainMenu(String propertymanagers) {
        if(users.equals(propertymanagers)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public ArrayList<HousingListing> FindHouse(String listingTitle, HousingType housingType,
                             ArrayList<Amenities> amenities) {
        ArrayList<HousingListing> results = null;
        for(int i = 0; i < this.housingListingList.size(); ++i) {
             
            if(housingSearch.equals(listingTitle) && housingSearch.equals(housingType) &&
            housingSearch.equals(amenities)) {
          
            results.add(this.housingListingList.get(i));
            } 
        }
           
        return results;    
    }
    
    public ArrayList<HousingListing> FindByName(String listingTitle) {
        ArrayList<HousingListing> results = null;
        
        for(int i = 0; i < this.housingListingList.size(); ++i) {
            if(housingSearch.equals(listingTitle)) {
                results.add(this.housingListingList.get(i));
            }
        }
        return results;
    } 
	
    public boolean FindByNumsOfBedroomAndBathRoom() {
        return false;
    }
    
    public ArrayList<HousingListing> FindByType(HousingType housingType) {
        ArrayList<HousingListing> results = null;
        
        for(int i = 0; i < this.housingListingList.size(); ++i) {
            if(housingSearch.equals(housingType)) {
                results.add(this.housingListingList.get(i));
            }
        }
        return results;    
    }
    
    public ArrayList<HousingListing> FindByAmenities(ArrayList<Amenities> amenities) {
        ArrayList<HousingListing> results = null;
        
        for(int i = 0; i < this.housingListingList.size(); ++i) {
            if(housingSearch.equals(amenities)) {
                results.add(this.housingListingList.get(i));
            }
        }
        return results;
    }
    
    
    public boolean SignLease() {
        return false;
        
    }
    
    public boolean PrintHousingInformation() {
        return false;
        
    }
}	
