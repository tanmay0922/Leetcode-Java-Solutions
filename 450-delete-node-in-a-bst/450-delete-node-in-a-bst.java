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
    public TreeNode deleteNode(TreeNode root, int key) {
    if(root == null){
        return null;
    }
    if(root.val == key){
        return detach(root);
    }
    TreeNode dummy = root;
    while(root != null){
        if(root.val > key){
            if(root.left != null && root.left.val == key){
                //detach
                root.left = detach(root.left);
                break;
            }
            root = root.left;
        }
        else{
            if(root.right != null && root.right.val == key){
                //detach
                root.right = detach(root.right);
                break;
            }
            root = root.right;
        }
    }
    return dummy;
}
public TreeNode detach(TreeNode root){
    if(root.left == null){
        return root.right;
    }
    if(root.right == null){
        return root.left;
    }
    TreeNode r = findRMostNode(root.left);
    r.right = root.right;
    return root.left;
}

public TreeNode findRMostNode(TreeNode root){
    while(root.right != null){
        root = root.right;
    }
    return root;
}    
    }