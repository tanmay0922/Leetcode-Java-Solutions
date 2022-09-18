/*We start by replacing left[], we do this by storing the values that we would have originally stored in left[] in ans[] from the start.
Now that we have the left[] array completed stored in ans[], we can directly multiply the suffixProduct to ans[i] to get the resultant answer, which is exactly what we do with the variable right here.
right here is used to store the value of the suffixProduct, at each iteration it is multiplied with value nums[i+1...n]*/


class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;//length of the array
        int right = 1; //right index
        int[] ans = new int[n]; //the left array.
        
        ans[0] = 1;
        //using ans as the left[] array
        for(int i = 1; i < n; i++)
        {
            ans[i] = ans[i-1] * nums[i-1];
        }
        
        for(int i = n-1; i >= 0; i--)
        {
            ans[i] *= right;
            right *= nums[i];//since the value of nums[i] is multipled after right is used in ans[], the value of nums[i] is not included in ans[i]
        }
        
        return ans;
    }
}