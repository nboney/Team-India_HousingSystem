import java.util.Scanner;

public class HousingUI {
    private static final String  WELCOME_MESSAGE = "Welcome to Team India Housing system";
    private static final String ChoiceByNumber = "Please choose by command number " ;
    private Scanner sc;
    private String[] mainMenuOptions = {"Students", "None Student" ,"Quit"};
    private String[] StudentLoginMenu = {"Sign in" ,"Sign up", "Back"};
    private String[] NoneStudentLoginMenu = {"Sign in" ,"Sign up", "Back"};
    private String[] StudentMainMenu = {"Find a House", "Sign a Lease" ," Leave a Review", "Back to login"};
    private String[] NoneStudentMainMenu = {"Upload a House" , "Sign a Lease"};
    private String [] HouseAmenities = {"Numbers of Bedrooms" , "Numbers of Bathrooms",
            "Allow pets", "Having a pool", "Included Washer and Dyer"};
    private User user;


    HousingUI(){
        sc = new Scanner(System.in);
        User user = new User();
        StudentUser studentUser = new StudentUser();
        HousingListings housingListings = HousingListings.getInstance();
        Reviews reviews = Reviews.getInstance();

    }



    public void run(){
        System.out.println(WELCOME_MESSAGE);
            displayMenu(mainMenuOptions);
            int command = getCommand(mainMenuOptions.length);

            switch (command){
                case (1):
                    StudentUserLogin();
                    break;
                case (2):
                    NoneStudentLogin();
                    break;
                case (3):
                    System.out.println("Bye!");
                default:
                    System.out.println("Wrong choice!");
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
        System.out.println("Please Enter the command number");
        String input = sc.nextLine();
        int command = Integer.parseInt(input) - 1;
        if(command >= 0 && command <= numCommands -1) return command;

        return -1;
    }




    public void StudentUserLogin(){
        int command;
        displayMenu(StudentLoginMenu);
        command = getCommand(StudentLoginMenu.length);

        switch (command){

        }


        }

    public void NoneStudentLogin(){
        int command;
        displayMenu(NoneStudentLoginMenu);
        command = getCommand(NoneStudentLoginMenu.length);

        }

        public void



    public static void main(String[] args) {
        HousingUI housingInterface = new HousingUI();
        housingInterface.run();
    }
}
