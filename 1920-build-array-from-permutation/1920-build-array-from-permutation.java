class Solution {
    public int[] buildArray(int[] nums) {
     int n= nums.length;
        for(int i=0;i<nums.length;i++){
             nums[i]=(nums[nums[i]]%n)*n + nums[i];
            //ans[i]=nums[nums[i]];
        }
             for(int i=0;i<n;i++){
            nums[i]/=n;
        }
        
        return nums;
    }
}