// Last updated: 15/08/2026, 20:08:02
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count =1;
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(count>=left && count<=right)
            {
                list.add(temp.val);
            }
            count++;
            temp=temp.next;
        }
        temp=head;
        int x=list.size()-1;
        count=1;
        while(temp!=null)
        {
            if(count>=left && count<=right)
            {
                temp.val=list.get(x);
                x--;
            }
            count++;
            temp=temp.next;
            
        }
        return head;
    }
}