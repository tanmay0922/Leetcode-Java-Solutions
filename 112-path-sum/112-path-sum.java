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
    public boolean hasPathSum(TreeNode root, int targetSum) {
   /* boolean res = false;

		if(root != null) {
			targetSum = targetSum - root.val;
			if(targetSum == 0 && root.left == null && root.right == null) {
				return true;
			}
			res = hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
		}

		return res;        
	}
}*/
        //Recursive Solution
        if(root == null)
            return false;
        else if(root != null && root.left == null && root.right == null && targetSum == root.val)
            return true;           
        else
            return hasPathSum(root.left,targetSum - root.val) || hasPathSum(root.right,targetSum - root.val);
    }
}
    