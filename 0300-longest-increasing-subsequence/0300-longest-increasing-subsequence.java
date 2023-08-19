class Solution {
    public int lengthOfLIS(int[] nums) {
        
         int dp[] = new int[nums.length];
        int max = 0,omax=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] > max)
                        max = dp[j];
                }
            }
            dp[i] = max + 1;
            max = 0;
            if (dp[i] > omax)
                omax = dp[i];
        }
        return omax;
    } 

}
