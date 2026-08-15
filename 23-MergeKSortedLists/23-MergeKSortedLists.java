// Last updated: 15/08/2026, 20:10:34
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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode temp=lists[i];
            while(temp!=null)
            {
                list.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(list);
        ListNode head=new ListNode(-1);
        ListNode temp=head;
        for(int i=0;i<list.size();i++)
        {
          ListNode newNode =new ListNode(list.get(i));
          temp.next=newNode;
          temp=newNode;;
        }
  
        return head.next;
    }
}