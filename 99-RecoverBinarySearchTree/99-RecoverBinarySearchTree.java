// Last updated: 15/08/2026, 20:07:53
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
    public static void inorder(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public static void check(TreeNode root,Stack<Integer> s)
    {
        if(root==null)
        {
            return;
        }
        check(root.left,s);
        root.val=s.pop();
        check(root.right,s);
    }
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        inorder(root,list);
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--)
        {
            s.push(list.get(i));
        }
        check(root,s);
    }
}