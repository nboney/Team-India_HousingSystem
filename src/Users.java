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
	
	public boolean haveUser(String username, int index) {
		/*for(int i = 0; i < userList.size(); ++i) {
			RegisteredUser currUser = userList.get(i);
			if(currUser.getUsername().contentEquals(username)) {
				return true;
			}
		}*/
		if(userList.get(index).getUsername().contentEquals(username)) {
			return true;
		}
		
		return false;
	}
	
	public User getUser(String username) {
		for(int i = 0; i < userList.size(); ++i) {
			if(users.haveUser(username, i)) {
				return userList.get(i);
			}
		}
		
		return null;
	}
}
