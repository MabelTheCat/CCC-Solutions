# Get the amount of participants
count = int(input())

# Get the scores
values: list[int] = []
for i in range(count):
    v = int(input())
    values.append(v)

# Sort the scores and revers (largest to smallest)
values.sort()
values.reverse()

# Remove all first place wins and second places wins
for i in range(2):
    values = values[values.count(values[0]):]

# Get third place value
v = values[0]

# Get and print results
print(f"{v} {values.count(v)}")