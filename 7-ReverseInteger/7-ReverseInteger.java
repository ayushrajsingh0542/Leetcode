// Last updated: 15/08/2026, 20:11:12
class Solution {
    public int reverse(int x) {
        long num=0;
        int sign=x<0?-1:1;
        if(x<0)
        x*=-1;
        while(x>0)
        {
            int n=x%10;
            num=num*10+n;
            x/=10;
        }
        num=num*sign;
        if(num<Integer.MIN_VALUE || num>Integer.MAX_VALUE)
        {
            return 0;
        }
        return (int)num;
        
    }
}