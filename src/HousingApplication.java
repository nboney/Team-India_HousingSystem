
public class HousingApplication extends Document {
	private double monthlyIncome;
	private String email;
	
	public HousingApplication(String firstName, String lastName, String currentAddress,
			                  String phone, String socialSecurityNumber, double monthlyIncome, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentAddress = currentAddress;
		this.phone = phone;
		this.socialSecurityNumber = socialSecurityNumber;
		this.monthlyIncome = monthlyIncome;
		this.email = email;
	}
	
	public String toString() {
		return "";
	}
}
