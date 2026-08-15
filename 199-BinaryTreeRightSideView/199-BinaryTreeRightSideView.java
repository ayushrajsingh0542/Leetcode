// Last updated: 15/08/2026, 20:04:44
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
    public static void level(TreeNode root,ArrayList<Integer> list)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        
        list.add(root.val);
        list.add(-101);
        while(!q.isEmpty())
        {
            TreeNode curr=q.remove();
            if(curr==null)
            {
                list.add(-101);
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
                    list.add(curr.left.val);
                }
                
                if(curr.right!=null)
                {
                    q.add(curr.right);
                    list.add(curr.right.val);
                }
                
                
            }
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        level(root,list);
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)!=-101)
            {
                if(list.get(i+1)==-101)
                {
                    ans.add(list.get(i));
                }
            }
        }
        return ans;
    }
}