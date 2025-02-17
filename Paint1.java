    import java.util.Scanner;

    public class Paint1 {
        private static Scanner scnr;

		public static void main(String[] args) {
            scnr = new Scanner(System.in);
            double wallHeight = 0.0;
            double wallWidth = 0.0;
            double wallArea = 0.0;
            double gallonsPaintNeeded = 0.0;
            final double squareFeetPerGallon = 350.0;
            String userChoice;

            do {
                // Validate wall height input using do-while loop
                do {
                    System.out.print("Enter wall height (feet): ");
                    if (scnr.hasNextDouble()) {
                        wallHeight = scnr.nextDouble();
                        scnr.nextLine(); // Consume newline
                        if (wallHeight <= 0) {
                            System.out.println("Error: Height must be a positive number greater than zero.");
                        }
                    } else {
                        System.out.println("Error: Please enter a valid numerical value.");
                        scnr.next(); // Clear invalid input
                        wallHeight = -1; // Force loop continuation
                    }
                } while (wallHeight <= 0);

                // Validate wall width input using do-while loop
                do {
                    System.out.print("Enter wall width (feet): ");
                    if (scnr.hasNextDouble()) {
                        wallWidth = scnr.nextDouble();
                        scnr.nextLine(); // Consume newline
                        if (wallWidth <= 0) {
                            System.out.println("Error: Width must be a positive number greater than zero.");
                        }
                    } else {
                        System.out.println("Error: Please enter a valid numerical value.");
                        scnr.next(); // Clear invalid input
                        wallWidth = -1; // Force loop continuation
                    }
                } while (wallWidth <= 0);

                // Calculate and output wall area
                wallArea = wallHeight * wallWidth;
                System.out.printf("Wall area: %.1f square feet\n", wallArea);

                // Calculate and output the amount of paint needed
                gallonsPaintNeeded = wallArea / squareFeetPerGallon;
                System.out.printf("Paint needed: %.15f gallons\n", gallonsPaintNeeded);

                // Ask user if they want to calculate another wall
                System.out.print("Would you like to enter another wall? (yes/no): ");
                userChoice = scnr.nextLine().trim().toLowerCase();
            } while (userChoice.equals("yes"));
            
            System.out.println("Thank you for using the paint calculator!");
        }
    }
