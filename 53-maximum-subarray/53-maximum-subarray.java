class Solution {
    public int maxSubArray(int[] nums) {
         int sum=0;
        int maxsum=Integer.MIN_VALUE;//-2^31(-2147483648)
        for(int i : nums){//for each loop.
            if(sum<0){//condition
                sum=0;
            }
            sum+=i;//sum
            if(maxsum<sum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
}
    