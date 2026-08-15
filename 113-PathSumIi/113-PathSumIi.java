// Last updated: 15/08/2026, 20:07:15
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
    public void dfs(TreeNode root,int t,List<Integer>list,List<List<Integer>>ans)
    {
        if(root==null)
        return;
        if(root.left==null && root.right==null)
        {
            list.add(root.val);
            int sum=0;
            for(int i=0;i<list.size();i++)
            sum+=list.get(i);
            if(sum==t)
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(root.val);
        dfs(root.left,t,list,ans);
        dfs(root.right,t,list,ans);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(root,targetSum,new ArrayList<>(),ans);
        return ans;
    }
}