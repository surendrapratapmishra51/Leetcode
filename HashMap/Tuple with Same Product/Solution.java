class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        int totalTuple = 0;

        // store the frequency of same product

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a = 0; a<n; a++){
            for(int b = a+1; b<n; b++){
                int product = nums[a]*nums[b];
                if(!map.containsKey(product)){
                    map.put(product,1);
                }
                else{
                    map.put(product,map.get(product)+1);
                }

            }
        }
            for(int ele :map.keySet()){
                int freq = map.get(ele);
                if(freq > 1){
                    // combination pair
                    int m = freq*(freq-1);
                    m = m/2;
                    totalTuple += (m*8);
                }
            }
            
        return totalTuple;
    }
}