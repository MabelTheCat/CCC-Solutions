// Owen Bélanger-Love

import java.util.Scanner;

public class DeliverEDroid {
    public static void main(String[] args) {
        
        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Find the amount of packages
        int packages = input.nextInt();

        // Find the amount of collisions
        int collisions = input.nextInt();

        int points = packages * 50 - collisions * 10;

        if (packages > collisions) {
            points += 500;
        }

        // Print result
        System.out.println(points);

        // Close input Scanner
        input.close();
    }
}
