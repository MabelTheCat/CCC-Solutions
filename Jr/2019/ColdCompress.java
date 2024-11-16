// Owen Bélanger-Love
// Import Scanner class
import java.util.Scanner;

public class ColdCompress {
    public static void main(String[] args) {
        
        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Get line count
        int lineCount = input.nextInt();

        // Clear input's \n
        input.nextLine();
    
        // Go over each line
        for (int i = 0; i < lineCount; i++) {
    
            // Get line to process
            String line = input.nextLine();
            
            // Get length of line
            int len = line.length();
    
            // Initialise variables
            int count = 1;
            int index = 0;
    
            // Get first count and do not print a space at the start
            while (index+count < len && line.charAt(index+count) == line.charAt(index)) {
                count ++;
            }
    
            // Print the first character
            System.out.print(count + " " + line.charAt(0));
            
            // Update index
            index = count;
    
            // Check if there is anything else to do
            if (index < len) {
    
                // Finish processing the line
                while (true) {
    
                    // Find count
                    count = 1;
                    while (index+count < len && line.charAt(index+count) == line.charAt(index)) {
                        count ++;
                    }
    
                    // Print information
                    System.out.print(" " + count + " " + line.charAt(index));
    
                    // Update index
                    index += count;
    
                    // Check if the code is done
                    if (index >= len) {
                        break;
                    }
                }
                
                // Print newline
                System.out.println();
            }
        }

        // Close input Scanner
        input.close();
    }
}
