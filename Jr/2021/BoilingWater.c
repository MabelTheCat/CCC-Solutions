// Owen Bélanger-Love
#include <stdio.h>

int main() {
    // Declare variables
    int t, p;

    // Get the boiling temperature of water
    scanf("%d", &t);

    // Caluclate the pressure
    p = 5 * t - 400;

    // Print the pressure
    printf("%d\n", p);

    // Check if the pressure is below sea level
    if (p > 100) {
        printf("%d", -1);
    }

    // Check if the pressure is at sea level
    else if (p == 100) {
        printf("%d", 0);
    }

    // The pressure is above sea level
    else{
        printf("%d", 1);
    }

    return 0;
}