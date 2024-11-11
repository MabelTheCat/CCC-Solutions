// Owen Bélanger-Love
#include <stdio.h>

int main() {
    // Initialise point scores
    int bananaScore = 0;
    int appleScore = 0;

    // Temporary variable for scanf
    int temp;

    // Get point scores for the apples
    // Get input three times, once for each amount of points:
    // 3, then 2, then 1, respectivly
    for (int i = 0; i < 3; i++) {
        // ... * (3-i) calculates the multiplier: first ... * 3
        // then ... * 2, and finally ... * 1
        // Get value
        scanf("%d", &temp);

        // Update score
        appleScore += (3-i) * temp;
    }

    // Get point scores for the bananas
    for (int i = 0; i < 3; i++) {

        // Get value
        scanf("%d", &temp);

        // Update score
        bananaScore += (3-i) * temp;
    }

    // Check if Apples win
    if (appleScore > bananaScore) {
        // Apples win
        printf("A");
    }

    // Check if Bananas win
    else if (bananaScore > appleScore) {
        // Bananas win
        printf("B");
    }

    // Tie
    else {
        printf("T");
    }
}
