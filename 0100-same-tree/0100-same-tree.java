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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){ //Base Case(both null return true)
        return true;
    }else if(p==null || q==null){ //Base Case(any one null return false)
        return false;
    }
 
    if(p.val==q.val){ //value or data equality checking
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); //right left nodes being checked
    }else{
        return false;
    }
    }
}