// Last updated: 15/08/2026, 20:03:00
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
   
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ArrayList<Integer> all=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            all.add(temp.val);
            if(temp.next==null)
            {
                break;
            }
            temp=temp.next.next;
        }
        temp=head.next;
         while(temp!=null)
        {
            all.add(temp.val);
            if(temp.next==null)
            {
                break;
            }
            temp=temp.next.next;
        }
        temp=head;
      for(int i=0;i<all.size();i++)
      {
        temp.val=all.get(i);
        temp=temp.next;
         
      }
     
      return head;


        
    }
}