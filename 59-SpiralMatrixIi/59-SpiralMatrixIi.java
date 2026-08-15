// Last updated: 15/08/2026, 20:09:10
class Solution {
    public int[][] generateMatrix(int n) {

        int m[][]=new int[n][n];
        ArrayList<Integer> list=new ArrayList<>();

        int sr=0,sc=0;
        int ec=n-1;
        int er=n-1;
        int j=0;
        int s=n*n;
        int num=0;
        while(true)
        {
            if(list.size()==s)
            break;
            num+=1;
           for(int i=sc;i<=ec;i++)
           {
            list.add(num);
            m[sr][i]=num;
            num+=1;
           }
           sr+=1;
           if(list.size()==s)
            break;
           for(int i=sr;i<=er;i++)
           {
            list.add(num);
            m[i][ec]=num;
            num+=1;
           }
           ec-=1;
           if(list.size()==s)
            break;
           for(int i=ec;i>=j;i--)
           {
            list.add(num);
            m[er][i]=num;
            num+=1;
           }
           er-=1;
           if(list.size()==s)
            break;
           for(int i=er;i>=sr;i--)
           {
            list.add(num);
            m[i][j]=num;
            num+=1;
           }
           num-=1;
           sc+=1;
           j+=1;
           if(list.size()==s)
            break;
        }
        // int x=0;
        // for(int i=0;i<n;i++)
        // {
        //     for(int k=0;k<n;k++)
        //     {
        //         m[i][k]=list.get(x);
        //         x++;
        //     }
        // }
        return m;
    }
}