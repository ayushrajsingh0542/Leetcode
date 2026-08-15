// Last updated: 15/08/2026, 19:57:28
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
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        int nxt[]=new int[list.size()];
        for(int i=list.size()-1;i>=0;i--)
        {
            while(!s.isEmpty()&&s.peek()<=list.get(i))
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nxt[i]=0;
            }
            else
            {
                nxt[i]=s.peek();
            }
            s.push(list.get(i));
        }
        return nxt;
    }
}