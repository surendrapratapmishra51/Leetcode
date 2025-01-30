
# Set Matrix Zeros.


## Problem Statement.
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.


_Example 1:_
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]


_Example_ 
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]



###Constraints:

- m == matrix.length
- n == matrix[0].length
- 1 <= m, n <= 200
- -231 <= matrix[i][j] <= 231 - 1



# Approach


**First Step**

*We create two boolean arrays:*
- row[]: To track which rows should be zeroed.
- col[]: To track which columns should be zeroed.



*First Pass - Identifying Zeroes:*

- We iterate through the matrix.
Whenever we encounter a 0 in the matrix at position (i, j):
Set row[i] to true to indicate that row i needs to be zeroed.
Set col[j] to true to indicate that column j needs to be zeroed.


*Second Pass - Zeroing Rows:*

Using the row[] boolean array, we iterate through each row.
If row[i] is true, set all elements in row i to 0.
Third Pass - Zeroing Columns:

Using the col[] boolean array, we iterate through each column.
If col[j] is true, set all elements in column j to 0.
Key Points:



# Time Complexity:
 The time complexity of this solution is O(m * n) where m is the number of rows and n is the number of columns in the matrix. We make three passes over the matrix.


# Space Complexity:
 The space complexity is O(m + n) due to the extra boolean arrays row[] and col[].
