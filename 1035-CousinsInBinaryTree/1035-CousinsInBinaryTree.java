// Last updated: 15/08/2026, 19:57:46
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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root.val==x || root.val==y)
        return false;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int par1=-1;
        int par2=-1;
        while(!q.isEmpty())
        {
            TreeNode curr=q.remove();
            if(curr==null)
            {
               
                if((par1!=-1 && par2==-1)||(par1==-1 && par2!=-1))
                {
                    return false;
                }
                else if(par1!=-1 && par2!=-1 && par1==par2)
                {
                    return false;
                }
                else if(par1!=par2)
                {
                    return true;
                }

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
                    if(curr.left.val==x)
                    par1=curr.val;
                    else if(curr.left.val==y)
                    par2=curr.val;
                    q.add(curr.left);
                }

                if(curr.right!=null)
                {
                    if(curr.right.val==x)
                    par1=curr.val;
                    else if(curr.right.val==y)
                    par2=curr.val;
                    q.add(curr.right);
                }

            }
        }

        return true;
    }
}