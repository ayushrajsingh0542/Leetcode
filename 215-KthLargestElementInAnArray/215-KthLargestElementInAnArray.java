// Last updated: 15/08/2026, 20:04:19
class Solution {
    public class Info implements Comparable<Info>
    {
        int num;
        Info(int n)
        {
            this.num=n;
        }
        @Override
        public int compareTo(Info p2)
        {
            return p2.num-this.num;
        }
    }
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Info>pq=new PriorityQueue<>();
        for(int n:nums)
        {
            pq.add(new Info(n));
        }
        int ans=0;
        while(k!=0)
        {
            Info curr=pq.remove();
            ans=curr.num;
            k--;
        }
        return ans;
    }
}