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
    public boolean isCompleteTree(TreeNode root) {
     Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isNullInBetweenNodes = false;
        while (!queue.isEmpty()) {
            int totalNodesInLevel = queue.size();
            while (totalNodesInLevel-- > 0) {
                TreeNode currNode = queue.poll();
                if (currNode == null) {
                    isNullInBetweenNodes = true;
                }
                else {
                    if (isNullInBetweenNodes) {
                        return false;
                    }
                    queue.add(currNode.left);
                    queue.add(currNode.right);
                }
            }
        }
        return true;
    }
}
