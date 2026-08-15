// Last updated: 15/08/2026, 20:09:17
class Solution {
    public int[][] merge(int[][] Intervals) {
        Arrays.sort(Intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int n = Intervals.length;
        List<int[]> merged = new ArrayList<>();

     
        int first = Intervals[0][0];
        int second = Intervals[0][1];

        for (int i = 1; i < n; i++) {
            int currfirst = Intervals[i][0];
            int currsecond = Intervals[i][1];
            if(currfirst <= second){
                second = Math.max(currsecond, second);
            }
            else{
                merged.add(new int[]{first, second});
                first = currfirst;
                second = currsecond;
            }
        }
        merged.add(new int[]{first, second});
        return merged.toArray(new int[merged.size()][]);
        
    }
}