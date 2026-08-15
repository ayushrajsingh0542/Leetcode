// Last updated: 15/08/2026, 19:48:49
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        return Math.min(calculateTime(landStartTime, landDuration, waterStartTime, waterDuration),
                calculateTime(waterStartTime, waterDuration, landStartTime, landDuration));
    }
    public int calculateTime(int[] firstStartTime, int[] firstDuration, int[] secondStartTime, int[] secondDuration) {
        int firstFinish = Integer.MAX_VALUE;
        for (int i = 0; i < firstStartTime.length; i++) {
            firstFinish = Math.min(firstFinish, firstStartTime[i] + firstDuration[i]);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < secondStartTime.length; i++) {
            min = Math.min(min, Math.max(firstFinish, secondStartTime[i]) + secondDuration[i]);
        }
        return min;
    }
}