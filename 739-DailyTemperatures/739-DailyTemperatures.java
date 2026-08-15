// Last updated: 15/08/2026, 19:59:43
class Solution {
    public int[] dailyTemperatures(int[] temp) {

        int ans[]=new int[temp.length];
        Stack<Integer> s=new Stack<>();
        int count=0;
        for(int i=temp.length-1;i>=0;i--)
        {
            
            while(!s.isEmpty() && temp[s.peek()]<=temp[i])
            {
                s.pop();
                
            }
            if(s.isEmpty())
            {
                ans[i]=0;
               
            }
            else
            {
                ans[i]=Math.abs(s.peek()-i);
               
            }
            s.push(i);
        }

        return ans;
        
    }
}