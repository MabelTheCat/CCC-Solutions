// Owen Bélanger-Love
#include <stdio.h>

int main() {
    // Initialise variables
    int packages, collisions, points;

    // Get the amount of packages
    scanf("%d", &packages);

    // Get the amount of collisisons
    scanf("%d", &collisions);

    points = packages * 50 - collisions * 10;

    if (packages > collisions) {
        points += 500;
    }
    
    printf("%d",points);
}