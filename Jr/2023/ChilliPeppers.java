// Owen Bélanger-Love

import java.util.Scanner;

public class ChilliPeppers {
    public static void main(String[] args) {

        // Array to store the names of the peppers
        String [] pepperNames = {"Poblano", "Mirasol", "Serrano", "Cayenne", "Thai", "Harbenaro"};

        // Array to store the spice amounts
        int [] spices = {1500, 6000, 15500, 40000, 75000, 125000};

        // Initialise the total amount of spice
        int totalSpice = 0;

        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Get the amount of peppers
        int pepperCount = input.nextInt();

        // Clear newline
        input.nextLine();

        // Main loop
        for (int i = 0; i < pepperCount; i++) {

            // Get the pepper used
            String pepper = input.nextLine();

            // Find the index to use
            int index = 0;

            for (index = 0; index < 5; index++) {

                // Check if it is the correct pepper
                if (pepperNames[index].equals(pepper)) {

                    // End the loop because we found the index we wanted
                    break;
                }
            }

            // Now we know the index of the pepper,
            // so we can get the spice amount
            int spice = spices[index];

            // Increase the total spice amount
            totalSpice += spice;
        }
    
        // Print total spice
        System.out.println(totalSpice);

        // Close input Scanner
        input.close();
    }
}
