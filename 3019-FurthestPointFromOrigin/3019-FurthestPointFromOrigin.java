// Last updated: 15/08/2026, 19:51:00
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count=0;
        int ans=0;
        for(char ch:moves.toCharArray())
        {
            if(ch=='L')
            ans--;
            else if(ch=='R')
            ans++;
            else
            count++;
        }
        return Math.abs(ans)+count;
    }
}