// Last updated: 15/08/2026, 19:52:15
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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        temp=head;
        int max=0;
        int ans[]=new int[n];
        int i=0;
        while(temp!=null)
        {
            ans[i]=temp.val;
            temp=temp.next;
            i++;
        }
        for(i=0;i<n/2;i++)
        {
            int sum=ans[i]+ans[n-1-i];
            max=Math.max(sum,max);
        }
        return max;
        
    }
}