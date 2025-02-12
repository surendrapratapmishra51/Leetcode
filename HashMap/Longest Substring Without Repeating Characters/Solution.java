import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0; int j = 0;
        int max = 0;
        while(j<n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                int len = j-i;
                max = Math.max(len,max);
                // i ko ch k purani position k ek aage le jane k liye
                while(s.charAt(i) != ch){
                    i++;
                }
                i++;

            }
            map.put(ch,j);
            j++;
        }

         int len = j-i;
         max = Math.max(len,max);
        return max;
    }
}