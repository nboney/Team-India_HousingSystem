public class HousingSystem {
    private Users users;
    private Reviews reviews;
      
    public HousingSystem() {
        users = Users.getInstance();
        reviews = Reviews.getInstance();
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
     
    public boolean UserSignUp() {
        return false;   
    }
    
    public boolean NewStudent() {
        return false;     
    }
    
    public boolean NewPropertyManagers() {
        return false;     
    }
    
    public boolean StudentMainMenu() {
        return false;      
    }
    
    public boolean PropertyManagersMainMenu() {
        return false;    
    }
    
    public ArrayList<HousingListing> FindHouse(String listingTitle, HousingType housingType,
                             ArrayList<Amenities> amenities) {
        ArrayList<HousingListing> results = null;
        
        for(int i = 0; i < this.housingListingList.size(); ++i) {
            
            if(listingTitle != null && housingType != null 
               && amenities != null) {
                results.add(this.housingListingList.get(i));
            } 
        }    
        return results;    
    }
    
    public ArrayList<HousingListing> FindByName(String listingTitle) {
        ArrayList<HousingListing> results = null;
        
        for(int i = 0; i < this.housingListingList.size(); ++i) {
            if(listingTitle != null) {
                results.add(this.housingListingList.get(i));
            }
        }
        return results;
    } 
}
