// Last updated: 15/08/2026, 19:46:50
class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int x=0;x<k;x++)
            {
                for(int y=0;y<k;y++)
                    {
                        if(x==y)
                            continue;

                        int ops=0;

                        for(int i=0;i<n;i++)
                            {
                                int tar=(i%2==0)?x:y;
                                int rem=nums[i]%k;
                                int diff=Math.abs(rem-tar);
                                ops+=Math.min(diff,k-diff);
                            }
                        ans=Math.min(ans,ops);
                    }
            }

        return ans;
    }
}