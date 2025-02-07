class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;
        // for ignoring whitespace
        while(i<n && s.charAt(i)==' '){
            i++;
        }

        // String is Empty
        if(i==n){
            return 0;
        }

        // for handle of + and -
        boolean negative = false;
        if(s.charAt(i)=='-'){
            negative = true;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }

        int result = 0;
        while(i<n){
            if(Character.isDigit(s.charAt(i))){ // check the integer
              int digit = (s.charAt(i)-'0');
              if(result > (Integer.MAX_VALUE -digit)/10 && negative == true){
                return Integer.MIN_VALUE;
              } 
              else if(result > (Integer.MAX_VALUE- digit)/10 && negative == false){
                return Integer.MAX_VALUE;
              }
              result = result*10 + digit; 
              i++;
            }
            else{
                break;
            }
        }
       
        
        if(negative == true){
            return result*-1;
        }
        return result;
    }
}