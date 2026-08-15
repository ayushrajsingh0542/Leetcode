// Last updated: 15/08/2026, 20:01:53
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> stack = new Stack<>();
        int[] ans= new int[nums.length];
        
		
        for(int i=nums.length-2;i>=0;i--)
        stack.push(nums[i]);
    
	   
        for(int i=nums.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&nums[i]>=stack.peek())
                stack.pop();
            
            if(stack.isEmpty())
            ans[i] = -1;
            else
            ans[i] = stack.peek();
            
            stack.push(nums[i]);
        }
        
        return ans;
    }
}