public class Review {
    private String listingTitle;
    private String author;
    private int rating;
    private String comment;
    private String listingID;
    
    public Review(String author, int rating, String comment, String listingID) {
        this.author = author;
        this.rating = rating;
        this.comment = comment;
        this.listingID = listingID;
    }
    
    public String getListingTitle() {
    	return this.listingTitle;
    }
    
   
    public String getAuthor() {
    	return this.author;
    }
    
    public int getRating() {
        return (int) rating;
    }
    
    public String getComment() {
        return comment;
    }
    
<<<<<<< HEAD
    public void setReviewID(String listingID) {
    	this.listingID = listingID;
    }
    
    public String getReviewID() {
    	return this.listingID;
    }
=======
   /**
    public void addReview(Review review, StudentUser user, int rating, String comment) {
        reviews.add(review);
    }
    */
>>>>>>> af42c5b5f0dc4ac27932bd8cf672e3f4e370c54e
    
    @Override
    public String toString() {
        return "Review by: " + this.author + "\nRating: " + this.rating + "\n" + this.comment;
    }
}
