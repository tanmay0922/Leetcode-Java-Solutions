class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans=new int[nums.length]; //ans array
        for(int i=0;i<nums.length;i++){ //loop till nums.length
            ans[(i+k)%nums.length]=nums[i]; //calculating with the formula and storing in nums[i]
        }
        for(int i=0; i<ans.length; i++){ //loop till answer.length
            nums[i]=ans[i]; //making ans and nums as equal
        }
    }
}