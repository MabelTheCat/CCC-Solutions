/**
 * Owen Bélanger-Love
 * https://cemc.uwaterloo.ca/sites/default/files/documents/2019/2019CCCJrProblemSet.html
 * Problem 1
 */

// Import Scanner class
import java.util.Scanner;


public class WinningScore {
    public static void main(String[] args) {

        // Create input scanner
        Scanner input = new Scanner(System.in);

        // Initialise point scores
        int bananaScore = 0;
        int appleScore = 0;

        // Get point scores for the apples
        // Get input three times, once for each amount of points:
        // 3, then 2, then 1, respectivly
        for (int i = 0; i < 3; i++) {
            // ... * (3-i) calculates the multiplier: first ... * 3
            // then ... * 2, and finally ... * 1

            appleScore += (3-i) * input.nextInt();
        }
        
        // Get point scores for the bananas
        for (int i = 0; i < 3; i++) {
            bananaScore += (3-i) * input.nextInt();
        }

        // Check if Apples win
        if (appleScore > bananaScore) {
            // Apples win
            System.out.println("A");
        }

        // Check if Bananas win
        else if (bananaScore > appleScore) {
            // Bananas win
            System.out.println("B");
        }

        // Tie
        else {
            System.out.println("T");
        }

        // Close Scanner
        input.close();
    }
}
