// Last updated: 15/08/2026, 20:09:14
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> mainL=new ArrayList<>();
        int n=intervals.length;
        int i=0;
        while(i<n && intervals[i][1]<newInterval[0])
        {
            List<Integer> list=new ArrayList<>();
            list.add(intervals[i][0]);
            list.add(intervals[i][1]);
            mainL.add(list);
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1])
        {
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        List<Integer> list2=new ArrayList<>();
            list2.add(newInterval[0]);
            list2.add(newInterval[1]);
            mainL.add(list2);
        
        while(i<n)
        {
            List<Integer> list=new ArrayList<>();
            list.add(intervals[i][0]);
            list.add(intervals[i][1]);
            mainL.add(list);
            i++;
        }
        int ans[][]=new int[mainL.size()][2];
        for(int j=0;j<mainL.size();j++)
        {
            List<Integer> list=mainL.get(j);
            ans[j][0]=list.get(0);
            ans[j][1]=list.get(1);
        }
        return ans;
    }
}