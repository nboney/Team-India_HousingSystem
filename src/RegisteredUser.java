public class RegisteredUser extends User {
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String password;
    protected String phone;
    protected String email;
    protected int rating;
    protected int ratingCount;
    
    public RegisteredUser() {
    }
    
    /*
     * Constructor for TESTING purposes ONLY. Needed for first pass at DataLoader
     */
    public RegisteredUser(String firstName2, String lastName2, String username2, String password2, String email2,
                          int parseInt, int parseInt2) {
    // TODO Auto-generated constructor stub
  }

  public void leaveUserRating(RegisteredUser user, int rating) {
    }
}
