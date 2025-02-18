package UpperBound;


class Solution {
    int upperBound(int[] arr, int target) {
       int n = arr.length;
       int ub = n;
       int lo = 0; int hi = n-1;
       while(lo<=hi){
           int mid = lo +(hi-lo)/2;
           if(arr[mid] > target){
               ub = mid;
          hi = mid-1;
           }
           else{
           lo = mid+1;
           
       }
       }
       return ub;
    }
}
