class Solution {
    public int searchInsert(int[] nums, int target) {
        int output = 0;
for (int i = 0; i < nums.length; i++) {
if(nums[i]==target){
output = i;
break;
}if(nums[i]<target){
output = i+1;
}
}

    return(output);   
}
}
    