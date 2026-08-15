// Last updated: 15/08/2026, 19:48:09
class Solution {
    public int minMoves(int[] nums) {
        int max = 0, ans = 0;
        for (int x : nums) 
            max = Math.max(max, x);
        for (int x : nums) 
            ans += max - x;
        return ans;
    }
}

    