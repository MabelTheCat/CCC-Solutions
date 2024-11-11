# Owen Bélanger-Love

# Get the amount of players
playerCount = int(input())

# Initialise variable to store the amount of golden players
goldenCount = 0

# Loop for each player
for i in range(playerCount):
    # Get amount of plays
    plays = int(input())

    # Get number of fouls
    fouls = int(input())

    # Calculate score
    score = 5 * plays - 3 * fouls

    # Chekc if they are a golden player
    if score > 40:
        goldenCount += 1

# Check if the team is golden
if goldenCount == playerCount:
    print(f"{goldenCount}+")

# Print the non-golden team count
else:
    print(f"{goldenCount}")