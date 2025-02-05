class Solution {
    public String frequencySort(String s) {
        int n = s.length();

        int freq[] = new int[128];
        
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }
        char[] ans = new char [n];
        for(int i = 0; i<n;){
            int max = 0;
            int idx = 0;
            for(int j = 0; j<128; j++){
                if(max<freq[j]){
                    max = freq[j];
                    idx = j;
                }
            }
                while(freq[idx]>0){
                    ans[i++] = (char)idx;
                    freq[idx]--;
                
            }
        }
        return new String(ans);
        
    }
}
