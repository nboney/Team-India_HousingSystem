public class HousingSystem {
    private Users users;
    private Reviews reviews;
      
    public HousingSystem() {
        users = Users.getInstance();
        reviews = Reviews.getInstance();
    }
    
    public boolean StudentUserLogin(String username, String password) {
        return users.studentLogin(username, password);
    }
    
    public boolean NoneStudentLogin(String username, String password) {
        return users.leaserLogin(username, password);
    }  
}
