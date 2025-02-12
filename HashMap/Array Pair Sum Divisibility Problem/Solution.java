import java.util.*;
class Solution {
    public boolean canPair(List<Integer> arr, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int n = arr.size();
       for(int i = 0; i<n; i++){
           int ele = arr.get(i);
           ele %= k;
           if(!map.containsKey(ele)){
               map.put(ele,1);
           }
           else{
               map.put(ele,map.get(ele)+1);
           }
           
       }
       if(map.containsKey(0)){
           if(map.get(0)%2 != 0) return false;
           map.remove(0);
       }
       for(int ele :map.keySet()){
           int rem = k-ele;
           if(!map.containsKey(rem))return false;
           int eleFreq = map.get(ele);
           int remFreq = map.get(rem);
           if(eleFreq != remFreq) return false;
           
       }
       return true;
    }
}

