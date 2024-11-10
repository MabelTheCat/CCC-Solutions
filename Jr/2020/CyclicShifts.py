# Owen Bélanger-Love

# Get string of text
text = input()

# Get string to check the cyclic shifts of
string = input()

# Find all cyclic shifts
shifts = [string[i:] + string[0:i] for i in range(len(string))]

# Loop over each cyclic shift
for shift in shifts:

    # Check if the shift is in the text
    if shift in text:
        print("yes")
        break

# Loop did not break, so none of the shifts are in the text
else:
    print("no")