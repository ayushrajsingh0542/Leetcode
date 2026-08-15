// Last updated: 15/08/2026, 19:46:15
class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n = monsters.length;

        long[] diff = new long[n + 1];
        for (int[] boost : boosts) {
            diff[boost[0]] += boost[2];
            if (boost[1] + 1 < diff.length) {
                diff[boost[1] + 1] -= boost[2];
            }
        }

        long[] bonus = new long[n];
        long current = 0;
        for (int i = 0; i < n; i++) {
            current += diff[i];
            bonus[i] = current;
        }

        long low = 0;
        long high = 0;
        for (int monster : monsters) {
            high += monster;
        }

        while (low < high) {
            long mid = low + (high - low) / 2;

            if (canDefeat(mid, monsters, bonus)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canDefeat(long strength, int[] monsters, long[] bonus) {
        long current = strength;

        for (int i = 0; i < monsters.length; i++) {
            if (current + bonus[i] < monsters[i]) {
                return false;
            }

            current -= monsters[i];
            if (current < 0) {
                current = 0;
            }
        }

        return true;
    }
}