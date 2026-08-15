// Last updated: 15/08/2026, 20:04:00
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
    public static void traversal(ArrayList<Integer> ans,TreeNode root)
    {
        if(root==null)
        {
            return;
        }
       
        traversal(ans,root.left);
        ans.add(root.val);
        traversal(ans,root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        traversal(ans,root);
        return ans.get(k-1);
        
    }
}