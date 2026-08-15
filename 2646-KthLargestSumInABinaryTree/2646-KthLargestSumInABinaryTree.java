// Last updated: 15/08/2026, 19:51:14
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     long val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(long val) { this.val = val; }
 *     TreeNode(long val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {

        if(root==null)
        {
            return -1;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> list=new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode curr=q.remove();
            if(curr==null)
            {
                list.add(0);
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
                list.add(curr.val);
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

        
        long sum=0;
        ArrayList<Long> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)!=0)
            {
                sum+=list.get(i);
            }
            if(list.get(i)==0)
            {
                list2.add(sum);
                sum=0;
            }
        }
        Collections.sort(list2,Collections.reverseOrder());
        if(k<=list2.size())
        return list2.get(k-1);
        return -1;

        
    }
}