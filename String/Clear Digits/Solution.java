class Solution {
    public String clearDigits(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);

        for(int i = 1; i<sb.length(); i++){
            char ch = sb.charAt(i);
            int num = ch-'0';
            if( i>0 && num >=0 && num <= 9){
                int j = i-2;
             sb = sb.delete(i-1,i+1);
                i=j;
            }
        }
         return sb.toString();
    }
}
