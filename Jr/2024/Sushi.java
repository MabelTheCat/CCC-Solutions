// Owen Bélanger-Love

import java.util.Scanner;

public class Sushi {
    
    public static void main(String[] args) {
        
        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Get amount of red sushi
        int red = input.nextInt();

        // Get amount of green sushi
        int green = input.nextInt();

        // Get amount of blue sushi
        int blue = input.nextInt();

        // Calculate price
        int price = 3 * red + 4 * green + 5 * blue;

        // Print the total price
        System.out.println(price);

        // Close Scanner
        input.close();
    }
}
