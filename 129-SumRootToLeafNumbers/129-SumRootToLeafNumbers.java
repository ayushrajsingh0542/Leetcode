// Last updated: 15/08/2026, 20:06:40
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
    public static void dfs(TreeNode root,List<Integer> list,int path)
    {
        if(root==null)
        {
            return;
        }
        path=path*10+root.val;
        if(root.left==null && root.right==null)
        {
            
            list.add(path);
            
            return;
        }
        
        
        dfs(root.left,list,path);
        dfs(root.right,list,path);
    }
    public int sumNumbers(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list,0);
        int ans=0;
        for(int i:list)
        {
            ans+=i;
        }
        return ans;
    }
}