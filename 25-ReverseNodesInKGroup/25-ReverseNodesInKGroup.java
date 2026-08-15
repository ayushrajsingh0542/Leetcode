// Last updated: 15/08/2026, 20:10:30
/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static ListNode getKth(ListNode temp,int k)
    {
        while(temp!=null && k!=1)
        {
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode kth=getKth(temp,k);
            if(kth==null)
            {
                if(prev!=null)
                {
                    prev.next=temp;
                }
                break;
            }
            ListNode nextNode=kth.next;
            kth.next=null;
            reverse(temp);
            if(temp==head)
            {
                head=kth;
            }
            else
            {
                prev.next=kth;
            }
            prev=temp;
            temp=nextNode;
        }
        return head;
    }
}