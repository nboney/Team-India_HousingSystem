import java.util.ArrayList;
/*
public class TestDriver {
	private Users users;
	private Reviews reviews;
	private HousingListings housingListings;
	private DataWriter dataWriter;
	
	TestDriver() {
		reviews = reviews.getInstance();
		housingListings = housingListings.getInstance();
		//users = users.getInstance();
		dataWriter = new DataWriter();
		
	}	
	
	public void run() {
		
		//Create and add a student user
		StudentUser testStudent = new StudentUser("X32910", "Nick", "Boney", "nboney", "123abc", "803-246-5704",
				                                  "nboney@gmail.com");
		//users.getStudentList();
		//users.addStudent(testStudent);
		
		//Create and add a housing listing
		ArrayList<Amenities> amenList = new ArrayList<Amenities>();
		amenList.add(Amenities.CATS);
		amenList.add(Amenities.DOGS);
		amenList.add(Amenities.POOL);
		
		HousingListing testListing = new HousingListing("Apartments!", "100 Main Street", "Nice complex downtown", 2.2, 500.00, HousingType.APARTMENT, amenList, "Joe Biden",
				                                        1, 2, 3);
		testListing.setManagerName("Joe", "Biden"); testListing.setBillingAddress("100 Blossom Street");
		testListing.setListingID("001");
		housingListings.addListing(testListing);
		
		HousingListing testListing1 = new HousingListing("Condo!", "100 Redwood Street", "Dope upscale condo", 3.2, 700.00, HousingType.CONDO, null, "Charles Styles",
                2, 2, 1);
		testListing1.setManagerName("Charles", "Styles"); testListing1.setBillingAddress("100 Bull Street");
		testListing1.setListingID("002");
		housingListings.addListing(testListing1);
		
		ArrayList<Amenities> amenSearch = new ArrayList<Amenities>();
		amenSearch.add(Amenities.CATS);
		amenSearch.add(Amenities.POOL);
		ArrayList<HousingListing> results = housingListings.housingSearch(HousingType.APARTMENT, amenSearch, 5, 0, 0, 0);
		
		if(results.isEmpty()) {
			System.out.println("No available results");
		} else {
			for(int i = 0; i < results.size(); ++i) {
				System.out.println(results.get(i).toString());
			}
		}*/
		//adding favorites for student
		//users.getStudentList().get(0).addFavorites(testListing);
		//users.getStudentList().get(0).addFavorites(testListing1);
		
		//dataWriter.saveStudents();
		//dataWriter.saveHousingListings();
		
		/*ArrayList<HousingListing> properties = housingListings.getAllListings();
		for(int i = 0; i < properties.size(); ++i) {
			System.out.println(properties.get(i).toString());
		}*/
		
		//dataWriter.saveStudents();
		//dataWriter.saveHousingListings();
		
	//}
	
	
  /*public static void main(String[] args) {
    // TODO Auto-generated method stub
	  TestDriver testUI = new TestDriver();
	  testUI.run();
  }
}*/
