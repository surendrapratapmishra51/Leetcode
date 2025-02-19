class Solution {
    public int kthMissing(int[] arr, int k) {
        int n = arr.length;
        int missed = 0;
        int lo = 0; 
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            missed = arr[mid] -(mid+1);
            if(missed >= k) hi = mid-1;
            else lo = mid+1;
        }
        return k+lo;
    }
}