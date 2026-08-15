// Last updated: 15/08/2026, 19:59:08
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
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp=head;
        int count=0;
        boolean flag=false;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        while(temp!=null)
        {
          if(set.contains(temp.val) && !flag)
          {
            count++;
            flag=true;
          }
          else if(!set.contains(temp.val))
          {
            flag=false;
          }
          temp=temp.next;
        }

        return count;
    }
}