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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
     ArrayList<Integer> leafsOf1 = new ArrayList<>(); //to store leaf nodes of tree1 
        ArrayList<Integer> leafsOf2 = new ArrayList<>(); //to store leaf nodes of tree1 
        treversal(root1,leafsOf1);  //dfs on tree1
        treversal(root2,leafsOf2);  //dfs on tree2
        return leafsOf1.equals(leafsOf2);  //compares both tree's leafs
    }


    //function which does dfs on tree and stores leafs in arrayList
    public void treversal(TreeNode root,ArrayList<Integer> leafs){
        if(root==null) return;
        
        if(root.left==null&&root.right==null){
            leafs.add(root.val);
            return;
        }
        
        treversal(root.left,leafs);
        treversal(root.right,leafs);
    }
}
       
 