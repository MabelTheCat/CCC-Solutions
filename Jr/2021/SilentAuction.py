# Owen Bélanger-Love

# Get the amount of people participating in the auction
count = int(input())

# Initalise variables
topBid = -1
winner = ""

# Loop over each person
for i in range(count):
    
    # Get the name
    name = input()

    # Get the bid
    bid = int(input())

    # Check if the bid is winning
    if bid > topBid:

        # Update the winner and highest bid
        winner = name
        topBid = bid

# Print the winner
print(winner)