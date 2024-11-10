// Owen Bélanger-Love
#include <stdio.h>

int main() {
    int red, green, blue;

    // Get the amount of red sushi plates
    scanf("%d", &red);
    
    // Get the amount of green sushi plates
    scanf("%d", &green);

    // Get the amount of blue sushi plates
    scanf("%d", &blue);

    // Calculate the total cost
    int total = 3 * red + 4 * green + 5 * blue;

    // Print total price
    printf("%d", total);

    return 0;
}