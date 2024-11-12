# Owen Bélanger-Love

# Get line count
lineCount = int(input())

# Go over each line
for i in range(lineCount):

    # Get line to process
    line = input()

    # Initialise variables
    count = 1
    index = 0

    # Get first count and do not print a space at the start
    while index+count < len(line) and line[index+count] == line[index]:
        count += 1

    print(f"{count} {line[0]}", end="")
    
    # Update index
    index = count

    # Check if there is anything else to do
    if index < len(line):

        # Finish processing the line
        while True:

            # Find count
            count = 1
            while index+count < len(line) and line[index+count] == line[index]:
                count += 1

            # Print information
            print(f" {count} {line[index]}", end="")

            # Update index
            index += count

            # Check if the code is done
            if index >= len(line):
                break
        
        # Print newline
        print()