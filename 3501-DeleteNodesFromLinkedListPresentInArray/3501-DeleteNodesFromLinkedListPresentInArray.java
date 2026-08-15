// Last updated: 15/08/2026, 19:50:18
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
    public static ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        set.add(i);
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
          if(!set.contains(temp.val))
          {
            list.add(temp.val);
          }
          temp=temp.next;
        }
        ListNode l2=new ListNode(-1);
        for(int i=0;i<list.size();i++)
        {
            ListNode newNode=new ListNode(list.get(i));
            newNode.next=l2;
            l2=newNode;
            
        }
        l2=reverse(l2);
        return l2.next;
    }
}