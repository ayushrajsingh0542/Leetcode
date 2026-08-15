// Last updated: 15/08/2026, 20:07:20
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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        } 
        return helper(root);
    }

    public int helper(TreeNode node){
      if(node ==  null){
        return 0;
      }

      int left = helper(node.left);
      int right = helper(node.right);

      if(node.left == null && node.right ==null ){
        return 1;
      }
      if(node.left == null){
        return right+1;
      }
      if(node.right == null){
        return left+1;
      }

      return Math.min(left,right) + 1;
    }
}