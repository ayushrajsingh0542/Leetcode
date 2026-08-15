// Last updated: 15/08/2026, 20:06:24
class Solution {
    Boolean dp[];
    public boolean helper1(int idx,String s,Set<String>words)
    {
        if(idx==s.length())
        {
            return true;
        }
        if(dp[idx]!=null)
        {
            return dp[idx];
        }
        for(int i=idx;i<s.length();i++)
        {
            String temp=s.substring(idx,i+1);
            if(words.contains(temp) && helper1(i+1,s,words))
            {
                return dp[idx]=true;
            }
        }

        return dp[idx]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        dp=new Boolean[s.length()];
        HashSet<String>words=new HashSet<>();
        for(String str:wordDict)
        {
            words.add(str);
        }
        return helper1(0,s,words);
    }
}