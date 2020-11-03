public class HousingSystem {
    private Users users;
    private Reviews reviews;
      
    public HousingSystem() {
        users = Users.getInstance();
        reviews = Reviews.getInstance();
    }
    
    //Returns true if item is found, and false otherwise
    public boolean StudentUserLogin(String username, String password) {
        return users.studentLogin(username, password);
    }
    
    //Returns true if item is found, and false otherwise
    public boolean NoneStudentLogin(String username, String password) {
        return users.leaserLogin(username, password);
    }  
}
