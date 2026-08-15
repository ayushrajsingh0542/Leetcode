// Last updated: 15/08/2026, 19:48:41
class Solution {
    public long splitArray(int[] nums) {
        long ans = -1;
        List<Long> pre = new ArrayList<>();
        List<Long> suff = new ArrayList<>();

        // build strictly increasing prefix sums
        pre.add((long) nums[0]);
        long sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
                pre.add(sum);
            } else {
                break;
            }
        }

        // build strictly decreasing suffix sums (from end)
        suff.add((long) nums[nums.length - 1]);
        sum = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                sum += nums[i];
                suff.add(sum);
            } else {
                break;
            }
        }
        Collections.reverse(suff); // align order with original array

        int n = nums.length;
        int p = pre.size();
        int m = suff.size();
        int offset = n - m; // starting index in array that suff.get(0) corresponds to

        long diff = (long) 1e18;
        boolean valid = false;

        // for each prefix end i (0..p-1), find suff index j such that suffix starts at i+1:
        for (int i = 0; i < p; i++) {
            int j = (i + 1) - offset;
            if (j >= 0 && j < m) {
                valid = true;
                diff = Math.min(diff, Math.abs(pre.get(i) - suff.get(j)));
            }
        }

        return valid ? diff : -1;
    }
}
