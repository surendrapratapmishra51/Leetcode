class Solution {
    public String convert(String s, int r) {
        int n = s.length();
        if(r==1) return s;

        char ans[][] = new char[r][n];
        int row = 0;
        boolean down = false;

        for(int i = 0; i<n; i++){
            ans[row][i] = s.charAt(i);

            if(row == 0|| row == r-1){
                down = !down;
            }
            row += down?1:-1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<r; i++){
            for(int j = 0; j<n; j++){
                if(ans[i][j]!='\0'){
                    sb.append(ans[i][j]);
                }
            }
        }
        return sb.toString();
    }
}