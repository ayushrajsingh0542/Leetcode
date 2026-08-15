// Last updated: 15/08/2026, 19:50:24
class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        Arrays.sort(h);
        int i=h.length-1;
        long ans=0;
        int m=0;
        while(k!=0)
        {
            int num=h[i];
            num=num-m;
            if(num<0)
            num=0;
            ans+=num;
            m++;
            i--;
            k--;
        }
        return ans;
    }
}