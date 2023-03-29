class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction); //sort
        int n = satisfaction.length; //length of array
        int presum = 0, res = 0;
        for (int i = n - 1; i >= 0; i--) { //loop
            presum += satisfaction[i];
            if (presum < 0) {
                break;
            }
            res += presum;
        }
        return res;
    }
}

