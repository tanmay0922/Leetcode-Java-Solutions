class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length;
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
}
