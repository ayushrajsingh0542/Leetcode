// Last updated: 15/08/2026, 20:02:49
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        List<Integer>ans=new ArrayList<>();
        Arrays.sort(nums);
        int hash[]=new int[n];
        int max[]=new int[n];
        Arrays.fill(max,1);
        for(int i=0;i<n;i++)
        {
            hash[i]=i;
            for(int prev=0;prev<i;prev++)
            {
                if((nums[i]%nums[prev]==0) && (1+max[prev]>max[i]))
                {
                    max[i]=1+max[prev];
                    hash[i]=prev;
                }
            }
        }


        int maxi=0;
        for(int i=0;i<n;i++)
        {
            if(max[i]>max[maxi])
            {
               maxi=i;
            }
        }

        while(maxi!=hash[maxi])
        {
            ans.add(nums[maxi]);
            maxi=hash[maxi];
        }
        ans.add(nums[maxi]);
        Collections.reverse(ans);
        return ans;


    }
}