import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.io.FileWriter;

public class LeaseAgreement { //extends Document {
	private String landlord = "";
	private String tenants = "";
	private String propertyAddress;
	private int num_bed;
	private int num_bath;
	private int sczip;
    	private int startdate;
    	private int enddate;
    	private int rent;
    	private String paymentAddress;
    	private int damages;
    	private String tenant1 = "";

    public LeaseAgreement() {
    	
    }
	
 
    public static void modifytxt(String fileName, String landlord, String replacement, String toFileName) throws IOException {
    	
    	//file should be local but I used this for now
    	File oglease = new File("/Users/sonaguzzarlamudi/Desktop/LeaseAgreement.txt");
		Scanner scanner = new Scanner(oglease);
		FileWriter writer = new FileWriter("/Users/sonaguzzarlamudi/Desktop/NewLeaseAgreement.txt");
		String line = "";
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			line = line.replaceAll(landlord, replacement);
			writer.write(line);
			//writer.newLine();	
		}
		scanner.close();
		writer.close();
    }
	
    public static void main(String[] args) throws IOException {
    	
    	System.out.println("What is the Landlord's name?");
	Scanner keyboard = new Scanner(System.in);
        String newLL = keyboard.nextLine();
        
    	modifytxt("c:/Users/sonaguzzarlamudi/Desktop/LeaseAgreement.txt", "LANDLOARD", " "+newLL+" ",
    			"d:/Users/sonaguzzarlamudi/Desktop/NewLease.txt");
        
    	/*
	this part isn't working out
	
    	System.out.println("What is the tenant's name?");
        String newt = keyboard.nextLine();
        String replacement = "";
	replacement .replaceAll(newLL, newLL);
        
    	modifytxt("c:/Users/sonaguzzarlamudi/Desktop/LeaseAgreement.txt", "TENANT (s)", " "+newt+" ",
    			"d:/Users/sonaguzzarlamudi/Desktop/NewLease.txt");
    	*/
    }
}

    	
    	
    
