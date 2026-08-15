// Last updated: 15/08/2026, 19:59:47
class Solution {
    public int[] asteroidCollision(int[] ast) {

        Stack<Integer> s=new Stack<>();
       
        for(int i=0;i<ast.length;i++)
        {
            if(!s.isEmpty() && ((ast[i]<0 && s.peek()<0) || (ast[i]>0 && s.peek()>0)))
            {
                s.push(ast[i]);
                continue;
            }
 
                while(!s.isEmpty() && Math.abs(s.peek())<Math.abs(ast[i]) && ast[i]<0 && s.peek()>0)
                {
                    s.pop();
                }
                if(!s.isEmpty() && s.peek()==Math.abs(ast[i]) && ast[i]<0)
                {
                    s.pop();
                    continue;
                }
                if(s.isEmpty() || ast[i]>0 || s.peek()==ast[i] || (s.peek()<0 && ast[i]<0))
                {
                    s.push(ast[i]);
                }
            
        }

        int ans[]=new int[s.size()];
        for(int i=ans.length-1;i>=0;i--)
        {
            ans[i]=s.pop();
        }
        return ans;
        
    }
}