class Solution {
    public int removeDuplicates(int[] nums) {
        int a=nums[0];
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=a){
                                c++;
            nums[c]=nums[i];
            }
             a=nums[i];
        }
       return c+1;
    }
    
}