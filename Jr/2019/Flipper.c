// Owen Bélanger-Love
#include <stdio.h>

int main() {
    // Initialise variables
    char input[1000000];
    int H = 0, V = 0;
    
    // Get input
    scanf("%s", input);

    // Loop over each item in input
    for (int i = 0; i < 1000000; i++) {

        // Horizontal flip
        if (input[i] == 'H') {
            H++;
        }

        // Vertical flip
        else if (input[i] == 'V')
        {
            V++;
        }
        
        // End of input
        else {
            break;
        }
    }

    // Calculate effective flip amount
    H = H % 2;
    V = V % 2;

    // No flip
    if (!H && !V) {
        printf("1 2\n3 4");
    }

    // Vertical flip
    else if (!H && V) {
        printf("2 1\n4 3");
    }

    // Horizontal flip
    else if (H && !V) {
        printf("3 4\n1 2");
    }

    // Horizontal && vertical flip
    else {
        printf("4 3\n2 1");
    }
}