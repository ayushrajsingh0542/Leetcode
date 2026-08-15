// Last updated: 15/08/2026, 19:53:52
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode temp=list1;
        int i=1;
        while(i<a)
        {
            temp=temp.next;
            i++;
        }
        ListNode temp2=list1;
        i=1;
        while(i<=b)
        {
            temp2=temp2.next;
            i++;
        }
        ListNode end2=list2;
        while(end2.next!=null)
        {
            end2=end2.next;
        }
        temp.next=list2;
        end2.next=temp2.next;
        temp2.next=null;
        return list1;

        
    }
}