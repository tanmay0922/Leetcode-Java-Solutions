/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {

        return subtree(nums, 0, nums.length - 1);
    }

    private TreeNode subtree(int[] nums, int first, int last) {

        if (first > last) return null;
        if (first == last) return new TreeNode(nums[first]);

        var bias = (first + last) / 2;
        return new TreeNode(
                nums[bias],
                subtree(nums, first, bias - 1),
                subtree(nums, bias + 1, last)
        );
    }
}