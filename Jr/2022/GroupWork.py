# Owen Bélanger-Love
import re

# Find count of same-group restrictions
sameGroupCount = int(input())

# Find list of restrictions
# Data format is [
#   [<names>],
#   [<next group's names>],
#   ...
# ]
# Regex is to match 1 or more uppercase letters
sameGroupRestrictions = [re.findall(r"[A-Z]+", input()) for _ in range(sameGroupCount)]


# Find count of different-group restrictions
differentGroupCount = int(input())

# Find list of restrictions
# Data format is [
#   [<names>],
#   [<next group's names>],
#   ...
# ]
# Regex is to match 1 or more uppercase letters
differentGroupRestrictions = [re.findall(r"[A-Z]+", input()) for _ in range(differentGroupCount)]

# Get amount of groups
groupCount = int(input())

# Initalise violations
violations = 0

# Get group names
# Format is [[group 1], [group 2], ...]
# Where each group is a collection of strings
groups = [re.findall(r"[A-Z]+", input()) for _ in range(groupCount)]

# Loop over each different group restriction
for i, sameGroupRestriction in enumerate(sameGroupRestrictions):
    # Loop over each group
    for group in groups:
        if sameGroupRestriction[0] in group and sameGroupRestriction[1] in group:
            break
    
    else:
        violations += 1

# Loop over each different group restriction
for i, differentGroupRestriction in enumerate(differentGroupRestrictions):

    # Loop over each group
    for group in groups:
        if differentGroupRestriction[0] in group and differentGroupRestriction[1] in group:
            break
    
    else:
        violations += 1

print(violations)