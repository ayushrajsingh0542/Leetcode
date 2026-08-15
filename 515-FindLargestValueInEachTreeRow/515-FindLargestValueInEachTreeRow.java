// Last updated: 15/08/2026, 20:01:55
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
    
    public static List<Integer> bfs(TreeNode root)
    { 
        List<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode curr=q.remove();
            if(curr!=null)
            max=Math.max(curr.val,max);
            if(curr==null)
            {
                ans.add(max);
                max=Integer.MIN_VALUE;
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
        }
        return ans;
    }
    public List<Integer> largestValues(TreeNode root) {
       
       if(root==null)
       return new ArrayList<>();
       
       return bfs(root);
        
        
    }
}