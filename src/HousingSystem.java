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
        if(users.equals(username) {
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
    
    public boolean FindHouse(String listingTitle, HousingType housingType,
                             ArrayList<Amenities> amenities) {
        
        if(!housingListings.equals(listingTitle)) return false;
        if(!housingListings.equals(housingType)) return false;
        if(!housingListings.equals(amenities)) return false;
            
        return true;
    }
    
    public boolean FindHouseName(String listingTitle) {
        if(housingListings.equals(listingTitle))return true;
        return false;
    }
    
    public boolean FindByName(String listingTitle) {
        if(!FindHouseName(listingTitle))return false;
        return true;
    }
}
