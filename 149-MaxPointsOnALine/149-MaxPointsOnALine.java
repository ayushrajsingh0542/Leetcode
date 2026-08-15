// Last updated: 15/08/2026, 20:06:02
class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        int ans = 1;

        for (int i = 0; i < n; i++) {
            HashMap<Double, Integer> map = new HashMap<>();

            for (int j = i + 1; j < n; j++) {
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];

                double slope;

                if (x2 - x1 == 0)
                    slope = Double.MAX_VALUE;
                else if (y2 - y1 == 0)
                    slope = 0;
                else
                    slope = (double)(y2 - y1) / (x2 - x1);

                map.put(slope, map.getOrDefault(slope, 0) + 1);

                ans = Math.max(ans, map.get(slope) + 1);
            }
        }

        return ans;
    }
}