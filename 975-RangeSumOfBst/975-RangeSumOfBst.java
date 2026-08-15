// Last updated: 15/08/2026, 19:58:18
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
    public static void range(TreeNode root,int low,int high,ArrayList<Integer>list)
    {
        if(root==null)
        {
            return;
        }
        range(root.left,low,high,list);
        if(root.val>=low && root.val<=high)
        {
            list.add(root.val);
        }
        range(root.right,low,high,list);

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer>list=new ArrayList<>();
        range(root,low,high,list);
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        return sum;
        
    }
}