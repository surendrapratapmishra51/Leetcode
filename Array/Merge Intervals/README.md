#Merge Intervals


## Problem Statement
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

**Example 1:**

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].


**Example 2:**

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

# Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104



# Approach

*step 1* Sort the intervals
*step 2* create a List of List for storing the merge Intervals.
*step 3* Iterate loop from 0 to n-1;
*step 4* if list is empty or current start is greater than end of the list, add the intervals in the list.
*step 5* if current start is less than end of the list then update the end of list to the maximum of end of list and current end.
*step 6* oconvert list of list into 2D array.


# Time complexity 
 Loop is run only one pass O(n);
 Sorting take O(nlog n).

**Total Time complexity** = o(n + nlog n). = O(n)


**space Complexity** O(n);
