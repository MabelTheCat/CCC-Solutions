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
        int small = input.nextInt();
        

        // Get the amount of medium treats
        int medium = input.nextInt();

        // Get the amount of large treats
        int large = input.nextInt();

        // Check happiness rating
        if (small + 2 * medium + 3 * large >= 10) {

            // There is enough points
            System.out.println("happy");
        }

        else {

            // There is not enough points
            System.out.println("sad");
        }

        // Close input Scanner
        input.close();
    }
}