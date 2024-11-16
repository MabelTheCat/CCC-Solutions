// Owen Bélanger-Love
#include <stdio.h>
#include <string.h>

int main() {
    // Initialise variables
    int lineCount, count, index, len;

    char line[81];

    // Get line count
    scanf("%d", &lineCount);

    // Go over each line
    for (int i = 0; i < lineCount; i++) {

        // Get line to process
        scanf("%s", line);

        // Get length of line
        len = strlen(line);

        // Initialise variables
        count = 1;
        index = 0;

        // Get first count and do not print a space at the start
        while (index+count < len && line[index+count] == line[index]) {
            count ++;
        }

        // Print the first character
        printf("%d %c", count, line[0]);
        
        // Update index
        index = count;

        // Check if there is anything else to do
        if (index < len) {

            // Finish processing the line
            while (1) {

                // Find count
                count = 1;
                while (index+count < len && line[index+count] == line[index]) {
                    count ++;
                }

                // Print information
                printf(" %d %c", count, line[index]);

                // Update index
                index += count;

                // Check if the code is done
                if (index >= len) {
                    break;
                }
            }
            
            // Print newline
            printf("\n");
        }
    }
}
