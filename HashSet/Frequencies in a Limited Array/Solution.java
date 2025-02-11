import java.util.HashMap;
import java.util.List;
class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int key = arr[i];
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                map.put(key,map.get(key)+1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(n+1);
        for(int i = 1; i<=n; i++){
            if(map.containsKey(i)){
                int value = map.get(i);
                list.add(value);
            }
            else{
                list.add(0);
            }
        }
        return list;
    }
}