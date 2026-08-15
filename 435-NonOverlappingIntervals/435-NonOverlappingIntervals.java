// Last updated: 15/08/2026, 20:02:18
class Solution {
    public int eraseOverlapIntervals(int[][] intr) {
        
        int count=0;
        Arrays.sort(intr,Comparator.comparingDouble(o->o[1]));
        int end=intr[0][1];
        for(int i=1;i<intr.length;i++)
        {
            if(intr[i][0]<end)
            {
                count++;
            }
            else
            {
                end=intr[i][1];
            }
        }
        return count;
    }
}