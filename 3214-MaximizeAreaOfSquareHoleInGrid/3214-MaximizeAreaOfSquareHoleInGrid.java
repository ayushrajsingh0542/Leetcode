// Last updated: 15/08/2026, 19:50:47
class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int vcon=1,hcon=1;
        int vtemp=1,htemp=1;

        for(int i=1;i<hBars.length;i++){
            if(hBars[i]==hBars[i-1]+1)
             htemp++;
            else{
                hcon=Math.max(hcon,htemp);
                htemp=1;
            }
        }
        hcon=Math.max(hcon,htemp);

        for(int i=1;i<vBars.length;i++){
            if(vBars[i]==vBars[i-1]+1) 
            vtemp++;
            else{
                vcon=Math.max(vcon,vtemp);
                vtemp=1;
            }
        }
        vcon=Math.max(vcon,vtemp);

        int side=Math.min(vcon,hcon)+1;
        return side*side;
    }
}
