// Last updated: 15/08/2026, 19:54:10
class Solution {
    public int minCost(String colors, int[] arr) {
        int l=0,r=1;
        int count=0;
        while(r<colors.length())
        {
            char ch1=colors.charAt(l);
            char ch2=colors.charAt(r);
            if(ch1==ch2)
            {
                if(arr[l]<arr[r])
                {
                    count+=arr[l];
                    l=r;
                    r++;
                }
                else
                {
                    count+=arr[r];
                    r++;
                }
            }
            else
            {
              l=r;
              r++;
            }
        }
        return count;
    }
}