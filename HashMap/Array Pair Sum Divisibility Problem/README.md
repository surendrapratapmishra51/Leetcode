# GFG

## Array Pair Sum Divisibility Problem


### Problem Statement
Difficulty: MediumAccuracy: 27.85%Submissions: 131K+Points: 4
Given an array of integers nums and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.

**Examples:**

Input: arr[] = [9, 5, 7, 3], k = 6
Output: true
Explanation: {(9, 3), (5, 7)} is a possible solution. 9 + 3 = 12 is divisible by 6 and 7 + 5 = 12 is also divisible by 6.

**Examples:**
Input: arr[] = [4, 4, 4], k = 4
Output: false
Explanation: You can make 1 pair at max, leaving a single element unpaired.

**Examples:**
Input: arr[] = [4, 4], k = 4
Output: true
Explanation: Here only {(4,4)} is possible whose sum 4 + 4 = 8 is divisible by 4.

# Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <= 105
1 <= k <= 105