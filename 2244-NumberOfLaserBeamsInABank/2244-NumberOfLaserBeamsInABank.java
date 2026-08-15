// Last updated: 15/08/2026, 19:52:11
class Solution {
    public int numberOfBeams(String[] bank) {
        int curr_c=0;
        int n=bank.length;
        
        int ans=0;
        for(int i=0;i<n;i++)
        {
            String str=bank[i];
            int sum=0;
            for(int j=0;j<str.length();j++)
            {
                char ch=str.charAt(j);
                if(ch=='1')
                sum++;
            }
            if(sum>0)
            {
                ans+=curr_c*sum;
                curr_c=sum;
            }
        }

        return ans;
    }
}