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
    public boolean isSymmetric(TreeNode root) {
      return is_Symmetric_check(root.left,root.right);
     
        
        //    return is_Symmetric_check(root,root); if we return only root t.c. will be increased.
        
        
       // if(root==0) return null;
        // if(isSymmetric(root.left)!=isSymmetric(root.right))
        //     return false;
        // return true;
    }
    public boolean is_Symmetric_check(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;
        
        if((t1.val!=t2.val)) return false;
        return is_Symmetric_check(t1.left,t2.right) && is_Symmetric_check(t1.right,t2.left);
    }
}