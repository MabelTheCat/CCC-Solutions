# Owen Bélanger-Love
import re

# Get amount of paint drops
paintDropCount = int(input())

# Get the paint drops
paintDrops = [[int(val) for val in re.findall(r"\d+", input())] for _ in range(paintDropCount)]

# Get paint drop X's and Y's
paintDropX = []
paintDropY = []

for drop in paintDrops:
    paintDropX.append(drop[0])
    paintDropY.append(drop[1])

# Find smallest and largest x values
minX, maxX = min(paintDropX) - 1, max(paintDropX) + 1

# Find smallest and largest y values
minY, maxY = min(paintDropY) - 1, max(paintDropY) + 1

print(f"{minX},{minY}")
print(f"{maxX},{maxY}")