// Last updated: 15/08/2026, 20:10:23
class Solution {
    public int removeElement(int[] nums, int val) {
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                int index = i;
                while(index < nums.length && nums[index] == val) {
                    index += 1;
                }

                if(index >= nums.length) {

                }else{
                    nums[i] = nums[index];
                    nums[index] = val;
                    result += 1;
                }
            }else {
                result += 1;
            }
        }

        return result;
    }
}