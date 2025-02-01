

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j = i+1; j<n; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int x = j+1;
                int y = n-1;
                while(x<y){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[x];
                    sum += nums[y];

                    if(sum < target){
                        x++;
                    }
                    else if(sum > target){
                        y--;
                    }
                    else{
                        ArrayList<Integer>temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                         temp.add(nums[x]);
                         temp.add(nums[y]);
                         ans.add(temp);
                         x++;
                         y--;
                         while(x<y && nums[x]== nums[x-1]) x++;
                         while(x<y && nums[y]== nums[y+1]) y--;

                    }
                }
            }
        }
        return ans;
        
    }
}
