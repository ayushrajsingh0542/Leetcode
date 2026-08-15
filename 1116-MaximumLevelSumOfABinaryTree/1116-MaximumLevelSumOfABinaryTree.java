// Last updated: 15/08/2026, 19:57:17
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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int level=1;
        int temp=1;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
           TreeNode curr=q.remove();
           if(curr!=null)
           sum+=curr.val;
           if(curr==null)
           {
            if(sum>max)
            {
             max=sum;
             level=temp;
            }
            temp++;
            sum=0;
            if(q.isEmpty())
            break;
            else
            q.add(null);

           }
           else
           {
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
           }
        }
        return level;
        
    }
}