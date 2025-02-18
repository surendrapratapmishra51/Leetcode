class Solution {
    int smallestDivisor(int[] arr, int k) {
       int n = arr.length;
       Arrays.sort(arr);
       int lo = 1;
       int hi = arr[n-1];
       int ans =1;
       while(lo<=hi){
           int mid = lo+(hi-lo)/2;
           int sum = 0;
           for(int i = 0; i<n; i++){
               if(arr[i]%mid == 0){
                   sum += arr[i]/mid;
               }
               else{
                    sum += arr[i]/mid +1;
               }
           }
           if(sum <= k){
              ans = mid;
              hi = mid-1;
           }
           else{
              lo = mid+1;
           }
       }
       return ans;
    }
}
