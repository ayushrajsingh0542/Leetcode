// Last updated: 15/08/2026, 20:06:36
class Solution {
    public static boolean isPal(int start,int end,String s)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            return false;
            start++;
            end--;
        }
        return true;
    }
    public static void rec(int idx,String s,List<String>path,List<List<String>> ans)
    {
        if(idx==s.length())
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<s.length();i++)
        {
            if(isPal(idx,i,s))
            {
                path.add(s.substring(idx,i+1));
                rec(i+1,s,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> path=new ArrayList<>();
        rec(0,s,path,ans);
        return ans;
    }
}