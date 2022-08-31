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
    
    private List result=new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root == null){
            return result;
        }
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result.add(root.val);
        
        return result;
        
    }
}