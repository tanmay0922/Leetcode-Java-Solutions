class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if(oldColor==color) return image;
        floodFillHelper(image,sr,sc,color,image.length,image[0].length,oldColor);
        return image;
    }

    private void floodFillHelper(int[][] image, int sr, int sc, int color,int m, int n,int oldColor){
        if((sr>=0 && sr<m) && (sc>=0 && sc<n) && (image[sr][sc]==oldColor)){
            image[sr][sc]=color;
            floodFillHelper(image,sr-1,sc,color,m,n,oldColor);
            floodFillHelper(image,sr+1,sc,color,m,n,oldColor);
            floodFillHelper(image,sr,sc-1,color,m,n,oldColor);
            floodFillHelper(image,sr,sc+1,color,m,n,oldColor);
        }
    }
}