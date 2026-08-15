// Last updated: 15/08/2026, 19:59:28
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
    public static TreeNode create(ArrayList<Integer> list,int st,int end)
    {
        if(st>end)
        {
            return null;
        }
        int mid=st+(end-st)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=create(list,st,mid-1);
        root.right=create(list,mid+1,end);
        return root;

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
        list.add(val);
        Collections.sort(list);
        return create(list,0,list.size()-1);
        
    }
}