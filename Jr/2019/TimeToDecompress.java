// Owen Bélanger-Love

import java.util.Scanner;

public class TimeToDecompress {
    public static void main(String[] args) {

        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Get the amount of lines
        int lineCount = input.nextInt();

        // Empty line
        input.nextLine();

        // Loop over each line
        for (int i = 0; i < lineCount; i++) {

            // Get line
            String line = input.nextLine();
            
            // Get number
            int number = Integer.parseInt(line.substring(0, line.length()-2));

            // Get character
            char character = line.charAt(line.length()-1);

            // Print line
            for (int j = 0; j < number; j++) {
                System.out.print(character);
            }

            // End line
            System.out.println();
        }

        // Close input Scanner
        input.close();
    }
}