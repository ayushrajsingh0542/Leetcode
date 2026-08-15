// Last updated: 15/08/2026, 20:09:38
class Solution {
    public void rotate(int[][] mt) {

        int n=mt.length;
        int x=(int)(Math.floor(n/2));
        int count=0;
        int a=0;
        int a1=0;
        int b=0;
        int b1=0;
        int c=n-1;
        int c1=n-1;
        int d=n-1;
        int d1=0;
        while(count!=x)
        {

        
        
        
        while(a!=n-1)
        {
            int temp1=mt[a1][a];
            int temp2=mt[b][n-1];
            int temp3=mt[n-1][c];
            int temp4=mt[d][d1];
            mt[b][n-1]=temp1;
            mt[n-1][c]=temp2;
            mt[d][d1]=temp3;
            mt[a1][a]=temp4;
            a++;
            b++;
            c--;
            d--;
        }
         n--;
        a1++;
        a=a1;
        b1++;
        b=b1;
        c1--;
        c=c1;
        d1++;
        d=n-1;
         count++;
        
    }

   
    }

    }