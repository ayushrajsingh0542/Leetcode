// Last updated: 15/08/2026, 20:06:06
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
    public ListNode insertionSortList(ListNode head) {

        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        for(int i=0;i<list.size();i++)
        {
            int j=i;
            while(j>0 && list.get(j-1)>list.get(j))
            {
                int temp2=list.get(j);
                list.set(j,list.get(j-1));
                list.set(j-1,temp2);
                j--;
            }
        }
        temp=head;
        int i=0;
        while(temp!=null)
        {
            temp.val=list.get(i);
            i++;
            temp=temp.next;
        }
        return head;
        
    }
}