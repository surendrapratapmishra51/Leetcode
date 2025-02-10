# 2442. Count Number of Distinct Integers After Reverse Operations

## problem Statement
You are given an array nums consisting of positive integers.

You have to take each integer in the array, reverse its digits, and add it to the end of the array. You should apply this operation to the original integers in nums.

Return the number of distinct integers in the final array.

 

**Example 1:**

Input: nums = [1,13,10,12,31]
Output: 6
Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).

**Example 2:**

Input: nums = [2,2,2]
Output: 1
Explanation: After including the reverse of each number, the resulting array is [2,2,2,2,2,2].
The number of distinct integers in this array is 1 (The number 2).
 

# Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 106

# Approach
*step1* Create a HashSet,
*step2* Iterate each element of nums array using loop. and reverse the each element of array.
*step3* Add each element of nums array and its reverse in HashSet.
*step4* know return size of hashSet.

# time complexity 

Loop runs from 0 to nums.length -1,So it take O(n).
Reverse function runs to the number of digit in the element O(d)(d is number of digit in the element).

O(n) + O(d) = O(n);

# Space time complexity

reverse function use conatant space O(1).
HashSet store all the distinct element So, in worse case it take n*2, means O(2n);

O(1)+O(2n) = O(n).