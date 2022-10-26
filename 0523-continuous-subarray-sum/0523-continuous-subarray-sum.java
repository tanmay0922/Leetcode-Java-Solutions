class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> modSet=new HashSet(); //hash set named modset is created
        int currSum = 0, prevSum=0; 
		//when we add prevSum=0 in set it will actually check if currSum is divided by k 
        for(int n : nums) { //for each loop
            currSum += n; //statement of the loop
            if(modSet.contains(currSum%k)) {
                return true;
            }
            currSum %=k;
            modSet.add(prevSum);
            prevSum = currSum;
        }
        return false;
    }
}