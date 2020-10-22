
public class TestDriver {
	private Users users;
	
	public void run() {
		StudentUser testStudent = new StudentUser("N","B","testUser","abc123","555-555-1234",
                "testUser@gmail.com","S349212");
		HousingListing testListing = new HousingListing();

		testStudent.leaveHousingReview(testListing, 4, "Chill place near campus. Building is old, but well maintained");

		DataLoader testLoader = new DataLoader();
		users = users.getInstance();
		
		
		
	}
	
  public static void main(String[] args) {
	  TestDriver testInterface = new TestDriver();
	  testInterface.run();
	  
  }
}
