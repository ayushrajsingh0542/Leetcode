// Last updated: 15/08/2026, 19:47:43
class Solution {
    public boolean ok(int nums[], int mid) {
        long ops = 0;
        for (int x : nums) {
            ops += (int)Math.ceil((double)x / mid);
            if (ops > (long)mid * mid)
                return false;
        }
        return true;
    }

    public int minimumK(int[] nums) {
        int low = 1, high = nums.length;
        for (int i = 0; i < nums.length; i++) {
            high = Math.max(high, nums[i]); 
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ok(nums, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
