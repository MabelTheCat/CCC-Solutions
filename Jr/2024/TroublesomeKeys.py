keys = input()
results = input()

silly = ""
sillyRes = ""
quiet = ""


def findSillyKey(input: str, results: str) -> tuple[str, str]:
    i = 0
    while keys[i] == results[i]:
        i += 1
    
    return (keys[i], results[i])



# No quiet key
if len(keys) == len(results):
    # Find first index of different characters
    silly = findSillyKey(keys, results)

    print(f"{silly[0]} {silly[1]}")
    print("-")

else:
    shift = 0

    for i in range(len(keys)):
        if i >= len(results):
            break
        
        # Difference found
        if keys[i] != results[i+shift]:

            # Find where difference ends
            while i + shift - 1 < len(results) and results[i] != keys[i+shift]:
                shift += 1
            
            # Check if it is the silly key
            if keys[i] * shift == results[i:i+shift]:

                # Silly key
                silly = keys[i]
                sillyRes = results[i]
            
            # Quiet key
            else:
                quiet = keys[i]

                # Get the results without the quiet key
                modifiedResults = results

                for j, k in enumerate(keys):
                    if k == quiet:
                        modifiedResults = modifiedResults[0:j] + quiet + modifiedResults[j:]

                # Find silly key
                silly, sillyRes = findSillyKey(keys, modifiedResults)[0], findSillyKey(keys, modifiedResults)[1]
                break
    
    # Keys found
    print(f"{silly} {sillyRes}")
    print(f"{quiet}")