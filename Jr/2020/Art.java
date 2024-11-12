// Owen Bélanger-Love

import java.util.Scanner;

public class Art {

    /**
     * Function `max`
     * This function takes an array and its size and returns the max value.
     * The largest element of the array must be >= to 0
     * Params
     *      int array[]: the array to process
     *      int size: the size of the array to process
     * Returns:
     *      int: the minimum value int the array
     */
    public static int max(int array[], int size) {

        // Find max value as initial minimum value
        int mx = 0;

        // Loop over each value
        for (int i = 0; i < size; i++) {

            // Check if the current value is smaller that the current smallest value
            if (array[i] > mx) {

                // Update smallest value
                mx = array[i];
            }
        }

        // Return the largest value
        return mx;
    }

    /**
     * Function `min`
     * This function takes an array and its size and returns the smallest value.
     * The smallest element of the array must be <= to 255
     * Params
     *      int array[]: the array to process
     *      int size: the size of the array to process
     * Returns:
     *      int: the minimum value int the array
     */
    public static int min(int array[], int size) {

        // Find max value as initial minimum value
        int mx = 255;

        // Loop over each value
        for (int i = 0; i < size; i++) {

            // Check if the current value is smaller that the current smallest value
            if (array[i] < mx) {

                // Update smallest value
                mx = array[i];
            }
        }

        return mx;
    }

    public static void main(String[] args) {
        
        // Create input Scanner
        Scanner input = new Scanner(System.in);

        // Initialise variables
        int paintDropCount;
        int minX, maxX, minY, maxY;

        // Get amount of paint drops
        paintDropCount = input.nextInt();
        
        // Initialise variables
        int[] paintDropX = new int[paintDropCount];
        int[] paintDropY = new int[paintDropCount];

        // Get paint drop X's and Y's
        for (int i = 0; i < paintDropCount; i++) {
            
            // Get the integers (as string)
            String[] nums = input.next().split(",");
            
            // Get the paint drops
            // Update paint drop values
            paintDropX[i] = Integer.parseInt(nums[0].trim());
            paintDropY[i] = Integer.parseInt(nums[1].trim());
        }

        // Find smallest and largest x values
        minX = min(paintDropX, paintDropCount) - 1;
        maxX = max(paintDropX, paintDropCount) + 1;

        // Find smallest and largest y values
        minY = min(paintDropY, paintDropCount) - 1;
        maxY = max(paintDropY, paintDropCount) + 1;

        System.out.println(minX + "," + minY);
        System.out.println(maxX + "," + maxY);

        // Close input Scanner
        input.close();
    }
}
