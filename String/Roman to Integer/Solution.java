class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char I, V, X, L, C, D,M;

         map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);

         int total = 0;
         int n = s.length();

         for(int i = n-1; i>=0; i--){
            char ch = s.charAt(i);
            int value = map.get(ch);
            if(i< n-1 && value <(map.get(s.charAt(i+1)))){
                total -= value;
            }
            else{
                total += value;
            }
            
         }
          return total;
    }
}