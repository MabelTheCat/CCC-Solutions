// Owen Bélanger-Love

import java.util.Scanner;

public class ChilliPeppers {
    public static void main(String[] args) {

        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Initialise pepepr spice
        int totalSpice = 0;
    
        // Find amount of peppers
        int pepperCount = input.nextInt();
        
        // Clear input
        input.nextLine();
        
        // Loop over the peppers
        for (int i = 0; i < pepperCount; i++) {
    
            // Get user input
            String pepper = input.nextLine();
    
            // Check if the pepper is a poblano
            if (pepper.charAt(0) == 'P') {
                totalSpice += 1500;
            }
    
            // Check if the pepper is a mirasol
            else if (pepper.charAt(0) == 'M') {
                totalSpice += 6000;
            }
    
            // Check if the pepper is a serrano
            else if (pepper.charAt(0) == 'S') {
                totalSpice += 15500;
            }
    
            // Check if the pepper is a cayenne
            else if (pepper.charAt(0) == 'C') {
                totalSpice += 40000;
            }
    
            // Check if the pepper is a thai
            else if (pepper.charAt(0) == 'T') {
                totalSpice += 75000;
            }
    
            // The pepper is a harbenaro
            else {
                totalSpice += 125000;
            }
        }
    
        // Print total spice
        System.out.println(totalSpice);

        // Close input Scanner
        input.close();
    }
}
