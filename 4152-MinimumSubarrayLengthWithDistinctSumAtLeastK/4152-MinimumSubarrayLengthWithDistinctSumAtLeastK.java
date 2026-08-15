// Last updated: 15/08/2026, 19:47:52
class Solution {
    public int minLength(int[] nums, int k) {
        int ans=Integer.MAX_VALUE;
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int l=0,r=0;
        while(r<nums.length)
            {
                int x=nums[r];
                map.put(x,map.getOrDefault(x,0)+1);
                if(map.get(x)==1)
                    sum+=x;
                while(sum>=k)
                    {
                        ans=Math.min(ans,r-l+1);
                        int y=nums[l];
                        map.put(y,map.get(y)-1);
                        if(map.get(y)==0)
                        {
                            map.remove(y);
                            sum-=y;
                        }
                        l++;
                    }
                r++;
            }
        if(ans==Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}