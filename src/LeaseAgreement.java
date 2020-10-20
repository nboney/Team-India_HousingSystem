public class LeaseAgreement extends Document{
    private String propertyAddress;
    private String leaseLength;
    private String monthlyRent;
    private String termsOfAgreement;
    private boolean agreeToTerms;

    public LeaseAgreement(String firstName, String lastName, String currentAddress, String phone,
                          String socialSecurityNumber, String propertyAddress, int leaseLength,
                          double monthlyRent){
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentAddress = currentAddress;
        this.phone = phone;
        this.socialSecurityNumber = socialSecurityNumber;
        this.propertyAddress = propertyAddress;
    }

    public boolean acceptTheTerms(){
        return acceptTheTerms();
    }

    public String toString(){
        return "";
    }

}
