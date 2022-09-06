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
    HashSet<Integer> h = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        
         
        return twoSumCheck(root , k);
    }
    
    public boolean twoSumCheck(TreeNode root, int target){
        if(root==null)  return false;
        
        if(h.contains(target- root.val)) return true;
        h.add(root.val);
        return twoSumCheck(root.left, target)
            || twoSumCheck(root.right, target);
    }
}