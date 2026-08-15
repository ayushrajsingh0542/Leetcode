// Last updated: 15/08/2026, 19:53:38
class Solution {
    public int minPartitions(String n) {
        int ans=0;
        for(char ch:n.toCharArray())
        {
            int num=ch-'0';
            ans=Math.max(ans,num);
        }
        return ans;
        
    }
}