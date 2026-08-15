// Last updated: 15/08/2026, 19:54:46
class Solution {
    public int maxScore(int[] card, int k) {

        int lsum=0,rsum=0,max=0;
        for(int i=0;i<k;i++)
        lsum+=card[i];
        max=lsum;
        int rInd=card.length-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum-=card[i];
            rsum+=card[rInd];
            rInd--;
            max=Math.max(max,lsum+rsum);
        }

        return max;
    }

}