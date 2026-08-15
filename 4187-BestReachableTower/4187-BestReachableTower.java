// Last updated: 15/08/2026, 19:47:34
class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int cx=center[0];
        int cy=center[1];

        Arrays.sort(towers,(a,b)->{
            if(a[2]!=b[2])
                return Integer.compare(b[2],a[2]);
             if(a[0]!=b[0])
                 return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
        });

        for(int t[]:towers)
            {
                int d=Math.abs(t[0]-cx)+Math.abs(t[1] - cy);
                if(d<=radius)
                    return new int[]{t[0],t[1]};
            }

        return new int[]{-1,-1};
    }
}