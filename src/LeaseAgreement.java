import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeaseAgreement {
	private static final String FILE_READER_NAME = "/Users/sonaguzzarlamudi/Desktop/LeaseAgreement.txt";
	private static final String FILE_WRITE_NAME = "/Users/sonaguzzarlamudi/Desktop/NewLeaseAgreement.txt";
	private static final String DATE = "<DATE>";
	private static final String LANDLORD = "<LANDLOARD>";
	private static final String TENANTS = "<TENANT(s)>";
	private static final String BEDS = "<NUM_BED>";
	private static final String BATHS = "<NUM_BATH>";
	private static final String PROPERTY_ADDRESS = "<PROPERTY_ADDRESS>";
	private static final String ZIP = "<ZIP>";
	private static final String START_DATE = "<START DATE>";
	private static final String END_DATE = "<END DATE>";
	private static final String RENT = "<RENT>";
	private static final String PAYMENT_ADDRESS = "<PAYMENT ADDRESS>";
	private static final String DAMAGE_COST = "<DAMAGE COST>";
	private static final String FIRST_TENANT = "<TENANT 1>";
	private static final String SECOND_TENANT = "<TENANT X>";
	
	
	private String firstTenant = "";  //it would add whatever is passed in from the UI, right?
	private String secondTenant = "";
	private String landlord = "";
	private String propertyAddress = "";
	private String paymentAddress = "";
	private int num_bed;
	private int num_bath;
	private String sczip;
	private String currentDate;
    	private String startdate;
    	private String endDate;
    	private double rent;
	private double damage = 3000.00;

	public LeaseAgreement(String tenant1, String tenant2, HousingListing housingListing, String startDate, String endDate) {
		this.firstTenant = tenant1;
		this.secondTenant = tenant2;
		this.landlord = housingListing.getManagerName();
		this.propertyAddress = housingListing.getAddress();
		this.paymentAddress = housingListing.getPaymentAddress();
		this.num_bed = housingListing.getBedrooms();
		this.num_bath = housingListing.getBathrooms();
		//this.sczip = housingListing.getZip();
		this.startdate = startDate;
		this.endDate = endDate;
		this.rent = housingListing.getPrice();
	}
	
	public void generateLeaseAgreement() throws IOException {
		File oglease = new File("/Users/sonaguzzarlamudi/Desktop/LeaseAgreement.txt");
		Scanner scanner = new Scanner(oglease);
		FileWriter writer = new FileWriter("/Users/sonaguzzarlamudi/Desktop/NewLeaseAgreement.txt");
		String line = "";
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			line = fillLease(line);
			
			writer.write(line);
		}
	}
	
	private String fillLease(String line) {
		if(line.contains(DATE)) {
			line.replace(DATE, this.currentDate);
		}
		if(line.contains(LANDLORD)) {
			line.replace(LANDLORD, this.landlord);
		}
		if(line.contains(TENANTS)) {
			if(!this.secondTenant.isEmpty()) {
				line.replace(TENANTS, this.firstTenant + ", " + this.secondTenant);
			} else {
				line.replace(TENANTS, this.firstTenant);
			}
		}
		if(line.contains(BEDS)) {
			line.replace(BEDS, String.valueOf(num_bed));
		}
		if(line.contains(BATHS)) {
			line.replace(BATHS, String.valueOf(num_bath));
		}
		if(line.contains(PROPERTY_ADDRESS)) {
			line.replace(PROPERTY_ADDRESS, this.propertyAddress);
		}
		if(line.contains(ZIP)) {
			line.replace(ZIP, this.sczip);
		}
		if(line.contains(START_DATE)) {
			line.replace(START_DATE, this.startdate);
		}
		if(line.contains(END_DATE)) {
			line.replace(END_DATE, this.endDate);
		}
		if(line.contains(RENT)) {
			line.replace(RENT, String.valueOf(this.rent));
		}
		if(line.contains(PAYMENT_ADDRESS)) {
			line.replace(DAMAGE_COST, this.paymentAddress);
		}
		if(line.contains(FIRST_TENANT)) {
			line.replace(FIRST_TENANT, this.firstTenant);
		}
		if(line.contains(SECOND_TENANT)) {
			if(this.secondTenant.isEmpty()) {
				line.replace(SECOND_TENANT, "");
			} else {
				line.replace(SECOND_TENANT, this.secondTenant);
			}
		}
		return line;
	}
}
