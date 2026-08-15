// Last updated: 15/08/2026, 20:10:51
class Solution {
    public static void comb(int idx,String digits,String temp,HashMap<Character,String> map,List<String> list)
    {
        if(idx==digits.length())
        {
            list.add(temp);
            return;
        }
        char ch=digits.charAt(idx);
        String str=map.get(ch);
        for(int i=0;i<str.length();i++)
        {
            temp+=str.charAt(i);
            comb(idx+1,digits,temp,map,list);
            temp=temp.substring(0,temp.length()-1);//removing last element
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> list=new ArrayList<>();
        if(digits.equals(""))
        return list;
        comb(0,digits,"",map,list);
        return list;
    }
}