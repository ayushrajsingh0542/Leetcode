// Last updated: 15/08/2026, 19:58:00
class Solution {
    public int[][] kClosest(int[][] points, int k) {

        int n=points.length;
        int m[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            m[i][0]=points[i][0];
            m[i][1]=points[i][1];
            int z=(points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
            m[i][2]=z;
        }
        Arrays.sort(m,Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            list.add(m[i][0]);
            list.add(m[i][1]);
        }
        int n2=list.size()/2;
        int ans[][]=new int[n2][2];
        int i=0;
        int j=0;
        while(i<list.size())
        {
            ans[j][0]=list.get(i);
            ans[j][1]=list.get(i+1);
            i+=2;
            j++;
        }
        return ans;
    }
}