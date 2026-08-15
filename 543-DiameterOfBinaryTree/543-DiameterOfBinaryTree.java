// Last updated: 15/08/2026, 20:01:38
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
    public static class Info
    {
        int diam;
        int ht;
        Info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(TreeNode root)
    {
        if(root==null)
        {
            return new Info(0,0);
        }
        Info left=diameter(root.left);
        Info right=diameter(root.right);
        int diam=Math.max(Math.max(left.diam,right.diam),left.ht+right.ht+1);
        int ht=Math.max(left.ht,right.ht)+1;

        return new Info(diam,ht);
    }
    public int diameterOfBinaryTree(TreeNode root) {

        return diameter(root).diam-1;
        
    }
}