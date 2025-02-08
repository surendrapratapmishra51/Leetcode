class Solution {
    public boolean isVovel(char ch){
        
            if(ch == 'a'|| ch == 'A') return true;
            if(ch == 'e'|| ch == 'E') return true;
            if(ch == 'i'|| ch == 'I') return true;
            if(ch == 'o'|| ch == 'O') return true;
            if(ch == 'u'|| ch == 'U') return true;
            return false;
        
    }
    public String reverseVowels(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = n-1;
        while(i<j){
            if(isVovel(sb.charAt(i))&& isVovel(sb.charAt(j))){
                char temp = sb.charAt(i);
                sb.setCharAt(i,s.charAt(j));
                sb.setCharAt(j,temp);
                i++;
                j--;
            }
            else if(isVovel(sb.charAt(i)) && !isVovel(sb.charAt(j))){
                j--;
            }
            else if(!isVovel(sb.charAt(i)) && isVovel(sb.charAt(j))){
                i++;
            }
                else{ 
                    i++;
                    j--;
                }
            
        }
        return sb.toString();
        
    }
}
