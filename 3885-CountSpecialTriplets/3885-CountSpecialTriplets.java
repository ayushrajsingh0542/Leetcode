// Last updated: 15/08/2026, 19:49:15
class Solution {
    public int specialTriplets(int[] nums) {
        HashMap<Integer,Integer> left = new HashMap<>();
        HashMap<Integer,Integer> right = new HashMap<>();
        long c = 0;
        int mod = (int)(1e9 + 7);

        for(int i = 0; i < nums.length; i++)
            right.put(nums[i], right.getOrDefault(nums[i], 0) + 1);

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];

            int val = right.get(num);
            if(val == 1) right.remove(num);
            else right.put(num, val - 1);

            long leftc = left.getOrDefault(num * 2, 0);
            long rightc = right.getOrDefault(num * 2, 0);

            c = (c + (leftc * rightc) % mod) % mod;

            left.put(num, left.getOrDefault(num, 0) + 1);
        }
        return (int)c;
    }
}
