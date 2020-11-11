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
	
	public ArrayList<Review> getReviewList() {
		return this.reviewList;
	}
	
	public ArrayList<Review> getReviews(String listingID) {
		ArrayList<Review> listingReviews = new ArrayList<Review>();
		
		for(int i = 0; i < reviewList.size(); ++i) {
			if (reviewList.get(i).getReviewID().contentEquals(listingID)) {
				listingReviews.add(reviewList.get(i));
			}
		}
		return listingReviews;
	}
	
	
	public void saveReviews() {
		DataWriter.saveReviews();
	}
}
