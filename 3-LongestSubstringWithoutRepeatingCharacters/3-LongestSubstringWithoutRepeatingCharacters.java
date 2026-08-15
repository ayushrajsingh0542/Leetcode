// Last updated: 15/08/2026, 20:11:23
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        return 0;
        if(s.length()==1)
        return 1;
      
        HashMap<Character,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<255;i++)
        {
            char c=(char)i;
            map.put(c,-1);
        }
        int l=0,r=0;
        while(r<s.length())
        {
            
            if(map.containsKey(s.charAt(r)))
            {
                l=Math.max((map.get(s.charAt(r))+1),l);
            }
            map.put(s.charAt(r),r);
            max=Math.max((r-l+1),max);
            r++;
        }
        return max;
    }
}