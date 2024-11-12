// Owen Bélanger-Love
#include <stdio.h>

int main() {
    // Initialise variables
    int lineCount, number;
    char character, temp;

    // Get the amount of lines
    scanf("%d", &lineCount);

    // Loop over each line
    for (int i = 0; i < lineCount; i++) {

        // Get number
        scanf("%d", &number);
        
        // Get space
        scanf("%c", &temp);

        // Get character
        scanf("%c", &character);

        // Print line
        for (int j = 0; j < number; j++) {
            putchar(character);
        }

        // Print new line
        printf("\n");
    }
}