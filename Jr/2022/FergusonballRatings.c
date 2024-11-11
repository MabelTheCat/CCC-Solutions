// Owen Bélanger-Love
#include <stdio.h>

int main() {
    // Define variables
    int playerCount, goldenCount = 0;
    int plays, fouls;

    // Get player count
    scanf("%d", &playerCount);

    // Loop over each player
    for (int i = 0; i < playerCount; i++) {

        // Get the amount of plays and fouls
        scanf("%d", &plays);
        scanf("%d", &fouls);

        // Check if the player is a golden player
        if (5 * plays - 3 * fouls > 40) {
            // Increase golden player count
            goldenCount ++;
        }
    }

    // Check the team is golden
    if (goldenCount == playerCount) {
        // All players are golden
        printf("%d+", goldenCount);
    }

    // The team is nto golden
    else {
        printf("%d", goldenCount);
    }
}
