class Solution {
    public int[][] generateMatrix(int n) {
        int cols=n,rows=n;
        int matrix[][]=new int[n][n];
        int max=n*n+1;
        int count=1;
        int col=0,row=0;
        while(count<max){
            for(int i=col;i<cols;i++){
                matrix[row][i]=count;
                count++;
            }
            ++row;
            for(int i=row;i<rows;++i){
                matrix[i][cols-1]=count;
                ++count;
            }
            --cols;
            for(int i=cols-1;i>=col;i--){
                matrix[rows-1][i]=count;
                ++count;
            }
            --rows;
            for(int i=rows-1;i>=row;i--){
                matrix[i][col]=count;
                ++count;
            }
            ++col;
        }
        return matrix;
    }
}