class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            int count = nums[i];
            for(int j = i+1; j<n; j++){
                if(nums[j-1]<nums[j]){
                    count += nums[j];
                    max = Math.max(max,count);
                }
                else{
                    count = 0;
                    break;
                    
                }
            }
        }
        
            for(int i = 0; i<n; i++){
                max = Math.max(max,nums[i]);
            }
        return max;
    }
}