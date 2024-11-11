# Owen Bélanger-Love

# Initialise team Apple's points and team Bananas's points
applePoints = 0
bananaPoints = 0

# Get team Apple's points
# Get input three times, once for each amount of points:
# 3, then 2, then 1, respectivly
for i in range(3):
    # ... * (3-i) calculates the multiplier: first ... * 3
    # then ... * 2, and finally ... * 1
    applePoints += int(input()) * (3-i)

# Get team Banana's points
for i in range(3):
    bananaPoints += int(input()) * (3-i)

# Check if Apples win
if applePoints > bananaPoints:
    # Apples won
    print("A")

# Check if Bananas win
elif applePoints < bananaPoints:
    # Bananas won
    print("B")

# Tie
else:
    # Game is a tie
    print("T")