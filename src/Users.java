import java.util.ArrayList;

public class Users {
	private static Users users;
	private ArrayList<StudentUser> studentList;
	private ArrayList<LeasingUser> leaserList;
	
	private Users() {
		studentList = DataLoader.loadStudents();
		leaserList = DataLoader.loadLeasers();
	}
	
	public static Users getInstance() {
		if(users == null) {
			users = new Users();
		}
		
		return users;
	}
	
	public boolean haveStudent(String username, int index) {
		if(studentList.get(index).getUsername().contentEquals(username)) {
			return true;
		}
		
		return false;
	}
	
	public StudentUser getStudent(String username) {
		for(int i = 0; i < studentList.size(); ++i) {
			if(users.haveStudent(username, i)) {
				return studentList.get(i);
			}
		}
		
		return null;
	}
	
	public ArrayList<StudentUser> getStudentList() {
		return this.studentList;
	}
	
	public ArrayList<LeasingUser> getLeaserList() {
		return this.leaserList;
	}
	
	public boolean studentLogin(String username, String password) {
		for(int i = 0; i < studentList.size(); ++i) {
			if(studentList.get(i).getUsername().contentEquals(username) &&
				studentList.get(i).getPassword().contentEquals(password)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean haveLeaser(String username, int index) {
		if(leaserList.get(index).getUsername().contentEquals(username)) {
			return true;
		}
		
		return false;
	}
	
	public LeasingUser getLeaser(String username) {
		for(int i = 0; i < leaserList.size(); ++i) {
			if(users.haveLeaser(username, i)) {
				return leaserList.get(i);
			}
		}
		
		return null;
	}
	
	public boolean leaserLogin(String username, String password) {
		for(int i = 0; i < leaserList.size(); ++i) {
			if(leaserList.get(i).getUsername().contentEquals(username) &&
				leaserList.get(i).getPassword().contentEquals(password)) {
				return true;
			}
		}
		
		return false;
	}
}
