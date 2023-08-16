class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int[] ret = new int[nums.length - k + 1];
        int idx=0;
        for(int i=0;i<k;i++) {
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }
        ret[idx] = nums[dq.peekFirst()];
        idx++;
        for(int i=k;i<nums.length;i++) {
            while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
            ret[idx] = nums[dq.peekFirst()];
            idx++;
        }
        return ret;
    }
}