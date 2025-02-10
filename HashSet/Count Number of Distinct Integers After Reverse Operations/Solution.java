import java.util.HashSet;
class Solution {
    public int reverse(int number){
        if(number > 0 && number <= 9){
         return number;
        }
        int rev = 0;
        while(number>0){
                int d = number%10;
                 rev = rev*10 + d;
                number = number/10;
        }
        reurn rev;
    }
    public int countDistinctIntegers(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            int ele = nums[i];
            int rele = reverse(nums[i]);
            set.add(ele);
            set.add(rele);
        }
        return set.size();
    }
}