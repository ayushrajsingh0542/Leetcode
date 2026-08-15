// Last updated: 15/08/2026, 20:07:18
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
    public static void sum(TreeNode root,int path,List<Integer>list,int t)
    {
        if(root==null)
        {
            return;
        }
         path+=root.val;
        if(root.left==null && root.right==null)
        {
           if(path==t)
            list.add(path);
           path=path-root.val;
            
        }
       
        
      
    sum(root.left,path,list,t);
    sum(root.right,path,list,t);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer>list=new ArrayList<>();
        sum(root,0,list,targetSum);
        if(list.size()==0)
        return false;
        return true;
    }
}