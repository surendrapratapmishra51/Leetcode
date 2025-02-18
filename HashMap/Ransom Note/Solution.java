import java.util.*;
class Solution {
    public boolean canConstruct(String r, String ma) {
        int n = r.length();
        int m = ma.length();
        if(n > m) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0; i<n; i++){
            char ch = r.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

         for(int i = 0; i<m; i++){
             char ch = ma.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        for(char key:map1.keySet()){
            int freq1 = map1.get(key);
            if(!map2.containsKey(key))return false;
            int freq2 = map2.get(key);
            if(freq1 > freq2) return false;
        }
        return true;
    }
}