
# 4Sum


#Problem Statement
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

**Example 1:**

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]


**Example 2:**

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

##Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109


# Time Complexity

Time Complexity:

Sorting takes O(n log n).
The outer loops (i and j) run in O(n^2).
The inner while loop runs in O(n).
Therefore, the overall time complexity is:
𝑂
(
𝑛
log
⁡
𝑛
)
+
𝑂
(
𝑛
2
⋅
𝑛
)
=
𝑂
(
𝑛
3
)
O(nlogn)+O(n 
2
 ⋅n)=O(n 
3
 )
Final time complexity: O(n^3).


# Space Complexity

Space Complexity: O(n^4)
