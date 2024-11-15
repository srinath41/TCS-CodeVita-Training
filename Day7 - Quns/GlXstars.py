patterns = {
    'A': [[".", "*", "."], ["*", "*", "*"], ["*", ".", "*"]],
    'E': [["*", "*", "*"], ["*", "*", "*"], ["*", "*", "*"]],
    'I': [["*", "*", "*"], [".", "*", "."], ["*", "*", "*"]],
    'O': [["*", "*", "*"], ["*", ".", "*"], ["*", "*", "*"]],
    'U': [["*", ".", "*"], ["*", ".", "*"], ["*", "*", "*"]],
}

N = 18
matrix = [
    ["*", ".", "*", "#", "*", "*", "*", "#", "*", "*", "*", "#", "*", "*", "*", ".", "*", "."],
    ["*", ".", "*", "#", "*", ".", "*", "#", ".", "*", ".", "#", "*", "*", "*", "*", "*", "*"],
    ["*", "*", "*", "#", "*", "*", "*", "#", "*", "*", "*", "#", "*", "*", "*", "*", ".", "*"]
]

result = []
i = 0

while i < N:
    if matrix[0][i] == '#':
        result.append('#')
        i += 1
        continue

    if i + 2 < N:
        block = [
            [matrix[0][i], matrix[0][i+1], matrix[0][i+2]],
            [matrix[1][i], matrix[1][i+1], matrix[1][i+2]],
            [matrix[2][i], matrix[2][i+1], matrix[2][i+2]]
        ]
        
        star = None
        for vowel, pattern in patterns.items():
            if block == pattern:
                star = vowel
                break
        
        if star:
            result.append(star)
            i += 3
        else:
            i += 1
    else:
        break

output = ''.join(result).strip('#')
print(output)











# def identify_star_pattern(block):
#     patterns = {
#         'A': [[".", "*", "."], ["*", "*", "*"], ["*", ".", "*"]],
#         'E': [["*", "*", "*"], ["*", "*", "*"], ["*", "*", "*"]],
#         'I': [["*", "*", "*"], [".", "*", "."], ["*", "*", "*"]],
#         'O': [["*", "*", "*"], ["*", ".", "*"], ["*", "*", "*"]],
#         'U': [["*", ".", "*"], ["*", ".", "*"], ["*", "*", "*"]],
#     }
#     for vowel, pattern in patterns.items():
#         if block == pattern:
#             return vowel
#     return None

# def find_galaxy_and_stars(matrix, N):
#     result = []
#     i = 0
    
#     while i < N:
#         if matrix[0][i] == '#':
#             result.append('#')
#             i += 1
#             continue

#         if i + 2 < N:
#             block = [
#                 [matrix[0][i], matrix[0][i+1], matrix[0][i+2]],
#                 [matrix[1][i], matrix[1][i+1], matrix[1][i+2]],
#                 [matrix[2][i], matrix[2][i+1], matrix[2][i+2]]
#             ]
#             star = identify_star_pattern(block)
#             if star:
#                 result.append(star)
#                 i += 3
#             else:
#                 i += 1
#         else:
#             break

#     return ''.join(result).strip('#')
# N = 18
# matrix = [
#     ["*", ".", "*", "#", "*", "*", "*", "#", "*", "*", "*", "#", "*", "*", "*", ".", "*", "."],
#     ["*", ".", "*", "#", "*", ".", "*", "#", ".", "*", ".", "#", "*", "*", "*", "*", "*", "*"],
#     ["*", "*", "*", "#", "*", "*", "*", "#", "*", "*", "*", "#", "*", "*", "*", "*", ".", "*"]
# ]

# output = find_galaxy_and_stars(matrix, N)
# print(output)
