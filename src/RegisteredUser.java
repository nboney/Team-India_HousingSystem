public class RegisteredUser extends User {
    protected String userID;
	protected String firstName;
    protected String lastName;
    protected String username;
    protected String password;
    protected String phone;
    protected String email;
    protected int rating;
    protected int ratingCount;
    
    /*
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
    }*/
    
    /*
     * Constructor for TESTING purposes ONLY. Needed for first pass at DataLoader
     
    public RegisteredUser(String firstName2, String lastName2, String username2, String password2, String email2,
                          int parseInt, int parseInt2) {
    // TODO Auto-generated constructor stub
        this.firstName = firstName2;
        this.lastName = lastName2;
        this.username = username2;
        this.password = password2;
        this.email = email2;
        this.rating = parseInt;
        this.ratingCount = parseInt2;     
  }*/
  
  public String getUsername() {
	  return this.username;
  }
  
  public String getPassword() {
	  return this.password;
  }
  
  public void setID(String id) {
	  this.userID = id;
  }
}
