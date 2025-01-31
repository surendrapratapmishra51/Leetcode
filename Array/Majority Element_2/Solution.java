
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        // find the length of nums array
        int n = nums.length;

        // initialize four variable;
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

       // iterate the loop from 0 to n;
       for(int i = 0; i<n; i++){
        int ele = nums[i];

        if(cnt1 == 0 && ele2 != ele){
            cnt1 = 1;
            ele1 = ele;
        }
        else if(cnt2 == 0 && ele1 != ele){
            cnt2 = 1;
            ele2 = ele;
        }
        else if(ele1 == ele) cnt1++;
        else if(ele2 == ele) cnt2++;
        else{
            cnt1--;
            cnt2--;
        }
       }
       int count = 0;
       int count1 = 0;
       for(int i = 0; i<n; i++){
        if(ele1 == nums[i]){
            count++;
        }
        if(ele2 == nums[i]){
            count1++;
        }
       }
       if(count > n/3) ans.add(ele1);
       if(count1 > n/3) ans.add(ele2);
        return ans;
    }
}
