// Owen Bélanger-Love
#include <stdio.h>
#include <string.h>

int main() {
    // Declare variables
    int count, bid;
    char name[100];

    // Initialise variables
    int topBid = -1;
    char winner[100] = "";

    // Get the amount of people participating in the auction
    scanf("%d", &count);

    // Loop over each person
    for (int i = 0; i < count; i++) {
        
        // Get the person's name and bid
        scanf("%s", name);
        scanf("%d", &bid);

        // Check if the bid is winning
        if (bid > topBid) {

            // Update the winner and highest bid
            strcpy(winner, name);
            topBid = bid;
        }
    }

    // Print the winner
    printf("%s", winner);
}
