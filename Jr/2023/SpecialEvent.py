# Owen Bélanger-Love

# Get person count
personCount = int(input())

# Initialise array of arrays to store the availabilities on each day
# Format: [
#    day 1 [<data for each person>]
#    day 2 [<data for each person>]
#    day 3 [<data for each person>]
#    day 4 [<data for each person>]
#    day 5 [<data for each person>]
# ]<                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
days = [[""] * personCount for _ in range(5)]


# Get the availibility of each person
for i in range(personCount):
    # Get their availabilty
    availability = input()

    for j in range(5):
        days[j][i] = availability[j]

# Find all the days with the most availability
# Find max availabilty
maxAvailability = 0

for day in days:

    # Find the availability
    count = day.count("Y")

    if count > maxAvailability:
        maxAvailability = count

# Find all days with the max availability
solutions = []

for i, day in enumerate(days):

    # Day has the max availability
    if day.count("Y") == maxAvailability:

        # Add index (+1) to solution
        # +1 is because the indexes start at 0, but days start at 1
        solutions.append(i+1)


# Format solution
solution = str(solutions).strip("[]").replace(" ", "")

# Print solution
print(solution)