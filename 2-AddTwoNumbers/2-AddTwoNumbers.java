// Last updated: 15/08/2026, 20:11:24
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // l1=reverse(l1);
        // l2=reverse(l2);
    //    if(l1.val==0 && l2.val==0)
    //    {
    //     return l1;
    //    }
    //     if(l1.val==0)
    //     {
    //         return l2;
    //     }
    //     if(l2.val==0)
    //     {
    //         return l1;
    //     }
         


        // int n1=0;
        // ListNode temp=l1;
        // int mul=1;
        // while(temp!=null)
        // {
        //    n1+=temp.val*mul;
        //    mul*=10;
        //    temp=temp.next;

        // }
        // int n2=0;
        // temp=l2;
        // mul=1;
        // while(temp!=null)
        // {
        //    n2+=temp.val*mul;
        //    mul*=10;
        //    temp=temp.next;

        // }
        // int n=n1+n2;
        // ListNode l3=new ListNode(-1);
        // ListNode temp2=l3;
        // while(n!=0)
        // {
        //     int num=n%10;
        //     ListNode newNode =new ListNode(num);
        //     newNode.next=l3;
        //     l3=newNode;
        //     n/=10;
        // }
        //  l3=reverse(l3);
        // return l3.next;

        ListNode l3=new ListNode(-1);
        ListNode temp=l1;
        ListNode temp2=l2;
        int n=0;
        int carry=0;
        while(temp!=null && temp2!=null)
        {
           n=temp.val+temp2.val;
           n+=carry;
           carry=0;
           if(n>9)
           {
            carry=1;
            ListNode newNode =new ListNode(n%10);
            newNode.next=l3;
            l3=newNode;
            temp=temp.next;
            temp2=temp2.next;
            continue;
           }
           ListNode newNode =new ListNode(n);
            newNode.next=l3;
            l3=newNode;
            temp=temp.next;
            temp2=temp2.next;

        }
        while( temp2!=null)
        {
           n=temp2.val;
           n+=carry;
           carry=0;
           if(n>9)
           {
            carry=1;
            ListNode newNode =new ListNode(n%10);
            newNode.next=l3;
            l3=newNode;
        
            temp2=temp2.next;
            continue;
           }
           ListNode newNode =new ListNode(n);
            newNode.next=l3;
            l3=newNode;
            
            temp2=temp2.next;

        }
        while(temp!=null )
        {
           n=temp.val;
           n+=carry;
           carry=0;
           if(n>9)
           {
            carry=1;
            ListNode newNode =new ListNode(n%10);
            newNode.next=l3;
            l3=newNode;
            temp=temp.next;
            
            continue;
           }
           ListNode newNode =new ListNode(n);
            newNode.next=l3;
            l3=newNode;
            temp=temp.next;
            

        }
        if(carry==1)
        {
            ListNode newNode =new ListNode(1);
            newNode.next=l3;
            l3=newNode;

        }
        l3=reverse(l3);
        return l3.next;




    }
}