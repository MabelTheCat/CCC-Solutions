# Get size of Dusa
size = int(input())

# Get size of first Yogi
val = int(input())

# Loop until there is a yogi that is too large
while size > val:

    # Update size
    size += val

    # Get size of the yogi
    val = int(input())