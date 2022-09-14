class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        
for(  int i = 0; i < nums.length-1 ;  i=i+2){
if(nums[i] != nums[i+1]){
return nums[i];
}
else{
continue;//Just to break one iteration in the loop and start with another one.
}
}
return nums[nums.length - 1];
}
}