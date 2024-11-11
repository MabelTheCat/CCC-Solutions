// Owen Bélanger-Love

import java.util.Scanner;

public class Epidemiology {

    public static void main(String[] args) {
        
        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Get the infection threshold (amount of people that need to get infected)
        int threshold = input.nextInt();

        // Get amount of people infected on day 0
        int infected = input.nextInt();

        // Get how many people are infected by each infected person
        int spread = input.nextInt();

        // Initialise total amount of people infected
        int infectedTotal = infected;

        // Day counter
        int days = 0;

        // Loop calculations until the threashold of infection is met
        while (threshold >= infectedTotal) {
            
            // Calculate new amount of people infected
            infected *= spread;

            // Update the total amount of people infected
            infectedTotal += infected;

            // New day
            days += 1;
        }

        // Print amount of days required
        System.out.println(days);

        // Close input Scanner
        input.close();
    }
}