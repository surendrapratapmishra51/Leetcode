class Solution {
    public boolean isPossible(int n,int arr[],int maxQ){
        int store = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]% maxQ ==0){
                store += arr[i]/maxQ;
            }
            else{
                store += arr[i]/maxQ +1;
            }
        }
        if(store > n)return false;
        return true;
    }
    public int minimizedMaximum(int n, int[] q) {
        int m = q.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<m; i++){
            max = Math.max(max,q[i]);
        }
        int lo = 1;
        int hi = max;
        int maxQ = max;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(isPossible(n,q,mid)==true){
                maxQ = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return maxQ;
    }
}