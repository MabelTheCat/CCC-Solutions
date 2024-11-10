// Owen Bélanger-Love
#include <stdio.h>

int main() {
    int regular, small;

    // Get the amount of regular cupcake boxes
    scanf("%d", &regular);
    
    // Get the amount of small cupcake boxes
    scanf("%d", &small);

    // Calculate the total amount of cupcakes
    int total = 8 * regular + 3 * small;
    
    // Calculate the amount of cupcakes left over
    int leftover = total - 28;

    // At least 0 left over
    if (leftover < 0) {
        
        leftover = 0;
    }

    // Print amount left over
    printf("%d", leftover);

    return 0;
}