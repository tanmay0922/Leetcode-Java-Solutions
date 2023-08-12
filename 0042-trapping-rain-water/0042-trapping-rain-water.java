//Here the approach is like we basically find the left max and right max and based on that we start our movement in two pointer.we start with finding the left most height and the right most height and then we do left++ , right-- and continue. Now if the new left height is greater than max left height then we update the lmax height and similarly for the right side.//

class Solution {
 public int trap(int[] height) {
        if(height.length < 3)
            return 0;
        int[] leftMax = new int[height.length]; //leftMax matrix
        int[] rightMax = new int[height.length]; //RightMax matrix
        int waterStored = 0; //ans stored here
        for(int i = 1; i < height.length; i++)  
            leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
        for(int i = height.length - 2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i + 1], height[i + 1]);
        for(int i = 0; i < height.length; i++)
            waterStored += Math.max(0, Math.min(leftMax[i], rightMax[i]) - height[i]);
        return waterStored;
    }
}