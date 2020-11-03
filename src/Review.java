public class Review {
    private String listingTitle;
    private String author;
    private double rating;
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
    
   /**
    public void addReview(Review review, StudentUser user, int rating, String comment) {
        reviews.add(review);
    }
    */
    
    @Override
    public String toString() {
        return "Review by: " + this.author + "\nRating: " + this.rating + "\n" + this.comment;
    }
}
