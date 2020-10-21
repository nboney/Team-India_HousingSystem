public class RegisteredUser extends User {
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String password;
    protected String phone;
    protected String email;
    protected int rating;
    protected int ratingCount;
    protected RegisteredUser user;
    private String firstName2;
    private String lastName2;
    private String username2;
    private String password2;
    private String email2;
    private int parseInt;
    private int parseInt2;
    
    public RegisteredUser(String firstName,String lastName,
                          String username, String password,
                          String phone,String email, int rating,
                          int ratingCount) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }
    
    /*
     * Constructor for TESTING purposes ONLY. Needed for first pass at DataLoader
     */
    public RegisteredUser(String firstName2, String lastName2, String username2, String password2, String email2,
                          int parseInt, int parseInt2) {
    // TODO Auto-generated constructor stub
        this.firstName2 = firstName2;
        this.lastName2 = lastName2;
        this.username2 = username2;
        this.password2 = password2;
        this.email2 = email2;
        this.parseInt = parseInt;
        this.parseInt2 = parseInt2;     
  }

  public void leaveUserRating(RegisteredUser user, int rating) {
      this.user = user;
      this.rating = rating;
    }
}
