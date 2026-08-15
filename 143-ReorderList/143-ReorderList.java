// Last updated: 15/08/2026, 20:06:18
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
class Solution {
   
    public static void reorder(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid= slow;
        ListNode lh=head;
        
        
        ListNode curr=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode rh=prev;
         ListNode nextL, nextR;
        while(lh!=null && rh!=null)
        {
            nextL=lh.next;
            lh.next=rh;
            nextR=rh.next;
            rh.next=nextL;

            lh=nextL;
            rh=nextR;
        }
       
    }
    public static void zigzag(ListNode lh,ListNode rh)
    {
       

        
    }
    public void reorderList(ListNode head) {
        reorder(head);
        
    }
}