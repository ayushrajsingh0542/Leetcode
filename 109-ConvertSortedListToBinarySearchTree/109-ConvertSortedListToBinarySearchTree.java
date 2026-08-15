// Last updated: 15/08/2026, 20:07:24
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public static TreeNode createBST(ArrayList<Integer> nodes,int st,int end)
    {
        if(st>end)
        {
            return null;
        }
        int mid=st+(end-st)/2;
        TreeNode root=new TreeNode(nodes.get(mid));
        root.left=createBST(nodes,st,mid-1);
        root.right=createBST(nodes,mid+1,end);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {

        ListNode temp=head;
        
        ArrayList<Integer> nodes=new ArrayList<>();
        
       
        while(temp!=null)
        {
           nodes.add(temp.val);
          
            temp=temp.next;
            
        }

        TreeNode root=createBST(nodes,0,nodes.size()-1);
        return root;
        
    }
}