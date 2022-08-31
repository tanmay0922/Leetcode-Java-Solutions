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
        int row=0;
        int col=0;
        if(mat.length*mat[0].length!=r*c) return mat;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                
             m[row][col]=mat[i][j]; // here we are starting from 00 position and we want to increase horizontally in the same row that's why we are increasing column only not row. but at some point we will reach to the last column then we should go to next row and then again go to horizontally.
                col++;
                if(col==c){
// here when we reach to the last column of first row then we will increase row by 1 and set our column to 0 so that we can repeat the same process.
                     row++;
                     col=0;
                }
              
            }
        }
       return m; 
        // by this process we can traverse our matrix by row by row 
    }
}
