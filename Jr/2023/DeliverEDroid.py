# Owen Bélanger-Love

# Get package count
packageCount = int(input())

# Get collision count
collisionCount = int(input())

# Calculate amount of points
points = 50 * packageCount - 10 * collisionCount

# Bonus points for less than 1 collision per package
if packageCount > collisionCount:
    points += 500

# Print the amount of points
print(points)