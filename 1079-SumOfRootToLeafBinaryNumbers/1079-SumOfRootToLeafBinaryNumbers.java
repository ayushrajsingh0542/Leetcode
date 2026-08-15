// Last updated: 15/08/2026, 19:57:24
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
    public void dfs(TreeNode root,List<String>list,String temp)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            temp+=root.val;
            list.add(temp);
            
        }
        else
        {
        temp+=root.val;
        dfs(root.left,list,temp);
        dfs(root.right,list,temp);
        }
    }
    public int sumRootToLeaf(TreeNode root) {
        List<String>list=new ArrayList<>();
        dfs(root,list,"");
        int ans=0;
        for(String s:list)
        {
            ans+=Integer.parseInt(s,2);
        }
        return ans;
    }
}