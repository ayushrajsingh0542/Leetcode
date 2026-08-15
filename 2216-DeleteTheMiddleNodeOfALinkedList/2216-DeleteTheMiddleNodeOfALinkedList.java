// Last updated: 15/08/2026, 19:52:25
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
    public ListNode deleteMiddle(ListNode head) {
        // ListNode temp=head;
        // int size=0;
        // while(temp!=null)
        // {
        //     temp=temp.next;
        //     size++;
        // }
        // if(size==1)
        // {
        //     head=null;
        //     return head;
        // }
        // ListNode slow=head;
        // ListNode fast=head.next;
        // if(size%2==0)
        // {
        //     while(fast!=null && fast.next!=null)
        // {
        //     slow=slow.next;
        //     fast=fast.next.next;
            
        // }
        // slow.next=slow.next.next;
        
       
        
        // return head;

        // }
        //  while( fast.next.next!=null)
        // {
        //     slow=slow.next;
        //     fast=fast.next.next;
            
        // }
        
         
        //  slow.next=slow.next.next;
        //     return head;
        if(head==null||head.next==null)
        {
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast=fast.next.next;
        }
        prev.next=prev.next.next;
        
        return head;
       
            
        
    }
}