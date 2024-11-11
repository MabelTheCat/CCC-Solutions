// Owen Bélanger-Love

import java.util.Scanner;

public class FergusonballRatings {
    public static void main(String[] args) {
        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Get the amount of players
        int playerCount = input.nextInt();

        // Initialise variable to store the amount of golden players
        int goldenCount = 0;

        // Loop for each player
        for (int i = 0; i < playerCount; i++) {
            // Get amount of plays
            int plays = input.nextInt();

            // Get number of fouls
            int fouls = input.nextInt();

            // Calculate score
            int score = 5 * plays - 3 * fouls;

            // Chekc if they are a golden player
            if (score > 40) {
                goldenCount += 1;
            }
        }

        // Check if the team is golden
        if (goldenCount == playerCount) {
            System.out.println(goldenCount + "+");
        }

        // Print the non-golden team count
        else {
            System.out.println(goldenCount);
        }

        // Close input Scanner
        input.close();
    }
}
