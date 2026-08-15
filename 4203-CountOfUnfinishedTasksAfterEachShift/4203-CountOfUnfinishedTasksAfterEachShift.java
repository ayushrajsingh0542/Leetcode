// Last updated: 15/08/2026, 19:47:23
class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n = tasks.length;
        int m = shifts.length;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + tasks[i];
        }

        long total = prefix[n];
        int[] ans = new int[m];

        long done = 0;

        for (int i = 0; i < m; i++) {
            done += shifts[i];

            if (done >= total) {
                ans[i] = 0;
                done = 0;
                continue;
            }

            int completed = upperBound(prefix, done) - 1;
            ans[i] = n - completed;
        }

        return ans;
    }

    private int upperBound(long[] prefix, long target) {
        int left = 0;
        int right = prefix.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefix[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}