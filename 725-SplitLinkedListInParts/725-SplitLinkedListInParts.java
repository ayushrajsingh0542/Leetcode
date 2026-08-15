// Last updated: 15/08/2026, 19:59:52
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size=0;
        ListNode temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        ListNode arr[]=new ListNode[k];
        if(size<k)
        {
            temp=head;
            for(int i=0;i<size;i++)
            {
               ListNode newNode=new ListNode(temp.val);
               arr[i]=newNode;
               temp=temp.next;
            }
        }

        if(size>=k)
        {
        int extra = size % k;
        int nsize = size / k;

        temp=head;
        int idx=0;
        while(temp!=null)
        {
            arr[idx++]=temp;
            int count=1;
            while(count!=nsize)
            {
                temp=temp.next;
                count++;
            }
            if(extra>0)
            {
                temp=temp.next;
                extra--;
            }
            ListNode newPart=temp.next;
            temp.next=null;
            temp=newPart;

        }
        }

        return arr;
    }
}