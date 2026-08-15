// Last updated: 15/08/2026, 20:10:48
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int l = j + 1;
                int k = n - 1;

                while (l < k) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[k];

                    if (sum < target) {
                        l++;
                    } else if (sum > target) {
                        k--;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[k]);
                        ans.add(list);

                        l++;
                        k--;

                        while (l < k && nums[l] == nums[l - 1]) l++;
                        while (l < k && nums[k] == nums[k + 1]) k--;
                    }
                }
            }
        }

        return ans;
    }
}
