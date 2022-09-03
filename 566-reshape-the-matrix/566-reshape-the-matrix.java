class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       /* int m=mat.length,n=mat[0].length;
        if(m*n != r*c)//Sizes check
            return mat;
        
        int[][] ans=new int[r][c];//new matrix is being created
        int x=0,y=0;//first col and row values have been assigned
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ans[i][j]=mat[x][y];
                y++;
                if(y==n)
                {
                    y=0;
                    x++;
                }
            }
        }
        
        return ans;
    }
}*/
//2nd approach:
         int[][] m = new int[r][c]; // make new matrix of r*c.
        int row=0;//indexed to zero
        int col=0;//indexed to zero
        if(mat.length*mat[0].length!=r*c) 
            return mat;
        for(int i=0; i<mat.length; i++){ //loop for original matrix
            for(int j=0; j<mat[0].length; j++){
                
             m[row][col]=mat[i][j]; 
                col++;
                if(col==c){
                     row++;
                     col=0;
                }
              
            }
        }
       return m; 
}
}