// Last updated: 15/08/2026, 19:59:24
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
    Integer pre=null;
    int min=Integer.MAX_VALUE;
    public  void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        
         inorder(root.left);
        if(pre!=null)
        {
            min=Math.min(min,root.val-pre);
        }
        pre=root.val;
     inorder(root.right);
       
      
    }
    public int minDiffInBST(TreeNode root) {
       
        
         inorder(root);
         return min;
    }
}