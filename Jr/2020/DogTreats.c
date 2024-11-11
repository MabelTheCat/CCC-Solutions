// Owen Bélanger-Love
#include <stdio.h>

int main() {

    // Declare variables
    int small, medium, large;

    // Get the amount of small treats
    scanf("%d", &small);

    // Get the amount of medium treats
    scanf("%d", &medium);

    // Get the amount of large treats
    scanf("%d", &large);

    // Calculate happiness
    int happiness = small + 2 * medium + 3 * large;

    // Check of Bailey is happy enough
    if (happiness >= 10) {

        // Bailey is happy
        printf("happy");
    }

    // Bailey is sad
    else {
        printf("sad");
    }
}