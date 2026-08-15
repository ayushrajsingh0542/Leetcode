// Last updated: 15/08/2026, 20:06:21
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int count=0;
        ListNode slow=head;
        ListNode fast=head;

        boolean cycle=false;//to detect cycle
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                cycle=true;
                break;
            }

        }

         if(cycle==false)
        {
           return null;//ie no cycle
        }

        slow=head;
        
        while(slow!=fast)
        {
            
            slow=slow.next;
            fast=fast.next;//abhi fast bhi sirf +1 hoga
        }

        return slow;
        
    }
}