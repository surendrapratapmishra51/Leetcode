
class Solution {
    public String largestOddNumber(String num) {
        String str = "";
        for(int i = num.length()-1; i>=0; i--){

            int d = num.charAt(i);
            if(d%2 == 1){
                return num.substring(0,i+1);
            }
        }
        return str;
    }
}