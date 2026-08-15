// Last updated: 15/08/2026, 20:11:03
class Solution {
    public int maxArea(int[] height) {
        int n=0;
        int m=height.length-1;
        int maxn=0;
        int maxm=height.length-1;
        int leftmax=-1;
        int rightmax=-1;
        int maxwater=-1;
        int water=1;
        int dist=0;
        int minheight=100000;
        int minht1=-1;
        int water1=0;
        int minht2=-1;
        int water2=0;
        while(n<m){

            leftmax=Math.max(leftmax,height[n]);
            rightmax=Math.max(rightmax,height[m]);
            dist=m-n;
            minheight=Math.min(leftmax,rightmax);
            water=minheight*dist;
            maxwater=Math.max(maxwater,water);




           if (height[n] < height[m]) {
              n++;
            } else {
                m--;
            }
            

        }
        return maxwater;
        
    }
}