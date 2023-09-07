/*class Solution {
    private int maxDiff(int[] nums, int left, int right, int n) {
        if (left == right) {
            return nums[left];
        }
        
        int scoreByLeft = nums[left] - maxDiff(nums, left + 1, right, n);
        int scoreByRight = nums[right] - maxDiff(nums, left, right - 1, n);
        
        return Math.max(scoreByLeft, scoreByRight);
    }
    
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        
        return maxDiff(nums, 0, n - 1, n) >= 0;
    }
}*/
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int[] dp = Arrays.copyOf(nums, n);
        
        for (int diff = 1; diff < n; ++diff) {
            for (int left = 0; left < n - diff; ++left) {
                int right = left + diff;
                dp[left] = Math.max(nums[left] - dp[left + 1], nums[right] - dp[left]);
            }
        }
        
        return dp[0] >= 0;
    }
}   