class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) 
            return;
        int count = 0, size = nums.length;
        for (int i = 0; i < nums.length; i++) { //loop till lenght
            if (nums[i] != 0) { //if not equal to zero
                nums[count] = nums[i]; //counts==i
                count++; //increment counter
            }
        }

        while (count < size) { //if count is less than length of array
            nums[count] = 0; //counts made zero
            count++; //increment
        }
    }
}