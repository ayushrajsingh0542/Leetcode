// Last updated: 15/08/2026, 19:55:21
class Solution {
    public int bits(int n)
    {
        int ans=0;
        while(n!=0)
        {
            if((n&1)==1)
            ans++;
            n>>=1;
        }
        return ans;
    }
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        int nums[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            nums[i][0]=bits(arr[i]);
            nums[i][1]=arr[i];
        }
        Arrays.sort(nums,(a,b)->{
            if(a[0]!=b[0])
            return Integer.compare(a[0],b[0]);
            else 
            return Integer.compare(a[1],b[1]);
        });

        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        ans[i]=nums[i][1];
        return ans;
    }
}