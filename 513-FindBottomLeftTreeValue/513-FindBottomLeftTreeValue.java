// Last updated: 15/08/2026, 20:01:50
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
    
    public int findBottomLeftValue(TreeNode root) {

         ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return 0;
        }
        q.add(root);
        q.add(null);
        ArrayList<Integer> list=new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode curr=q.remove();
            if(curr==null)
            {
                mainlist.add(list);
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

        return mainlist.get(mainlist.size()-1).get(0);

        
    }
}