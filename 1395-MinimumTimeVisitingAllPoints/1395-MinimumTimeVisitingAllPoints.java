// Last updated: 15/08/2026, 19:55:46
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int lastx=points[0][0];
        int lasty=points[0][1];
        boolean flag=false;
        int ans=0;
        for(int arr[]:points)
        {
           if(!flag)
           {
            flag=true;
            continue;
           }
           int currx=arr[0];
           int curry=arr[1];
           while(currx!=lastx || curry!=lasty)
           {
            if(currx>lastx && curry>lasty)
            {
                lastx++;
                lasty++;
                ans++;
            }
            else if(currx>lastx && curry<lasty)
            {
                lastx++;
                lasty--;
                ans++;
            }
            else if(currx<lastx && curry>lasty)
            {
                lastx--;
                lasty++;
                ans++;
            }
            else if(currx==lastx && curry>lasty)
            {
                lasty++;
                ans++;
            }
            else if(currx==lastx && curry<lasty)
            {
                lasty--;
                ans++;
            }
            else if(currx>lastx && curry==lasty)
            {
                lastx++;
                ans++;
            }
            else if(currx<lastx && curry==lasty)
            {
                lastx--;
                ans++;
            }
            else
            {
                lastx--;
                lasty--;
                ans++;
            }
           }
        }
        return ans;
    }
}