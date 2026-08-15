// Last updated: 15/08/2026, 20:07:56
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
    public static void inorder(ArrayList<Integer>list,TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
    }
    public boolean isValidBST(TreeNode root) {

        ArrayList<Integer>list=new ArrayList<>();
        inorder(list,root);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)<=list.get(i-1))
            {
                return false;
            }
        }
        return true;
        
    }
}