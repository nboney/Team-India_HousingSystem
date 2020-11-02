public class HousingSystem {
    private Users users;
    private Reviews reviews;
      
    public HousingSystem() {
        users = Users.getInstance();
        reviews = Reviews.getInstance();
    }
    
    public boolean userLogin() {
        return false;   
    }
    
    public boolean getHosuingList() {
        return false;       
    }
    
    public boolean searchByName() {
        return false;       
    }  
}
