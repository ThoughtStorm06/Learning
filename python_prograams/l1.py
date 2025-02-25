l = [
    [3, 4, 1, 6],
    [1, 2, 4, 8],
    [5, 9, 7, 5]
]

for i in range(0, 3):  # Loop through pivot rows
    # Normalize the pivot row
    pivot = l[i][i]
    for j in range(0, 4):
        l[i][j] = l[i][j] / pivot
    
    # Eliminate the other rows
    for j in range(0, 3):
        if j != i:  # Skip the pivot row
            factor = l[j][i]
            for k in range(0, 4):
                l[j][k] = l[j][k] - factor * l[i][k]
    
    # Print the matrix state after processing the current pivot row
    print(f"After processing row {i + 1}:")
    for row in l:
        print(row)
    print()

# Extract solutions
solutions = [row[-1] for row in l]

print("Solutions:")
print(f"x = {solutions[0]}, y = {solutions[1]}, z = {solutions[2]}")