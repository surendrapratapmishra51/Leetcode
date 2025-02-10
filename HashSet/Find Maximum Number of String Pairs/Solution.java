class Solution {
    public String reverse(String s){
        int n = s.length();
        String str = "";
        char ch;
        for(int i = 0; i<n; i++){
            ch = s.charAt(i);
            str = ch + str;
        }
        return str;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
         HashSet<String> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
            String s = words[i];
            String r = reverse(words[j]);
            if(s.equals(r)){
                set.add(s);
            }
            }
        }
        return set.size();
        
    }
}