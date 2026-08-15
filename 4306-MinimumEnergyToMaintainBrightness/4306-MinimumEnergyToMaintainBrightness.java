// Last updated: 15/08/2026, 19:46:41
class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        long time = 0;
        long start = intervals[0][0];
        long end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= end + 1) {
                end = Math.max(end, intervals[i][1]);
            } else {
                time += end - start + 1;
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        time += end - start + 1;

        int cover = Math.min(3, n);
        long bulbs = (brightness + cover - 1) / cover;

        return bulbs * time;
    }
}