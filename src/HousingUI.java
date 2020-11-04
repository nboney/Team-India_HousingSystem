import java.util.Scanner;

public class HousingUI {
    private static final String  WELCOME_MESSAGE = "Welcome to Team India Housing system";
    private static final String ChoiceByNumber = "Please choose by command number " ;
    private Scanner sc;
    private String[] MainMenuOptions = {"Log in as Student User","Login as Property Managers","Sign up","Quit"};
    private String[] UserSingUpMenu = {"Sign Up as Student" , "Sign Up as Property Managers"};
    private String[] StudentLoginMenu = {"Sign in"};
    private String[] PropertyManagers = {"Sign in"};
    private String[] StudentMainMenu = {"Find a House", "Sign a Lease" ," Leave a Review", "Back to login"};
    private String[] FindHouse = {"HouseListing","Housing Type" , "Amenities"};
    private String[] PropertyManagersMainMenu = {"Upload a House" , "Sign a Lease", "Back to login"};
    private String [] HouseAmenities = {"Numbers of Bedrooms" , "Numbers of Bathrooms",
            "Allow pets", "Having a pool", "Included Washer and Dyer"};
    private User user;
    private StudentUser studentUser;



    HousingUI(){
        sc = new Scanner(System.in);
        User user = new User();
        StudentUser studentUser = new StudentUser();
        LeasingUser leasingUser = new LeasingUser();
        HousingListing housingListing = HousingListing();
        Reviews reviews = Reviews.getInstance();
        Amenities amenities = Amenities.getAmenities;
        LeaseAgreement leaseAgreement = LeaseAgreement.getLeaseAgreement;
        HousingType housingType = HousingType.getHousingType;


    }



    public void run(){
        System.out.println(WELCOME_MESSAGE);
            displayMenu(MainMenuOptions);
            int command = getCommand(MainMenuOptions.length);

            switch (command){
                case (0):
                    StudentUserLogin();
                    break;
                case (1):
                    PropertyManagersLogin();
                    break;
                case (2):
                    ;
                    break;
                case (3):
                    System.out.println("Bye" + "\n");
                    break;
                default:
                    System.out.println("Wrong choice!" + "\n");
                    break;
            }

    }


    public void displayMenu(String[] menu){
        for (int i = 0; i < menu.length; i++){
            System.out.println((i+1) + "" + menu[i]);
            System.out.println("");
        }

    }

    private int getCommand(int numCommands) {
        System.out.println("Please Enter the command number" + "\n");
        sc = new Scanner(System.in);
        int command = sc.nextInt() - 1;
        if(command >= 0 && command <= numCommands -1) return command;

        return -1;
    }




    public void StudentUserLogin(){
        int command;
        displayMenu(StudentLoginMenu);
        command = getCommand(StudentLoginMenu.length);

        switch (command) {
            case (0):
                StudentMainMenu();
                break;
        }


        }

    public void PropertyManagersLogin(){
        int command;
        displayMenu(PropertyManagersMainMenu);
        command = getCommand(PropertyManagers.length);

        }

     public void UserSingUp(){
        int command;
        displayMenu(UserSingUpMenu);
        command = getCommand(UserSingUpMenu.length);

        switch (command){
            case (0):
                NewStudent();
                break;
            case (1):
                NewPropertyManagers();
                break;

            default:
                System.out.println("Wrong choice!" + "\n");
                break;
        }
     }

    public void  NewStudent(){
        System.out.println("Please enter your first name" + "\n");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last name" + "\n");
        String lastName = sc.nextLine();
        System.out.println("Please enter your USC ID" + "\n");
        String id = sc.nextLine();
        System.out.println("Please enter your password" + "\n");

        StudentUser newStudent = new StudentUser(firstName,lastName,id);
        StudentUser studentUser = StudentUser.getStudents();
        studentUser.addStudent(newStudent);
        user = newStudent;

        System.out.println("Welcome" + firstName + lastName);
        StudentMainMenu();
    }

    public void NewPropertyManagers(){
        System.out.println("Please enter your first name" + "\n");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last name" + "\n");
        String lastName = sc.nextLine();
        System.out.println("Please enter your USC ID" + "\n");
        String id = sc.nextLine();
        System.out.println("Please enter your password" + "\n");

        PropertyManagers propertyManagers = PropertyManagers.getPropertyManagers();
        PropertyManagers.addPropertyManagers(newPropertyManagers);
        user = newPropertyManagerst;

        System.out.println("Welcome" + firstName + lastName + "\n");
        PropertyManagersMainMenu();

    }


    public void StudentMainMenu(){
        int command;
        displayMenu(StudentMainMenu);
        command = getCommand(StudentMainMenu.length);

        switch (command){
            case (0):
                FindHouse();
                break;

            case (1):
                SignLease();
                break;

            case (2):
                LeaveReview();
                break;

            case (3):
                StudentUserLogin();
                break;

            default:
                System.out.println("Wrong choice!" + "\n");
                break;
        }
        }




    public void PropertyManagersMainMenu(){
        int command;
        displayMenu(PropertyManagers);
        command = getCommand(PropertyManagers.length);

        switch (command){
            case (0):
                //UploadNewHouse();
                break;
            case (1):
                SignLease();
                break;

            case (2):
                PropertyManagersLogin();
                break;

            default:
                System.out.println("Wrong choice!" + "\n");
                break;
        }
        }

     public void FindHouse(){
        int command;
        displayMenu(FindHouse);
        command = getCommand(FindHouse.length);

        switch (command){
            case (0):
                FindByName();
                break;
            case (1):
                FindByType();
                break;
            case (2):
                FindByAmenities();
                break;

            }
        }

        public void FindByName(){
            System.out.println("Please Enter the Name of the Property" + "\n");
            sc = new Scanner(System.in);
            String propertyName = sc.nextLine();
            System.out.println("\n" +"Searching......" + "\n");
            if (propertyName == null)return;
            HousingListing housingListing = HousingListing.getHousingListing;
            if (housingListing.getListingName(propertyName)){
                System.out.println();
            }else {
                System.out.println("Sorry, We don't have this property in our data base yet" + "\n");
            }

        }

        public void FindByNumsOfBedroomAndBathRoom(){
            System.out.println("Please enter the numbers of Bedroom you want");
            sc = new Scanner(System.in);
            Integer numOfBedroom = sc.nextInt();
            System.out.println("Please enter the numbers of Bedroom you want");
            Integer numOfBathroom = sc.nextInt();
            if (numOfBedroom < 0 || numOfBathroom < 0)return;
            System.out.println("\n" +"Searching......" + "\n");

            if (numOfBathroom && numOfBedroom == ){
                System.out.println();
            }
        }

        public void FindByType(){

        }

        public void FindByAmenities(){
            System.out.println("Please tell us what kind of amenities you would like" + "\n");
            displayMenu(HouseAmenities);


        }

        public void SignLease(){

        }

        public void PrintHousingInformation(){
            System.out.println();
        }








    public static void main(String[] args) {
        HousingUI housingInterface = new HousingUI();
        housingInterface.run();
    }
}
