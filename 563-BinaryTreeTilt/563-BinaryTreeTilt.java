// Last updated: 15/08/2026, 20:01:27
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
    public static int tilt(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null)
        {
            return 0;
        }
        int left=tilt(root.left,list);
        int right=tilt(root.right,list);
        int sum=left-right;
        sum=Math.abs(sum);
        list.add(sum);
        return left+right+root.val;
    }
    public int findTilt(TreeNode root) {

        ArrayList<Integer> list=new ArrayList<>();
        tilt(root,list);
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        return sum;


        
    }
}