// Last updated: 15/08/2026, 20:06:15
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
    public static void preorder(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        preorder(root,list);
        return list;
    }
}