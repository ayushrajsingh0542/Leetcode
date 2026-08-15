// Last updated: 15/08/2026, 20:10:58
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        String s="";
        String fst=strs[0];
        String last=strs[n-1];
        for(int i=0;i<fst.length();i++)
        {
            if(fst.charAt(i)!=last.charAt(i))
            {
            break;
            }
            else
            s+=fst.charAt(i);
        }
        return s;
        
    }
}