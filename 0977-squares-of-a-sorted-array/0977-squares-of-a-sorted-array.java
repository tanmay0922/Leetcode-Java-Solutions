class Solution {
    public int[] sortedSquares(int[] nums) {
         if(nums.length==0)
            return nums; 
			
//naive Approach
//         for(int i=0;i<nums.length;i++)
//             nums[i]*=nums[i];
//         Arrays.sort(nums);
       
            
        int ans[]= new int[nums.length];
            
        int l=0;
        int r = ans.length-1;
        int index = nums.length-1;
        
        while(l<=r)
        {
            int val1 = nums[l]*nums[l];
            int val2 = nums[r]*nums[r];
            if(val1>val2)
            {
                ans[index] = val1;
                l++;
            }
            else
            {
                ans[index] = val2;
                r--;
            }
            index--;
        }
        
        return ans;
    }
}