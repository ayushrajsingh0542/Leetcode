// Last updated: 15/08/2026, 20:07:35
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
    public static TreeNode build(int preorder[],int pStart,int pEnd,int inorder[],int inStart,int inEnd,HashMap<Integer,Integer> map)
    {
        if(pStart>pEnd || inStart>inEnd)
        {
            return null;
        }
        TreeNode root=new TreeNode(preorder[pStart]);
        int inRoot=map.get(root.val);
        int numLeft=inRoot-inStart;
        root.left=build(preorder,pStart+1,pStart+numLeft,inorder,inStart,inRoot-1,map);
        root.right=build(preorder,pStart+numLeft+1,pEnd,inorder,inRoot+1,inEnd,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    }
}