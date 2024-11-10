# Owen Bélanger-Love

# Dictionary of chilli pepper names and spice levels 
# Measured in SHU (scoville heat units)
spiceChart = {
    "Poblano": 1500,
    "Mirasol": 6000,
    "Serrano": 15500,
    "Cayenne": 40000,
    "Thai": 75000,
    "Habanero": 125000
}

# Total spice
totalSpice = 0

# Get chilli pepper count
chilliCount = int(input())

# Get the peppers and add spice amounts
for i in range(chilliCount):

    # Get the pepper's name
    pepperName = input()

    # Get and update the total spice amount
    totalSpice += spiceChart[pepperName]

# Print total amount of spice
print(totalSpice)