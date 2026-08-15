// Last updated: 15/08/2026, 19:54:17
class Solution {
    private int solve(int n,int k)
    {
        if(n==1 || k==1)
          return 0;
        int length=(1<<n)-1;
        int mid=length/2;
        int ind=k-1;
        if(mid==ind)
        {
            return 1;
        }
        if(ind<mid)
        {
            return solve(n-1,k);
        }
        else
        {
            return solve(n-1,length-k+1)==1?0:1;
        }
    }
    public char findKthBit(int n, int k) {
        int ans=solve(n,k);
        return ans==1 ? '1' : '0';
    }
    
}