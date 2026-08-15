// Last updated: 15/08/2026, 19:53:32
class Solution {
    public int totalMoney(int n) {
        if(n<=7)
        return (n*(n+1))/2;
       
        int adder=0,ans=0,counter=0;
        for(int i=1;i<=n;i++)
        {
            ans+=(i-counter)+adder;
            adder=i/7;
            if(i%7==0)
            counter+=7;
        }

        return ans;
    }
}