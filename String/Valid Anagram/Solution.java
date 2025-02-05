import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) return false;
        char [] arr1 = new char[n];
        char []  arr2 = new char[m];

        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            arr1[i] = ch;
        }
         for(int i = 0; i<n; i++){
            char ch = t.charAt(i);
            arr2[i] = ch;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i<n; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
