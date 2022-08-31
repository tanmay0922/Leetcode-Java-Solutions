class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int colLen = matrix[0].length-1;//Column length
        for(int i=0;i<matrix.length;i++){
            if(target<=matrix[i][colLen]){
                int val = Arrays.binarySearch(matrix[i],target);
                if(val>=0){
                    return true;
                }
            }
        }
        return false;
    }
}