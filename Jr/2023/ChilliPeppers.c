// Owen Bélanger-Love
#include <stdio.h>

int main() {
    // Initialise variables
    int pepperCount;
    char userInput[8];

    int totalSpice = 0;

    // Find amount of peppers
    scanf("%d", &pepperCount);

    // Loop over the peppers
    for (int i = 0; i < pepperCount; i++) {

        // Get user input
        scanf("%s", userInput);

        // Check if the pepper is a poblano
        if (userInput[0] == 'P') {
            totalSpice += 1500;
        }

        // Check if the pepper is a mirasol
        else if (userInput[0] == 'M') {
            totalSpice += 6000;
        }

        // Check if the pepper is a serrano
        else if (userInput[0] == 'S') {
            totalSpice += 15500;
        }

        // Check if the pepper is a cayenne
        else if (userInput[0] == 'C') {
            totalSpice += 40000;
        }

        // Check if the pepper is a thai
        else if (userInput[0] == 'T') {
            totalSpice += 75000;
        }

        // The pepper is a harbenaro
        else {
            totalSpice += 125000;
        }
    }

    // Print total spice
    printf("%d", totalSpice);

    return 0;
}