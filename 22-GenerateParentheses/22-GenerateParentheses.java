// Last updated: 15/08/2026, 20:10:37
class Solution {
    public static void gen(int n,int open,int closed,List<String> list,String str)
    {
        if(open==n && closed==n)
        {
            list.add(str);
            return;
        }
        if(open<n)
        {
            str+="(";
            gen(n,open+1,closed,list,str);
            str=str.substring(0,str.length()-1);
        }
        if(closed<open)
        {
            str+=")";
            gen(n,open,closed+1,list,str);
            str=str.substring(0,str.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        gen(n,0,0,list,"");
        return list;
        
    }
}