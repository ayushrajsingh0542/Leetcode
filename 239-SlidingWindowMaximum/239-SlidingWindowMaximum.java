// Last updated: 15/08/2026, 20:03:38
class Solution {

    static class Pairs implements Comparable<Pairs>
    {
        int val;
        int idx;
        Pairs(int val,int idx)
        {
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Pairs p2)
        {
            return p2.val-this.val;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {

        
        
        int n=nums.length;
        int ans[]=new int[n-k+1];
        PriorityQueue<Pairs>pq=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(new Pairs(nums[i],i));
        }
        ans[0]=pq.peek().val;
        for(int i=k;i<n;i++)
        {
            while(pq.size()>0 && pq.peek().idx<=(i-k))
            {
                pq.remove();
            }
            pq.add(new Pairs(nums[i],i));
            ans[i-k+1]=pq.peek().val;
        }

        return ans;
    }
}