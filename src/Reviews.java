import java.util.ArrayList;

public class Reviews {
	private static Reviews reviews;
	private ArrayList<Review> reviewList;
	
	private Reviews() {
		reviewList = DataLoader.loadReviews();
		
	}
	
	public static Reviews getInstance() {
		if(reviews == null) {
			reviews = new Reviews();
		}
		
		return reviews;
		
	}
	
	public ArrayList<Review> getReviews(String listingTitle) {
		ArrayList<Review> listingReviews = new ArrayList<Review>();
		return listingReviews;
	}
	
}
