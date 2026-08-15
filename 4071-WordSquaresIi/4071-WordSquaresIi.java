// Last updated: 15/08/2026, 19:48:25
class Solution {
    public boolean check(String top,String left,String right,String bottom)
    {
        if(top.charAt(0)==left.charAt(0) && top.charAt(3)==right.charAt(0) && bottom.charAt(0)==left.charAt(3) && bottom.charAt(3)==right.charAt(3))
        {
            return true;
        }
        return false;
    }
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> ans=new ArrayList<>();
        int n=words.length;
        Arrays.sort(words);
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                    {
                        if(i==j)
                            continue;
                        for(int k=0;k<n;k++)
                            {
                                if(i==k || j==k)
                                    continue;
                                for(int l=0;l<n;l++)
                                    {
                                        if(l==i || l==j || l==k)
                                            continue;
                                        String top=words[i];
                                        String left=words[j];
                                        String right=words[k];
                                        String bottom=words[l];
                                        if(check(top,left,right,bottom))
                                        {
                                            List<String>list=new ArrayList<>();
                                            list.add(top);
                                            list.add(left);
                                            list.add(right);
                                            list.add(bottom);
                                            ans.add(list);
                                        }
                                    }
                            }
                    }
            }

        return ans;
    }
}