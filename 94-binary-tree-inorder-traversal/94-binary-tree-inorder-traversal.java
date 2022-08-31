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
    public List<Integer> inorderTraversal(TreeNode root) {
        
    List<Integer>values=new ArrayList<Integer>();//ArrayList
        if(root==null)
            return values;
        Stack<TreeNode> st=new Stack<TreeNode>();//Stack created
    TreeNode curr=root;//curr node is assigned as root value
        while(curr!=null||!st.isEmpty()){//Check if the current elementis empty
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();//removing  the value from the stack
            values.add(curr.val);
            curr=curr.right;//treverse towards right
        }
    return values;
    }
}
            