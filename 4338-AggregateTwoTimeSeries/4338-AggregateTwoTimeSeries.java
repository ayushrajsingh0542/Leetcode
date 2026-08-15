// Last updated: 15/08/2026, 19:46:22
class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {


       int i = 0;
        int j = 0;

        List<List<Integer>> answer = new ArrayList<>();

        while (i < series1.length || j < series2.length) {

            int timestamp;

            if (i == series1.length) {
                timestamp = series2[j][0];
            } else if (j == series2.length) {
                timestamp = series1[i][0];
            } else {
                timestamp = Math.min(series1[i][0], series2[j][0]);
            }

            int value1 = 0;
            if (i < series1.length && series1[i][0] == timestamp) {
                value1 = series1[i][1];
                i++;
            } else if (i < series1.length) {
                value1 = series1[i][1];
            }

            int value2 = 0;
            if (j < series2.length && series2[j][0] == timestamp) {
                value2 = series2[j][1];
                j++;
            } else if (j < series2.length) {
                value2 = series2[j][1];
            }

            answer.add(Arrays.asList(timestamp, value1 + value2));
        }

        return answer;


        
    }
}