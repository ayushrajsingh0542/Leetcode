// Last updated: 15/08/2026, 20:05:42
/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Boolean>map=new HashMap<>();
        ListNode temp=headA;
        while(temp!=null)
        {
            map.put(temp,true);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null)
        {
            if(map.containsKey(temp))
            return temp;
            temp=temp.next;
        }
        return null;

    }
}
