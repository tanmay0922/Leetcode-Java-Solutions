/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String serialize(TreeNode root) {
        //base Case
        if (root == null) 
            return "";
        //Queue usage
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder res = new StringBuilder();//String Builder(Used bcz it is mutuable)
        q.add(root);//adds element at the end
        while (!q.isEmpty()) {//loop's  condition if the queue is empty or not
            TreeNode node = q.poll(); //removes element from the end
            if (node == null) { //condition 
                res.append("n "); //used to append or add data in a file(appended n as a null value into the queue)
                continue;
            }
            res.append(node.val + " ");
            q.add(node.left); //adding value of left node as well as right node too
            q.add(node.right);
        }
        return res.toString(); //returning String
    }
//Serialize function (I Will give it a root and it will pass me a String!)
    public TreeNode deserialize(String data) {
        //Base Case
        if (data == "") 
            return null;
        Queue<TreeNode> q = new LinkedList<>(); 
        String[] values = data.split(" ");//array will be created using a split function
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        for (int i = 1; i < values.length; i++) {
            TreeNode parent = q.poll();
            if (!values[i].equals("n")) {
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                q.add(left);
            }
            if (!values[++i].equals("n")) {
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
    }
}
//Deseralize Function-returns back the string from the root

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));