// Last updated: 15/08/2026, 19:51:47
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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        int sz=(m*n)-list.size();
        if(sz>0)
        {
            for(int i=1;i<=sz;i++)
            {
                list.add(-1);
            }
        }

        int mt[][]=new int[m][n];
        ArrayList<Integer> list2=new ArrayList<>();

        int sr=0,sc=0;
        int ec=n-1;
        int er=m-1;
        int j=0;
        int s=m*n;
        int num=0;
        while(true)
        {
            if(list2.size()==s)
            break;
            
           for(int i=sc;i<=ec;i++)
           {
            list2.add(num);
            mt[sr][i]=list.get(num);
            num+=1;
           }
           sr+=1;
           if(list2.size()==s)
            break;
           for(int i=sr;i<=er;i++)
           {
            list2.add(num);
            mt[i][ec]=list.get(num);
            num+=1;
           }
           ec-=1;
           if(list2.size()==s)
            break;
           for(int i=ec;i>=j;i--)
           {
            list2.add(num);
            mt[er][i]=list.get(num);
            num+=1;
           }
           er-=1;
           if(list2.size()==s)
            break;
           for(int i=er;i>=sr;i--)
           {
            list2.add(num);
            mt[i][j]=list.get(num);
            num+=1;
           }
           
           sc+=1;
           j+=1;
           if(list2.size()==s)
            break;
        }
        return mt;
        
    }
}