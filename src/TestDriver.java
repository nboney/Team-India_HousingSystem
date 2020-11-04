import java.util.ArrayList;

public class TestDriver {
	private Users users;
	private HousingListings listings;
	public void run() {
		StudentUser testStudent = new StudentUser("N","B","testUser","abc123","555-555-1234",
                "testUser@gmail.com","S349212");
		//HousingListing testListing = new HousingListing();

		//testStudent.leaveHousingReview(testListing, 4, "Chill place near campus. Building is old, but well maintained");

		DataLoader testLoader = new DataLoader();
		listings = listings.getInstance();
		
		HousingListing list1 = new HousingListing("Test", "", "", 0, 0, null, 
				null, null, 0, 0, 0);
		list1.setListingID("012");
		listings.addListing(list1);
		HousingListing list2 = new HousingListing("", "", "", 0, 0, null, 
				null, null, 0, 0, 0);
		list2.setListingID("142");
		listings.addListing(list2);
		HousingListing list3 = new HousingListing("", "", "", 0, 0, null, 
				null, null, 0, 0, 0);
		list3.setListingID("321");
		listings.addListing(list3);
		HousingListing list4 = new HousingListing("", "", "", 0, 0, null, 
				null, null, 0, 0, 0);
		list4.setListingID("003");
		listings.addListing(list4);
		HousingListing list5 = new HousingListing("", "", "", 0, 0, null, 
				null, null, 0, 0, 0);
		list5.setListingID("772");
		listings.addListing(list5);
		HousingListing list6 = new HousingListing("", "", "", 0, 0, null, 
				null, null, 0, 0, 0);
		list6.setListingID("082");
		listings.addListing(list6);
		
		users = users.getInstance();
		ArrayList<StudentUser> test = users.getStudentList();
		for(int i = 0; i < test.size(); ++i) {
			System.out.println(test.get(i).toString());
			System.out.println();
			ArrayList<HousingListing> favs = test.get(i).getFavorites();
			for(int j = 0; j < favs.size(); ++j) {
				/*if(favs.get(j).) {
					break;
				}*/
				System.out.println(favs.get(j).getListingID());
			}
			
		}
		//System.out.println(test.get(0).getFavorites().get(0).getListingTitle());
		
	}
	
  public static void main(String[] args) {
	  TestDriver testInterface = new TestDriver();
	  testInterface.run();
	  
  }
}
