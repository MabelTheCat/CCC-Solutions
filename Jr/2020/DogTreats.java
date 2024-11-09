/**
 * Owen Bélanger-Love
 * 23 sept 2024
 */


// Import Scanner class
import java.util.Scanner;

public class DogTreats {
    public static void main(String[] args) {

        // Create input scanner
        Scanner input = new Scanner(System.in);
        
        // Get the amount of small treats
        // Ask for the user to enter the amount of small treats
        System.out.print("Enter the amount of small treats: ");
        
        // Get and save user response
        int small = input.nextInt();
        
        // Loop over, repeatedly trying to get a valid input
        while (0 <= small && small <= 10) {
            
            // State the entry requirements
            System.out.println("The number entered nust be between 0 and 10.");

            // Ask for the user to enter the amount of small treats
            System.out.print("Enter the amount of small treats: ");

            // Get and save user response
            small = input.nextInt();
        }

        // Get the amount of medium treats
        System.out.print("Enter the amount of medium treats: ");
        int medium = input.nextInt();

        while (0 <= medium && medium <= 10) {
            System.out.println("The number entered nust be between 0 and 10.");
            System.out.print("Enter the amount of medium treats: ");
            medium = input.nextInt();
        }

        // Get the amount of large treats
        System.out.print("Enter the amount of large treats: ");
        int large = input.nextInt();

        while (0 <= large && large <= 10) {
            System.out.println("The number entered nust be between 0 and 10.");
            System.out.print("Enter the amount of large treats: ");
            large = input.nextInt();
        }

        // Check happiness rating
        if (small + 2 * medium + 3 * large >= 10) {

            // There is enough points
            System.out.println("Doggy is Happy!");
        }

        else {

            // There is not enough points
            System.out.println("Doggy is Sad!");
        }

        // Close input Scanner
        input.close();
    }
}