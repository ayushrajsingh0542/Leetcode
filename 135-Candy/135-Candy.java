// Last updated: 15/08/2026, 20:06:33
class Solution {
    public int candy(int[] ratings) {
       //your code goes here
       if(ratings.length==1)
       {
        return 1;
       }
       if(ratings.length==2)
       {
        if(ratings[0]>ratings[1] || ratings[1]>ratings[0])
        return 3;
        return 2;
       }
       else{
       int left[]=new int[ratings.length];
       int right[]=new int[ratings.length];
       Arrays.fill(left,1);
       Arrays.fill(right,1);
       int ans[]=new int[ratings.length];
       for(int i=1;i<ratings.length;i++)
       {
        if(ratings[i]>ratings[i-1])
        left[i]=left[i-1]+1;
       }
       for(int i=ratings.length-2;i>=0;i--)
       {
        if(ratings[i]>ratings[i+1])
        right[i]=right[i+1]+1;
       }
       for(int i=0;i<ratings.length;i++)
       {
        ans[i]=Math.max(left[i],right[i]);
       }
       int sum=0;
       for(int i:ans)
       {
       sum+=i;
       }
       return sum;
       }
    }
        
    }
