// Last updated: 15/08/2026, 20:03:11
class NumArray {
     static int pre[];
    public NumArray(int[] nums) {
        pre=new int[nums.length];
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            temp+=nums[i];
            pre[i]=temp;           
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
        return pre[right];
        return pre[right]-pre[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */