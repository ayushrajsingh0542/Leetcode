// Last updated: 15/08/2026, 19:59:33
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
    public static TreeNode search(TreeNode root,int val)
    {
        if(root==null)
        {
            return null;
        }
        if(root.val==val)
        {
            return root;
        }
        if(val<root.val)
        {
            return search(root.left,val);
        }
        return search(root.right,val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
        {
            return null;
        }
        return search(root,val);

        
    }
}