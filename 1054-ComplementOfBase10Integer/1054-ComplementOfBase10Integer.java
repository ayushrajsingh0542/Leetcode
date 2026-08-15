// Last updated: 15/08/2026, 19:57:35
class Solution {
    public int bitwiseComplement(int n) {
        String ans="";
        if(n==0)
        return 1;
        else if(n==1)
        return 0;
        while(n!=0)
        {
            int num=n&1;
            if(num==1)
            ans="0"+ans;
            else
            ans="1"+ans;
            n>>=1;
        }
        return Integer.parseInt(ans,2);

    }
}