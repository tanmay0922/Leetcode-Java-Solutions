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
    // stores all paths that add to targetSum
    List<List<Integer>> sums = new ArrayList<>();
	
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return sums;
        generatePathSums(root, targetSum, 0, new ArrayList<Integer>());
        return sums;
    }
    
    public void generatePathSums(TreeNode node, int target, int sum, ArrayList<Integer> path) {
        sum += node.val;
        path.add(node.val);
        
		// if we are at a leaf node, check if the path sum == target
        if (node.left == null && node.right == null) {
            if (sum == target) sums.add(new ArrayList<Integer>(path));
			// we don't call a child, so we don't have to remove a node from the list
            return;
        }
        
        if (node.left != null) {
			// add the left child to the path
            generatePathSums(node.left, target, sum, path);
			// after it finishes executing, remove the node that was added by node.left
            path.remove(path.size() - 1);
        }
        
		// do the same for the right child
        if (node.right != null) {
            generatePathSums(node.right, target, sum, path);
            path.remove(path.size() - 1);
        }
    }
}