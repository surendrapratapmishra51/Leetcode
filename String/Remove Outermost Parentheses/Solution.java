class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        String ans = "";
         int open = 0;
         int close = 0;
         int i = 0;
         int j = 0;
         while(j<n){
            if(s.charAt(j)=='(') {
                close++;
            }
            else{
            open++;
            }
            j++;
            if(open == close){
                ans += s.substring(i+1,j-1);
                i = j;
                open = 0;
                close = 0;
            }
         }
            return ans;
    }
}