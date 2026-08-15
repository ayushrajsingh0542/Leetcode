// Last updated: 15/08/2026, 20:00:18
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
    static class Info
    {
        TreeNode node;
        int idx;
        Info(TreeNode node,int i)
        {
            this.node=node;
            this.idx=i;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;
     int ans=0;
     Queue<Info>q=new LinkedList<>();
     q.add(new Info(root,0));
     q.add(new Info(null,-1));
     while(!q.isEmpty())
     {
        Info curr=q.remove();
        if(curr.node==null)
        {
            ans=Math.max(ans,(max-min+1));
            max=Integer.MIN_VALUE;
            min=Integer.MAX_VALUE;
            if(q.isEmpty())
            break;
            else
            q.add(new Info(null,-1));
        }
        else
        {
            min=Math.min(min,curr.idx);
            max=Math.max(max,curr.idx);
            if(curr.node.left!=null)
            {
                q.add(new Info(curr.node.left,2*(curr.idx-min)+1));
            }
            if(curr.node.right!=null)
            {
                q.add(new Info(curr.node.right,2*(curr.idx-min)+2));
            }
        }
        
     }
     return ans;
        
    }
}