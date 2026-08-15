// Last updated: 15/08/2026, 20:07:31
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
    public static void level(TreeNode root,Stack<List<Integer>> st)
    {
        
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode curr=q.remove();
            if(curr!=null)
            list.add(curr.val);
            if(curr==null)
            {
                st.push(new ArrayList<>(list));
                list=new ArrayList<>();
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
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> st=new Stack<>();
        List<List<Integer>> ans=new ArrayList<>();
        if (root == null) 
        return ans;
        level(root,st);
        while(!st.isEmpty())
        {
            ans.add(st.pop());
        }
        return ans;
    }
}