import java.util.HashSet;
class Solution {
    public static int findUnion(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(a[i]);
        }
        for(int i = 0; i<m; i++){
            set.add(b[i]);
        }
        return set.size();
    }
}