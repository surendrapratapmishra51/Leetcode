class Solution {
    int[] printKClosest(int[] arr, int n, int k, int x) {
         int ans[]= new int[k];
         int z = 0;
       if(x > arr[n-1]){
           for(int i = n-1; i>=n-k; i--){
               ans[z++] = arr[i];
           }
           return ans;
       }
       int lo = 0;
        int hi = n-1;
        int lb = n;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid]>= x){
                lb = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
       
        int j;
        if(arr[lb]==x){
            j = lb+1;
        }
        else{
            j = lb;
        }
        
       int i = lb-1;
       while(k>0&& i>=0 && j<n){
           int di = Math.abs(x-arr[i]);
            int dj = Math.abs(x-arr[j]);
            if(di>=dj){
                ans[z++] = arr[j];
                j++;
            }
            else{
                ans[z++] = arr[i];
                i--;
            }
            k--;
           
       }
       while(k>0 && i>=0){
            ans[z++] = arr[i];
            i--;
            k--;
       }
        while(k>0 && j<n){
            ans[z++] = arr[j];
            j++;
            k--;
       }
       return ans;
    }
}