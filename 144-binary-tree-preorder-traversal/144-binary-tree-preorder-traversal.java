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
//Basically Stack based question..Implemented Stack and pushed each and every node one by one into the stack and then checked it with implemented conditions and printed it..
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>preorder=new ArrayList<Integer>();//ArrayList
        if(root==null)
            return preorder;
        Stack<TreeNode> st=new Stack<TreeNode>();//Stack created
        st.push(root);
        while(!st.isEmpty()){//Check if the stack is empty
            root=st.pop();//poping the root node
            preorder.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return preorder;
    }
}