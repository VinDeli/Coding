import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    // Lists to store dogs and monkeys
    private static ArrayList<Dog> dogList = new ArrayList<>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<>();

    public static void main(String[] args) {
        initializeMonkeyList(); // Pre-populate the monkey list
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            displayMenu(); // Show menu options
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    intakeNewDog(scanner); // Process new dog intake
                    break;
                case "2":
                    intakeNewMonkey(scanner); // Process new monkey intake
                    break;
                case "3":
                    reserveAnimal(scanner); // Handle animal reservation
                    break;
                case "4":
                    printAnimals(); // Display list of animals
                    break;
                case "5":
                    exit = true; // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice, please select again.");
            }
        }
        scanner.close();
    }

    public static void displayMenu() {
        // Display available menu options
        System.out.println("\nRescue Animal System Menu");
        System.out.println("1. Intake a new dog");
        System.out.println("2. Intake a new monkey");
        System.out.println("3. Reserve an animal");
        System.out.println("4. Print animals");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void initializeMonkeyList() {
        // Pre-populate monkey list with sample monkeys
        monkeyList.add(new Monkey("George", "Capuchin", "Male", "5", "10kg", "01-01-2023", "Brazil", "In Training", false, "USA", 1.2, 0.5, 0.8));
        monkeyList.add(new Monkey("Lola", "Marmoset", "Female", "3", "7kg", "02-15-2023", "Peru", "Phase II", false, "Canada", 1.0, 0.4, 0.7));
    }

    public static void intakeNewDog(Scanner scanner) {
        // Prompt user for dog details
        System.out.print("Enter dog's name: ");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("This dog is already in our system.");
                return;
            }
        }
        System.out.println("Intake process for new dog initiated.");
        // Additional dog intake logic here
    }

    public static void intakeNewMonkey(Scanner scanner) {
        // Prompt user for monkey details
        System.out.print("Enter monkey's name: ");
        String name = scanner.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("This monkey is already in our system.");
                return;
            }
        }
        
        // Collect additional attributes
        System.out.print("Enter species: ");
        String species = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter age: ");
        String age = scanner.nextLine();
        System.out.print("Enter weight: ");
        String weight = scanner.nextLine();
        System.out.print("Enter acquisition date: ");
        String acquisitionDate = scanner.nextLine();
        System.out.print("Enter acquisition country: ");
        String acquisitionCountry = scanner.nextLine();
        System.out.print("Enter training status: ");
        String trainingStatus = scanner.nextLine();
        System.out.print("Enter reserved status (true/false): ");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Enter in-service country: ");
        String inServiceCountry = scanner.nextLine();
        System.out.print("Enter tail length: ");
        double tailLength = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter height: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter body length: ");
        double bodyLength = Double.parseDouble(scanner.nextLine());

        // Create and add new monkey object
        Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength);
        monkeyList.add(newMonkey);
        System.out.println("New monkey successfully added!");
    }

    public static void reserveAnimal(Scanner scanner) {
        // Placeholder for reserving an animal
        System.out.println("Reserving an animal feature not yet implemented.");
    }

    public static void printAnimals() {
        // Placeholder for displaying animal details
        System.out.println("Displaying list of animals not yet implemented.");
    }
}
