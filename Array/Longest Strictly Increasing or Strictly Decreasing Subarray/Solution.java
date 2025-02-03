

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
         int n = nums.length;
         int ans = 0;
         int inSub = 1;
         int decSub = 1;
         int count = 1;
         for(int i = 0; i<n-1; i++){
            if(nums[i] < nums[i+1]){
                count++;
                inSub = Math.max(inSub,count);
            }
            else{
                count = 1;
            }
         }
         int cnt = 1;
          for(int j = 0; j<n-1; j++){
            if(nums[j] > nums[j+1]){
                cnt++;
                decSub = Math.max(decSub,cnt);
            }
            else{
                cnt = 1;
            }
         }
         return Math.max(inSub,decSub);
    }
}
