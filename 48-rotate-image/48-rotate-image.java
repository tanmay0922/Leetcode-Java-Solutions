class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){//loop till the first index of matrix
                int t=0;//temporary variable
                //swapping
                t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){//loop till half the length of the matrix
                int t=0;//temprary variable
                //swapping
                t=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=t;
            }
        }
    }
}