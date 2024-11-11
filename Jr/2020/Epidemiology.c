// Owen Bélanger-Love
#include <stdio.h>

int main() {
    // Declare variables
    int threshold, infected, spread;
    // Get the infection threshold (amount of people that need to get infected)
    scanf("%d", &threshold);

    // Get amount of people infected on day 0
    scanf("%d", &infected);

    // Get how many people are infected by each infected person
    scanf("%d", &spread);

    // Initialise total amount of people infected
    int infectedTotal = infected;

    // Day counter
    int days = 0;

    // Loop calculations until the threashold of infection is met
    while (threshold >= infectedTotal) {
        
        // Calculate new amount of people infected
        infected *= spread;

        // Update the total amount of people infected
        infectedTotal += infected;

        // New day
        days += 1;
    }

    // Print amount of days required
    printf("%d", days);
}