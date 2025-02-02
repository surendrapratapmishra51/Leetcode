class Solution {
    // list of list to 2D array conversion
    private int[][] listToArray(List<List<Integer>> listOfLists) {
        int rows = listOfLists.size();
        int[][] array = new int[rows][2]; // Each interval has 2 elements (start, end)
        
        for (int i = 0; i < rows; i++) {
            array[i][0] = listOfLists.get(i).get(0);
            array[i][1] = listOfLists.get(i).get(1);
        }
        
        return array;
    }


    public int[][] merge(int[][] intervals) {

        int n = intervals.length;
        // Sorting 
        Arrays.sort(intervals, new Comparator<int[]>(){
        public int compare(int[] a,int[] b){
            return a[0]-b[0];
        }
    });


    List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int start = intervals[i][0];
            int end = intervals[i][1]; 
            
            // we can add  in two case either list is empty or current start is greater tha the last end of list

            if(ans.isEmpty()|| start > ans.get(ans.size()-1).get(1)){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            temp.sort(null);
            ans.add(temp);
            }
            else{
              // update the last end of list to maximum of current end and  last end of list

                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]));
            
            } 
        }
        return listToArray(ans);
        
    }
}
