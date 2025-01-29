
# Rotate Image Problem

**Problem Statement*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.


*Example 1:*


  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
 
    rotate into
 
  [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3],


*Input: matrix =* [[1,2,3],[4,5,6],[7,8,9]]
*Output:* [[7,4,1],[8,5,2],[9,6,3]]

#Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000



## Approach:

- *Transpose the martix*
- *Reverse each row*


## Time Complexity:
- **O(n^2)**


## Space Complexity:
- **O(1)**
