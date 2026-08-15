// Last updated: 15/08/2026, 20:07:43
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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> mainList=new ArrayList<>();
         if(root==null)
        {
            return mainList;
        }
        q.add(root);
        q.add(null);
        List <Integer>list=new ArrayList<>();

        while(!q.isEmpty())
        {
            TreeNode currNode=q.remove();
            
            if(currNode==null)
            {
                mainList.add(list);
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
                list.add(currNode.val);
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }

            
        }

        return mainList;
        
    }
}