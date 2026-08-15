// Last updated: 15/08/2026, 19:54:34
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> list = new ArrayList<>();

        // Generate all subarray sums
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                list.add(sum);
            }
        }

        // Sort all subarray sums
        Collections.sort(list);

        // Calculate the range sum
        int result = 0;
        int mod = 1_000_000_007;
        for (int i = left - 1; i < right; i++) {
            result = (result + list.get(i)) % mod;
        }

        return result;
    }
}
