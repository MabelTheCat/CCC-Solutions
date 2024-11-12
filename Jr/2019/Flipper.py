# Owen Bélanger-Love

# Get input
line = input()

# Find amount of horizontal flips mod 2
H = line.count("H") % 2
V = line.count("V") % 2

# No flip
if not H and not V:
    print("1 2\n3 4")

# Vertical flip
elif not H and V:
    print("2 1\n4 3")

# Horizontal flip
elif H and not V:
    print("3 4\n1 2")

# Horizontal and vertical flip
else:
    print("4 3\n2 1")