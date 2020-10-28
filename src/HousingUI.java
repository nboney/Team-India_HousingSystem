import java.util.Scanner;

public class HousingUI {
    private static final String  WELCOME_MESSAGE = "Welcome to Team India Housing system";
    private String[] mainMenuOptions = {"Find Porty Name","Exit"};
    private Scanner sc;
    private HousingListings housingListing;

    HousingUI(){
        sc = new Scanner(System.in);
        housingListing = new HousingListings();
    }

    public void run(){
        System.out.println(WELCOME_MESSAGE);

        while (true){
            displayMainMenu();

            int command = getCommand(mainMenuOptions.length);

            if (command == -1){
                System.out.println("Not valid command");
                continue;
            }

            if(command == mainMenuOptions.length -1)
                break;
            switch (command){
                case (0):
                    searchByName();
                    break;
            }
        }
        System.out.println("Good bye");
    }

    public void displayMainMenu(){
        System.out.println("---------*Main Menu*---------");
        for (int i = 0; i < mainMenuOptions.length; i++){
            System.out.println((i+1) + "" + mainMenuOptions[i]);
            System.out.println("");
        }

    }

    public int getCommand(int numCommand){
        System.out.println("What you want search for today?");
        String input = sc.nextLine();
        int command =  Integer.parseInt(input) -1;
        if (command >= 0 && command <= numCommand){
            return command;
        }else {
            return -1;
        }

    }

    private String getHousingList(){
        System.out.println("Enter Porty Name : ");
        while (true){
            String portyName = sc.nextLine().trim().toLowerCase();

            if (!portyName.contentEquals("")){
                return portyName;
            }

            System.out.println("There are no such porty inout database");
            System.out.println("Would you like to search another porty");
            System.out.println("Please enter (Y) to search another porty or (n) to return to the main menu" );
            String command = sc.nextLine().trim().toLowerCase();
            if (command == "n"){
                return null;
            }
        }
    }


    public void searchByName(){
        System.out.println("---------*Searching the House*---------");
        String housingName = getHousingList();
        if(housingName == null){
            return;
        }
        

    }

    public static void main(String[] args) {
        HousingUI housingInterface = new HousingUI();
        housingInterface.run();
    }
}
