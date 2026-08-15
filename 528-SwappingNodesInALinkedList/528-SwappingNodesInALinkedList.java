// Last updated: 15/08/2026, 20:01:45
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
    public ListNode swapNodes(ListNode head, int k) {
        int size=1;
        ListNode temp=head;
        ListNode first=null;
        while(temp!=null)
        {
            if(size==k)
            {
                first=temp;
            }
            size++;
            temp=temp.next;
        }
        ListNode sec=null;
        temp=head;
        int count=1;
        while(temp!=null)
        {
            if(count==(size-k))
            {
                sec=temp;
                break;
            }
            temp=temp.next;
            count++;
        }
        int t=first.val;
        first.val=sec.val;
        sec.val=t;
        return head;
    }
}