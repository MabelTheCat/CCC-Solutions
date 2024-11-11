# Owen Bélanger-Love

# Get string of text
text = input()

# Get string to check the cyclic shifts of
string = input()

# Loop over each cyclic shift
for i in range(len(string)):

    # Calculate cyclic shift and Check if the shift is in the text
    if string[i:] + string[0:i] in text:
        print("yes")
        break

# Loop did not break, so none of the shifts are in the text
else:
    print("no")