class Solution {
    public int[] findErrorNums(int[] nums) {
        int[]arr=new int[nums.length];
        int[]result=new int[2];
        for(int i:nums){ //for each loop    
            arr[i-1]++;
    }
    for(int i=0;i<arr.length;i++){ //for loop till array length
        if(arr[i]==2){
            result[0]=i+1;
            
        }
        if(arr[i]==0){
            result[1]=i+1
;
        }
    }
        return result;
    }
}