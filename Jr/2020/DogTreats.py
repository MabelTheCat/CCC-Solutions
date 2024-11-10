# Owen Bélanger-Love

# Get the amount of small dog treats
small = int(input())

# Get the amount of medium dog treats
medium = int(input())

# Get the amount of large dog treats
large = int(input())

# Calculate happiness
happiness = small + 2 * medium + 3 * large

# Check if happiness score is high enough
if happiness >= 10:
    # Happy enough
    print("happy")

else:
    # Not happy enough
    print("sad")