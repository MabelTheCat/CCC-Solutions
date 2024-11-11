# Owen Bélanger-Love
import re

# Get instructions
instructions = input()

# Loop over each instruction
for instruction in re.findall(r"[A-Z]+[+-]\d+", instructions):
    if "+" in instruction:
        value = instruction[0:instruction.find("+")]

        key = "tighten"
    
    else:
        value = instruction[0:instruction.find("-")]
        key = "loosen"
    
    num = re.search(r"\d+", instruction)

    num = int(num.group())

    print(f"{value} {key} {num}")