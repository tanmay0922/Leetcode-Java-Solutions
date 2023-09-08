class Solution {
    public int missingNumber(int[] nums) {
        /*int n = nums.length;
       int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+nums[i]; 
        }
        return totalSum - sum;
    }
}*/
        Arrays.sort(nums);
        for (int i=0;i< nums.length;i++){
            if (nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}
