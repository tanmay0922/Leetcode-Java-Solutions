class Solution {
    public boolean increasingTriplet(int[] nums) {
          int firstNum = Integer.MAX_VALUE, secondNum = Integer.MAX_VALUE;
        for (int num:nums) { // dynamically update the numbers in ascending range
            if (num <= firstNum) firstNum = num;
            else if (num <= secondNum) secondNum = num;
            else return true;
        }
        return false;
    }
}