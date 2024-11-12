# Owen Bélanger-Love

# Get amount of lines
lineCount = int(input())

for i in range(lineCount):
    line = input()

    index = line.find(" ")
    symbol = line[index+1]
    number = int(line[0:index])

    print(symbol * number)