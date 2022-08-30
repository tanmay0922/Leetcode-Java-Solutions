class Solution{
public int removeElement(int[] nums, int val) {
        int l=0,r=nums.length-1;//l is starting pointer(l=0)
        while(l<=r){
            if(nums[l]==val){
                int t=nums[r];//Swapping is done using temporary variable
                nums[r]=nums[l];
                nums[l]=t;
                r--;
            }
            else{
                l++;//next pointer
            }
        }
        return r+1;
    }
}