import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.io.FileWriter;

public class LeaseAgreement { 
	private static final String tenant = "";  //it would add whatever is passed in from the UI, right?
	private static final String landloard = "";
	private static final String propertyAddress = "";
	private static final String paymentAddress = "";
	private static final CharSequence num_bed = null;
	private static final CharSequence num_bath = null;
	private static final CharSequence sczip = null;
    	private static final CharSequence startdate = null;
    	private static final CharSequence enddate = null;
    	private static final CharSequence rent = null;
	private static final CharSequence damage = null;
    
	public LeaseAgreement(String tenant1, String tenant2, HousingListing housingListing, String startDate, String endDate) {
		
		File oglease = new File("/Users/sonaguzzarlamudi/Desktop/LeaseAgreement.txt");
		Scanner scanner = new Scanner(oglease);
		FileWriter writer = new FileWriter("/Users/sonaguzzarlamudi/Desktop/NewLeaseAgreement.txt");
		String line = "";
		while(scanner.hasNextLine()) {
			line.replace("<LANDLOARD>", this.landloard);
			line.replace("<TENANT>", this.tenant);
			line.replace("<PROPERTY_ADDRESS>", this.propertyAddress);
			line.replace("<PAYMENT_ADDRESS>", this.paymentAddress);
			line.replace("<NUM_BED>", this.num_bed);
			line.replace("<NUM_BATH>", this.num_bath);
			line.replace("<ZIP>", this.sczip);
			line.replace("<START DATE>", this.startdate);
			line.replace("<END DATE>", this.enddate);
			line.replace("<DAMAGE COST>", this.damage);
		}
	}
}
	/*
    public LeaseAgreement() {
    	
    }
 
    public static void modifytxt(String fileName, String text, String replacement, String toFileName) throws IOException {
    	
    	//file should be local
    	File oglease = new File("/Users/sonaguzzarlamudi/Desktop/LeaseAgreement.txt");
		Scanner scanner = new Scanner(oglease);
		FileWriter writer = new FileWriter("/Users/sonaguzzarlamudi/Desktop/NewLeaseAgreement.txt");
		String line = "";	
		}
		scanner.close();
		writer.close();
    }
	private String read(String line) {
		
		return line;
	}
}*/ 
