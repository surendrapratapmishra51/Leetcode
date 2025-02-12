class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i<n; i++){
           int ele = arr[i];
           map.put(ele,map.getOrDefault(ele,0)+1);
       }
       HashSet<Integer> set = new HashSet<>();
       for(int ele:map.values()){
           set.add(ele);
       }
       if(map.size()==set.size())return true;
       return false;
    }
}
        
