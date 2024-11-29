// Owen Bélanger-Love
#include <stdio.h>
#include <string.h>

int main() {
    // Initialise variables
    int pepperCount;
    char pepper[10];

    // Store the total amoutn of spice
    int totalSpice = 0;

    // Array to store the names of the peppers
    char pepperNames[6][10] = {"Poblano", "Mirasol", "Serrano", "Cayenne", "Thai", "Harbenaro"};

    // Array to store the spice amounts
    int spices[6] = {1500, 6000, 15500, 40000, 75000, 125000};


    // Find amount of peppers
    scanf("%d", &pepperCount);

    // Main loop
    for (int i = 0; i < pepperCount; i++) {

        // Get the pepper used
        scanf(" %s", pepper);

        // Find the index to use
        int index = 0;

        for (index = 0; index < 5; index++) {

            // Check if it is the correct pepper
            if (strcmp(pepper, pepperNames[index]) == 0) {

                // End the loop because we found the index we wanted
                break;
            }
        }

        // Now we know the index of the pepper,
        // so we can get the spice amount
        int spice = spices[index];

        // Increase the total spice amount
        totalSpice += spice;
    }

    // Print total spice
    printf("%d", totalSpice);

    return 0;
}