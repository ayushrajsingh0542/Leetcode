// Last updated: 15/08/2026, 20:00:56
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
    public TreeNode merge(TreeNode root1, TreeNode root2)
    {
        if(root1==null && root2==null)
        return null;
        TreeNode newNode;
        if(root1==null && root2!=null)
        {
           newNode=new TreeNode(root2.val);
            
        }
        else if(root1!=null && root2!=null)
        {
             newNode=new TreeNode(root2.val+root1.val);
            
        }
        else 
        newNode=new TreeNode(root1.val);
        newNode.left = merge(root1==null ? null : root1.left,
                             root2==null ? null : root2.left);

        newNode.right = merge(root1==null ? null : root1.right,
                              root2==null ? null : root2.right);
        return newNode;
        
    }
    
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
       root1=merge(root1,root2);
        return root1;
    }
}