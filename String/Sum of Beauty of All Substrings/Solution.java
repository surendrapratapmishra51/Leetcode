class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int count = 0;
        for(int i = 0; i<n; i++){
            int freq [] = new int[26];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int j = i; j<n; j++){
                char ch = s.charAt(j);
                int idx = ch-'a';
                freq[idx]++;

                max = Math.max(max,freq[idx]);
                min = Integer.MAX_VALUE;
                for(int f : freq){
                    if(f>0){
                        min = Math.min(min,f);
                    }
                }
                count += max-min;
            }
            
        }
        return count;
    }
}