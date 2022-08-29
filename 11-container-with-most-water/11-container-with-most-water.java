
/*1.We are taking the widest container (using first and last pointer in the array) as our starting candidate, because of its width. Its water level is the height of the smaller one of first and last boundary.
2.All the other boundaries can be less than / greater than/ equal to these 2 lines.
(If any of the line between two line is smaller, then we can omit that line after calculating the water capacity (the capacity will be calculated and stored (if necessary) in the max variable).)
3.For that reason, we are checking for the smaller line and increasing / decreasing the width based on that.
4.Finally after all the iteration, the max variable will contain the maximum water capacity, hence return it.*/



class Solution {
    public int maxArea(int[] height) {
        int len = height.length, start = 0, end = len-1, max = Integer.MIN_VALUE;
        
        while(start < end){
            max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        
        return max;
    }
}