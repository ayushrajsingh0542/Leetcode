// Last updated: 15/08/2026, 20:03:47
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public static TreeNode lca(TreeNode root,TreeNode p,TreeNode q)
    {
        if(root==null||root==p||root==q)
        {
            return root;
        }
        root.left=lca(root.left,p,q);
        root.right=lca(root.right,p,q);
        if(root.left==null)
        {
            return root.right;
        }
        if(root.right==null)
        {
            return root.left;
        }
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root,p,q);
        
    }
}