// Last updated: 15/08/2026, 20:03:57
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
        TreeNode left=lca(root.left,p,q);
        TreeNode right=lca(root.right,p,q);
        if(right==null)
        {
            return left;
        }
        if(left==null)
        {
            return right;
        }
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return lca(root,p,q);
        
    }
}