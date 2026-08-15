// Last updated: 15/08/2026, 20:10:31
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
    public ListNode swapPairs(ListNode head) {

        if(head==null||head.next==null)
        {
            return head;
        }

        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.next!=null)
            {
                int x=temp.val;
                temp.val=temp.next.val;
                temp.next.val=x;
            }
            if(temp.next==null)
            {
                temp=temp.next;
                continue;
            }
            temp=temp.next.next;
        }

        return head;
        
    }
}