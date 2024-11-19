// Owen Bélanger-Love

// Import Scanner class
import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {

        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Declare variables
        int t, p;
    
        // Get the boiling temperature of water
        t = input.nextInt();
    
        // Caluclate the pressure
        p = 5 * t - 400;
    
        // Print the pressure
        System.out.println(p);
    
        // Check if the pressure is below sea level
        if (p > 100) {
            System.out.println(-1);
        }
    
        // Check if the pressure is at sea level
        else if (p == 100) {
            System.out.println(0);
        }
    
        // The pressure is above sea level
        else{
            System.out.println(1);
        }

        // Close input Scanner
        input.close();
    }
}
