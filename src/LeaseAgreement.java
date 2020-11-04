import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.io.FileWriter;

public class LeaseAgreement { 
	private static String text = "LANDLOARD";
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
 
    public static void modifytxt(String fileName, String text, String replacement, String toFileName) throws IOException {
    	
    	//file should be local
    	File oglease = new File("/Users/sonaguzzarlamudi/Desktop/LeaseAgreement.txt");
		Scanner scanner = new Scanner(oglease);
		FileWriter writer = new FileWriter("/Users/sonaguzzarlamudi/Desktop/NewLeaseAgreement.txt");
		String line = "";
		while(scanner.hasNextLine()) {
			
			read();
			
			line = scanner.nextLine();
			line = line.replaceAll(text, replacement);
			writer.write(line);	
		}
		scanner.close();
		writer.close();
    }

	private static void read() throws FileNotFoundException 
	{
		File oglease = new File("/Users/sonaguzzarlamudi/Desktop/LeaseAgreement.txt");
		Scanner scanner = new Scanner(oglease);
		if(scanner.hasNext("LANDLOARD")) {
			//replace
		}
		else if (scanner.hasNext("TENANT")) {
			
		}
		else if (scanner.hasNext("PROPERTY ADDRESS")) {
			
		}
		
		
	}
    
    
    
	/*
    public static void main(String[] args) throws IOException {
    	
    	String[] text = {"LANDLOARD", "TENANT (s)"};
    	
    	for(int i = 0; i < text.length; i++) {
    		
    		System.out.println("What is the "+text[0]+" name?");
    		Scanner keyboard = new Scanner(System.in);
            String newLL = keyboard.nextLine();
            
            modifytxt("c:/Users/sonaguzzarlamudi/Desktop/LeaseAgreement.txt", ""+text+"", 
            		" "+newLL+" ", "d:/Users/sonaguzzarlamudi/Desktop/NewLease.txt");
        
    	}
    
    }*/
}

    	
    	
    
