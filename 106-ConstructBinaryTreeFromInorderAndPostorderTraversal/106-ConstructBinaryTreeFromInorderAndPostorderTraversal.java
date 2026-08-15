// Last updated: 15/08/2026, 20:07:33
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
    public static TreeNode create(int inorder[],int inStart,int inEnd,int postorder[],int pStart,int pEnd, HashMap<Integer,Integer> map)
    {
        if(pStart>pEnd || inStart>inEnd)
        {
            return null;
        }
        TreeNode root=new TreeNode(postorder[pEnd]);
        int inRoot=map.get(root.val);
        int numsLeft=inRoot-inStart;
        root.left=create(inorder,inStart,inRoot-1,postorder,pStart,pStart+numsLeft-1,map);
        root.right=create(inorder,inRoot+1,inEnd,postorder,pStart+numsLeft,pEnd-1,map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        TreeNode root=create(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
        return root;
    }
}