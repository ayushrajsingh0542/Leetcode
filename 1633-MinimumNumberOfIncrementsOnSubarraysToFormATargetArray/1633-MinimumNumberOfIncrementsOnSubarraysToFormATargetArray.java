// Last updated: 15/08/2026, 19:54:26
class Solution {
    public int minNumberOperations(int[] target) {
        int ans=target[0];
        for(int i=1;i<target.length;i++)
        {
            if(target[i]-target[i-1]>0)
            ans+=target[i]-target[i-1];
        }
        return ans;
    }
}