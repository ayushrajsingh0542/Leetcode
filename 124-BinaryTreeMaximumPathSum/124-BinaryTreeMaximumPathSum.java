// Last updated: 15/08/2026, 20:06:51
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {

    public int dist(TreeNode root,int maxi[])
    {
        if(root==null)
        {
            return 0;
        }
        int left=Math.max(0,dist(root.left,maxi));
        int right=Math.max(0,dist(root.right,maxi));
        maxi[0]=Math.max(maxi[0],root.val+left+right);
        return root.val+Math.max(left,right);
    }
    
    public int maxPathSum(TreeNode root) {
        //your code goes here 
        int maxi[]=new int[1];
        maxi[0]=Integer.MIN_VALUE;
        dist(root,maxi);
        return maxi[0];
       
    }
}