// Last updated: 15/08/2026, 20:07:46
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
   
    public static boolean same(TreeNode p,TreeNode q)
    {
        if(p==null && q==null)
        {
            return true;
        }
        if(p==null||q==null||p.val!=q.val)
        {
            return false;
        }
        if(!same(p.left,q.right))
        {
            return false;
        }
        if(!same(p.right,q.left))
        {
            return false;
        }
        return true;
    }
    public boolean isSymmetric(TreeNode root) {

       return same(root.left,root.right);
        
    }
}