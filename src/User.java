import java.util.ArrayList;

public class User {
    private ArrayList<HousingListing> search;
    private ArrayList<HousingListing> tag;
    
    public User () {
        this.search = search;
        this.tag = tag;
    }
    
    public ArrayList<HousingListing> search() {
        return this.search;
    }   
        
    public ArrayList<HousingListing> search(String tag) {
       return this.tag;    
    }    
}
