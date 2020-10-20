import java.util.ArrayList;

public class Users {
	private Users users;
	private ArrayList<RegisteredUser> userList;
	
	private Users() {
		userList = DataLoader.loadUsers();
	}
	
	public Users getInstance() {
		if(users == null) {
			users = new Users();
		}
		
		return users;
	}
	
	public boolean haveUser(String username) {
		return true;
	}
	
	public User getUser(String username) {
		return null;
	}
}
