class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       // int hi;
        //runtime error
       /* if(matrix.length==0) return false;
        int n=matrix.length;
        int m=matrix[0].length;
        int lo=0;
        int hi=(n*m)-1;
        while(lo<=hi){
            int mid =(lo+(hi-lo)/2);
            if(matrix[mid/m][mid %m]==target){
                return true;
            }
            if(matrix[mid/m][mid%m]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return false;
    }
}*/
        
int rowS=matrix.length;
int colS=matrix[0].length;
int s=0;
int e=colS-1;
while(s<rowS && e>=0){
int ele=matrix[s][e];
if(ele==target){
return true;
}else if(ele>target){
e--;
}else {
s++;
}
}
return false;
}
}