class Solution {
    public int findKthLargest(int[] nums, int k) {
     Arrays.sort(nums); //Sorts the Array
int a=nums.length; //finds length of the Array
return nums[a-k];
}
}   
    