// Owen Bélanger-Love

// Import Scanner class
import java.util.Scanner;

public class SilentAuction {
    public static void main(String[] args) {
        
        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Initialise variables
        int topBid = -1;
        String winner = "";

        // Get the amount of people participating in the auction
        int count = input.nextInt();

        // Loop over each person
        for (int i = 0; i < count; i++) {
            
            // Clear the newline
            input.nextLine();

            // Get the person's name and bid
            String name = input.nextLine();
            int bid = input.nextInt();

            // Check if the bid is winning
            if (bid > topBid) {

                // Update the winner and highest bid
                winner = name;
                topBid = bid;
            }
        }

        // Print the winner
        System.out.println(winner);

        // Close input Scanner
        input.close();
    }
}
