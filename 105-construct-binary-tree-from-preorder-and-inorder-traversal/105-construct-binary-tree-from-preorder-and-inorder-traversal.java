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
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    
        Map<Integer,Integer> hm = new HashMap<>();
        int i=0;
        for(int num : inorder){
            hm.put(num , i);
            i++;
        }
        
        TreeNode root = arrayToTree(preorder , 0 , preorder.length-1,inorder,0,inorder.length-1,hm);
        
        return root;
    }
    
    private TreeNode arrayToTree(int[] preorder , int preStart , int preEnd , int[] inorder , int inStart , int inEnd , Map<Integer , Integer> hm){
        
        if(preStart > preEnd || inStart > inEnd )   return null;
        
        TreeNode root = new TreeNode(preorder[preStart]);
        
        int inRoot = hm.get(root.val);
        int numsLeft = inRoot - inStart;
        
        root.left = arrayToTree(preorder , preStart+1 , preStart+numsLeft,inorder, inStart,inRoot-1,hm);
        root.right = arrayToTree(preorder , preStart+numsLeft+1 , preEnd,inorder,inRoot+1,inEnd,hm);
        
        return root;
    }
}