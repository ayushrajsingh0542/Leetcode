// Last updated: 15/08/2026, 20:08:12
class Solution {
     public int largestRectangleArea(int[] heights) {
        int nsl[]=new int[heights.length];
        int nsr[]=new int[heights.length];
        int maxArea=0;
        Stack <Integer> s=new Stack<>();

        for(int i=heights.length-1;i>=0;i--)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i]=heights.length;
            }
            else
            {
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        s=new Stack<>();
        for(int i=0;i<heights.length;i++)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nsl[i]=-1;
            }
            else
            {
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<heights.length;i++)
        {
            int height=heights[i];
            int width=nsr[i]-nsl[i]-1;
            int area=height*width;
            maxArea=Math.max(area,maxArea);
        }

        return maxArea;
     }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0)
                {
                    if(matrix[i][j]=='1')
                    mat[i][j]=1;
                }
                else
                {
                    if(matrix[i][j]=='1')
                    {
                        mat[i][j]=mat[i-1][j]+1;
                    }
                }
            }
        }

        int maxArea=0;
        for(int arr[]:mat)
        {
            maxArea=Math.max(maxArea,largestRectangleArea(arr));
        }

        return maxArea;
    }
}