// Last updated: 15/08/2026, 19:49:49
class Solution {
    public double areaBelow(double mid,int[][] squares)
    {
        double area=0;
        for(int sqr[]:squares)
        {
            double len=sqr[2];
            double y=sqr[1];
            if(y+len<=mid)
            {
                area+=len*len;
            }
            else if((y<mid) && (y+len>mid))
            {
                area+=len*(mid-y);
            }
        }
        return area;
    }
    public double separateSquares(int[][] squares) {

        double min=Integer.MAX_VALUE;
        double max=Integer.MIN_VALUE;
        double totAr=0;
        for(int sqr[]:squares)
        {
            double len=sqr[2];
            totAr+=len*len;
            min=Math.min(min,sqr[1]);
            max=Math.max(max,sqr[1]+len);
        }
        double tar=totAr/2;
        double low=min,high=max;
        while(high-low>Math.pow(10,-5))
        {
            double mid=(low+high)/2;
            if(areaBelow(mid,squares)<tar)
            {
                low=mid;
            }
            else
            {
                high=mid;
            }
        }
        return low;
        
    }
}