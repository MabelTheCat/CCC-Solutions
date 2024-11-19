# Owen Bélanger-Love

# Get the temperature
t= int(input())

# Calculate the pressure
p = 5 * t - 400

# Print the temperature
print(p)

# Check if the pressure is below sea level
if p > 100:
    print(-1)

# Check if the pressure is at sea level
elif p == 100:
    print(0)

# The pressure is above sea level
else:
    print(1)