// Last updated: 15/08/2026, 20:00:47
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
class Solution { //mik
    public String tree2str(TreeNode root) {
        if(root==null)
        return "";
        String res=Integer.toString(root.val);
        String left=tree2str(root.left);
        String right=tree2str(root.right);
        if(root.left==null && root.right==null)
        return res;
        else if(root.left==null)
        return res+"()"+"("+right+")";
        else if(root.right==null)
        return res+"("+left+")";
        else
        return res+"("+left+")"+"("+right+")";
    }
}