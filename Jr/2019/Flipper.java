// Owen Bélanger-Love

import java.util.Scanner;

public class Flipper {
    public static void main(String[] args) {

        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Initialise variables
        int H = 0, V = 0;
    
        // Get line
        String line = input.nextLine();
    
        // Loop over each item in line
        for (int i = 0; i < line.length(); i++) {
    
            // Horizontal flip
            if (line.charAt(i) == 'H') {
                H++;
            }
    
            // Vertical flip
            else if (line.charAt(i) == 'V')
            {
                V++;
            }
        }
    
        // Calculate effective flip amount
        H = H % 2;
        V = V % 2;
    
        // No flip
        if (H == 0 && V == 0) {
            System.out.println("1 2\n3 4");
        }
    
        // Vertical flip
        else if (H == 0 && V == 1) {
            System.out.println("2 1\n4 3");
        }
    
        // Horizontal flip
        else if (H == 1 && V == 0) {
            System.out.println("3 4\n1 2");
        }
    
        // Horizontal && vertical flip
        else {
            System.out.println("4 3\n2 1");
        }

        // Close input Scanner
        input.close();
    }
}
