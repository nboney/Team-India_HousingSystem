public class HousingSystem {
    private Users users;
    private Reviews reviews;
      
    public HousingSystem() {
        users = Users.getInstance();
        reviews = Reviews.getInstance();
    }
    
    public boolean userLogin(String username, String password) {
        return users.studentLogin(username, password);
    }
    
    public boolean getHousingList() {
        return false;       
    }
    
    public boolean searchByName() {
        return false;       
    }  
}
