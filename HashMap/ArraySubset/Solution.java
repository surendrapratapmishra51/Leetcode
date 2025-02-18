package ArraySubset;
import java.util.*;
class Solution {
    public boolean isSubset(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        HashMap<Integer,Integer>map = new HashMap<>();
         HashMap<Integer,Integer>map2 = new HashMap<>();
          
          for(int i = 0; i<n; i++){
              map.put(a[i],map.getOrDefault(a[i],0)+1);
          }
          
          for(int i = 0; i<m; i++){
              map2.put(b[i],map2.getOrDefault(b[i],0)+1);
          }
          for(int key :map2.keySet()){
              int FreqB = map2.get(key);
              if(!map.containsKey(key)) return false;
              int FreqA = map.get(key);
              if(FreqA < FreqB) return false;
          }
          return true;
    }
}


