

class Solution {
    public void reverse(int matrix[]){
        int a = 0;
        int b = matrix.length-1;
        while(a<b){
            int temp = matrix[a];
            matrix[a] = matrix[b];
            matrix[b] = temp;
            a++;
            b--;
        }
    }
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        // transpose matrix
        for(int i = 0; i<m; i++){
            for(int j = 0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // rotate
        for(int i = 0; i<m; i++){
            reverse(matrix[i]);
        }
    }
}
