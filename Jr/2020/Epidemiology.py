# Owen Bélanger-Love

# Get the infection threshold (amount of people that need to get infected)
threshold = int(input())

# Get amount of people infected on day 0
infected = int(input())

# Get how many people are infected by each infected person
spread = int(input())

# Initialise total amount of people infected
infectedTotal = infected

# Day counter
days = 0

# Loop calculations until the threashold of infection is met
while threshold >= infectedTotal:
    
    # Calculate new amount of people infected
    infected *= spread

    # Update the total amount of people infected
    infectedTotal += infected

    # New day
    days += 1

# Print amount of days required
print(days)