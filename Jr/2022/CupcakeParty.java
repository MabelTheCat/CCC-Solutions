// Owen Bélanger-Love

// Import Scanner class
import java.util.Scanner;

public class CupcakeParty {
    public static void main(String[] args) {
        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Amount of regular boxes
        int regularBoxCount = input.nextInt();

        // Amount of small boxes
        int smallBoxCount = input.nextInt();

        // Calculate amount of cupcakes
        int cupcakeCount = 8 * regularBoxCount + 3 * smallBoxCount;

        // Calculate remaining amount of cupcakes
        int leftover = cupcakeCount - 28;

        // No negative leftovers
        if (leftover < 0) {
            leftover = 0;
        }

        // Print amount of leftover cupcakes
        System.out.println(leftover);

        // Close input Scanner
        input.close();
    }
}
