# Owen Bélanger-Love

# Amount of regular boxes
regularBoxCount = int(input())

# Amount of small boxes
smallBoxCount = int(input())

# Calculate amount of cupcakes
cupcakeCount = 8 * regularBoxCount + 3 * smallBoxCount

# Amount of remaining cupcakes
# 28 students, each gets 1
leftover = max(cupcakeCount - 28, 0)

# Print amount of remaining cupcakes
print(leftover)