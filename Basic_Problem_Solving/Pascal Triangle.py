# Python program for Pascal’s Triangle Using Dynamic 
# Programming in O(n^2) time and O(n^2) extra space 

def printPascal(n):
    
    # An auxiliary array to store 
    # generated pascal triangle values
    mat = []

    # Iterate through every line and 
    # print integer(s) in it
    for row in range(n):
      
        # Every line has number of integers 
        # equal to line number
        arr = []
        for i in range(row + 1):
          
            # First and last values in every row are 1
            if row == i or i == 0:
                arr.append(1)
              
            # Other values are sum of values just 
            # above and left of above
            else:
                arr.append(mat[row - 1][i - 1] + mat[row - 1][i])
        mat.append(arr)
    return mat

n = 5
mat = printPascal(n)
for i in range(len(mat)):
    for j in range(len(mat[i])):
        print(mat[i][j], end=" ")
    print()