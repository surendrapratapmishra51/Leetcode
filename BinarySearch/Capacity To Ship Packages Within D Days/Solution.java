class Solution {
    public static boolean isPossible(int cap,int arr[],int d){
        int day = 1;
        int load = 0;
        for(int i = 0; i<arr.length; i++){
            if(load + arr[i]<= cap){
                load += arr[i];
            }
            else{
                load = arr[i];
                day++;
            }
        }
        if(day <= d) return true;
        return false;
    }
    static int leastWeightCapacity(int[] arr, int n, int d) {
       int max = Integer.MIN_VALUE;
       int sum = 0;
       for(int i = 0; i<n; i++){
           sum += arr[i];
           max = Math.max(max,arr[i]);
       }
      int lo = max;
      int hi = sum;
      int maxC = sum;
      while(lo<=hi){
          int mid = lo+(hi-lo)/2;
          if(isPossible(mid,arr,d)){
              maxC = mid;
              hi = mid-1;
          }
          else{
              lo = mid+1;
          }
      }
      return maxC;
      
    }
};