class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        char [] ans = new char[128];

        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch;
            if(ans[idx] == '\0'){
                ans[idx] = dh;
            }
            else{
                if(ans[idx] != dh)
                    return false;
            }
        }
        char [] ans1 = new char[128];
        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int idx = (int)ch;
            if(ans1[idx] == '\0'){
                ans1[idx] = dh;
            }
            else{
                if(ans1[idx] != dh)
                    return false;
            }
        }

        return true;
    }
}
