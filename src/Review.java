public class Review {
    private StudentUser writer;
    private double rating;
    private String comment;
    
    public Review(StudentUser writer, double rating, String comment) {
        this.writer = writer;
        this.rating = rating;
        this.comment = comment;
    }
    
    public StudentUser getWriter() {
        return this.writer;
    }
    
    public int getRating() {
        return (int) rating;
    }
    
    public String getComment() {
        return comment;
    }
    
    @Override
    public String toString() {
        return "";
    }
}
