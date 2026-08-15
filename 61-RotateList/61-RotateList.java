// Last updated: 15/08/2026, 20:09:08
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)
        {
            return head;
        }
        

        int size=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        if(size==k)
        {
            return head;
        }
        if(k>size)
        k=k%size;
        ListNode endNode=head;
        while(endNode.next!=null)
        {
            endNode =endNode.next;
        }
        int curr=size-k;
        temp=head;
        for(int i=1;i<curr;i++)
        {
            temp=temp.next;
        }
        endNode.next=head;
        head=temp.next;
        temp.next=null;
        return head;

        
    }
}