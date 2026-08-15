// Last updated: 15/08/2026, 20:04:12
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
    public static int count(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=count(root.left);
        int right=count(root.right);

        return left+right+1;
    }
    public int countNodes(TreeNode root) {
        return count(root);
    }
}