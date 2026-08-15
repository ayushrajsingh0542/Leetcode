// Last updated: 15/08/2026, 19:51:31
class Solution {
    public int bestClosingTime(String str) {
        int n=str.length();
        int arr[]=new int[n];
        int total=0;
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(ch=='Y')
            {
            arr[i]=1;
            total++;
            }

        }

        int max=total;
        int pos=0;
        for(int i=0;i<n;i++)
        {
            if(total<max)
            {
             max=total;
             pos=i;
            }
            else if(total==max)
            {
                pos=Math.min(pos,i);
            }
            if(str.charAt(i)=='N')
            total++;
            else
            total--;
        }

        if(total<max)
            {
             max=total;
             pos=n;
            }
            

        return pos;


    }
}