// Last updated: 15/08/2026, 19:57:38
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
    public static TreeNode bst(TreeNode root,int value)
    {
        if(root==null)
        {
            root=new TreeNode(value);
            return root;
        }
        if(value<root.val)
        {
            
            root.left=bst(root.left,value);
        }
        else
        {
            root.right=bst(root.right,value);
        }
        return root;
       
        
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++)
        {
            root=bst(root,preorder[i]);
        }
        return root;
        
    }
}